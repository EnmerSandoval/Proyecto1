package ipc1.game.typesGame;

import ipc1.game.gameMechanism.SubMenu;
import ipc1.game.util.Jaula;

public class VersusMode {
    private int oroVersus = 10;
    private int vidaVersus = 10;
    private int victoriasVersus = 10;
    private int rondas = 1;

    public VersusMode(){
        
    }

    public void versusFunction(){
        SubMenu sub = new SubMenu();
        Jaula.generarJaula(rondas);
        Jaula.llenadoPlayer(rondas);
        System.out.println();
        System.out.println("Player 2");
        Jaula.generarJaula(rondas);
        Jaula.compraAnimalesRival();
        Jaula.ataque();
        Jaula.contraAtaque();
        rondas = rondas + 1;
    }
}
