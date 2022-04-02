package ipc1.game.animal.tier5;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Cocodrilo extends Animal {
    public Cocodrilo(){
        super(40, "Cocodrilo", 8, 4, true, new Reptil(), new Solitario());
    }
}
