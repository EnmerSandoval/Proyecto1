package ipc1.game.animal.tier6;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Mosca extends Animal {
    public Mosca(){
        super(51, "Mosca", 5, 5, 1, true, new Volador(), new Insecto());
    }
    
}
