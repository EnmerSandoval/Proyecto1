package ipc1.game.animal.tier7;

import ipc1.game.animal.Animal;

public class Camaleon extends Animal{
    public Camaleon(){
        super(53, "Camaleon", 8, 8, true);
    }
    public Camaleon(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(53, "Camaleon", 8, 8, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 8;
  }
}
