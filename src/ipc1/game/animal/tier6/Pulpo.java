package ipc1.game.animal.tier6;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Pulpo extends Animal {
    public Pulpo(){
        super(50, "Pulpo", 8, 8, true, new Acuatico(), new Solitario());
    }
}
