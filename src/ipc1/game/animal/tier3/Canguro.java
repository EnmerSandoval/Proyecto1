package ipc1.game.animal.tier3;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Canguro extends Animal {
    public Canguro(){
        super(25, "Canguro", 1, 2, 1, true, new Mamifero(), new Terrestre());
    }
}
