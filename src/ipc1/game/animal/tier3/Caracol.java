package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Caracol extends Animal {
    public Caracol(){
        super(20, "Caracol", 2, 2, true);
    }
    public Caracol(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(20, "Caracol", 2, 2, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
