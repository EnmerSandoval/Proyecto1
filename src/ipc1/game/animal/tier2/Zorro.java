package ipc1.game.animal.tier2;

import ipc1.game.animal.Animal;

public class Zorro extends Animal {
    public Zorro(int id, String nombreAnimal, int ataque, int vida){
        super(14, "Zorro", 5, 2);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
