package ipc1.game.animal.tier1;

import ipc1.game.animal.Animal;

public class Grillo extends Animal {
    public Grillo(){
        super(3, "Grillo", 1, 2);
    }
    public Grillo(int id, String nombreAnimal, int ataque, int vida){
        super(3, "Grillo", 1, 2);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
