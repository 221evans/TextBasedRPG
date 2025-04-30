package GameMechanics;

import java.util.Scanner;

public class Core {

    static Scanner scanner = new Scanner(System.in);
    static String input;

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

}
