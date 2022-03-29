package ipc1.game.animal.tier2;

import ipc1.game.animal.Animal;

public class Aranya extends Animal {
    public Aranya(){
        super(15, "Arania", 2, 2, true);
    }
    public Aranya(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(15, "Arania", 2, 2, true);
    }

    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
