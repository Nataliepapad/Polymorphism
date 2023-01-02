public class Player {
    public String name;
    public  int health;
    public String weapon;


    public Player(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        health = health - damage;
        if(health <= 0){
            System.out.println(name + " is knocked out");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth){
        health = health + extraHealth;

        if ((health + extraHealth) > 100){
            System.out.println(name + "'s health restored to 100hp");
            health = 100;
        }
    }
}
