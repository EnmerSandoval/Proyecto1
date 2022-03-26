package ipc1.game;

import ipc1.game.animal.tier1.*;

public class Game {
     public static void main(String[] args) {
         Menu menu = new Menu();
         System.out.println(menu);
         Caballo caballo = new Caballo();
         Castor castor = new Castor();      
           System.out.println(caballo);
           System.out.println(castor);
     } 
}