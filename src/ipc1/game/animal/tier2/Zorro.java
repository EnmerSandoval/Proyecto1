package ipc1.game.animal.tier2;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Zorro extends Animal {
    public Zorro(){
        super(14, "Zorro", 5, 2, true, new Solitario(), new Terrestre());
    }
}
