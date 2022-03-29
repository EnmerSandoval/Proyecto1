package ipc1.game.animal.tier5;

import ipc1.game.animal.Animal;

public class Jaguar extends Animal{
    public Jaguar(){
        super(36, "Jaguar", 7, 4, true);
    }
    public Jaguar(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(36, "Jaguar", 7, 4, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 4;
  }
}
