package ipc1.game.animal.tier5;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Jaguar extends Animal{
    public Jaguar(){
        super(36, "Jaguar", 7, 4, 1, true, new Mamifero(), new Terrestre());
    }
}
