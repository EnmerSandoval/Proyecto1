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
    public static Animal jaulaPlayerAtaque[] = new Animal[5];
    public static Animal jaulaPlayerRival[] = new Animal[5];
    public static Animal jaulaPlayerRivalAtaque[] = new Animal[5];
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
        compraAnimales(rondas, jaulaPlayer, jaulaPlayerAtaque);
    }

    public static void llenadoPlayerRival(int rondas) {
        compraAnimales(rondas, jaulaPlayerRival, jaulaPlayerRivalAtaque);
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
            for (int i = 0; i < Jaula.jaulaPlayerAtaque.length; i++) {
                for (int j = 0; j < Jaula.jaulaPlayerRival.length; j++) {
                    if (Jaula.jaulaPlayerAtaque[i] != null && Jaula.jaulaPlayerRival[j] != null) {
                        System.out.println("Ataca el animal " + Jaula.jaulaPlayerAtaque[i].getNombreAnimal());
                        System.out.println(
                                "Tiene de ataque " + Jaula.jaulaPlayerAtaque[i].getAtaque() + " y de vida tiene "
                                        + Jaula.jaulaPlayerAtaque[i].getVida());
                        Jaula.jaulaPlayerAtaque[i]
                                .setVida(Jaula.jaulaPlayerAtaque[i].getVida() - Jaula.jaulaPlayerRival[j].getAtaque());
                        if (Jaula.jaulaPlayerAtaque[i].getVida() <= 0) {
                            Jaula.jaulaPlayerAtaque[i].setVida(0);
                            Jaula.jaulaPlayerAtaque[i].setEstado(false);
                        }
                        System.out.println("\n Recibio de daño  " + jaulaPlayerRival[j].getAtaque()
                                + " por lo tanto tiene de vida " + jaulaPlayer[i].getVida());
                        if (Jaula.jaulaPlayerAtaque[i].getVida() > 0) {
                            System.out.println(
                                    "El animal " + jaulaPlayerAtaque[i].getNombreAnimal() + " vuelve a recibir daño");
                            Jaula.jaulaPlayerAtaque[i]
                                    .setVida(Jaula.jaulaPlayerAtaque[i].getVida()
                                            - Jaula.jaulaPlayerRival[j].getAtaque());
                        }
                    }
                    // Boolean Cuando termine la pelea todos vivos Si el animal muere un nuevo
                    // arreglo con la posicion -1
                    // Atributo vivo o muerto si este animal 0 Se muere YA pasaria a la posicion de
                    // | mueve todos los otros animales.
                    // 1 del arreglo
                    /* */
                    contraAtaque();
                }
            }
            rondas = rondas + 1;
            // for (int i = 0; i < jaulaPlayer.length; i++) {

            // }
        } while (vida > 0);
        // Implementar por for o copyOfRange
        // Cuando muera llamar al copyOfRange.@interface
        // Si la longitud es == 0 entonces el otro gano, o perdio.

        // Arrays.copyOf(jaula, 2);

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
                }
            }
        }
    }

    public static void incrementaNivel(Animal[] mientras, int seleccion, int llenado) {
        for (int i = 0; i < jaulaPlayer.length; i++) {
            jaulaPlayer[llenado] = mientras[seleccion];
            jaulaPlayer[llenado].setNivel(jaulaPlayer[llenado].getNivel() + 0.5);
            System.out.println(
                    "El nivel de: " + jaulaPlayer[llenado] + " es: " + jaulaPlayer[llenado].getNivel());
            if (jaulaPlayer[llenado].getNivel() == 2) {
                jaulaPlayer[llenado].setAtaque(jaulaPlayer[llenado].getAtaque() + 1);
                jaulaPlayer[llenado].setVida(jaulaPlayer[llenado].getVida() + 1);
                System.out.println("Se le sumo 1 de vida y 1 de ataque");
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

    public static void ventaAnimales(int rondas, Animal[] jaulaVacia, int oro) {
        if (rondas > 1) {
            int venta = Util.solicitarNumero("¿Desea vender algun animal de su equipo? \n Si = 1, No = 2.", 1, 2);
            if (venta == 1) {
                for (int i = 0; i < jaulaVacia.length; i++) {
                    if (jaulaVacia[i] != null) {
                        System.out.println(i + "" + jaulaVacia[i]);
                    }
                }
                int ventaPos = Util.solicitarNumero("¿Que animal desea vender conforme al indice que se le dio?", 0,
                        jaulaVacia.length - 1);
                jaulaVacia[ventaPos] = null;
                oro = oro + 1;
                System.out.println("Vendio correctamente al jugador tiene de oro: " + oro);
            }
        }
    }

    public static void compraAnimales(int rondas, Animal[] jaulaRelleno, Animal[] jaulaAtaque) {
        int oro = 10;
        int llenado, opcion;
        boolean errordeposicion;
        Animal[] jaulaMientras = getSeleccionArray(rondas);
        if (rondas == 1) {
            opcion = Util.solicitarNumero("¿Desea comprar animales para su equipo? \n Si = 1, No = 2.", 1, 2);
        } else {
            opcion = Util.solicitarNumero("¿Desea comprar animales para su equipo o modificarlos? \n Si = 1, No = 2.",
            1, 2);
        }
        //  if (rondas > 1 && opcion == 1) {
            //      ventaAnimales(rondas, jaulaRelleno, oro);
            //  }
        do {
            if (opcion == 1) {
                
                int seleccion = Util.solicitarNumero(
                    "Que animal desea comprar indique el animal conforme al indice que se le dio", 0,
                    jaulaMientras.length - 1);
                    if (jaulaMientras[seleccion] != null) {
                        do {
                            try {
                                
                                llenado = Util.solicitarNumero("En que posicion de equipo quiere poner a su animal de [0..4]", 0,
                                jaulaRelleno.length - 1);
                                if (jaulaRelleno[llenado] == null && oro > 0) {
                                    errordeposicion = false;
                                    jaulaRelleno[llenado] = (Animal) jaulaMientras[seleccion].clone();
                                    jaulaMientras[seleccion] = null;
                                    jaulaAtaque[llenado] = (Animal) jaulaRelleno[llenado].clone();
                                      
                                    oro = oro - 3;
                                    System.out.println("Le quedan de oro: " + oro);
                                    System.out.println("\n Su equipo actualmente es: ");
                                    for (int i = 0; i < jaulaRelleno.length; i++) {
                                        System.out.println(jaulaRelleno[i]);
                                    }
                                    int refrescar = Util.solicitarNumero("Desea refrescar la lista? \n Si = 1, No = 2",
                                            1,
                                            2);





                                            
                                    if (refrescar == 1) {
                                        if (oro > 0) {
                                            oro = oro - 1;
                                            System.out.println("Le queda de oro: " + oro);
                                            generarJaula(rondas);
                                        }
                                    } else if (oro > 0) {
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
                                llenado = Util.solicitarNumero("Error en que posicion de equipo quiere poner a su animal", 0,
                                        jaulaRelleno.length - 1);
                                if (jaulaRelleno[llenado] == null) {
                                    errordeposicion = false;
                                }
                            }
                        } while (errordeposicion);
                    } else {
                        System.out.println("Error no existe un animal en esa posicion.");
                    }

                
            } else  {
                for (int i = 0; i < jaulaRelleno.length; i++) {
                    System.out.println("Es una lastima pero tu equipo es: " + i + "" + jaulaRelleno[i]);
                }   
            }
        }while(opcion!=2&&oro>0);
}

}
