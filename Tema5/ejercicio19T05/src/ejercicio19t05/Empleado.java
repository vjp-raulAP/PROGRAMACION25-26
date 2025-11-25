/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19t05;

/**
 *
 * @author rulaa
 */
public class Empleado {
    //1. Atributos
    private String nombre;
    private int horas;
    private float tarifa;
    
    //2.contructor por defecto
     public Empleado(){
         this.nombre = "";
         this.horas = 0;
         this.tarifa = 0.0f;
     }
     
     //2.1 constructor parametrizado
     public Empleado (String nombre, int horas, float tarifa){
         this.nombre = nombre;
         this.horas = horas;
         this.tarifa = tarifa;
     }
     
     //getter y setters
     
     public String getNombre(){
         return this.nombre;
     }
     public void setNombre(String nombre){
         this.nombre = nombre;
     }
     
     public int getHoras(){
         return this.horas;
     }
     public void setHoras(int horas){
         this.horas = horas;
     }
     
     public float getTarifa(){
         return this.tarifa;
         
     }
     public void setTarifa(float tarifa){
         this.tarifa = tarifa;
     }
     
     //metodos
     //metodo para el calculo del salario  (tarifa normal = 40h y  tarifaextra(>40h) = tarifanormal + (tarifanormal/2)
      //lo creo en la clase Test
     
     
     
     //toString
     @Override
     public String toString(){
         return (this.nombre + " trajabó "+this.horas+ " horas, cobra "+this.tarifa+" euros la hora por lo que le corrsponde un sueldo de "+ Test.CalculoTarifaTotal(this.tarifa,this.horas)+"euros");
    }
}
