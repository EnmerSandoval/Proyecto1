package ipc1.game.animal.tier1;

import ipc1.game.animal.Animal;

public class Caballo extends Animal {

    public Caballo() {
        super(5, "Caballo", 2, 1, true);
    }
    public Caballo(int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
          super(id = 5, "Caballo", 2, 1, true);
    }
    @Override
    public int getModDefense(Animal ataque){
      return 2;
    }
}
