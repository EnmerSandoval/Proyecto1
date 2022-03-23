package ipc1.game.animal.tier4;

import ipc1.game.animal.Animal;

public class Delfin extends Animal {
    public Delfin(){
        super(30, "Delfin", 4, 6);
    }
    public Delfin(int id, String nombreAnimal, int ataque, int vida){
        super(30, "Delfin", 4, 6);
    }
    @Override
  public int getModDefense(Animal vida){
      return 6;
  }
}
