package ipc1.game.animal.tier2;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class PavoReal extends Animal {
    public PavoReal(){
        super(12, "Pavo Real", 2, 5, true, new Domestico(), new Volador());
    }
}
