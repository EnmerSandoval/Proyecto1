package ipc1.game.animal.tier1;

import ipc1.game.animal.Animal;

public class Castor extends Animal {
    public Castor(){
        super(4, "Castor", 2, 2);
    }
    public Castor(int id, String nombreAnimal, int ataque, int vida){
        super(4, "Castor", 2, 2);
    }

    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
