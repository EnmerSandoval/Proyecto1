package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Buey extends Animal {
    public Buey(int id, String nombreAnimal, int ataque, int vida){
        super(24, "Buey", 1, 4);
    }
    @Override
  public int getModDefense(Animal vida){
      return 4;
  }
}
