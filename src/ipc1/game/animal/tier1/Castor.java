package ipc1.game.animal.tier1;


import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Castor extends Animal {
    public Castor(){
        super(4, "Castor", 2, 2, 1, true, new Terrestre(), new Acuatico());
    }
  
}
