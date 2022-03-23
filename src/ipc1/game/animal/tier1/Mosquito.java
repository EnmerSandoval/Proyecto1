package ipc1.game.animal.tier1;

import ipc1.game.animal.Animal;

public class Mosquito extends Animal {
    public Mosquito(){
        super(2, "Mosquito", 2, 2);
    }
    public Mosquito(int id, String nombreAnimal, int ataque, int vida){
        super(2, "Mosquito", 2, 2);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }    
}
