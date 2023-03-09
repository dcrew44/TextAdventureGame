public class NPC {
    private String name;
    private int health;
    private int level;
    private Weapon weapon;

    public NPC (String name, int health, Weapon weapon) {
        this.level = 1;
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage) {
        this.health = this.health - damage;
        System.out.println("The NPC has lost " + damage + " health.");
        if (this.health <= 0) {
            System.out.println("The NPC has been killed!");

        }
    }

    public int attack() {
        System.out.println("The " + this.name + " attacks with " + this.weapon.getName() + " for " + this.weapon.getDamage() + " damage.");
        return this.weapon.getDamage();
    }
    public int healthRemaining() {
        return this.health;
    }
}
