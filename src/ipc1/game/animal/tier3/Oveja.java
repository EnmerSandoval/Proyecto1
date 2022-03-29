package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Oveja extends Animal {
    public Oveja(){
        super(21, "Oveja", 2, 2, true);
    }
    public Oveja(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(21, "Oveja", 2, 2, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
