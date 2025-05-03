package GameMechanics;

import GameMechanics.Enemies.Enemy;

import java.util.Scanner;

public class Core {
    Player player = new Player("Player", (byte) 100, true, (byte) 1, (byte) 0, 0, (byte) 10);
    Enemy enemy = new Enemy("Enemy", (byte) 100, true, (byte) 1, (byte) 0, 10, (byte) 10);
    Scanner scanner = new Scanner(System.in);

    String input;

    public void startGame(){
        while (true){
            System.out.println("Would you like to start the game? (y/n)");
            input = scanner.nextLine();
            if(input.equals("y")){
                System.out.println("Player Health: " + player.getHealth());
            }
            else if(input.equals("n")){
                System.exit(0);
            }
            else{
                System.out.println("Invalid input");
            }

        }
    }
}
