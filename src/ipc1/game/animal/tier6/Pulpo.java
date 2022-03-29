package ipc1.game.animal.tier6;

import ipc1.game.animal.Animal;

public class Pulpo extends Animal {
    public Pulpo(){
        super(51, "Pulpo", 8, 8, true);
    }
    public Pulpo(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(51, "Pulpo", 8, 8, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 8;
  }
}
