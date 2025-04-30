package GameMechanics;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Player player = new Player();
    static String input;

    static Core core = new Core();



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
    }


    public static void main(String[] args) {

        while(player.isAlive) {
            core.StartGame();
            NewGame();
        }
        EndGame();



    }
}