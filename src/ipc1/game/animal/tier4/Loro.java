package ipc1.game.animal.tier4;

import ipc1.game.animal.Animal;

public class Loro extends Animal {
    public Loro(){
        super(28,"Loro", 5, 3, true);
    }
    public Loro(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(28,"Loro", 5, 3, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 3;
  }
}
