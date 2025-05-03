package GameMechanics.Enemies;

import GameMechanics.Entity;

public class Enemy extends Entity {

    public Enemy(String name, byte health, boolean isAlive, byte level, byte xp, int coins, byte attackPower){
        super(name,health,isAlive,level,xp, coins,attackPower);
    }

    public int dropCoins(){
        System.out.println(getCoins() + " Coins dropped");
        return getCoins();


    }

    public int  takeDamage(byte damage){
        setHealth((byte) (getHealth() - damage));

        if(getHealth() <= 0){
            setAlive(false);

            return dropCoins();
        }

        return  0;
    }

}
