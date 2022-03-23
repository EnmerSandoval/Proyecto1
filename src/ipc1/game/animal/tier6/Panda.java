package ipc1.game.animal.tier6;

import ipc1.game.animal.Animal;

public class Panda extends Animal {
    public Panda(){
        super(43, "Panda", 5, 5);
    }
    public Panda(int id, String nombreAnimal, int ataque, int vida){
        super(43, "Panda", 5, 5);
    }
    @Override
  public int getModDefense(Animal vida){
      return 5;
  }
}
