package ipc1.game.gameMechanism;

import ipc1.game.util.*;
import ipc1.game.Game;
// import ipc1.game.animal.Animal;
// import ipc1.game.animal.tier2.*;
// import ipc1.game.animal.tier3.*;
// import ipc1.game.animal.tier4.*;
// import ipc1.game.animal.tier5.*;
// import ipc1.game.animal.tier6.*;
// import ipc1.game.animal.tier7.*;



public class Menu {
    //ModoArena modoArena = new ModoArena();
    //ModoCreativo modoCreativo = new ModoCreativo();
    //ModoArena modoArena = new ModoArena();

    Game game = new Game();
    public Menu (){
        // System.out.println("*****SUPER AUTO PETS*****");
        // System.out.println("*****BIENVENIDO USUARIO*****");
        // System.out.println("1.) Modo de juego Arena");
        // System.out.println("2.) Modo de juego Versus");
        // System.out.println("3.) Modo de juego Creativo");
        // System.out.println("4.) Salir");
        //Util.solicitarNumero("Ingrese la opcion que desea.", 1, 4);
        //Caballo p1 = new Caballo();
        //Castor p2 = new Castor();
        //System.out.println(p1);
        //System.out.println(p2);
        //p1.attack(p2);
        //p2.attack(p1);

        int numrandom = 0;
        for (int j = 0; j < 3; j++) {
            numrandom = Util.generarNumeroRandom(0, 53);
            System.out.println("El numero random es:" +numrandom);
            for (int i = 0; i < Util.jaula.length; i++) {
                if(numrandom == i){

                    System.out.println("El animal es" + Util.jaula[i]);
                }
            }
        }
            
        for (int i = 0; i < Util.jaula.length; i++) {
            System.out.println(Util.jaula[i]);
        }

    }

    
}
