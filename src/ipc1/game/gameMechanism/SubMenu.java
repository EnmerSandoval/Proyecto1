package ipc1.game.gameMechanism;


public class SubMenu {
    public static int opcionMenu, oro = 10, vidaPlayer = 10, victorias = 0;
    
    public SubMenu(){
        
    }
    
    public void texto(int vidaPlayer, int victorias){
       System.out.println("*****TIENDA DE ANIMALES******");
       System.out.println("                                                                            Tiene " + vidaPlayer +" vidas");
       System.out.println("                                                                            Tiene " + oro +" de oro");
       System.out.println("                                                                            Tiene " + victorias +" victorias");
       
    }  
}
