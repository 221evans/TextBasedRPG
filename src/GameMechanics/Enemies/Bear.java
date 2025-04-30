package GameMechanics.Enemies;

import GameMechanics.Player;

public class Bear {

    public byte health = 10;
    public byte level = 1;

    public boolean isAlive = true;

    public boolean isBearTurn = false;

    String name = "Bear";

    public Player player = new Player();

    public void AdjustHealthForLevel() {

        switch(level) {
            case 2-> health += 10;
            case 3-> health += 15;
            case 4-> health += 20;
            case 5-> health += 25;
        }

    }

    public void Attack(){
        player.health -= (byte) (Math.random() * 5 + 1);
    }

    public Bear() {

    }
}
