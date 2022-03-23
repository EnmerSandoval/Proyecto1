package ipc1.game.animal.tier4;

import ipc1.game.animal.Animal;

public class Puma extends Animal {
    public Puma(){
        super(31, "Puma", 3, 7);
    }
    public Puma(int id, String nombreAnimal, int ataque, int vida){
        super(31, "Puma", 3, 7);
    }
    @Override
  public int getModDefense(Animal vida){
      return 7;
  }
}
