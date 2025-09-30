/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notaexamenes;

/**
 *
 * @author alumno
 */
public class NotaExamenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Declaro las variables que almacenan las notas
        float notaExamen1;
        float notaExamen2;
        float notaMedia;
        //asigno un valor a esas variables
        notaExamen1 = 6;
        notaExamen2 = 7;
        //Realizo el cáculo de la nota media
        notaMedia = (notaExamen1 + notaExamen2)/2;
        //imprimo por pantalla el nombre de la asignatura, las notas de cada exmamen y la media de ellos
        System.out.println("Nombre de la asignatura: Programacion");
        System.out.println("Notas del primer examen: " +notaExamen1);
        System.out.println("Notas del segundo examen: "+notaExamen2);
        System.out.println("Nota media de Examen1 y Examen2 es: "+ notaMedia);
         
    }
    
}
