package ipc1.game.animal.tier4;

import ipc1.game.animal.Animal;

public class Ballena extends Animal {
    public Ballena(){
        super(32, "Ballena", 3, 8, true);
    }
    public Ballena(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(32, "Ballena", 3, 8, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 8;
  }
}
