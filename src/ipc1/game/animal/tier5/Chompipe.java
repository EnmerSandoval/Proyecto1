package ipc1.game.animal.tier5;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Chompipe extends Animal {
    public Chompipe(){
        super(42, "Chompipe", 3, 4, 1, true, new Terrestre(), new Volador());
    }
}
