/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25t05;

/**
 *
 * @author rulaa
 */
public class Ordenador {
     //1. Atributos
    private int ram;
    private int disco;
    private String procesador;
    private String grafica;
    private double precio;
    
    //2. construc defecto
    public Ordenador(){
        this.ram = 0;
        this.disco = 0;
        this.procesador="";
        this.grafica = "";
        this.precio = 0;
    }    
    
    //2.1 construc parametrizado 
      public Ordenador(int ram, int disco, String procesador, String grafica, double precio) {
        this.ram = ram;
        this.disco = disco;
        this.procesador = procesador;
        this.grafica = grafica;
        this.precio = precio;
    }
    
    
      //3 Getter y setter
      
      public int getRam(){
          return ram;
      }
      public void setRam(int ram){
          this.ram = ram;
      }
      
      public int getDisco(){
          return disco;
          
      }
      
      public void setDisco(int disco){
          this.disco = disco;
      }
      
      public String getProcesador(){
          return procesador;
      }
      
      public void setProcesador(String procesador){
          this.procesador=procesador;
      }
      
      public String getGrafica(){
          return grafica;
      }
      
      public void setGrafica(String grafica){
          this.grafica=grafica;
      }
    
      public double getPrecio(){
          return precio;
      }
    
      public void setPrecio(double precio){
          this.precio=precio;
      }
      
      //metodos 
      
      
       //toString
       @Override
      public String toString(){
          return "RAM: "+ram+"GB, Disco: "+disco+"GB, Procesador: "+procesador+", Gráfica: "+grafica+", Precio: "+precio+"€";
      }
      
     
     
      
      
}
