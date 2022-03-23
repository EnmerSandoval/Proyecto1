package ipc1.game.animal.tier5;

import ipc1.game.animal.Animal;

public class Mono extends Animal {
    public Mono(int id, String nombreAnimal, int ataque, int vida){
        super(39, "Mono", 1, 2);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
