package ipc1.game.animal;


public abstract class Animal implements Cloneable{
    private String nombreAnimal;
    private int ataque, vida, id;
    private boolean estadoVida;


    public Animal(){
    
    }

    public Animal (int id, String nombreAnimal, int ataque, int vida, boolean estadoVida){
        this.id = id;
        this.nombreAnimal = nombreAnimal;
        this.ataque = ataque;
        this.vida = vida;
        this.estadoVida = estadoVida;
    }
 
    
    abstract public int getModDefense(Animal ataque);
   
    // abstract public int geAttack(Animal attack);
   // abstract public int getModDefense(Animal attack);
   //Generar instanceof para cada animal si es mamifero true o false

   @Override
   public String toString(){
        return " " + 
        "El id del animal es " + getId() + "'" +
        " El animal es " + getNombreAnimal() + "'" +
        " Tiene de ataque " + getAtaque() + "'" + 
        " Y de vida tiene " + getVida() ;
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

    public void setEstado(boolean estadoVida){
        this.estadoVida = estadoVida;
    }

    public boolean getEstado(){
        return this.estadoVida;
    }
}
