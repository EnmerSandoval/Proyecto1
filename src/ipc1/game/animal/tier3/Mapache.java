package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Mapache extends Animal {
    public Mapache(){
        super(17, "Mapache", 5, 4);
    }
    public Mapache(int id, String nombreAnimal, int ataque, int vida){
        super(17, "Mapache", 5, 4);
    }
    @Override
  public int getModDefense(Animal vida){
      return 4;
  }
}
