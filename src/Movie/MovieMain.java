package Movie;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("C", "Minions");
        movie.watchMovie();

        Adventure jumanji = (Adventure) Movie.getMovie("A", "Jumanji");
        jumanji.watchMovie();

        System.out.printf("%n--------------------------------------------%n%n");

        var jaws = new Thriller("Jaws");
        jaws.watchThriller();

        System.out.printf("%n--------------------------------------------%n%n");

        Object unknownObject = Movie.getMovie("C", "Jaws");
        if(unknownObject.getClass().getSimpleName().equals("Comedy")){
                Comedy c = (Comedy) unknownObject;
                c.watchComedy();
        } else if (unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof Thriller thriller){
            thriller.watchThriller();
        }
    }
}
