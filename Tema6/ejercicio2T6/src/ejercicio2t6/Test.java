/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2t6;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Alumno alumno1 = new Alumno("Carlos", "1º DAM");
       Profesor profesor1 = new Profesor("Ana", "Informatica");
       
        System.out.println(alumno1.saludar());
        System.out.println(alumno1.getNombre());
        
        System.out.println(profesor1.getNombre());
        System.out.println(profesor1.saludar());
        
        
        System.out.println("------Polimorfismo ------");
        
        Persona persona1 = new Alumno("Raul","1 DAW");
        Persona persona2 = new Profesor("Anabel","Programación");
        System.out.println(persona1.saludar());
        System.out.println(persona2.saludar());
        
    }
    
}
