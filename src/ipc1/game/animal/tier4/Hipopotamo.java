package ipc1.game.animal.tier4;

import ipc1.game.animal.Animal;

public class Hipopotamo extends Animal {
    public Hipopotamo(int id, String nombreAnimal, int ataque, int vida){
        super(29, "Hipopotamo", 4, 7);
    }
    @Override
  public int getModDefense(Animal vida){
      return 7;
  }
}
