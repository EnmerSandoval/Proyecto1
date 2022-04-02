package ipc1.game.animal.tier2;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Rata extends Animal {
    public Rata(){
        super(13, "Rata", 4, 5, true, new Terrestre(), new Solitario());
    }
}
