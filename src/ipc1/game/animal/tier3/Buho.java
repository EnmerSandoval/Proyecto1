package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Buho  extends Animal{
    public Buho(){
        super(26, "Buho", 5, 3);
    }
    public Buho(int id, String nombreAnimal, int ataque, int vida){
        super(26, "Buho", 5, 3);
    }
    @Override
  public int getModDefense(Animal vida){
      return 3;
  }
}
