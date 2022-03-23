package ipc1.game.animal.tier4;

import ipc1.game.animal.Animal;

public class Ballena extends Animal {
    public Ballena(int id, String nombreAnimal, int ataque, int vida){
        super(32, "Ballena", 3, 8);
    }
    @Override
  public int getModDefense(Animal vida){
      return 8;
  }
}
