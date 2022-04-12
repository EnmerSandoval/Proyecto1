package ipc1.game.animal;

import ipc1.game.animal.tier1.Caballo;
import ipc1.game.animal.tier1.Castor;
import ipc1.game.animal.tier1.Escarabajo;
import ipc1.game.animal.tier1.Grillo;
import ipc1.game.animal.tier1.GrilloZombie;
import ipc1.game.animal.tier1.Hormiga;
import ipc1.game.animal.tier1.Mosquito;
import ipc1.game.animal.tier1.Nutria;
import ipc1.game.animal.tier1.Pescado;
import ipc1.game.animal.tier2.*;
import ipc1.game.animal.tier3.*;
import ipc1.game.animal.tier4.*;
import ipc1.game.animal.tier5.*;
import ipc1.game.animal.tier6.*;
import ipc1.game.animal.tier7.*;

public abstract class AnimalesTier {
    // tier 1
    private static Hormiga hormiga = new Hormiga();
    private static Caballo caballo = new Caballo();
    private static Castor castor = new Castor();
    private static Escarabajo escarabajo = new Escarabajo();
    private static Grillo grillo = new Grillo();
    private static GrilloZombie grilloZombie = new GrilloZombie();
    private static Mosquito mosquito = new Mosquito();
    private static Nutria nutria = new Nutria();
    private static Pescado pescado = new Pescado();

    // Tier 2
    private static Aranya aranya = new Aranya();
    private static Dodo dodo = new Dodo();
    private static Elefante elefante = new Elefante();
    private static PavoReal pavoReal = new PavoReal();
    private static PuercoEspin puercoEspin = new PuercoEspin();
    private static Rata rata = new Rata();
    private static Sapo sapo = new Sapo();
    private static Zorro zorro = new Zorro();

    // Tier 3
    private static Buey buey = new Buey();
    private static Buho buho = new Buho();
    private static Camello camello = new Camello();
    private static Canguro canguro = new Canguro();
    private static Caracol caracol = new Caracol();
    private static Conejo conejo = new Conejo();
    private static Jirafa jirafa = new Jirafa();
    private static Lobo lobo = new Lobo();
    private static Mapache mapache = new Mapache();
    private static Oveja oveja = new Oveja();
    private static Tortuga tortuga = new Tortuga();

    // Tier 4
    private static Ardilla ardilla = new Ardilla();
    private static Ballena ballena = new Ballena();
    private static Delfin delfin = new Delfin();
    private static Hipopotamo hipopotamo = new Hipopotamo();
    private static Llama llama = new Llama();
    private static Loro loro = new Loro();
    private static Puma puma = new Puma();
    private static Venado venado = new Venado();

    // Tier 5
    private static Chompipe chompipe = new Chompipe();
    private static Cocodrilo cocodrilo = new Cocodrilo();
    private static Escorpion escorpion = new Escorpion();
    private static Foca foca = new Foca();
    private static Jaguar jaguar = new Jaguar();
    private static Mono mono = new Mono();
    private static Rinoceronte rinoceronte = new Rinoceronte();
    private static Vaca vaca = new Vaca();

    // Tier 6
    private static Gato gato = new Gato();
    private static Gorilla gorilla = new Gorilla();
    private static Leopardo leopardo = new Leopardo();
    private static Mamut mamut = new Mamut();
    private static Mosca mosca = new Mosca();
    private static Panda panda = new Panda();
    private static Pulpo pulpo = new Pulpo();
    private static Serpiente serpiente = new Serpiente();
    private static Tigre tigre = new Tigre();

    // Tier 7
    private static Camaleon camaleon = new Camaleon();
    private static Quetzal quetzal = new Quetzal();

    private static int[] jaulaTier1 = new int[] {
            hormiga.getId(), caballo.getId(), castor.getId(), escarabajo.getId(), grillo.getId(), grilloZombie.getId(),
            mosquito.getId(), nutria.getId(), pescado.getId()
    };

    private static int[] jaulaTier2 = new int[] {
            aranya.getId(), dodo.getId(), elefante.getId(), pavoReal.getId(),
            puercoEspin.getId(), rata.getId(), sapo.getId(), zorro.getId()
    };

    private static int[] jaulaTier3 = new int[] {
            buey.getId(), buho.getId(), camello.getId(),
            canguro.getId(), caracol.getId(), conejo.getId(), jirafa.getId(), lobo.getId(), mapache.getId(),
            oveja.getId(),
            tortuga.getId()
    };

    private static int[] jaulaTier4 = new int[] {
            ardilla.getId(), ballena.getId(), delfin.getId(), hipopotamo.getId(), llama.getId(), loro.getId(),
            puma.getId(), venado.getId()
    };

    private static int[] jaulaTier5 = new int[] {
            chompipe.getId(), cocodrilo.getId(), escorpion.getId(), foca.getId(), jaguar.getId(),
            mono.getId(), rinoceronte.getId(), vaca.getId()
    };

    private static int[] jaulaTier6 = new int[] {
            gato.getId(), gorilla.getId(), leopardo.getId(), mamut.getId(),
            mosca.getId(), panda.getId(), pulpo.getId(), serpiente.getId(), tigre.getId()
    };

    private static int[] jaulaTier7 = new int[] {
            camaleon.getId(), quetzal.getId()
    };

    public static int[] getAnimalesTier1() {
        return jaulaTier1;
    }
    public static int[] getAnimalesTier2() {
        return jaulaTier2;
    }
    public static int[] getAnimalesTier3() {
        return jaulaTier3;
    }
    public static int[] getAnimalesTier4() {
        return jaulaTier4;
    }
    public static int[] getAnimalesTier5() {
        return jaulaTier5;
    }
    public static int[] getAnimalesTier6() {
        return jaulaTier6;
    }
    public static int[] getAnimalesTier7() {
        return jaulaTier7;
    }

}
