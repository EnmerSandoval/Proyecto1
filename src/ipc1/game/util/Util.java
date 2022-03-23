package ipc1.game.util;

import java.util.Random;
import java.util.Scanner;
import ipc1.game.animal.tier1.*;
import ipc1.game.animal.tier2.*;
import ipc1.game.animal.tier3.*;
import ipc1.game.animal.tier4.*;
import ipc1.game.animal.tier5.*;
import ipc1.game.animal.tier6.*;
import ipc1.game.animal.tier7.*;
// import ipc1.game.animal.Animal;

public class Util {

    //Animales de Tier1
    public static Hormiga hormiga = new Hormiga();
    public static Pescado pescado = new Pescado();        
    public static Mosquito mosquito = new Mosquito();
    public static Grillo grillo = new Grillo();
    public static Castor castor = new Castor();
    public static Caballo caballo = new Caballo();
    public static Nutria nutria = new Nutria();
    public static Escarabajo escarabajo = new Escarabajo();

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

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

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

    public static int generarEquipoTier1(){
        int tmp = 0;
        for (int i = 0; i <=2; i++) {
            tmp = generarNumeroRandom(0, 7);
               
             switch (tmp) {
                    case 0:
                    System.out.println("case 0 " + hormiga);    
                    //return hormiga;
                            break;          
                            case 1:
                            System.out.println("Case 1 " + pescado);
                            break;           
                            case 2:
                            System.out.println("Case 2 " + mosquito);
                            break;           
                            case 3:
                            System.out.println("Case 3" + grillo);
                            break; 
                            case 4:
                            System.out.println("Case 4" + castor);
                            break; 
                            case 5:
                            System.out.println("case 5 " +caballo);
                            break; 
                            case 6:
                            System.out.println("case 6 " + nutria);
                            break; 
                            case 7:
                            System.out.println("case 7 " +escarabajo);          
                            break; 
                    }
        }
        
        return tmp;
    }


}
