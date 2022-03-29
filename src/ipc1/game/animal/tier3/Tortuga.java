package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Tortuga extends Animal {
    public Tortuga(){
        super(19, "Tortuga", 1, 2, true);
    }
    public Tortuga(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(19, "Tortuga", 1, 2, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
