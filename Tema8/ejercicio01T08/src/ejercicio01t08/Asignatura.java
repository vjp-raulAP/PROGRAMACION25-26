/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01t08;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Asignatura {
    //atributos 
    
    private String nombre;
    private float nota;
 //constructores 
     public Asignatura() {
        this.nombre = "";
        this.nota = 0.0f;
    }
      public Asignatura(String nombre) {
        this.nombre = "";
    
    }
  
    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
   //getter y setter

    public String getAsignatura() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setAsignatura(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    //metodo para introducir la nota
     public void introducirNota() {
         Scanner entrada= new Scanner(System.in);
        System.out.print("Introduzca la nota de " + this.nombre+ ": ");
        this.nota = entrada.nextFloat();
    }
  
     
     //metodo para calcular la nota media
     public static float calcularNotaMedia(Asignatura[] asignaturas){
         float suma = 0;
         float resultado=0;
         for (int i = 0; i < asignaturas[i].getNota(); i++) {
             suma += asignaturas[i].getNota();
             resultado = suma/asignaturas.length;
          
         }
             return resultado;      
                 
     }
     
    //to string

    @Override
    public String toString() {
        return "asignaturas{" + "asignatura=" + nombre + ", nota=" + nota + '}';
    }
    
    
    
    
}
