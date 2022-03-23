package ipc1.game.animal.tier4;

import ipc1.game.animal.Animal;

public class Ardilla extends Animal {
    public Ardilla(int id, String nombreAnimal, int ataque, int vida){
        super(33, "Ardilla", 2, 5);
    }
    @Override
  public int getModDefense(Animal vida){
      return 5;
  }
}
