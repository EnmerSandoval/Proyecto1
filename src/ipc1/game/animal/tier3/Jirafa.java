package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Jirafa extends Animal {
    public Jirafa(int id, String nombreAnimal, int ataque, int vida){
        super(18, "Jirafa", 2, 5);
    }
    @Override
  public int getModDefense(Animal vida){
      return 5;
  }
}
