package ipc1.game.animal.tier5;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Escorpion extends Animal {
    public Escorpion(){
        super(37, "Escorpion", 1, 1, true, new Desertico(), new Solitario());
    }
}
