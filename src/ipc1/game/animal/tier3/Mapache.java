package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Mapache extends Animal {
    public Mapache(){
        super(17, "Mapache", 5, 4, true);
    }
    public Mapache(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(17, "Mapache", 5, 4, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 4;
  }
}
