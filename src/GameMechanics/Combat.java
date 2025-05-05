package GameMechanics;

import GameMechanics.Enemies.Enemy;

import java.util.Scanner;

public class Combat {

    Player player = new Player("Player", (byte) 100, true, (byte) 1, (byte) 0, 100, (byte) 10, true);
    Enemy enemy = new Enemy("enemy", (byte) 100, false, (byte) 1, (byte) 0, 100, (byte) 10, false);
    Scanner scanner = new Scanner(System.in);
    int combatInput;
    public boolean isCombatOver;

    public void startCombat(String enemyName){
        enemy.setAlive(true);
        setEnemyName(enemyName);
        while (player.isAlive() && enemy.isAlive()){

            System.out.println("A " + enemy.getName() + " appears in front of you.");


            System.out.println("What would you like to do? 1. attack 2. run");
            combatInput = scanner.nextInt();

            if(combatInput == 1){
                    isCombatOver = false;
                    player.setPlayerTurn(true);
                }
            else if(combatInput == 2){
                isCombatOver = true;
            }
            else {
                System.out.println("Invalid input");
            }

            while (!isCombatOver && player.isAlive() && enemy.isAlive()){
                if(player.getIsTurn()){
                    enemy.setTurn(false);
                    System.out.println("You attack for " + player.getAttackPower() + " damage.");
                    enemy.takeDamage(player.getAttackPower());
                    System.out.println("The enemies health is now " + enemy.getHealth());
                    player.setPlayerTurn(false);
                    enemy.setTurn(true);
            }

                else if(enemy.getIsTurn()){
                    enemy.setTurn(true);
                    System.out.println("The enemy attacks for " + enemy.getAttackPower() + " damage.");
                    player.takeDamage(enemy.getAttackPower());
                    System.out.println("Your health is now " + player.getHealth());
                    player.setPlayerTurn(true);

                }


            }

        }

    }

    private void setEnemyName(String enemyName){
        enemy.setName(enemyName);

    }
}
