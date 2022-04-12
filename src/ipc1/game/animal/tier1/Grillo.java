package ipc1.game.animal.tier1;


import ipc1.game.animal.tipos.*;
import ipc1.game.animal.Animal;

public class Grillo extends Animal {
    public Grillo(){
        super(3, "Grillooo", 1, 2, 1, true, new Insecto(), null);
    }
    /* 
        Al morir iguala la posicion del array con un zombie de 1/1 2/2 3/3 de vida y ataque.
        y si boolean es falsa llama a Grillo Zombie si es nivel 2 establecer 2/2 etc...
    */
}
