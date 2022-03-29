package ipc1.game.animal.tier5;

import ipc1.game.animal.Animal;

public class Rinoceronte extends Animal {
    public Rinoceronte(){
        super(38, "Rinoceronte", 5, 8, true);
    }
    public Rinoceronte(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        super(38, "Rinoceronte", 5, 8, true);
    }
    @Override
  public int getModDefense(Animal vida){
      return 8;
  }
}
