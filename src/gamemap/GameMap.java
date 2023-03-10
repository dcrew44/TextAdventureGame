package gamemap;

import enemies.goblins.Goblin;

public class GameMap {
    public MapTile[][] map;
    public GameMap() {
        map = new MapTile[10][10];
        generateMap();
    }
    public void generateMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = new MapTile(i,j);
                if (Math.random() < 0.2) {
                    System.out.println("Enemy at " + i + ", " + j);
                    map[i][j].setEnemy(true);
                    map[i][j].enemy = new Goblin();
                }
            }
        }
    }

}
