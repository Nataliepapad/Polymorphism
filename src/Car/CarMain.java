package Car;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        System.out.printf("%n--------------------------------------------%n%n");

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);

        System.out.printf("%n--------------------------------------------%n%n");

        Car tesla = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
        runRace(tesla);

        System.out.printf("%n--------------------------------------------%n%n");

    }

    public static void runRace (Car car){
        car.startEngine();
        car.drive();
    }
}
