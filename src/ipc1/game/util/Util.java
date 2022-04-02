package ipc1.game.util;

import java.util.Random;
import java.util.Scanner;
import ipc1.game.animal.Animal;
import ipc1.game.animal.tier1.*;
import ipc1.game.animal.tier2.*;
import ipc1.game.animal.tier3.*;
import ipc1.game.animal.tier4.*;
import ipc1.game.animal.tier5.*;
import ipc1.game.animal.tier6.*;
import ipc1.game.animal.tier7.*;

// Investigar sobre la interfaz clone.
public class Util {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static Animal jaulaPlayer[] = new Animal[5];    
    public static Animal jaulaPlayerRival[] = new Animal[5];
    public static Animal jaulaTemporal[] = new Animal[5];
    public static Animal jaulaTemporal3[] = new Animal[3];
    public static Animal jaulaTemporal4[] = new Animal[4];
    public static Animal principal[] = new Animal[54];
  
    public  static Animal jaula[] = new Animal[]{
    principal[0] = new Hormiga(),principal[1] = new Pescado(), principal[2] = new Mosquito(), principal[3] = new Grillo(), principal[4] = new Castor(), principal[5] = new Caballo(),
    principal[6] = new Nutria(), principal[7] = new Escarabajo(), principal[8] = new Sapo(), principal[9] = new Dodo(), principal[10] = new Elefante(), principal[11] = new PuercoEspin(),
    principal[12] = new PavoReal(), principal[13] = new Rata(), principal[14] = new Zorro(), principal[15] = new Aranya(), principal[16] = new Camello(), principal[17] = new Mapache(),
    principal[18] = new Jirafa(), principal[19] = new Tortuga(), principal[20] = new Caracol(), principal[21] = new Oveja(), principal[22] = new Conejo(), principal[23] = new Lobo(),
    principal[24] = new Buey(), principal[25] = new Canguro(), principal[26] = new Buho(), principal[27] = new Venado(), principal[28] = new Loro(), principal[29] = new Hipopotamo(),
    principal[30] = new Delfin(), principal[31] = new Puma(), principal[32] = new Ballena(), principal[33] = new Ardilla(), principal [34] = new Llama(), principal[35] = new Foca(),
    principal[36] = new Jaguar(), principal[37] = new Escorpion(), principal[38] = new Rinoceronte(), principal[39] = new Mono(), principal[40] = new Cocodrilo(), principal[41] = new Vaca(), 
    principal[42] = new Chompipe(), principal[43] = new Panda(), principal[44] = new Gato(), principal[45] = new Tigre(), principal[46] = new Serpiente(), principal[47] = new Mamut(), 
    principal[48] = new Leopardo(), principal[49] = new Gorilla(), principal[50] = new Pulpo(), principal[51] = new Mosca(), principal[52] = new Quetzal(), principal[53] = new Camaleon()
    };
    
//Animales de Tier1
    Hormiga hormiga = new Hormiga();
    Pescado pescado = new Pescado();
    Mosquito mosquito = new Mosquito();
    Grillo grillo = new Grillo();
    Castor castor = new Castor();
    Caballo caballo = new Caballo();
    Nutria nutria = new Nutria();
    Escarabajo escarabajo = new Escarabajo();

    //Animales de Tier2
    Aranya aranya = new Aranya();
    Dodo dodo = new Dodo();
    Elefante elefante = new Elefante();
    PavoReal pavoReal = new PavoReal();
    PuercoEspin puercoEspin = new PuercoEspin();
    Rata rata = new Rata();
    Sapo sapo = new Sapo();
    Zorro zorro = new Zorro();

    //Animales de tier3
    Buey buey = new Buey();
    Buho buho = new Buho();
    Camello camello = new Camello();
    Canguro canguro = new Canguro();
    Caracol caracol = new Caracol();
    Conejo conejo = new Conejo();
    Jirafa jirafa = new Jirafa();
    Lobo lobo = new Lobo();
    Mapache mapache = new Mapache();
    Oveja oveja = new Oveja();
    Tortuga tortuga = new Tortuga();

