package enemies.goblins;

import Entities.classes.Character;
import weapons.goblinSword;

public class Goblin extends Character {
    public Goblin() {
        super("Goblin", new goblinSword(), new GoblinStatus());
    }
}

