package GameMechanics;

import GameMechanics.Enemies.Bear;

public class Player {
    public boolean isAlive = true;
    public int health = 100;
    public byte level = 1;

    public byte maxLevel = 20;
    public int xp = 0;
    public int coins = 0;

    public boolean isPlayerTurn = false;

    public byte attackDamage = (byte) (Math.random() * 10 + 1);

    public Bear bear = new Bear();



    public void AddXP(int amount) {
        xp += amount;
        CheckForLevelUp();
    }

    public void CheckForLevelUp(){

        if(xp >= 100) {

            if(level <= maxLevel) {
                System.out.println(xp);
                level += 1;
                System.out.println("You have leveled up! You are now level: " + level);
                xp = 0;
                System.out.println("XP reset: " + xp); // for debugging purposes
            }
            else{
                System.out.println("You have reached the max level!");
            }
        }
    }



    public Player() {


    }

}
