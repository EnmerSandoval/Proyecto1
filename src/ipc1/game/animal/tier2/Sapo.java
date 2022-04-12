package ipc1.game.animal.tier2;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Sapo extends Animal {
    public Sapo(){
        super(8, "Sapo", 3, 3, 1, true, new Terrestre(), new Acuatico());
    }
}
