package ipc1.game.util;

import ipc1.game.animal.Animal;
import ipc1.game.animal.tier1.*;
import ipc1.game.animal.tier2.*;
import ipc1.game.animal.tier3.*;
import ipc1.game.animal.tier4.*;
import ipc1.game.animal.tier5.*;
import ipc1.game.animal.tier6.*;
import ipc1.game.animal.tier7.*;
import ipc1.game.gameMechanism.SubMenu;

public class Jaula {
    public static Animal jaulaPlayer[] = new Animal[5];
    public static Animal jaulaPlayerRival[] = new Animal[5];
    public static Animal jaulaTemporal[] = new Animal[5];
    public static Animal jaulaTemporal3[] = new Animal[3];
    public static Animal jaulaTemporal4[] = new Animal[4];
    public static Animal principal[] = new Animal[54];

    /*
     * Arreglo de enteros buscar el id de los animales si coincide crear un objeto
     * con el id. getId
     * Cuando genere un caballo no llamar a ese si a un nuevo caballo New caballo
     */

    public static Animal jaula[] = new Animal[] {
            principal[0] = new Hormiga(), principal[1] = new Pescado(), principal[2] = new Mosquito(),
            principal[3] = new Grillo(), principal[4] = new Castor(), principal[5] = new Caballo(),
            principal[6] = new Nutria(), principal[7] = new Escarabajo(), principal[8] = new Sapo(),
            principal[9] = new Dodo(), principal[10] = new Elefante(), principal[11] = new PuercoEspin(),
            principal[12] = new PavoReal(), principal[13] = new Rata(), principal[14] = new Zorro(),
            principal[15] = new Aranya(), principal[16] = new Camello(), principal[17] = new Mapache(),
            principal[18] = new Jirafa(), principal[19] = new Tortuga(), principal[20] = new Caracol(),
            principal[21] = new Oveja(), principal[22] = new Conejo(), principal[23] = new Lobo(),
            principal[24] = new Buey(), principal[25] = new Canguro(), principal[26] = new Buho(),
            principal[27] = new Venado(), principal[28] = new Loro(), principal[29] = new Hipopotamo(),
            principal[30] = new Delfin(), principal[31] = new Puma(), principal[32] = new Ballena(),
            principal[33] = new Ardilla(), principal[34] = new Llama(), principal[35] = new Foca(),
            principal[36] = new Jaguar(), principal[37] = new Escorpion(), principal[38] = new Rinoceronte(),
            principal[39] = new Mono(), principal[40] = new Cocodrilo(), principal[41] = new Vaca(),
            principal[42] = new Chompipe(), principal[43] = new Panda(), principal[44] = new Gato(),
            principal[45] = new Tigre(), principal[46] = new Serpiente(), principal[47] = new Mamut(),
            principal[48] = new Leopardo(), principal[49] = new Gorilla(), principal[50] = new Pulpo(),
            principal[51] = new Mosca(), principal[52] = new Quetzal(), principal[53] = new Camaleon()
    };
    public static SubMenu sub = new SubMenu();

    private static void randomJaula(int tierMaximo, int cantidadAnimales) {
        int numrandom1 = 0;
        for (int j = 0; j < cantidadAnimales; j++) {
            numrandom1 = Util.generarNumeroRandom(0, tierMaximo);
            if (numrandom1 < Jaula.jaula.length) {
                switch (cantidadAnimales) {
                    case 3:
                        Jaula.jaulaTemporal3[j] = (Animal) Jaula.jaula[numrandom1].clone();
                        break;
                    case 4:
                        Jaula.jaulaTemporal4[j] = (Animal) Jaula.jaula[numrandom1].clone();
                        break;
                    case 5:
                        Jaula.jaulaTemporal[j] = (Animal) Jaula.jaula[numrandom1].clone();
                        break;
                }
            }
        }
        if (cantidadAnimales <= 3) {
            for (int i = 0; i < Jaula.jaulaTemporal3.length; i++) {
                System.out.println(i + "" + Jaula.jaulaTemporal3[i]);
            }
        } else if (cantidadAnimales <= 4) {
            for (int i = 0; i < jaulaTemporal4.length; i++) {
                System.out.println(i + "" + Jaula.jaulaTemporal4[i]);
            }
        } else if (cantidadAnimales <= 5) {
            for (int i = 0; i < jaulaTemporal.length; i++) {
                System.out.println(i + "" + Jaula.jaulaTemporal[i]);
            }
        }
    }

