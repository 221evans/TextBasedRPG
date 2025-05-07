package GameMechanics;

public class Entity {
    private  String name;

    private byte health;
    private boolean isAlive;

    private byte level;
    private byte xp;

    private int coins;

    private byte attackPower;

    private boolean isTurn;


    public Entity(String name , byte health, boolean isAlive , byte level , byte xp , int coins, byte attackPower, boolean isTurn) {
        setName(name);
        setHealth(health);
        setAlive(isAlive);
        setLevel(level);
        setXp(xp);
        setCoins(coins);
        setAttackPower(attackPower);
        setTurn(isTurn);
    }

    // Getters
    public String getName() {return name;}
    public byte getHealth() {return health;}
    public boolean isAlive() {return isAlive;}
    public byte getLevel() {return level;}
    public byte getXp() {return xp;}
    public int getCoins() {return coins;}
    public byte getAttackPower() {return attackPower;}
    public boolean getIsTurn() {return isTurn;}


    // Setters

    public void setName(String name) {this.name = name;}
    public void setHealth(byte health) {this.health = health;}

    public void setAlive(boolean alive) {isAlive = alive;}
    public void setLevel(byte level) {
        if(level <= 0)
        {
            throw new IllegalArgumentException("Level cannot be less than 1");
        }
        else {
            this.level = level;
        }
    }
    public void setXp(byte xp) {
        if(xp < 0)
        {
            throw new IllegalArgumentException("XP cannot be less than 0");
        }
        else {
            this.xp = xp;
        }
    }
    public void setCoins(int coins) {
        if(coins < 0)
        {
            throw new IllegalArgumentException("Coins cannot be less than 0");
        }
        else {
            this.coins = coins;
        }
    }

    public void setAttackPower(byte attackPower) {
        if(attackPower <= 0){
            throw new IllegalArgumentException("Attack power cannot be less than 1");
        }
        else {
            this.attackPower = attackPower;
        }
    }
    public void setTurn(boolean turn) {isTurn = turn;}
}
