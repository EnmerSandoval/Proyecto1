package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Canguro extends Animal {
    public Canguro(){
        super(25, "Canguro", 1, 2);
    }
    public Canguro(int id, String nomberAnimal, int ataque, int vida){
        super(25, "Canguro", 1, 2);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
