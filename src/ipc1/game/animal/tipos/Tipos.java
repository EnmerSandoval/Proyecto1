package ipc1.game.animal.tipos;


public abstract class Tipos {
 
    public Tipos() {
        
    }

    public abstract void ejecutarPuntos();  //Metodo

    /* Si el mapa es el de tierra ejecutar este metodo
        en cualquier mapa por que se esta heredando entonces si terrestre = true entonces vida y ataque +1
        Se maneja desde cada tipo de animal teniendo un funcionamiento diferente.
    */
}
