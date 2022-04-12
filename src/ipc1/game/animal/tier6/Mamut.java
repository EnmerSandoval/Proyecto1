package ipc1.game.animal.tier6;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Mamut extends Animal {
    public Mamut(){
        super(47, "Mamut", 3, 10, 1, true, new Mamifero(), new Terrestre());
    }
}
