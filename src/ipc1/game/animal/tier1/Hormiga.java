package ipc1.game.animal.tier1;

import ipc1.game.animal.Animal;

public class Hormiga extends Animal{
   public Hormiga(){
      super(0, "Hormiga", 2, 1, true);
   }
     public Hormiga(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(0, "Hormiga", 2, 1, true);
     }
     @Override
  public int getModDefense(Animal vida){
      return 1;
  }
}