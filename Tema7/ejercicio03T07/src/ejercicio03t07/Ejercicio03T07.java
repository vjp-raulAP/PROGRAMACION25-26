/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03t07;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author rulaa
 */
public class Ejercicio03T07 {

    /**
     * Metodo en el que pido una longitud Para el array entre 1-10 con control
     * del excepciones.
     *
     * @return longitudArray
     */
    public static int longitudArray() {
        Scanner entrada = new Scanner(System.in);  //creo objeto scanner
        //Declaro las variables
        int longitudArray = 0;
        boolean valido = false;
        // bucle do-While para que mientras no se cumpla la condicion nos lo vuelva a pedir
        do {
            try {
                System.out.println("Por favor, introduzca un numero entre 1-10: ");
                longitudArray = entrada.nextInt();
                if (longitudArray >= 1 && longitudArray <= 10) { //condicion para salir del bucle
                    valido = true;
                } else {
                    System.out.println("Numero incorrecto. El número debes ser entre 1 y 10");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Tiene  que introducir un numero entero entre 1-10.");
                entrada.nextLine(); //para limpiar el buffer
            }

        } while (!valido);
        return longitudArray;
    }

    /**
     * Metodo mediante el cual le paso la longitud del array y me genera
     * aleatorios entre 1 y 6 
     *
     * @param longitud
     * @return array
     */
    public static int[] rellenoArray(int longitud) {
        int[] array = new int[longitud];  //declaro variable en el que le paso la longitud del array.

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 6) + 1; //numero entero aleatorio del 1 al 6

        }
        return array;
    }

    /**
     * Metodo que nos muestra el contenido del array mediante un for normal.
     * Pasando por parametros el array de enteros.
     * @param array 
     */
    public static void mostrarArray(int[] array) {

        System.out.println("El array contiene los siguientes números.");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int longitud = longitudArray();
        int[] numerosArray = rellenoArray(longitud);
        mostrarArray(numerosArray);
    }

}
