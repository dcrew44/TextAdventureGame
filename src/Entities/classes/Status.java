package Entities.classes;

public class Status {
    public int health;
    public int level;
    public int xp;
    public int strength;
    public int defense;
    public int dexterity;
    public int constitution;
    public int intelligence;

    public Status(int health, int level, int strength, int defense) {
        this.health = health;
        this.level = level;
        this.xp = 0;
        this.strength = strength;
        this.defense = defense;
    }


}
