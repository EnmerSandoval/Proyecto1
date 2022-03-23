package ipc1.game.animal.tier4;

import ipc1.game.animal.Animal;

public class Loro extends Animal {
    public Loro(){
        super(28,"Loro", 5, 3);
    }
    public Loro(int id, String nombreAnimal, int ataque, int vida){
        super(28,"Loro", 5, 3);
    }
    @Override
  public int getModDefense(Animal vida){
      return 3;
  }
}
