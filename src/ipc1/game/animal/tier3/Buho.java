package ipc1.game.animal.tier3;

import ipc1.game.animal.Animal;

public class Buho  extends Animal{
    public Buho(){
        super(26, "Buho", 5, 3, true);
    }
    public Buho(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(26, "Buho", 5, 3, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 3;
  }
}
