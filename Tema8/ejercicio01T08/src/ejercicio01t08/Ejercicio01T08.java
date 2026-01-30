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
    
 Scanner entrada = new Scanner(System.in);

 
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       Asignatura[] asignaturas = new Asignatura[6];
       
        asignaturas [0] = new Asignatura("Programacion");
        asignaturas[1] = new Asignatura("Lenguaje de marcas");
        asignaturas[2] = new Asignatura("Bases de datos");
        asignaturas[3] = new Asignatura("Entornos de Desarrollo");
        asignaturas[4] = new Asignatura("Sistemas informaticos");
        asignaturas[5]= new Asignatura("FOL");
       
        //pido las notas con for each
        
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Por favor introduzca la nota para la asignatura"+asignaturas[i]+": ");
            
        }
            
            
                
        
        
    }
    
}
