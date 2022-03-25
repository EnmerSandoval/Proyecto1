package ipc1.game;

import ipc1.game.util.*;
import ipc1.game.animal.tier1.*;

public class Menu {
    //ModoArena modoArena = new ModoArena();
    //ModoCreativo modoCreativo = new ModoCreativo();
    //ModoArena modoArena = new ModoArena();

    Game game = new Game();
    public Menu (){
        System.out.println("*****SUPER AUTO PETS*****");
        System.out.println("*****BIENVENIDO USUARIO*****");
        System.out.println("1.) Modo de juego Arena");
        System.out.println("2.) Modo de juego Versus");
        System.out.println("3.) Modo de juego Creativo");
        System.out.println("4.) Salir");
        Util.solicitarNumero("Ingrese la opcion que desea.", 1, 4);
        Caballo p1 = new Caballo();
        Castor p2 = new Castor();
        p1.attack(p2);
        p2.attack(p1);
    }

    public void opcionMenu(int opcionMenu){
        switch (opcionMenu) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }
    
}
