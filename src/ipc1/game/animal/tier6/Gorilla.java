package ipc1.game.animal.tier6;

import ipc1.game.animal.Animal;

public class Gorilla extends Animal{
    public Gorilla(){
        super(49, "Gorilla", 6, 9, true);
    }
    public Gorilla(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(49, "Gorilla", 6, 9, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 9;
  }
}