    //Animales de Tier4
    Ardilla ardilla = new Ardilla();
    Ballena ballena = new Ballena();
    Delfin delfin = new Delfin();
    Hipopotamo hipopotamo = new Hipopotamo();
    Llama llama = new Llama();
    Loro loro = new Loro();
    Puma puma = new Puma();
    Venado venado = new Venado();

    //Animales de Tier5
    Chompipe chompipe = new Chompipe();
    Cocodrilo cocodrilo = new Cocodrilo();
    Escorpion escorpion = new Escorpion();
    Foca foca = new Foca();
    Jaguar jaguar = new Jaguar();
    Mono mono = new Mono();
    Rinoceronte rinoceronte = new Rinoceronte();
    Vaca vaca = new Vaca();

    //Animales de Tier6
    Gato gato = new Gato();
    Gorilla gorilla = new Gorilla();
    Leopardo leopardo = new Leopardo();
    Mamut mamut = new Mamut();
    Mosca mosca = new Mosca();
    Panda panda = new Panda();
    Pulpo pulpo = new Pulpo();
    Serpiente serpiente = new Serpiente();
    Tigre tigre = new Tigre();

    //Animales de Tier7
    Camaleon camaleon = new Camaleon();
    Quetzal quetzal = new Quetzal();

    /*
    public void idTier1(){
        hormiga.getId();
        pescado.getId();
        mosquito.getId();
        grillo.getId();
        castor.getId();
        caballo.getId();
        nutria.getId();
        escarabajo.getId();
    } */

