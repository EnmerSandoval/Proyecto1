package ipc1.game.animal.tier1;

import ipc1.game.animal.Animal;

public class Nutria extends Animal {
    public Nutria(){
        super(6, "Nutria", 1, 2, true);
    }
    public Nutria(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(6, "Nutria", 1, 2, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
