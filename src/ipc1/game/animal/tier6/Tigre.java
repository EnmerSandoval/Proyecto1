package ipc1.game.animal.tier6;

import ipc1.game.animal.Animal;

public class Tigre extends Animal {
    public Tigre(){
        super(45, "Tigre", 4, 3);
    }
    public Tigre(int id, String nombreAnimal, int ataque, int vida){
        super(45, "Tigre", 4, 3);
    }
    @Override
  public int getModDefense(Animal vida){
      return 3;
  }
}
