package ipc1.game.animal.tier3;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Lobo extends Animal {
    public Lobo(){
        super(23, "Lobo", 3, 4, true, new Solitario(), new Terrestre());
    }
}
