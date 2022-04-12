package ipc1.game.animal.tier6;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Leopardo extends Animal {
    public Leopardo(){
        super(48, "Leopardo", 10, 4, 1, true, new Mamifero(), new Terrestre());
    }
}
