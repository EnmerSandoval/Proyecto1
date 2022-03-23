package ipc1.game.animal.tier5;

import ipc1.game.animal.Animal;

public class Vaca extends Animal {
    public Vaca(){
        super(41, "Vaca", 4, 6);
    }
    public Vaca(int id, String nombreAnimal, int ataque, int vida){
        super(41, "Vaca", 4, 6);
    }
    @Override
  public int getModDefense(Animal vida){
      return 6;
  }
}
