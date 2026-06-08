/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenordinaria_ejercicio01;

import java.lang.reflect.Array;

/**
 *
 * @author Eva Cantero Abad
 */
public class ExamenOrdinaria_Ejercicio01 {

    // Método que acepta como atributo un array de 10 posiciones
    public static void rellenarVector() {
        Array[] vector = new Array[10];
        for (int i = 0; i < 10; i++) {
            // Math.random(1, 8);
        }
    }

    // Método para reemplazar los valores repetidos por un 0
    
    
    // Método para mostrar el vector 
    public static void mostrarVector(Array[] vector) {
        // Este sout muestra el vector con números repetidos
        System.out.println("Se han generado los siguientes números: " + vector);

        // Este sout muestra el vector con los números repetidos reemplzados por 0
        System.out.println("Sustituimos los elementos repetidos por un 0: " + vector);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Array[] vector = null;
        // TODO code application logic here
        mostrarVector(vector);
    }

}
