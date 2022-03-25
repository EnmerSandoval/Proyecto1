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
// Investigar sobre la interfaz clone. 

public class Util {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    
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