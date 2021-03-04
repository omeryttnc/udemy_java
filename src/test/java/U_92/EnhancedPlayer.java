package U_92;

public class EnhancedPlayer {
    private String name;
    private int hitPoint;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon){
        if(health > 0 && health <= 100) {
            this.hitPoint = health;
        }
    }
    public void loseHealth (int damage){
        this.hitPoint = this.hitPoint - damage;
        if(this.hitPoint <= 0){
            System.out.println("Player knocked out");

        }
    }

    public int getHitPoint() {
        return hitPoint;
    }
}
