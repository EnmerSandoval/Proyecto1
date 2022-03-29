package ipc1.game.animal.tier1;

import ipc1.game.animal.Animal;

public class Grillo extends Animal {
    public Grillo(){
        super(3, "Grillo", 1, 2, true);
    }
    public Grillo(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(3, "Grillo", 1, 2, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
