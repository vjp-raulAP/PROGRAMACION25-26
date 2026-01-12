/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2t07;

import java.util.Scanner;







/**
 *
 * @author rulaa
 */
public class IntercambioNumeros {

    /**
     * Metodo pedir 7 numeros enteros e introducirlos en array unidimensional
     *
     * @return
     */
    public static int[] pedirNum() {
        int[] numArray = new int[7];
        int i;
        Scanner entrada = new Scanner(System.in);
        for (i = 0; i < numArray.length; i++) {
            System.out.println("Por favor, introduzca un numero entero " + (i + 1) + ": ");
            numArray[i] = entrada.nextInt();
        }

        return numArray;
    }

    /**
     * Metodo intercambio de numeros del array entre los indices 2 y 4
     *
     * @param numerosArray
     */
    public static void intercambioNumeros(int[] numerosArray) {
        int aux = numerosArray[1];
        numerosArray[1] = numerosArray[3];
        numerosArray[3] = aux;
    }

    public static void verArray(int[] numerosArray) {
        System.out.println("Los numeros del array son: ");
        for (int num : numerosArray) {
            System.out.println(num);
        }
    }




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] numerosUsuario = pedirNum();
        System.out.println("Array por orden de introducion del usuario: ");
        verArray(numerosUsuario);
        
        intercambioNumeros(numerosUsuario);
        
        System.out.println("Array con los indices 1 y 4 cambiados entre si: ");
        
        verArray(numerosUsuario);
        
    }
    
}
