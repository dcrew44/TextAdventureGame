import Entities.classes.Character;
import Entities.classes.Player;

import java.util.Scanner;

public class Battle {
    private Player player;
    private Character enemy;
    private boolean isPlayerTurn;
    public Scanner in = new Scanner(System.in);

    public Battle(Player player, Character enemy) {
        this.player = player;
        this.enemy = enemy;
        this.isPlayerTurn = true;
    }

    public void start() {
        while (player.isAlive() && enemy.isAlive()) {
            if (isPlayerTurn) {
                playerTurn();
                isPlayerTurn = false;
            } else {
                enemyTurn();
                isPlayerTurn = true;
            }
        }
        if (player.isAlive()) {
            System.out.println("You won!");
            player.currentTile.enemy = null;
        } else {
            System.out.println("You lost!");
            System.out.println("Game Over");
            System.exit(0);
        }

    }

    private void enemyTurn() {
        enemy.attack(player);
    }

    private void playerTurn() {
        System.out.println("What would you like to do?");
        String response = in.nextLine();
        switch (response) {
            case "0","help":
                System.out.println("1. Attack");
                System.out.println("2. Run");
                System.out.println("3. Quit");
                System.out.println("4. Do Nothing");
                System.out.println("5. Check Health");
                System.out.println("6. Check Entities.equipment.Weapon");
                System.out.println("7. Check Level");
                System.out.println("8. Check Name");
                System.out.println("9. Check XP");
                playerTurn();
                break;
            case "1","attack":
                if (enemy.healthRemaining() > 0) {
                    player.attack(enemy);
                }
                break;
            case "2","run":
                System.out.println("You ran away!");
                System.out.println("Game Over");
                System.exit(0);
                break;

            case "3","quit":
                System.out.println("Game Over");
                System.exit(0);
                break;

            case "4","do nothing":
                break;

            case "5","check health":
                System.out.println("Your health is " + player.healthRemaining());
                playerTurn();
                break;
            case "6","check weapon":
                System.out.println("Your weapon is " + player.getWeapon().getName());
                playerTurn();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + response);
        }
    }
}
