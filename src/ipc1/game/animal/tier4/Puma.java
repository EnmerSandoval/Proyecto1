package ipc1.game.animal.tier4;

import ipc1.game.animal.Animal;

public class Puma extends Animal {
    public Puma(){
        super(31, "Puma", 3, 7, true);
    }
    public Puma(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(31, "Puma", 3, 7, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 7;
  }
}
