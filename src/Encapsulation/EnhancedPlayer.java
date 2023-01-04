package Encapsulation;

public class EnhancedPlayer {
    private String name;
    private  int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name, 100, "Dagger");
    }
    public EnhancedPlayer(String name, int healthPercentage, String weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage <= 0 ? 0 : healthPercentage >= 100 ? healthPercentage = 100 : healthPercentage;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void loseHealth(int damage){
        healthPercentage = healthPercentage - damage;
        if(healthPercentage <= 0){
            System.out.println(name + " is knocked out");
            healthPercentage = 0;
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth){
        healthPercentage = healthPercentage + extraHealth;

        if ((healthPercentage + extraHealth) > 100){
            System.out.println(name + "'s health restored to 100hp");
            healthPercentage = 100;
        }
    }
}
