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
// import ipc1.game.animal.Animal;
// Investigar sobre la interfaz clone. 

public class Util {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();


    
   Animal[] arreglo = new Animal[54];

   Animal[] = new Animal[] 
   {
    arreglo[0] = new Hormiga(),arreglo[1] = new Pescado(), arreglo[2] = new Mosquito(), arreglo[3] = new Grillo(), arreglo[4] = new Castor(), arreglo[5] = new Caballo(),
    arreglo[6] = new Nutria(), arreglo[7] = new Escarabajo(), arreglo[8] = new Sapo(), arreglo[9] = new Dodo(), arreglo[10] = new Elefante(), arreglo[11] = new PuercoEspin(),
    arreglo[12] = new PavoReal(), arreglo[13] = new Rata(), arreglo[14] = new Zorro(), arreglo[15] = new Aranya(), arreglo[16] = new Camello(), arreglo[17] = new Mapache(),
    arreglo[18] = new Jirafa(), arreglo[19] = new Tortuga(), arreglo[20] = new Caracol(), arreglo[21] = new Oveja(), arreglo[22] = new Conejo(), arreglo[23] = new Lobo(),
    arreglo[24] = new Buey(), arreglo[25] = new Canguro(), arreglo[26] = new Buho(), arreglo[27] = new Venado(), arreglo[28] = new Loro(), arreglo[29] = new Hipopotamo(),
    arreglo[30] = new Delfin(), arreglo[31] = new Puma(), arreglo[32] = new Ballena(), arreglo[33] = new Ardilla(), arreglo [34] = new Llama(), arreglo[35] = new Foca(),
    arreglo[36] = new Jaguar(), arreglo[37] = new Escorpion(), arreglo[38] = new Rinoceronte(), arreglo[39] = new Mono(), arreglo[40] = new Cocodrilo(), arreglo[41] = new Vaca(), 
    arreglo[42] = new Chompipe(), arreglo[43] = new Panda(), arreglo[44] = new Gato(), arreglo[45] = new Tigre(), arreglo[46] = new Serpiente(), arreglo[47] = new Mamut(), 
    arreglo[48] = new Leopardo(), arreglo[49] = new Gorilla(), arreglo[50] = new Pulpo(), arreglo[51] = new Mosca(), arreglo[52] = new Quetzal(), arreglo[53] = new Camaleon()
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