package ipc1.game.animal.tier1;

import ipc1.game.animal.Animal;

public class Pescado extends Animal {
   public Pescado(){
      super(1, "Pescado", 2, 3, true);
   }
     public Pescado(int id, String nombreAnimal, int ataque, int vida){
        super(1, "Pescado", 2, 3, true);
     }

     @Override
  public int getModDefense(Animal vida){
      return 3;
  }
}
