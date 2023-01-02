public class App {
    public static void app(){
        Player firstPlayer = new Player("Natalie", 100, "Bow");

        firstPlayer.loseHealth(25);
        System.out.println( firstPlayer.name + "'s remaining health is: " + firstPlayer.healthRemaining());

        firstPlayer.restoreHealth(30);
        System.out.println( firstPlayer.name + "'s remaining health is: " + firstPlayer.healthRemaining());

        firstPlayer.loseHealth(100);
        System.out.println( firstPlayer.name + "'s remaining health is: " + firstPlayer.healthRemaining());

    }
}
