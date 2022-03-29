package ipc1.game.animal.tier2;

import ipc1.game.animal.Animal;

public class Zorro extends Animal {
    public Zorro(){
        super(14, "Zorro", 5, 2, true);
    }
    public Zorro(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(14, "Zorro", 5, 2, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
