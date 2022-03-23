package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Tortuga extends Animal {
    public Tortuga(int id, String nombreAnimal, int ataque, int vida){
        super(19, "Tortuga", 1, 2);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
