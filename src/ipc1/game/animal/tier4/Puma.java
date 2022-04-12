package ipc1.game.animal.tier4;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Puma extends Animal {
    public Puma(){
        super(31, "Puma", 3, 7, 1, true, new Mamifero(), new Terrestre());
    }
}
