package ipc1.game.typesGame;

import ipc1.game.util.Jaula;

public class VersusMode {
    private int rondas = 1;

    public VersusMode(){
        
    }

    public void versusFunction(){
        
        //System.out.println("Player 2");
        //Jaula.generarJaula(rondas);
        //Jaula.llenadoPlayerRival(rondas);
        Jaula.ataque(rondas);
    }
}