    public static void generarJaula(int rondas){
        int numrandom1 = 0;
                            if (rondas < 4) {
                               
                                    switch (rondas) {
                                        case 1:
                                        for (int j = 0; j < 3; j++) {
                                            numrandom1 = Util.generarNumeroRandom(0, 7);
                                            for (int k = 0; k < Util.jaula.length; k++) {
                                                if(numrandom1 == k){
                                                    switch (j) {
                                                        case 0:
                                                            Util.jaulaTemporal3[0] = jaula[k];
                                                        break;
                                                        case 1:
                                                            Util.jaulaTemporal3[1] = jaula[k];
                                                        break;
                                                        case 2:
                                                            Util.jaulaTemporal3[2] = jaula[k];
                                                        break;
                                                    }                          
                                                }
                                            }
                                        }
                                        for (int i = 0; i < Util.jaulaTemporal3.length; i++) {
                                            System.out.println(i+""+jaulaTemporal3[i]);
                                        }
                                        break;
                                        case 2:
                                        for (int j = 0; j < 3; j++) {
                                            numrandom1 = Util.generarNumeroRandom(0, 15);
                                            for (int k = 0; k < Util.jaula.length; k++) {
                                                if(numrandom1 == k){
                                                    switch (j) {
                                                        case 0:
                                                            Util.jaulaTemporal3[0] = jaula[k];
                                                        break;
                                                        case 1:
                                                            Util.jaulaTemporal3[1] = jaula[k];
                                                        break;
                                                        case 2:
                                                            Util.jaulaTemporal3[2] = jaula[k];
                                                        break;
                                                    }                          
                                                }
                                            }
                                        }
                                        for (int i = 0; i < Util.jaulaTemporal3.length; i++) {
                                            System.out.println(i +" "+jaulaTemporal3[i]);
                                        }
                                        break;
                                        case 3:
                                        for (int j = 0; j < 3; j++) {
                                            numrandom1 = Util.generarNumeroRandom(0, 15);
                                            for (int i = 0; i < Util.jaula.length; i++) {
                                                if(numrandom1 == i){
                                                    switch (j) {
                                                        case 0:
                                                            Util.jaulaTemporal3[0] = jaula[i];
                                                        break;
                                                        case 1:
                                                            Util.jaulaTemporal3[1] = jaula[i];
                                                        break;
                                                        case 2:
                                                            Util.jaulaTemporal3[2] = jaula[i];
                                                        break;
                                                    }                          
                                                }
                                            }
                                        }
                                        for (int i = 0; i < Util.jaulaTemporal3.length; i++) {
                                            System.out.println(i +" "+jaulaTemporal3[i]);
                                        }
                                        break;
                                    }
                                    
                            }
                            

                            //Si la ronda es mayor que 4 y menos que 7 generar 4 animales aleatorios en tienda
                            if (rondas > 4 && rondas < 7){
                                
                                    switch (rondas) {
                                        case 4:
                                        for (int j = 0; j < 4; j++) {
                                            numrandom1 = Util.generarNumeroRandom(0, 26);
                                            for (int i = 0; i < Util.jaula.length; i++) {
                                                if(numrandom1 == i){
                                                    switch (j) {
                                                        case 0:
                                                            Util.jaulaTemporal4[0] = jaula[i];
                                                        break;
                                                        case 1:
                                                            Util.jaulaTemporal4[1] = jaula[i];
                                                        break;
                                                        case 2:
                                                            Util.jaulaTemporal4[2] = jaula[i];
                                                        break;
                                                        case 3:
                                                            Util.jaulaTemporal4[3] = jaula[i];
                                                        break;
                                                    }                          
                                                }
                                            }
                
                                        }
                                        for (int i = 0; i < Util.jaulaTemporal4.length; i++) {
                                            System.out.println(i +" "+jaulaTemporal4[i]);
                                        }
                                        break;
                                        case 5:
                                        for (int j = 0; j < 4; j++) {
                                            numrandom1 = Util.generarNumeroRandom(0, 26);
                                            for (int i = 0; i < Util.jaula.length; i++) {
                                                if(numrandom1 == i){
                                                    switch (j) {
                                                        case 0:
                                                            Util.jaulaTemporal4[0] = jaula[i];
                                                        break;
                                                        case 1:
                                                            Util.jaulaTemporal4[1] = jaula[i];
                                                        break;
                                                        case 2:
                                                            Util.jaulaTemporal4[2] = jaula[i];
                                                        break;
                                                        case 3:
                                                            Util.jaulaTemporal4[3] = jaula[i];
                                                        break;
                                                    }                          
                                                }
                                            }
                
                                        }
                                        for (int i = 0; i < Util.jaulaTemporal4.length; i++) {
                                            System.out.println(i +" "+jaulaTemporal4[i]);
                                        }
                                        break;
                                        case 6:
                                        for (int j = 0; j < 4; j++) {
                                            numrandom1 = Util.generarNumeroRandom(0, 34);
                                            for (int i = 0; i < Util.jaula.length; i++) {
                                                if(numrandom1 == i){
                                                    switch (j) {
                                                        case 0:
                                                            Util.jaulaTemporal4[0] = jaula[i];
                                                        break;
                                                        case 1:
                                                            Util.jaulaTemporal4[1] = jaula[i];
                                                        break;
                                                        case 2:
                                                            Util.jaulaTemporal4[2] = jaula[i];
                                                        break;
                                                        case 3:
                                                            Util.jaulaTemporal4[3] = jaula[i];
                                                        break;
                                                    }                          
                                                }
                                            }
                
                                        }
                                        for (int i = 0; i < Util.jaulaTemporal4.length; i++) {
                                            System.out.println(i +" "+jaulaTemporal4[i]);
                                        }
                                        break;
                                    }
                                }    

                            if (rondas >= 7) {
                                    switch (rondas){
                                        case 7:
                                        for (int j = 0; j < 5; j++) {
                                            numrandom1 = Util.generarNumeroRandom(0, 34);
                                            for (int i = 0; i < Util.jaula.length; i++) {
                                                if(numrandom1 == i){
                                                    switch (j) {
                                                        case 0:
                                                            Util.jaulaTemporal[0] = jaula[i];
                                                        break;
                                                        case 1:
                                                            Util.jaulaTemporal[1] = jaula[i];
                                                        break;
                                                        case 2:
                                                            Util.jaulaTemporal[2] = jaula[i];
                                                        break;
                                                        case 3:
                                                            Util.jaulaTemporal[3] = jaula[i];
                                                        break;                
                                                        case 4:
                                                            Util.jaulaTemporal[3] = jaula[i];                           
                                                        break;                
                                                    }
                                                }
                                             }
                                        }
                                        for (int i = 0; i < Util.jaulaTemporal.length; i++) {
                                            System.out.println(i +" "+jaulaTemporal[i]);
                                        }
                                        break;
                                        case 8:
                                        for (int j = 0; j < 5; j++) {
                                            numrandom1 = Util.generarNumeroRandom(0, 42);
                                            for (int i = 0; i < Util.jaula.length; i++) {
                                                if(numrandom1 == i){
                                                    switch (j) {
                                                        case 0:
                                                            Util.jaulaTemporal[0] = jaula[i];
                                                        break;
                                                        case 1:
                                                            Util.jaulaTemporal[1] = jaula[i];
                                                        break;
                                                        case 2:
                                                            Util.jaulaTemporal[2] = jaula[i];
                                                        break;
                                                        case 3:
                                                            Util.jaulaTemporal[3] = jaula[i];
                                                        break;                
                                                        case 4:
                                                            Util.jaulaTemporal[4] = jaula[i];                           
                                                        break;                
                                                    }
                                                }
                                             }
                                        }
                                        for (int i = 0; i < Util.jaulaTemporal.length; i++) {
                                            System.out.println(i +" "+jaulaTemporal[i]);
                                        }
                                        break;
                                        case 9:
                                        for (int j = 0; j < 5; j++) {
                                            numrandom1 = Util.generarNumeroRandom(0, 42);
                                            for (int i = 0; i < Util.jaula.length; i++) {
                                                if(numrandom1 == i){
                                                    switch (j) {
                                                        case 0:
                                                            Util.jaulaTemporal[0] = jaula[i];
                                                        break;
                                                        case 1:
                                                            Util.jaulaTemporal[1] = jaula[i];
                                                        break;
                                                        case 2:
                                                            Util.jaulaTemporal[2] = jaula[i];
                                                        break;
                                                        case 3:
                                                            Util.jaulaTemporal[3] = jaula[i];
                                                        break;                
                                                        case 4:
                                                            Util.jaulaTemporal[3] = jaula[i];                           
                                                        break;                
                                                    }
                                                }
                                             }
                                        }
                                        for (int i = 0; i < Util.jaulaTemporal.length; i++) {
                                            System.out.println(i +" "+jaulaTemporal[i]);
                                        }
                                        break;
                                        case 10:
                                        for (int j = 0; j < 5; j++) {
                                            numrandom1 = Util.generarNumeroRandom(0, 51);
                                            for (int i = 0; i < Util.jaula.length; i++) {
                                                if(numrandom1 == i){
                                                    switch (j) {
                                                        case 0:
                                                            Util.jaulaTemporal[0] = jaula[i];
                                                        break;
                                                        case 1:
                                                            Util.jaulaTemporal[1] = jaula[i];
                                                        break;
                                                        case 2:
                                                            Util.jaulaTemporal[2] = jaula[i];
                                                        break;
                                                        case 3:
                                                            Util.jaulaTemporal[3] = jaula[i];
                                                        break;                
                                                        case 4:
                                                            Util.jaulaTemporal[3] = jaula[i];                           
                                                        break;                
                                                    }
                                                }
                                             }
                                        }
                                        for (int i = 0; i < Util.jaulaTemporal.length; i++) {
                                            System.out.println(i +" "+jaulaTemporal[i]);
                                        }
                                        break;
                                        case 11:
                                        for (int j = 0; j < 5; j++) {
                                            numrandom1 = Util.generarNumeroRandom(0, 51);
                                            for (int i = 0; i < Util.jaula.length; i++) {
                                                if(numrandom1 == i){
                                                    switch (j) {
                                                        case 0:
                                                            Util.jaulaTemporal[0] = jaula[i];
                                                        break;
                                                        case 1:
                                                            Util.jaulaTemporal[1] = jaula[i];
                                                        break;
                                                        case 2:
                                                            Util.jaulaTemporal[2] = jaula[i];
                                                        break;
                                                        case 3:
                                                            Util.jaulaTemporal[3] = jaula[i];
                                                        break;                
                                                        case 4:
                                                            Util.jaulaTemporal[3] = jaula[i];                           
                                                        break;                
                                                    }
                                                }
                                             }
                                        }
                                        for (int i = 0; i < Util.jaulaTemporal.length; i++) {
                                            System.out.println(i +" "+jaulaTemporal[i]);
                                        }
                                        break;
                                        case 12:
                                        numrandom1 = Util.generarNumeroRandom(0, 53);
                                        for (int j = 0; j < 5; j++) {
                                            for (int i = 0; i < Util.jaula.length; i++) {
                                                if(numrandom1 == i){
                                                    switch (j) {
                                                        case 0:
                                                            Util.jaulaTemporal[0] = jaula[i];
                                                        break;
                                                        case 1:
                                                            Util.jaulaTemporal[1] = jaula[i];
                                                        break;
                                                        case 2:
                                                            Util.jaulaTemporal[2] = jaula[i];
                                                        break;
                                                        case 3:
                                                            Util.jaulaTemporal[3] = jaula[i];
                                                        break;                
                                                        case 4:
                                                            Util.jaulaTemporal[3] = jaula[i];                           
                                                        break;                
                                                    }
                                                }
                                             }
                                        }
                                        for (int i = 0; i < Util.jaulaTemporal.length; i++) {
                                            System.out.println(i +" "+jaulaTemporal[i]);
                                        }
                                        break;
                                    }
                                
                                }
    }

