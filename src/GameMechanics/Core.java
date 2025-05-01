package GameMechanics;

import GameMechanics.Enemies.Bear;

import java.util.Scanner;

public class Core {

    static Scanner scanner = new Scanner(System.in);
    static String input;

    static Bear bear = new Bear();
    static Player player = new Player();

    static Combat combat = new Combat();

    public void StartGame() {
        while(true) {

            System.out.println("Welcome to the game!");
            System.out.println("Do you want to start a new game? (y/n)");
            input = scanner.nextLine();

            if(input.equals("y")) {
                System.out.println("Starting a new game!");
                break;
            } else if(input.equals("n")) {
                System.out.println("Exiting game!");
                break;
            } else {
                System.out.println("Invalid input!");
            }

        }
    }

    public void EnemyEncounter() {
        System.out.println("You encounter a bear!");

        System.out.println("Do you want to fight it? (y/n)");
        input = scanner.nextLine().toLowerCase();

        if(input.equals("y")) {

            combat.StartCombat();

        } else if(input.equals("n")) {
            System.out.println("You walk away.");
        } else {
            System.out.println("Invalid input!");
        }
    }

    public void EndGame() {
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

    public void NewGame() {
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



}
