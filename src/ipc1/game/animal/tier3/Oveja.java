package ipc1.game.animal.tier3;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Oveja extends Animal {
    public Oveja(){
        super(21, "Oveja", 2, 2, 1, true, new Domestico(), new Terrestre());
    }
}
