package ipc1.game;

import ipc1.game.animal.tier1.*;
import ipc1.game.animal.tier5.Mono;

 public class Game {
    public static void main(String[] args) {
        Caballo castor = new Caballo();
        System.out.println(castor); 
        Mono p2 = new Mono(0,"mono",0,0);
        System.out.println(p2);
        
        
    } 
}