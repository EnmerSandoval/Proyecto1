package ipc1.game.animal.tier7;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Quetzal extends Animal {
    public Quetzal(){
        super(52, "Quetzal", 10, 10, 1, true, new Volador(), new Solitario());
    }
}
