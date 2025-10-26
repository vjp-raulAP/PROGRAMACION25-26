/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * En este ejercicio pide una nota al usuario del 1 a 10 y mama al método
 * de la clase NotaAlumno para mostrar la calificación obtenida.
 * @author rulaa
 */
import java.util.Scanner;
public class CalificacionAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro variables
        int nota;
        
        //Creo el escanner de entrada de datos del usuario
        Scanner notaAlumno = new Scanner(System.in);
        
        //Pedimos la usuario la nota.
        System.out.println("Introduce la nota de 1 al 10.");
        nota = notaAlumno.nextInt();
        
        
        
    }
    
}
