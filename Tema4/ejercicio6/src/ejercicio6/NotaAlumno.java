/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 * 
 * @author rulaa
 */

public class NotaAlumno  {
    /**
     * Método que pasamos el parámetro nota y nos clasifica la nota en función del valor entre 0 y 10
     * @param nota 
     */
    public static void mostrarClasificacion (int nota){
        //condion  en funcíón d ela nota
        if (nota >=0 & nota <= 4){
            System.out.println("Su calificación es de suspenso. ");
        }
        else if (nota >= 5 & nota <= 6){
            System.out.println("Su calificación es de Bien ");
        }
        else if (nota >= 7 & nota <= 8){
            System.out.println("Su calificación es de Notable ");
        }
        else if (nota >= 9 & nota <= 10){
            System.out.println("Su calificación es de Notable ");
        }
        else {
            System.out.println("Error . La nota debe de estar entre 0 y 10 ");
        }
    }
}
