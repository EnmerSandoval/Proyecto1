package ipc1.game;

import ipc1.game.util.Util;

public class SubMenu {
    public static int opcionMenu, oro = 10, vidaPlayer = 10, victorias = 0;

    public SubMenu(){
        
    }
    
    public void texto(){
        System.out.println("*****TIENDA DE ANIMALES******");
        System.out.println("Tiene " + vidaPlayer +" vidas");
        System.out.println("Tiene " + oro +" de oro");
        System.out.println("Tiene " + victorias +" victorias");
        System.out.println("Su equipo es: (Esta vacio)");
        System.out.println("Puede comprar los siguientes animales.");
        Util.generarJaula();

        
        if (oro > 0){
            System.out.println("Desea comprar algun animal");
            //metodo rellenar matriz

            System.out.println("Desea actualizar el listado de animales? ");
                    int seleccion;
                    seleccion = Util.solicitarNumero("Si = 1, No = 2", 1, 2);

                    if (seleccion == 1){
                        Util.generarJaula();
                    } else{
                        //desea comprar algun animal.
                    }
                    System.out.println("Desea comprar alguno");
                    int compra = Util.solicitarNumero("SI = 1, No = 2", 1, 2);
                   
                        if (compra == 1 ){
                            oro--;
                            System.out.println("Le quedan de oro: " +oro);
                        
                    } 
        }


    }

    
}
