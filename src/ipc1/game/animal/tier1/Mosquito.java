package ipc1.game.animal.tier1;

import ipc1.game.animal.Animal;
import ipc1.game.animal.tipos.Volador;

public class Mosquito extends Animal {
    public Mosquito(){
        super(2, "Mosquito", 2, 2, true, new Volador(), null);
    }
}
