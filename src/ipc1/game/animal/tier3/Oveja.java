package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Oveja extends Animal {
    public Oveja(int id, String nombreAnimal, int ataque, int vida){
        super(21, "Oveja", 2, 2);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
