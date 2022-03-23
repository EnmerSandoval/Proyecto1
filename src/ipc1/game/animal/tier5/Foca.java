package ipc1.game.animal.tier5;

import ipc1.game.animal.Animal;

public class Foca extends Animal {
    public Foca(int id, String nomberAnimal, int ataque, int vida){
        super(35, "Foca", 3, 8);
    }
    @Override
  public int getModDefense(Animal vida){
      return 8;
  }
}
