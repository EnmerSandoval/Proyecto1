package ipc1.game;

import ipc1.game.util.*;

public class Menu {
    //ModoArena modoArena = new ModoArena();
    //ModoCreativo modoCreativo = new ModoCreativo();
    //ModoArena modoArena = new ModoArena();

    public Menu (){
        System.out.println("*****SUPER AUTO PETS*****");
        System.out.println("*****BIENVENIDO USUARIO*****");
        System.out.println("1.) Modo de juego Arena");
        System.out.println("2.) Modo de juego Versus");
        System.out.println("3.) Modo de juego Creativo");
        System.out.println(Util.solicitarNumero("4. Salir \n Ingrese la opcion que desea.", 1, 4));
    }
    
}
