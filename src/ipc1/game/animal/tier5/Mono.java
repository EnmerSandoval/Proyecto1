package ipc1.game.animal.tier5;

import ipc1.game.animal.Animal;

public class Mono extends Animal {
    public Mono(){
        super(39, "Mono", 1, 2, true);
    }
    public Mono(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(39, "Mono", 1, 2, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
