package ipc1.game.animal.tier6;

import ipc1.game.animal.Animal;

public class Gorilla extends Animal{
    public Gorilla(){
        super(49, "Gorilla", 6, 9);
    }
    public Gorilla(int id, String nombreAnimal, int ataque, int vida){
        super(49, "Gorilla", 6, 9);
    }
    @Override
  public int getModDefense(Animal vida){
      return 9;
  }
}
