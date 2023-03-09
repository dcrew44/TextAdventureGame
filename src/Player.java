public class Player {
    private String name;
    private int health;
    private int level;
    private Weapon weapon;

    public Player (String name, int health, Weapon weapon) {
        this.level = 1;
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");

        }
    }

    public int attack() {
        System.out.println("Player " + this.name + " attacks with " + this.weapon.getName() + " for " + this.weapon.getDamage() + " damage.");
        return this.weapon.getDamage();
    }
    public int healthRemaining() {
        return this.health;
    }
}
