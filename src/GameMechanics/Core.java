package GameMechanics;



import java.util.Scanner;

public class Core {

   static Scanner scanner = new Scanner(System.in);
   static Combat combat = new Combat();

   static String input;

    public void startGame(){
        while (true){
            System.out.println("Would you like to start the game? (y/n)");
            input = scanner.nextLine();
            if(input.equals("y")){
                level1();
            }
            else if(input.equals("n")){
                System.exit(0);
            }
            else{
                System.out.println("Invalid input");
            }

        }
    }

    private static void level1(){
        while (true){
            System.out.println("\"You awaken in darkness, the cold stone floor pressing against your cheek. " +
                    "The air is thick with the musty scent of decay and forgotten years. " +
                    "As your eyes adjust to the gloom, you make out the rough-hewn walls of what appears to be an ancient cellar." +
                    " A single shaft of pale light filters through a crack in the ceiling above, illuminating dancing motes of dust.\"");

            System.out.println("The chamber is roughly circular, about twenty feet across." +
                    " Broken crates and rotting barrels line the walls, their contents long since turned to dust. " +
                    "To the north, a heavy wooden door stands slightly ajar, its iron hinges crusted with rust. To the east," +
                    " a narrow passage disappears into shadow.");

            System.out.println("Which room would you like to enter? Northern, or Eastern? (n/e)");
            input = scanner.nextLine();

            if(input.equals("n")){
                northRoomEncounter();

            }
            else if(input.equals("e")){
                eastRoomEncounter();
                }
            else{
                System.out.println("Invalid input");
            }
            }
         }

    private static void northRoomEncounter(){

        System.out.println("This room once served as a storage area. Wooden shelves, now collapsed and rotting, spill their contents across the floor." +
                        "Among the debris, you spot several intact glass bottles," +
                        "a length of rope, and what might be an old leather-bound journal."
                );
    }

    public static void eastRoomEncounter(){
        System.out.println("The passage narrows until you must turn sideways to continue." +
                " Water drips steadily from above, creating small puddles that splash beneath your feet." +
                " The walls here are slick with moisture and some kind of phosphorescent moss that casts an eerie green glow.");

        System.out.println(" ");

        System.out.println("A sudden skittering breaks the silence. From behind a toppled barrel emerges a rat the size of a small dog, " +
                "its red eyes gleaming with hunger." +
                " Its matted fur bristles as it bares yellowed fangs, letting out a threatening hiss.");
        System.out.println(" ");
        combat.startCombat("Large rat");

    }
    }




