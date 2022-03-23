package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Conejo extends Animal {
    public Conejo(){
        super(22, "Conejo", 3, 2);
    }
    public Conejo(int id, String nombreAnimal, int ataque, int vida){
        super(22, "Conejo", 3, 2);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
