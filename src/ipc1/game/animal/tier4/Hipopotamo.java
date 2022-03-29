package ipc1.game.animal.tier4;

import ipc1.game.animal.Animal;

public class Hipopotamo extends Animal {
    public Hipopotamo(){
        super(29, "Hipopotamo", 4, 7, true);
    }
    public Hipopotamo(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(29, "Hipopotamo", 4, 7, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 7;
  }
}
