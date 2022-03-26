package ipc1.game.animal.tier1;

import ipc1.game.animal.Animal;

public class Caballo extends Animal {

    public Caballo() {
        super(5, "Caballo", 2, 1);
    }
    public Caballo(int id, String nombreAnimal, int ataque, int vida){
          super(id = 5, "Caballo", 2, 1);
    }
    @Override
    public int getModDefense(Animal ataque){
      return 2;
    }
}
