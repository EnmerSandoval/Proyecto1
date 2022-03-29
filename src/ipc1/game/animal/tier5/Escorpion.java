package ipc1.game.animal.tier5;

import ipc1.game.animal.Animal;

public class Escorpion extends Animal {
    public Escorpion(){
        super(37, "Escorpion", 1, 1, true);
    }
    public Escorpion(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(37, "Escorpion", 1, 1, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 1;
  }
}
