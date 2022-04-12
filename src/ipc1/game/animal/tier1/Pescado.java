package ipc1.game.animal.tier1;

import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Pescado extends Animal {
   public Pescado(){
      super(1, "Pescado", 2, 3, 1, true, new Acuatico(), null);
   }
   /* 
      Power-up le da a todos los aliados (+1/+1) (+2/+2) al subir de nivel.
      si nivel pasa a nivel 2 entonces dar a todos los aliados del arreglo lo estimado.
   */

}
