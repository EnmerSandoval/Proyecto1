package ipc1.game.animal.tier2;

import ipc1.game.animal.Animal;

public class Rata extends Animal {
    public Rata(){
        super(13, "Rata", 4, 5);
    }
    public Rata(int id, String nombreAnimal, int ataque, int vida){
        super(13, "Rata", 4, 5);
    }

    @Override
  public int getModDefense(Animal vida){
      return 5;
  }
}
