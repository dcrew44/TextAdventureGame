public class GameEngine {
    public GameEngine() {
        System.out.println("Welcome to the game!");
        System.out.print("Enter your name: ");
        String name = System.console().readLine();
        System.out.println("A Goblin has appeared!");
        Weapon goblinWeapon = new Weapon("Sword", 10);
        NPC goblin = new NPC("Goblin", 100, goblinWeapon);
        Weapon adventurerWeapon = new Weapon("Sword", 15);
        Player player = new Player(name, 100, adventurerWeapon);

        while (goblin.healthRemaining() > 0 && player.healthRemaining() > 0) {
            promptPlayer();
        }
    }

    private void promptPlayer() {
        System.out.println("What would you like to do?");
        System.out.println("1. Attack");
        System.out.println("2. Run");
        System.out.println("3. Quit");
        System.out.println("4. Heal");
        System.out.println("5. Check Health");
        System.out.println("6. Check Weapon");
        System.out.println("7. Change Weapon");
        System.out.println("8. Check Level");
        System.out.println("9. Check Name");
        System.out.println("11. Check XP");

    }
}
