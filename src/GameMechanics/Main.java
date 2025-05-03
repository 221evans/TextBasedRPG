package GameMechanics;


public class Main {

    public static void main(String[] args) {


        Player player = new Player("Player", (byte) 100, true, (byte) 1, (byte) 0, 100, (byte) 10);


        System.out.println("The players level is " + player.getLevel());

        for (int i = 0; i < 10; i++) {
            player.addXp((byte) 10);

        }

        System.out.println("The players level now is " + player.getLevel());


    }
}