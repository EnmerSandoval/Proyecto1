package ipc1.game.animal.tier5;

import ipc1.game.animal.Animal;

public class Chompipe extends Animal {
    public Chompipe(){
        super(42, "Chompipe", 3, 4, true);
    }
    public Chompipe(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(42, "Chompipe", 3, 4, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 4;
  }
}
