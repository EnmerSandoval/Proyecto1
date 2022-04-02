package ipc1.game.animal.tier3;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Caracol extends Animal {
    public Caracol(){
        super(20, "Caracol", 2, 2, true, new Insecto(), new Solitario());
    }
}
