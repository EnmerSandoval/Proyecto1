package ipc1.game.animal.tier2;

import ipc1.game.animal.Animal;

public class Dodo extends Animal {
    public Dodo(){
        super(9, "Dodo", 2, 3, true);
    }
    public Dodo(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(9, "Dodo", 2, 3, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 3;
  }

}
