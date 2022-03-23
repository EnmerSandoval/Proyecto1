package ipc1.game.animal.tier1;

import ipc1.game.animal.Animal;

public class Escarabajo extends Animal {
    public Escarabajo(int id, String nombreAnimal, int ataque, int vida){
        super(7, "Escarabajo", 2, 3);
    }

    @Override
  public int getModDefense(Animal vida){
      return 3;
  }
}
