/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01t08;

import java.util.Scanner;






/**
 *
 * @author alumno
 */
public class Ejercicio01T08 {
    
   

 
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float media ;
        //creo array de 6 asignaturas.
       Asignatura[] asignaturas = new Asignatura[6];
       //inicializamos cada asignatura con su nombre
        asignaturas [0] = new Asignatura("Programacion");
        asignaturas[1] = new Asignatura("Lenguaje de marcas");
        asignaturas[2] = new Asignatura("Bases de datos");
        asignaturas[3] = new Asignatura("Entornos de Desarrollo");
        asignaturas[4] = new Asignatura("Sistemas informaticos");
        asignaturas[5]= new Asignatura("FOL");
       
        //pido las notas
        
        for (int i = 0; i < asignaturas.length; i++) {
            asignaturas[i].introducirNota();
            
        }
        
        //calculo de media
         media = Asignatura.calcularNotaMedia(asignaturas);
         
         //resultado de media
         System.out.println("La nota media del curso es :"+media);
            
                
        
        
    }
    
}
