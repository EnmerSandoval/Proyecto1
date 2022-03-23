package ipc1.game.animal.tier4;

import ipc1.game.animal.Animal;

public class Venado extends Animal {
    public Venado(int id, String nombreAnimal, int ataque, int vida){
        super(27, "Venado", 1, 1);
    }
    @Override
  public int getModDefense(Animal vida){
      return 1;
  }
}