    public static void compraAnimales(){
        int oro = 10;
        int rol = Util.solicitarNumero("0 = no, 1 = si", 0, 1);
            if (rol == 1){
                int seleccion = Util.solicitarNumero("Que animal desea comprar indique el animal conforme al indice que se le dio", 0, 3);
                for (int j = 0; j < jaulaTemporal3.length; j++) {
                        if (seleccion == j) {
                                switch (seleccion) {
                                    case 0:
                                    jaulaPlayer[0] = jaulaTemporal3[0];
                                    System.out.println("Estamos en el case 0"); 
                                    oro = oro - 3;
                                    break;
                                    case 1:
                                    jaulaPlayer[1] = jaulaTemporal3[1]; 
                                    System.out.println("case 1" + oro);
                                    break;
                                    case 2:
                                    jaulaPlayer[2] = jaulaTemporal3[2]; 
                                    System.out.println("Case 2" + oro);
                                    break;                                    
                                }
                        }
                        
                }
                
                //System.out.println("case 0 " + oro);
                //System.out.println("Tiene de oro: "+oro);
                System.out.println("Tiene de oro: " +oro);
                for (int i = 0; i < jaulaPlayer.length; i++) {
                    System.out.println("Su equipo es: "+jaulaPlayer[i]);
                }
        } else {
            for (int i = 0; i < jaulaPlayer.length; i++) {    
                System.out.println("Su equipo es: "+jaulaPlayer[i]);
            }
        }                               
    }

