package ipc1.game.animal.tier1;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Hormiga extends Animal{
   public Hormiga(){
      super(0, "Hormiga", 2, 1, true, new Insecto(), new Terrestre());
   }
}