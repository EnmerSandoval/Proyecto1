package ipc1.game.animal.tier4;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Hipopotamo extends Animal {
    public Hipopotamo(){
        super(29, "Hipopotamo", 4, 7, 1, true, new Acuatico(), new Terrestre());
    }
}
