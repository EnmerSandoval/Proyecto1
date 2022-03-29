package ipc1.game.animal.tier1;

import ipc1.game.animal.Animal;

public class Escarabajo extends Animal {
    public Escarabajo(){
        super(7, "Escarabajo", 2, 3, true);
    }
    public Escarabajo(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(7, "Escarabajo", 2, 3, true);
    }

    @Override
  public int getModDefense(Animal vida){
      return 3;
  }
}
