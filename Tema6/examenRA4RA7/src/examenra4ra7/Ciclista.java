/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra4ra7;

/**
 *
 * @author alumno
 */

public abstract class  Ciclista {
    //Atributos
    private String nombre;
    int energia;
    private boolean estaEscapado;
    private double kmMeta;
    private int numBidones;
    private double velocidad;
    private int nivelHidratacion;
    private static  int CONTADOR_CICLISTAS_CREADOS = 0;
  
    
    //constructores
    
    //construct defecto
    
    public  Ciclista(){
        this.nombre = "";
        this.energia = 50;
        this.estaEscapado = false;
        this.kmMeta = 120;
        this.numBidones = 2;
        this.velocidad = 0;
        this.nivelHidratacion = 50;
        
        }
        
        //construc parametrizado
        
        public Ciclista (String nombre, int energia,boolean estaEscapado, double kmMeta,int numBidones,double velocidad, int nivelHidratacion){
        this.nombre = nombre;
        this.energia = energia;
        this.estaEscapado = estaEscapado;
        this.kmMeta = kmMeta;
        this.numBidones =numBidones;
        this.velocidad = velocidad;
        this.nivelHidratacion = nivelHidratacion;
        
            
        }
        
        //getter y setter
        
        public String getNombre(){
            return nombre;
     
       }
        
       public void setNombre(String nombre) {
           this.nombre = nombre;
       }
       
       
      public int getEnergia(){
          return energia;
      }
      public void setEnergia(int energia){
          this.energia = energia;
      }
      
      
      public boolean getEstaEscapado(){
          return estaEscapado;
      }
      
      public void setEstaEscapado(boolean estaEscapado){
          this.estaEscapado = estaEscapado;
      }
      
      public double getKmMeta(){
          return kmMeta;
      }
      public void setKmMeta(double kmMeta ){
          this.kmMeta=kmMeta;
      }
      
      
      public int getNumBidones(){
         return numBidones;
      }
      
      public void setNumBidones(int numBidones){
          this.numBidones = numBidones;
      }
        
     public double getVelocidad(){
         return velocidad;
     }
     
     public void setVelocidad(double velocidad){
         this.velocidad = velocidad;
     }
     
     
     public int getNivelHidratacion(){
         return nivelHidratacion;
     }
     
     public void setNivelHidratacion(int nivelHidratacion){
         this.nivelHidratacion= nivelHidratacion;
         
     }
     
     //metodos
     
     public void cogerBidones(){
         if(kmMeta > 10){
             numBidones  = numBidones+2;
         }else{
             System.out.println("No puedes coger bidones a menos de 10km de meta.");
         }
         
     }
     public void tirarBidon(){
         numBidones --;
         
     } 
     
     //metodo abstracto para comer y beber
     
     public abstract void comer();
     
     public abstract void beber();
     
     
     
     public void aumentarNumeroCiclistas(){
         
          CONTADOR_CICLISTAS_CREADOS ++;
          System.out.println(CONTADOR_CICLISTAS_CREADOS);
     }
     
    public void verNumCiclistas(){
        System.out.println(CONTADOR_CICLISTAS_CREADOS);
    }
    
     //tostring
     
     public String ToString(){
         return "";
     }
    
    
}
