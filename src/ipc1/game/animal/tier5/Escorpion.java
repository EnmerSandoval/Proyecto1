package ipc1.game.animal.tier5;

import ipc1.game.animal.Animal;

public class Escorpion extends Animal {
    public Escorpion(){
        super(37, "Escorpion", 1, 1);
    }
    public Escorpion(int id, String nombreAnimal, int ataque, int vida){
        super(37, "Escorpion", 1, 1);
    }
    @Override
  public int getModDefense(Animal vida){
      return 1;
  }
}
