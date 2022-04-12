package ipc1.game.animal.tier3;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Buho  extends Animal{
    public Buho(){
        super(26, "Buho", 5, 3, 1, true, new Volador(), new Solitario());
    }
}
