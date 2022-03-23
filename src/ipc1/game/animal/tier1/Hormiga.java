package ipc1.game.animal.tier1;

import ipc1.game.animal.Animal;

public class Hormiga extends Animal{
   public Hormiga(){
      super(0, "Hormiga", 2, 1);
   }
     public Hormiga(int id, String nombreAnimal, int ataque, int vida){
        super(0, "Hormiga", 2, 1);
     }
     @Override
  public int getModDefense(Animal vida){
      return 1;
  }
}