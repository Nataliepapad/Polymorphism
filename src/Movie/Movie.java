package Movie;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'T' -> new Thriller(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("- %s%n".repeat(3),
                "Pleasant scene",
                "Exotic locations",
                "Historical myths");

    }

    public void watchAdventure(){
        System.out.println("Watching an Adventure movie");
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("- %s%n".repeat(3),
                "Designed to elicit laughter ",
                "Crafted to amuse",
                "Light-hearted dramas");
    }

    public void watchComedy(){
        System.out.println("Watching a Comedy movie");
    }
}

class Thriller extends Movie {
    public Thriller(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("- %s%n".repeat(3),
                "Full of tension",
                "Action-packed",
                "Fast-paced");
    }

    public void watchThriller(){
        System.out.println("Watching a Thriller movie");
    }
}