package ipc1.game.animal.tier2;

import ipc1.game.animal.Animal;

public class Rata extends Animal {
    public Rata(){
        super(13, "Rata", 4, 5, true);
    }
    public Rata(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(13, "Rata", 4, 5, true);
    }

    @Override
  public int getModDefense(Animal vida){
      return 5;
  }
}
