package GameMechanics;

import GameMechanics.Enemies.Bear;

import java.util.Scanner;

public class Combat {

Player player = new Player();
Bear bear = new Bear();

Core core = new Core();

String scanner = String.valueOf(new Scanner(System.in));
Scanner scanner2 = new Scanner(System.in);
String input = scanner;

public boolean isInCombat;



public void StartCombat() {

    isInCombat = true;
    player.isPlayerTurn = true;
    bear.AdjustHealthForLevel();
    bear.AdjustDamageForLevel();
    System.out.println("you encounter a level " + bear.level + " bear!");

    while(isInCombat) {

        if(player.isPlayerTurn) {
            HandlePlayerTurn();
        }
        else if(bear.isBearTurn) {
            HandleBearTurn();
        }
        else {

        }

        if(bear.health <= 0) {
            System.out.println("The bear has been killed!");
            isInCombat = false;
            player.AddXP(100);
        }
        else if(player.health <= 0) {
            System.out.println("You have been killed!");
            isInCombat = false;
            core.EndGame();
        }
    }
}

public void HandlePlayerTurn(){
    System.out.println("Player attacks and deals: " + player.attackDamage + " damage");
    bear.health -= player.attackDamage;
    player.isPlayerTurn = false;
    bear.isBearTurn = true;
}

public void HandleBearTurn(){
    System.out.println("Bear attacks and deals: " + bear.attackDamage + " damage");
    player.health -= bear.attackDamage;;
    bear.isBearTurn = false;
    player.isPlayerTurn = true;
}

}
