package ipc1.game.gameMechanism;

import ipc1.game.util.Util;

public class GameOperation {
    public int oro = 10;
    public GameOperation(){

    }

    public void modeArena(){

    }

    public void modeVersus(int p2){
       if (oro > 2){
           Util.compraAnimales();
       }
    }

    public void modeCreative(){

    }

    public void marketPlace(){
        
    }
}
