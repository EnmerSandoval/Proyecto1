package ipc1.game.gameMechanism;

import ipc1.game.util.*;
import ipc1.game.Game;
import ipc1.game.typesGame.*;

public class Menu {

    Game game = new Game();

    public Menu() {
        textoMenu();
        eleccion();
    }

    CreativeMode creative = new CreativeMode();
    ArenaMode arena = new ArenaMode();
    VersusMode versus = new VersusMode();

    public static void textoMenu() {
        System.out.println("*****SUPER AUTO PETS*****");
        System.out.println("*****BIENVENIDO USUARIO*****");
        System.out.println("1.) Modo de juego Arena");
        System.out.println("2.) Modo de juego Versus");
        System.out.println("3.) Modo de juego Creativo");
        System.out.println("4.) Salir");
    }

    public void eleccion() {
        int opcionMenu = 0;
        while (opcionMenu != 4) {
            opcionMenu = Util.solicitarNumero("Ingrese la opcion que desea.", 1, 4);
            switch (opcionMenu) {
                case 1:
                    arena.arenaFunction();
                    break;
                case 2:
                    versus.versusFunction();
                    break;
                case 3:
                    creative.creativeFunction();
                    break;
                case 4:
                    System.out.println("Hasta la proxima");
                    break;
            }

        }
    }

}
