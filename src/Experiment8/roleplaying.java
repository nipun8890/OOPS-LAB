package Experiment8;

public class roleplaying {

}
@SuppressWarnings("serial")
class PlayerDefeatedException extends Exception {
    public PlayerDefeatedException(String message) {
        super(message);
    }
}

class Player {
    private int health;

    public Player(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) throws PlayerDefeatedException {
        health -= damage;
        if (health < 0) {
            throw new PlayerDefeatedException("Player has been defeated!");
        }
        System.out.println("Player's current health: " + health);
    }

    public int getHealth() {
        return health;
    }
    public static void main(String[] args) {
        Player player = new Player(50);
        int[] attacks = {20, 15, 20}; 

        for (int damage : attacks) {
            try {
                player.takeDamage(damage);
            } catch (PlayerDefeatedException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
