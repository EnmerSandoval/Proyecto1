package ipc1.game.animal.tier6;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Tigre extends Animal {
    public Tigre(){
        super(45, "Tigre", 4, 3, 1, true, new Terrestre(), new Mamifero());
    }
}
