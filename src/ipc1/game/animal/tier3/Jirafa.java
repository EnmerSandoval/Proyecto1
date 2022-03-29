package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Jirafa extends Animal {
    public Jirafa(){
        super(18, "Jirafa", 2, 5, true);
    }
    public Jirafa(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(18, "Jirafa", 2, 5, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 5;
  }
}
