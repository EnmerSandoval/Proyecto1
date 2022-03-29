package ipc1.game.animal.tier6;

import ipc1.game.animal.Animal;

public class Gato extends Animal {
    public Gato(){
        super(44, "Gato", 4, 5, true);
    }
    public Gato(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(44, "Gato", 4, 5, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 5;
  }
}
