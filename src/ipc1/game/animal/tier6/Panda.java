package ipc1.game.animal.tier6;

import ipc1.game.animal.Animal;

public class Panda extends Animal {
    public Panda(){
        super(43, "Panda", 5, 5, true);
    }
    public Panda(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(43, "Panda", 5, 5, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 5;
  }
}
