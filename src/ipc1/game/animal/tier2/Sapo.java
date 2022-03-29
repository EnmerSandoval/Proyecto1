package ipc1.game.animal.tier2;

import ipc1.game.animal.Animal;

public class Sapo extends Animal {
    public Sapo(){
        super(8, "Sapo", 3, 3, true);
    }
    public Sapo(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(8, "Sapo", 3, 3, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 3;
  }
}
