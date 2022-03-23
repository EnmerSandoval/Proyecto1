package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Lobo extends Animal {
    public Lobo(int id, String nombreAnimal, int ataque, int vida){
        super(23, "Lobo", 3, 4);
    }
    @Override
  public int getModDefense(Animal vida){
      return 4;
  }
}
