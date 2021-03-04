package U_92;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health= 20;
//        player.weapon = "Sword";
//        int damage = 10;
//        player.loseHealth(damage);
//     //   System.out.println("Remaining health = " + player.healthRemain());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemain());
        EnhancedPlayer player = new EnhancedPlayer("tim",50,"balta");
        System.out.println(player.getHitPoint());
    }
}
