package GameMechanics;

import GameMechanics.Enemies.Bear;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Player player = new Player();
    static String input;

    static Core core = new Core();

    static Bear bear = new Bear();

    public static void NewGame() {
        System.out.println("You walk down the street and see a fork in the road.");
        System.out.println("Do you want to take the fork? (y/n)");
        input = scanner.nextLine().toLowerCase();
        while(true){
            if(input.equals("y")) {
                System.out.println("You take the fork and encounter a bear.");
                EnemyEncounter();
                break;
            } else if(input.equals("n")) {
                System.out.println("You walk away.");
                break;
            } else {
                System.out.println("Invalid input!");
            }
        }

    }

    public static void EnemyEncounter() {
        System.out.println("You encounter a bear!");

        System.out.println("Do you want to fight it? (y/n)");
        input = scanner.nextLine().toLowerCase();
        while(true) {
            if(input.equals("y")) {
                System.out.println("You fight the bear!");
                bear.level = (byte) (Math.random() * 5 + 1);
                bear.AdjustHealthForLevel();
                System.out.println("you encounter a level " + bear.level + " bear!");
                player.isPlayerTurn = true;

                if(player.isPlayerTurn){
                    System.out.println("Attack | CastSpell | Heal");
                    byte combatInput = scanner.nextByte();
                    if(combatInput == 1) {
                        System.out.println("You attack");
                        player.Attack();
                        player.isPlayerTurn = false;
                    }
                    else if(combatInput == 2) {
                        System.out.println("You cast a spell!");
                    }
                    else if(combatInput == 3) {
                        System.out.println("You heal!");
                        player.health += (byte) (Math.random() * 10 + 1);
                    }
                    else {
                        System.out.println("Invalid input!");
                    }

                }
                else{
                    bear.Attack();
                }
                break;

            } else if(input.equals("n")) {
                System.out.println("You turn around. The bear attacks you from behind.");
                player.isAlive = false;
               break;
            }
            else {
                System.out.println("Invalid input!");
            }
        }

    }

    public static void EndGame() {
        System.out.println("You have been killed");
        System.out.println("Thank you for playing!");
        System.out.println("Do you want to play again? (y/n)");
        if(scanner.nextLine().toLowerCase().equals("y")) {
            NewGame();
        }
        else {
            System.exit(0);
        }
    }


    public static void main(String[] args) {

        while(player.isAlive) {

            System.out.println("You are level: " + player.level);
            core.StartGame();
            NewGame();

        }
        EndGame();



    }
}