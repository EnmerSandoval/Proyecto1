package ipc1.game.animal.tier3;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Camello extends Animal {
    public Camello(){
        super(16,"Camello", 2, 5, true, new Mamifero(), new Desertico());
    }
}
