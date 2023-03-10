package Entities.classes;

import Entities.equipment.Weapon;

public class Character {
    protected String name;
    protected Weapon weapon;

    public Status status;


    public Character(String name, int health, int strength, int defense, int level, Weapon weapon) {
        this.name = name;
        this.status = new Status(health, strength, defense, level);
        this.weapon = weapon;
    }

    public Character(String name, Weapon weapon, Status status) {
        this.name = name;
        this.weapon = weapon;
        this.status = status;
    }

    public int healthRemaining() {
        return status.health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return status.health;
    }

    public int getLevel() {
        return status.level;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void loseHealth(int damage) {
        this.status.health = this.status.health - damage;
        System.out.println(this.getName() + " has lost " + damage + " health.");
        System.out.println(this.getName() + " has " + this.healthRemaining() + " health remaining.");
        if (this.status.health <= 0) {
            System.out.println(this.getName() + " has been killed!");
        }
    }

    public void attack(Character target) {
        int damage = calculateDamage(this, target);
        System.out.println(this.name + " attacks " + target.getName() + " with " + this.weapon.getName() + " for " + this.weapon.getDamage() + " damage.");
        target.loseHealth(damage);
    }

    private int calculateDamage(Character attacker, Character target) {
        int weaponDamage = attacker.weapon.getDamage();
        int attackerStrength = attacker.status.strength;
        int targetDefense = target.status.defense;
        int damage = weaponDamage + attackerStrength - targetDefense;
        return damage;
    }


    public boolean isAlive() {
        return this.status.health > 0;
    }
}