    public static void generarJaula(int rondas) {
        switch (rondas) {
            case 1:
                randomJaula(7, 3);
                break;
            case 2:
            case 3:
                randomJaula(15, 3);
                break;
            case 4:
            case 5:
                randomJaula(26, 4);
                break;
            case 6:
                randomJaula(34, 4);
                break;
            case 7:
                randomJaula(34, 5);
                break;
            case 8:
            case 9:
                randomJaula(42, 5);
                break;
            case 10:
            case 11:
                randomJaula(51, 5);
                break;
            case 12:
                randomJaula(53, 5);
                break;
        }
    }

    public static void llenadoPlayer(int rondas) {
        int oro = 10, llenado = 0;
        boolean errordeposicion = false;
        Animal[] jaulaMientras = getSeleccionArray(rondas);
        int opcion = Util.solicitarNumero("¿Desea comprar animales para su equipo? \n Si = 1, No = 2.", 1, 2);
        do {
            if (opcion == 1) {
                int seleccion = Util.solicitarNumero(
                        "Que animal desea comprar indique el animal conforme al indice que se le dio", 0,
                        jaulaMientras.length - 1);
                if (jaulaMientras[seleccion] != null) {
                    do {
                        try {
                            llenado = Util.solicitarNumero("En que posicion de equipo quiere poner a su animal", 0,
                                    jaulaPlayer.length - 1);
                            if (jaulaPlayer[llenado] == null || (jaulaPlayer.getClass().equals(jaulaPlayer[llenado]))) {
                                errordeposicion = false;
                                jaulaPlayer[llenado] = jaulaMientras[seleccion];
                                jaulaMientras[seleccion] = null;
                                oro = oro - 3;
                                System.out.println("\n Su equipo actualmente es: ");

                                for (int i = 0; i < jaulaPlayer.length; i++) {
                                    System.out.println(jaulaPlayer[i]);
                                }
                                System.out.println("Le quedan de oro: " + oro);
                                int refrescar = Util.solicitarNumero("Desea refrescar la lista? \n Si = 1, No = 2", 1,
                                        2);
                                if (refrescar == 1) {
                                    oro = oro - 1;
                                    System.out.println("Le queda de oro: " + oro);
                                    generarJaula(rondas);
                                } else {
                                    opcion = Util.solicitarNumero(
                                            "¿Desea volver a comprar animales para su equipo? \n Si = 1, No = 2.",
                                            1, 2);
                                    for (int i = 0; i < jaulaMientras.length; i++) {
                                        if (jaulaMientras[i] != null) {
                                            System.out.println("Puede comprar los siguientes animales " + i + ""
                                                    + jaulaMientras[i]);
                                        }
                                    }
                                }
                            } else {
                                System.out.println("Ya existe un animal en esa posicion");
                                System.out.println(
                                        "Debe ingresar una posicion diferente o que sean el mismo animal, diferente de: "
                                                + llenado);
                                errordeposicion = true;
                            }
                        } catch (Exception e) {
                            errordeposicion = true;
                            llenado = Util.solicitarNumero("En que posicion de equipo quiere poner a su animal", 0,
                                    jaulaPlayer.length - 1);
                            if (jaulaPlayer[llenado] == null) {
                                errordeposicion = false;
                            }
                        }

                    } while (errordeposicion);
                } else {
                    System.out.println("Error no existe un animal en esa posicion.");
                }
                // DOnde compre en esa posicion mostrar correr los animales. Volver a mostrar el
                // menu de la tienda que puedo si es diferente de null
                // EL animal ya fue comprado antes jaula mientras [seleccion]
                // MOSTRAR MENU ACTUALIZADO
            } else {
                for (int i = 0; i < jaulaPlayer.length; i++) {
                    System.out.println("Es una lastima pero tu equipo es: " + i + "" + jaulaPlayer[i]);
                }
            }
        } while (opcion != 2 && oro > 2);
    }

