/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05t5;

/**
 *
 * @author rulaa
 */
public class Asignatura {
    //1. Atributos
    private String nombre;
    private double nota;

    //2. Constructor por defecto
    public Asignatura() {
        this.nombre = "";
        this.nota = 0;
    }
    // 2.1 Constructor parametrizado
    public Asignatura(String nombre, double nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    
    // 3. getter y setter
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre =nombre;
    }
    
    public double getNota() {
        return this.nota;
    }
    public void setNota(double nota){
        this.nota = nota;
    }
    
    //metodos
    
    //metodo calcular nota
    public static double CalculoNotaMedia(double n1,double n2,double n3, double n4,double n5,double n6){
   
   double resultado;
   resultado =(n1+n2+n3+n4+n5+n6)/6;
   return resultado;
   }
    
}  
//    //toString
//    @Override
//    public String toString(){
//        return "Asignatura: " +this.nombre + " ,nota = "+ this.nota;
//    }
//}
