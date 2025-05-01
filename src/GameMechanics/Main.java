package GameMechanics;

import GameMechanics.Enemies.Bear;


public class Main {

    static Player player = new Player();
    static String input;

    static Core core = new Core();

    static Bear bear = new Bear();


    public static void main(String[] args) {

        while(player.isAlive ) {

            core.StartGame();
            core.NewGame();

        }
        core.EndGame();



    }
}