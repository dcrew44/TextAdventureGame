package gamemap;

import Entities.classes.Character;

public class MapTile {
    public int x;
    public int y;
    public boolean isExplored;
    public boolean isWall;
    public boolean isDoor;
    public boolean isStairs;
    public boolean isChest;
    public boolean isEnemy;
    public Character enemy;
    public MapTile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setExplored(boolean explored) {
        isExplored = explored;
    }

    public void setWall(boolean wall) {
        isWall = wall;
    }

    public void setDoor(boolean door) {
        isDoor = door;
    }

    public void setStairs(boolean stairs) {
        isStairs = stairs;
    }

    public void setChest(boolean chest) {
        isChest = chest;
    }

    public void setEnemy(boolean enemy) {
        isEnemy = enemy;
    }

    public boolean isExplored() {
        return isExplored;
    }

    public boolean isWall() {
        return isWall;
    }

    public boolean isDoor() {
        return isDoor;
    }

    public boolean isStairs() {
        return isStairs;
    }

    public boolean isChest() {
        return isChest;
    }

    public boolean isEnemy() {
        return isEnemy;
    }

}
