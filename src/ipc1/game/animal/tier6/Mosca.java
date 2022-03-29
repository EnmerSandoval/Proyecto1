package ipc1.game.animal.tier6;

import ipc1.game.animal.Animal;

public class Mosca extends Animal {
    public Mosca(){
        super(51, "Mosca", 5, 5, true);
    }
    public Mosca(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(51, "Mosca", 5, 5, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 5;
  }
}
