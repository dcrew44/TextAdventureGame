import Entities.classes.Player;
import gamemap.GameMap;
import weapons.AdventurersSword;

import java.util.Scanner;

public class GameEngine {
    Scanner in = new Scanner(System.in);
    public Player player;
    public GameMap gameMap;

    public GameEngine() {

    }

    public void start() {
        System.out.println("Welcome to the game!");
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        AdventurersSword adventurerWeapon = new AdventurersSword();
        player = new Player(name, 100, 1, 1, 1, adventurerWeapon);
        System.out.println("Welcome " + player.getName() + "!");
        gameMap = new GameMap();
        player.linkMap(gameMap);


        explore();
        System.out.println("The end!");
    }

    public void explore() {
        while (true) {
            System.out.println("Where would you like to go?");
            System.out.println("1. North");
            System.out.println("2. East");
            System.out.println("3. South");
            System.out.println("4. West");
            System.out.println("5. Quit");
            int choice = in.nextInt();
            switch (choice) {
                case 1 -> player.move(player.currentTile.x, player.currentTile.y - 1);
                case 2 -> player.move(player.currentTile.x + 1, player.currentTile.y);
                case 3 -> player.move(player.currentTile.x, player.currentTile.y + 1);
                case 4 -> player.move(player.currentTile.x - 1, player.currentTile.y);
                case 5 -> {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }
            if (player.currentTile.isEnemy) {
                System.out.println("A " + player.currentTile.enemy.getName() + " has appeared!");
                Battle battle = new Battle(player, player.currentTile.enemy);
                battle.start();

            } else {
                System.out.println("You found nothing");
            }
        }
    }
}

