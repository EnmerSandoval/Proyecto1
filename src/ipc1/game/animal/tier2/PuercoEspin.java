package ipc1.game.animal.tier2;

import ipc1.game.animal.Animal;

public class PuercoEspin extends Animal {
    public PuercoEspin(){
        super(11, "Puerco Espin", 3, 2, true);
    }
    public PuercoEspin(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(11, "Puerco Espin", 3, 2, true);
    }
  @Override
  public int getModDefense(Animal vida){
      return 2;
  }
}
