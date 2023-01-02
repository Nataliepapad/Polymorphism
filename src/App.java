public class App {
    public static void app(){
        Player firstPlayer = new Player("Natalie", 100, "Bow");

        firstPlayer.loseHealth(25);
        System.out.println( firstPlayer.name + "'s remaining health is: " + firstPlayer.healthRemaining());

        firstPlayer.restoreHealth(30);
        System.out.println( firstPlayer.name + "'s remaining health is: " + firstPlayer.healthRemaining());

        firstPlayer.loseHealth(100);
        System.out.println( firstPlayer.name + "'s remaining health is: " + firstPlayer.healthRemaining());

        EnhancedPlayer secondPlayer = new EnhancedPlayer("George", 120, "Sword");
        System.out.println( secondPlayer.getName() + "'s remaining health is: " + secondPlayer.healthRemaining());

        secondPlayer.loseHealth(95);
        System.out.println( secondPlayer.getName() + "'s remaining health is: " + secondPlayer.healthRemaining());

        secondPlayer.restoreHealth(30);
        System.out.println( secondPlayer.getName() + "'s remaining health is: " + secondPlayer.healthRemaining());

        secondPlayer.loseHealth(45);
        System.out.println( secondPlayer.getName() + "'s remaining health is: " + secondPlayer.healthRemaining());
    }
}
