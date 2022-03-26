package ipc1.game.animal;


public abstract class Animal implements Cloneable{
    private String nombreAnimal;
    private int ataque, vida, id;


    public Animal(){
        
    }

    public Animal (int id, String nombreAnimal, int ataque, int vida){
        this.id = id;
        this.nombreAnimal = nombreAnimal;
        this.ataque = ataque;
        this.vida = vida;

    }
 
    
    abstract public int getModDefense(Animal ataque);
   
    // abstract public int geAttack(Animal attack);
   // abstract public int getModDefense(Animal attack);

   @Override
   public String toString(){
        return " " + 
        "El id del animal es " + getId() + "'" +
        " El animal es " + getNombreAnimal() + "'" +
        " Tiene de ataque " + getAtaque() + "'" + 
        " Y de vida tiene " + getVida() ;
   }

   public void attack(Animal p2){
        System.out.println("*****INICIA LA PELEA*****");
        System.out.println();
        System.out.println("        "+this.getNombreAnimal()+" ataca a "+p2.getNombreAnimal());
        System.out.println();
        System.out.println("*Musica de suspenso* *Sonidos de golpes*");
        System.out.println();
        System.out.println("Ataque de: " + this.nombreAnimal);
        p2.setVida(p2.getVida() - this.getAtaque());
        p2.defense(this);

        if (p2.getVida() == 0){
            System.out.println("el animal murio" +p2.getNombreAnimal());
        }

        System.out.println("Termino el ataque.");
        System.out.println("Atacante: "+this.toString());
        System.out.println("Defensor: "+p2.toString());
   }

   public void defense(Animal p1){
            

    System.out.println("El ataque de: "+p1.getNombreAnimal()+" fue exitoso y "+this.getNombreAnimal()+" recibio daño y termino con  de vida");

    System.out.println(this.getNombreAnimal()+" se defiende de " +p1.getNombreAnimal());
    if (p1.getVida() >= 0){
        System.out.println("el animal murio" +p1.getNombreAnimal());
    }

   }

   // public void attack(Animal p2){
   //      System.out.println("******INICIA LA PELEA*****");
   //     System.out.println("        "+this.getAnimal()+" ataca a "+p2.getAnimal());
   //     int amount = this.getModAttack(p2);
   //  }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
    public String getNombreAnimal(){
        return this.nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal){
        this.nombreAnimal = nombreAnimal;
    }

    public void setAtaque(int ataque){
        this.ataque = ataque;
    }

    public int getAtaque(){
        return this.ataque;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public int getVida(){
       return this.vida;
    }
}
