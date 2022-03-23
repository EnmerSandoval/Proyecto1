package ipc1.game.animal.tier2;

import ipc1.game.animal.Animal;

public class Dodo extends Animal {
    public Dodo(){
        super(9, "Dodo", 2, 3);
    }
    public Dodo(int id, String nombreAnimal, int ataque, int vida){
        super(9, "Dodo", 2, 3);
    }
    @Override
  public int getModDefense(Animal vida){
      return 3;
  }

}
