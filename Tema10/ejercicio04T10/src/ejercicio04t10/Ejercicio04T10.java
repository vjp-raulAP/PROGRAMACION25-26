/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Ejercicio04T10 {
 // Leer todos los números en una línea
    public static void rellenarArrayList(ArrayList<Integer> numeros) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce números separados por espacios:");

        String linea = sc.nextLine();
        String[] partes = linea.split(" ");

        for (String p : partes) {
            int num = Integer.parseInt(p);
            if (num > 0) {
                numeros.add(num);
            }
        }
    }

    // Mostrar lista
    public static void mostrarArrayList(ArrayList<Integer> numeros) {
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // Sustituir todos los números repetidos por 0
    public static void sustituirRepetidos(ArrayList<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            int actual = numeros.get(i);

            // Comprobar si aparece más de una vez en la lista
            if (numeros.indexOf(actual) != numeros.lastIndexOf(actual)) {
                for (int j = 0; j < numeros.size(); j++) {
                    if (numeros.get(j).equals(actual)) {
                        numeros.set(j, 0); // Cambiar todas las apariciones a 0
                    }
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<Integer> numeros = new ArrayList<>();

        rellenarArrayList(numeros);

        System.out.println("ANTES:");
        mostrarArrayList(numeros);

        sustituirRepetidos(numeros);

        System.out.println("DESPUÉS:");
        mostrarArrayList(numeros);
    }
    
}
