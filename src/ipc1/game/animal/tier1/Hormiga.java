package ipc1.game.animal.tier1;

import ipc1.game.animal.tipos.*;
import ipc1.game.util.Jaula;
import ipc1.game.animal.Animal;

public class Hormiga extends Animal{
   public Hormiga(){
      super(0, "Hormiga", 2, 1, 1, true, new Insecto(), new Terrestre());
   }

   public void habilidadPlayer(){
      for (int i = 0; i < Jaula.jaulaPlayer.length; i++) {
      }   
   }
  
      /*
       Del arreglo Rival o del arreglo jaulaPlayer generar automaticamente un objeto a ese objeto modificarle la vida y el ataque
       Con otro numero random que podría ser (+2/+1) (+4/+2) (+6/+3) al morir.
       Podría ser un si boolean estadoVida = false generar un numero random del arreglo a los vivos y que les de la vida 
       y el ataque random.
       */
}