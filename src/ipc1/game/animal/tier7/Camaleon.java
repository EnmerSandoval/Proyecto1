package ipc1.game.animal.tier7;

import ipc1.game.animal.Animal;

public class Camaleon extends Animal{
    public Camaleon(){
        super(53, "Camaleon", 8, 8);
    }
    public Camaleon(int id, String nombreAnimal, int ataque, int vida){
        super(53, "Camaleon", 8, 8);
    }
    @Override
  public int getModDefense(Animal vida){
      return 8;
  }
}