    public static void compraAnimalesRival(){
        int oro = 10;
        int rol = Util.solicitarNumero("0 = no, 1 = si", 0, 1);
        if (rol == 1){
            do {
                int seleccion = Util.solicitarNumero("Que animal desea comprar indique el animal conforme al indice que se le dio", 0, 3);
                for (int i = 0; i < jaulaPlayerRival.length; i++) {
                    for (int j = 0; j < jaulaTemporal3.length; j++) {
                        if (seleccion == j) {
                            if(jaulaPlayerRival[i] == null){
                                jaulaPlayerRival[i] = jaulaTemporal3[0]; 
                            }
                        }
                    }
                }
                oro = oro - 3;
            } while (oro >= 3);
            System.out.println("Tiene de oro: " +oro);
            for (int i = 0; i < jaulaPlayerRival.length; i++) {
                System.out.println("El equipo del rival es:  "+jaulaPlayerRival[i]);
            }
        } else {
            for (int i = 0; i < jaulaPlayerRival.length; i++) {    
                System.out.println("Su equipo es: "+jaulaPlayerRival[i]);
            }
        }                   
    }

    public static void ataque(){
        System.out.println("******INICIA LA PELEA*****");
        System.out.println();
        for (int i = 0; i < Util.jaulaPlayer.length; i++) {
            for (int j = 0; j < Util.jaulaPlayerRival.length; j++) {
                if (Util.jaulaPlayer[0] != null && Util.jaulaPlayerRival[0] != null){
                    Util.jaulaPlayer[0].setVida(Util.jaulaPlayerRival[0].getAtaque() - Util.jaulaPlayer[0].getVida());
                    if (Util.jaulaPlayer[0].getVida() <= 0) {
                        Util.jaulaPlayer[0].setVida(0);
                        Util.jaulaPlayer[0].setEstado(false);
                    }
                    // Boolean Cuando termine la pelea todos vivos
                    //Atributo vivo o muerto si este animal 0 Se muere YA pasaria a la posicion de 1 del arreglo 
                } else{
                    // System.out.println("No hay nadie en tu equipo PUNIETAS");
                }
            }
        }
        System.out.println("Ataca el animal" + Util.jaulaPlayer[0]);
        System.out.println("Su vida es" +jaulaPlayer[0].getVida()+"Estamos luchando animo");
    }
    
