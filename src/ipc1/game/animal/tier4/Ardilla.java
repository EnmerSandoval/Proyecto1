package ipc1.game.animal.tier4;

import ipc1.game.animal.Animal;

public class Ardilla extends Animal {
    public Ardilla(){
        super(33, "Ardilla", 2, 5, true);
    }  
    public Ardilla(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(33, "Ardilla", 2, 5, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 5;
  }
}
