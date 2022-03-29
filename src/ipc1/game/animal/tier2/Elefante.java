package ipc1.game.animal.tier2;

import ipc1.game.animal.Animal;

public class Elefante extends Animal {
    public Elefante(){
        super(10, "Elefante", 3, 5, true);
    }
    public Elefante(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(10, "Elefante", 3, 5, true);
    }

    @Override
  public int getModDefense(Animal vida){
      return 5;
  }
}
