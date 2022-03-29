package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Conejo extends Animal {
    public Conejo(){
        super(22, "Conejo", 3, 2, true);
    }
    public Conejo(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(22, "Conejo", 3, 2, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
