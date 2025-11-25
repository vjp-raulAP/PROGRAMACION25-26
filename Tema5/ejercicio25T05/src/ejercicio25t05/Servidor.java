/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25t05;

/**
 *
 * @author rulaa
 */
public class Servidor extends Ordenador {
    //1. Atributos
    private int tamanoMonitor; //el tamaño del monitor sera mayor a 14 pulgadas
    private String teclado;
    private String raton;
    
    //2. constructor defecto
    public Servidor(){
        super();
        this.tamanoMonitor = 15; //pongo por defecto superior a 15
        this.teclado = "";
        this.raton = "";
    }
    
    //2.1 Costructor parametrizado
    public Servidor(int ram,int disco,String procesador,String grafica,double precio, int tamanoMonitor,String teclado,String raton){
        super(ram,disco,procesador,grafica,precio);
        this.tamanoMonitor = tamanoMonitor;
        this.teclado = teclado;
        this.raton = raton;  
    }        
    
    //Getter y setter
    public int getTamanoMonitor(){
        return tamanoMonitor;
    }
    public void setTamanoMonitor(int tamanoMonitor){
        this.tamanoMonitor = tamanoMonitor;
    }
    
    
    public String getTeclado(){
        return teclado;
    }
    public void setTeclado(String teclado){
        this.teclado=teclado;
    }
    public String getRaton(){
        return raton;
    }
    public void setRaton(String raton){
        this.raton=raton;
    }
    //metodos 
  

   
    //to string
    
   @Override
    public String toString() {
         return "Servidor (" + super.toString() + ", Monitor: " + tamanoMonitor + " pulgadas, Teclado: " + teclado +
                ", Ratón: " + raton + ")]";
    }
    
    
}
