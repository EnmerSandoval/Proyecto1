package ipc1.game.animal.tier2;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Elefante extends Animal {
    public Elefante(){
        super(10, "Elefante", 3, 5, 1, true, new Mamifero(), new Terrestre());
    }
}
