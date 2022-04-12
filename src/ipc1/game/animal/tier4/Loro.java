package ipc1.game.animal.tier4;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Loro extends Animal {
    public Loro(){
        super(28,"Loro", 5, 3, 1, true, new Volador(), null);
    }
}
