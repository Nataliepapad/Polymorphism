import Encapsulation.EnhancedPlayer;
import Encapsulation.Player;
import Movie.Movie;

import java.util.Scanner;

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

        System.out.println("--------------------------------------------");

        Scanner s = new Scanner(System.in);

        while (true){
            System.out.printf("Enter Type of Movie.Movie:%s%n".repeat(4),
                                       "A for Movie.Adventure",
                                       "C for Movie.Comedy",
                                       "T for Movie.Thriller",
                                       "Q to Quit%n");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter Movie.Movie Title:");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }




    }
}
