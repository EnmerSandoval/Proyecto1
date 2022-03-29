package ipc1.game.animal.tier5;

import ipc1.game.animal.Animal;

public class Cocodrilo extends Animal {
    public Cocodrilo(){
        super(40, "Cocodrilo", 8, 4, true);
    }
    public Cocodrilo(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(40, "Cocodrilo", 8, 4, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 4;
  }
}
