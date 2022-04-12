package ipc1.game.animal.tier5;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Vaca extends Animal {
    public Vaca(){
        super(41, "Vaca", 4, 6, 1, true, new Mamifero(), new Terrestre());
    }
}
