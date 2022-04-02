package ipc1.game.animal.tier2;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class PuercoEspin extends Animal {
    public PuercoEspin(){
        super(11, "Puerco Espin", 3, 2, true, new Solitario(), new Terrestre());
    }
}
