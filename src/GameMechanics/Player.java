package GameMechanics;


public class Player extends Entity {



    public Player(String name, byte health, boolean isAlive, byte level, byte xp, int coins, byte attackPower) {
        super(name, health, isAlive, level, xp, coins, attackPower );
    }

    public void levelUp(){
        setLevel((byte) (getLevel() +1 ));
        setXp((byte) 0);
    }

    public void addXp(byte xpGained){

        int newXp = getXp() + xpGained;
        setXp((byte) newXp);

        if(getXp() >= 100){
            levelUp();
        }
    }


}
