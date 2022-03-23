package ipc1.game.animal.tier2;

import ipc1.game.animal.Animal;

public class PuercoEspin extends Animal {
    public PuercoEspin(int id, String nombreAnimal, int ataque, int vida){
        super(11, "Puerco Espin", 3, 2);
    }
  @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
