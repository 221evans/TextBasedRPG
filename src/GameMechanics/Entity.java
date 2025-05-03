package GameMechanics;

public class Entity {
    private  String name;

    private byte health;
    private boolean isAlive;

    private byte level;
    private byte xp;

    private int coins;

    private byte attackPower;


    public Entity(String name , byte health, boolean isAlive , byte level , byte xp , int coins, byte attackPower) {
        this.name = name;
        this.health = health;
        this.isAlive = isAlive;
        this.level = level;
        this.xp = xp;
        this.coins = coins;
        this.attackPower = attackPower;
    }

    // Getters
    public String getName() {return name;}
    public byte getHealth() {return health;}
    public boolean isAlive() {return isAlive;}
    public byte getLevel() {return level;}
    public byte getXp() {return xp;}
    public int getCoins() {return coins;}
    public byte getAttackPower() {return attackPower;}

    // Setters

    public void setName(String name) {this.name = name;}
    public void setHealth(byte health) {this.health = health;}
    public void setAlive(boolean alive) {isAlive = alive;}
    public void setLevel(byte level) {this.level = level;}
    public void setXp(byte xp) {this.xp = xp;}
    public void setCoins(int coins) {this.coins = coins;}
    public void setAttackPower(byte attackPower) {this.attackPower = attackPower;}
}
