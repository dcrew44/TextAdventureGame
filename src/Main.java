public class Main {
    public static void main(String[] args) {
        System.out.println("A Goblin has appeared!");
        Weapon goblinWeapon = new Weapon("Sword", 10);
        NPC goblin = new NPC("Goblin", 100, goblinWeapon);
        Weapon adventurerWeapon = new Weapon("Sword", 15);
        Player player = new Player("Player", 100, goblinWeapon);
    }
}
