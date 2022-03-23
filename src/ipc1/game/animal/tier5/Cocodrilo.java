package ipc1.game.animal.tier5;

import ipc1.game.animal.Animal;

public class Cocodrilo extends Animal {
    public Cocodrilo(int id, String nombreAnimal, int ataque, int vida){
        super(40, "Cocodrilo", 8, 4);
    }
    @Override
  public int getModDefense(Animal vida){
      return 4;
  }
}
