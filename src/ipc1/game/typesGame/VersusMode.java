package ipc1.game.typesGame;

import ipc1.game.gameMechanism.SubMenu;
import ipc1.game.util.Util;

public class VersusMode {
    private int oroVersus = 10;
    private int vidaVersus = 10;
    private int victoriasVersus = 10;
    private int rondas = 1;

    public VersusMode(){
        versusFunction();
    }

    public void versusFunction(){
        SubMenu sub = new SubMenu();

        sub.texto();
        Util.generarJaula(rondas);
        Util.compraAnimales();
        Util.generarJaula(rondas);
        Util.compraAnimalesRival();
        Util.ataque();
        Util.contraAtaque();
    }
}
