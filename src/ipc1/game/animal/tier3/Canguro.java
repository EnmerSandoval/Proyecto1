package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Canguro extends Animal {
    public Canguro(){
        super(25, "Canguro", 1, 2, true);
    }
    public Canguro(int id, String nomberAnimal, int ataque, int vida, boolean estadoVida){
        super(25, "Canguro", 1, 2, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
