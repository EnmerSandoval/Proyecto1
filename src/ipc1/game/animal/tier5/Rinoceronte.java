package ipc1.game.animal.tier5;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Rinoceronte extends Animal {
    public Rinoceronte(){
        super(38, "Rinoceronte", 5, 8, 1, true, new Desertico(), new Terrestre());
    }
}