    public static void contraAtaque(){
        System.out.println("El rival ataca");
        System.out.println();
                if (jaulaPlayerRival[0+1] != null && jaulaPlayer[0] != null) {
                    Util.jaulaPlayerRival[0].setVida(Util.jaulaPlayer[0].getAtaque() - Util.jaulaPlayerRival[0].getVida());
                    if(Util.jaulaPlayerRival[0].getVida() <= 0){
                        Util.jaulaPlayerRival[0].setVida(0);  
                        Util.jaulaPlayerRival[0].setEstado(false);  
                    }
                    
                }else {
                    System.out.println("No hay pelea. Rayos yo queria ver golpes");
                }
                
        System.out.println(jaulaPlayerRival[0]+" El principal ataco");
    }



    public static int generarNumeroRandom(int min, int max) {
        // int tmp = random.nextInt(max-min)+min;
        // System.out.println(tmp);

        // return tmp;
        return random.nextInt(max - min) + min;
    }

    public static int solicitarNumero(String mensaje, int limiteInferior, int limiteSuperior) {
        int numeroIngresado = 0;
        boolean hayErrorNumeroIngresado = false;
        do {
            try {

                System.out.println("\n" + mensaje);
                numeroIngresado = scanner.nextInt();
                if ((numeroIngresado >= limiteInferior) && (numeroIngresado <= limiteSuperior)) {
                    hayErrorNumeroIngresado = false;
                } else {
                    hayErrorNumeroIngresado = true;
                    System.out.println(
                            "Debe ingresar un número entre [" + limiteInferior + " . . " + limiteSuperior + "]");
                    System.out.println("Ingrese de nuevo.");
                }
            } catch (Exception e) {
                hayErrorNumeroIngresado = true;
                System.out.println(
                        "Debe ingresar un número entre [" + limiteInferior + " . . " + limiteSuperior + "]");
                System.out.println("Ingrese un numero entero.");

            }
            scanner.nextLine();
        } while (hayErrorNumeroIngresado);
        return numeroIngresado;
    }

    public static String solicitarString(String mensaje) {
        String respuesta = "";
        boolean hayErrorStringIngresado = false;

        do {
            System.out.println("\n" + mensaje);
            respuesta = scanner.nextLine();
            // scanner.nextLine();//probar
            respuesta = respuesta.trim();
            if (respuesta.length() > 0) {
                hayErrorStringIngresado = false;
            } else {
                hayErrorStringIngresado = true;
                System.out.println("Ingresa un caracter como minimo.");
            }

        } while (hayErrorStringIngresado);

        return respuesta;
    }

}