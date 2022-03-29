package ipc1.game.animal.tier5;

import ipc1.game.animal.Animal;

public class Vaca extends Animal {
    public Vaca(){
        super(41, "Vaca", 4, 6, true);
    }
    public Vaca(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(41, "Vaca", 4, 6, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 6;
  }
}
