package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Camello extends Animal {
    public Camello(){
        super(16,"Camello", 2, 5, true);
    }
    public Camello(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(16,"Camello", 2, 5, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 5;
  }
}
