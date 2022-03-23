package ipc1.game.animal.tier4;

import ipc1.game.animal.Animal;

public class Llama extends Animal {
    public Llama(){
        super(34, "Llama", 3, 6);
    }
    public Llama(int id, String nombreAnimal, int ataque, int vida){
        super(34, "Llama", 3, 6);
    }
    @Override
  public int getModDefense(Animal vida){
      return 6;
  }
}
