package ipc1.game.animal.tier6;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Panda extends Animal {
    public Panda(){
        super(43, "Panda", 5, 5, 1, true, new Mamifero(), new Solitario());
    }
}
