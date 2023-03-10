package Entities.equipment;

public class Inventory {
    public Weapon weapon;
    public Armor armor;
    public Potion potion;

    public Inventory(Weapon weapon, Armor armor, Potion potion) {
        this.weapon = weapon;
        this.armor = armor;
        this.potion = potion;
    }
}
