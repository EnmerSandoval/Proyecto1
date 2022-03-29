package ipc1.game.animal.tier6;

import ipc1.game.animal.Animal;

public class Leopardo extends Animal {
    public Leopardo(){
        super(49, "Leopardo", 10, 4, true);
    }
    public Leopardo(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(49, "Leopardo", 10, 4, true);
    }

    
    @Override
  public int getModDefense(Animal vida){
      return 4;
  }
}
