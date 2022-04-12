package ipc1.game.animal.tier6;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Serpiente extends Animal {
    public Serpiente(){
        super(46, "Serpiente", 6, 6, 1, true, new Reptil(), new Terrestre());
    }
   
}
