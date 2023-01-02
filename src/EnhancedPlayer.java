public class EnhancedPlayer {
    private String name;
    private  int health;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.health = health <= 0 ? 0 : health >= 100 ? health = 100 : health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void loseHealth(int damage){
        health = health - damage;
        if(health <= 0){
            System.out.println(name + " is knocked out");
            health = 0;
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
