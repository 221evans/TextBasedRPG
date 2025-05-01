package GameMechanics.Enemies;

import GameMechanics.Player;


public class Bear {
    public byte health = 10;
    public byte level = 1;

    public int levelDamage = 1;

    public int attackDamage = (int) (Math.random() * 10 + levelDamage);

    public boolean isAlive = true;
    public boolean isBearTurn = false;
    String name = "Bear";

    static Player player = new Player();

    public void AdjustHealthForLevel() {
        switch(level) {
            case 2-> health += 10;
            case 3-> health += 15;
            case 4-> health += 20;
            case 5-> health += 25;
        }
    }

    public void AdjustDamageForLevel() {
        switch(level) {
            case 2-> levelDamage += 1;
            case 3-> levelDamage += 2;
            case 4-> levelDamage += 3;
            case 5-> levelDamage += 4;
        }
    }

    public void Attack(Player target){
        if (target != null) {
            target.health -= (byte) (Math.random() * 5 + 1);
            isBearTurn = false;
            player.isPlayerTurn = true;
        }
    }

    public Bear() {
        // Empty constructor
    }
}
