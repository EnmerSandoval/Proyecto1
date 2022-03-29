package ipc1.game.animal.tier1;

import ipc1.game.animal.Animal;

public class Castor extends Animal {
    public Castor(){
        super(4, "Castor", 2, 2, true);
    }
    public Castor(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
       super(4, "Castor", 2, 2, true);
    }

    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
