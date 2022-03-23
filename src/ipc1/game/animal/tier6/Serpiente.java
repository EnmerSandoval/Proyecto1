package ipc1.game.animal.tier6;

import ipc1.game.animal.Animal;

public class Serpiente extends Animal {
    public Serpiente(){
        super(46, "Serpiente", 6, 6);
    }
    public Serpiente(int id, String nombreAnimal, int ataque, int vida){
        super(46, "Serpiente", 6, 6);
    }
    @Override
  public int getModDefense(Animal vida){
      return 6;
  }
}
