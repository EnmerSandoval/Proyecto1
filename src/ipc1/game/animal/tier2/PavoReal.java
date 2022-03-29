package ipc1.game.animal.tier2;

import ipc1.game.animal.Animal;

public class PavoReal extends Animal {
    public PavoReal(){
        super(12, "Pavo Real", 2, 5, true);
    }
    public PavoReal(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(12, "Pavo Real", 2, 5, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 5;
  }
}
