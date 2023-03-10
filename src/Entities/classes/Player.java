package Entities.classes;


import Entities.equipment.Weapon;
import gamemap.GameMap;
import gamemap.MapTile;

public class Player extends Character {
    public MapTile currentTile;
    public GameMap gameMap;

    public Player(String name, int health, int strength, int defense, int level, Weapon weapon) {
        super(name, health, strength, defense, level, weapon);

    }
    public void linkMap(GameMap gameMap) {
        this.gameMap = gameMap;
        currentTile = gameMap.map[0][0];
    }

    public void move(int x, int y) {
        if (x < 0 || y < 0 || x >= gameMap.map.length || y >= gameMap.map[0].length) {
            System.out.println("You can't go that way");
        } else {
            currentTile = gameMap.map[x][y];
            System.out.println("You are now at " + currentTile.x + ", " + currentTile.y);
        }
    }
    public void loseHealth(int damage) {
        this.status.health = this.status.health - damage;
        if (this.status.health <= 0) {
            System.out.println("Player knocked out");
            System.out.println("Game Over");
        }
    }




}
