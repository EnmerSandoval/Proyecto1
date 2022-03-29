package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Buey extends Animal {
    public Buey(){
        super(24, "Buey", 1, 4, true);
    }
    public Buey(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(24, "Buey", 1, 4, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 4;
  }
}