    public static void llenadoPlayerRival(int rondas) {
        int oro = 10;
        Animal[] jaulaRivalTMP = getSeleccionArray(rondas);
        int opcionRival = Util.solicitarNumero("¿Desea comprar animales para su equipo? \n Si = 1, 2 = no.", 1, 2);
        do {
            if (opcionRival == 1) {
                if (jaulaRivalTMP == null) {
                    for (int i = 0; i < jaulaPlayerRival.length; i++) {
                        System.out.println("No has comprado nada pero tu equipo es: " + i + "" + jaulaPlayerRival[i]);
                    }
                } else {
                    int seleccionRival = Util.solicitarNumero(
                            "Que animal desea comprar indique el animal conforme al indice que se le dio", 0,
                            jaulaRivalTMP.length - 1);
                    int llenadoRival = Util.solicitarNumero(
                            "En que posicion de equipo quiere poner a su animal", 0, jaulaPlayerRival.length - 1);
                    jaulaPlayerRival[llenadoRival] = jaulaRivalTMP[seleccionRival];
                    System.out.println("Puede comprar los siguientes animales" + jaulaRivalTMP.length);
                    oro = oro - 3;
                    System.out.println("Le quedan de oro: " + oro);
                    for (int i = 0; i < jaulaPlayerRival.length; i++) {
                        System.out.println("El equipo del jugador es: " + jaulaPlayerRival[i]);
                    }
                    System.out.println("Le quedan de oro: " + oro);
                    opcionRival = Util.solicitarNumero(
                            "¿Desea volver a comprar animales para su equipo? \n Si = 1, No = 2.", 1, 2);
                }
            }
        } while (opcionRival != 2 && oro >= 3);
    }

    public static void ataque(int rondas) {
        int vida = 10;
        int victorias = 0;
        do {
            System.out.println("****** PLAYER 1 ******");
            System.out.println();
            sub.texto(vida, victorias);
            generarJaula(rondas);
            llenadoPlayer(rondas);
            System.out.println();
            System.out.println("****** PLAYER 2 ******");
            System.out.println();
            sub.texto(vida, victorias);
            System.out.println();
            generarJaula(rondas);
            llenadoPlayerRival(rondas);
            System.out.println();
            System.out.println("******INICIA LA PELEA*****");
            for (int i = 0; i < Jaula.jaulaPlayer.length; i++) {
                for (int j = 0; j < Jaula.jaulaPlayerRival.length; j++) {
                    if (Jaula.jaulaPlayer[i] != null && Jaula.jaulaPlayerRival[j] != null) {
                        Jaula.jaulaPlayer[i]
                                .setVida(Jaula.jaulaPlayerRival[j].getAtaque() - Jaula.jaulaPlayer[i].getVida());
                        System.out.println("Ataca el animal " + Jaula.jaulaPlayer[i]);
                        System.out.println("\n Su vida es " + jaulaPlayer[i].getVida() + " Estamos luchando animo");
                        if (Jaula.jaulaPlayer[i].getVida() <= 0) {
                            Jaula.jaulaPlayer[i].setVida(0);
                            Jaula.jaulaPlayer[i].setEstado(false);
                        }
                    }
                    // Boolean Cuando termine la pelea todos vivos Si el animal muere un nuevo
                    // arreglo con la posicion -1
                    // Atributo vivo o muerto si este animal 0 Se muere YA pasaria a la posicion de
                    // | mueve todos los otros animales.
                    // 1 del arreglo
                    /* */
                }
            }
            rondas = rondas + 1;
            // for (int i = 0; i < jaulaPlayer.length; i++) {

            // }
        } while (vida > 0);
        // Implementar por for o copyOfRange
        // Cuando muera llamar al copyOfRange.@interface
        // Si la longitud es == 0 entonces el otro gano, o perdio.

        // Arrays.copyOfRange(jaula, 2, 5)

    }

    public static void contraAtaque() {
        System.out.println("El rival ataca");
        System.out.println();
        for (int i = 0; i < jaulaPlayer.length; i++) {
            for (int j = 0; j < jaulaPlayerRival.length; j++) {
                if (jaulaPlayer[i] != null && jaulaPlayerRival[j] != null) {
                    Jaula.jaulaPlayerRival[j]
                            .setVida(Jaula.jaulaPlayer[i].getAtaque() - Jaula.jaulaPlayerRival[j].getVida());
                    if (Jaula.jaulaPlayerRival[j].getVida() <= 0) {
                        Jaula.jaulaPlayerRival[j].setVida(0);
                        Jaula.jaulaPlayerRival[j].setEstado(false);
                    }
                    System.out.println("Ataca " + jaulaPlayer[i]);
                    System.out.println(jaulaPlayerRival[j] + " El principal ataco");
                } else {
                    System.out.println("No existen animales en esta posicion");
                }
            }
        }
    }

    public static Animal[] getSeleccionArray(int rondas) {
        if (rondas <= 3) {
            return jaulaTemporal3;
        }
        if (rondas < 7) {
            return jaulaTemporal4;
        }
        return jaulaTemporal;
    }

}
