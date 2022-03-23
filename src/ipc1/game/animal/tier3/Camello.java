package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Camello extends Animal {
    public Camello(){
        super(16,"Camello", 2, 5);
    }
    public Camello(int id, String nombreAnimal, int ataque, int vida){
        super(16,"Camello", 2, 5);
    }
    @Override
  public int getModDefense(Animal vida){
      return 5;
  }
}
