package ipc1.game.animal.tier7;

import ipc1.game.animal.Animal;

public class Quetzal extends Animal {
    public Quetzal(){
        super(52, "Quetzal", 10, 10);
    }
    public Quetzal(int id, String nombreAnimal, int ataque, int vida){
        super(52, "Quetzal", 10, 10);
    }
    @Override
  public int getModDefense(Animal vida){
      return 10;
  }
}
