package ipc1.game.animal.tier1;

import ipc1.game.animal.Animal;
import ipc1.game.animal.tipos.Volador;

public class Mosquito extends Animal {
    public Mosquito(){
        super(2, "Mosquito", 2, 2, 1, true, new Volador(), null);
    }
    /* 
        Al realizar la batalla mostrar en el cartel que genera daño al rival seleccionado al azar 1 o 2 o3 enemigos
        generados al azar de JaulaPlayerRival
    */
}
