package ipc1.game.animal.tier6;

import ipc1.game.animal.Animal;

public class Mamut extends Animal {
    public Mamut(){
        super(47, "Mamut", 3, 10);
    }
    public Mamut(int id, String nombreAnimal, int ataque, int vida){
        super(47, "Mamut", 3, 10);
    }
    @Override
  public int getModDefense(Animal vida){
      return 10;
  }
}
