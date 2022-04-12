package ipc1.game.animal.tier5;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Foca extends Animal {
    public Foca(){
        super(35, "Foca", 3, 8, 1, true, new Acuatico(), new Mamifero());
    }
}
