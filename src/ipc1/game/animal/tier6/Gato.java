package ipc1.game.animal.tier6;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Gato extends Animal {
    public Gato(){
        super(44, "Gato", 4, 5, 1, true, new Mamifero(), new Domestico());
    }
}
