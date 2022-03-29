package ipc1.game.animal.tier4;

import ipc1.game.animal.Animal;

public class Delfin extends Animal {
    public Delfin(){
        super(30, "Delfin", 4, 6, true);
    }
    public Delfin(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(30, "Delfin", 4, 6, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 6;
  }
}
