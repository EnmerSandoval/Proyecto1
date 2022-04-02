package ipc1.game.gameMechanism;


public class SubMenu {
    public static int opcionMenu, oro = 10, vidaPlayer = 10, victorias = 0;
    
    public SubMenu(){
        texto();
    }
    
    public void texto(){
       System.out.println("*****TIENDA DE ANIMALES******");
       System.out.println("                                                                            Tiene " + vidaPlayer +" vidas");
       System.out.println("                                                                            Tiene " + oro +" de oro");
       System.out.println("                                                                            Tiene " + victorias +" victorias");
       System.out.println("                                                                            Su equipo es: (Esta vacio)");
       System.out.println("Puede comprar los siguientes animales.");
       //int rondas = 8;
        //Util.generarJaula(rondas);
       //System.out.println("Ya se generaron los animales.");
       // Util.compraAnimales();
       //System.out.println("Usted si compro animales");
       //Util.generarJaula(rondas);
       //Util.compraAnimalesRival();
       //Util.ataque();
       //Util.contraAtaque();
    }  
}
