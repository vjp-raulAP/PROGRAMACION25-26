/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamiento;

import java.util.Arrays;

/**
 *
 * @author rulaa
 */
public class Ordenamiento {
// Método de la imagen
    boolean burbuja(int[] arrayNumeros) {
        boolean ordenado = true;
        int elementoActual, elementoSiguiente;

        for (int x = 0; x < arrayNumeros.length; x++) {
            for (int y = 0; y < arrayNumeros.length - 1; y++) {
                elementoActual = arrayNumeros[y];
                elementoSiguiente = arrayNumeros[y + 1];

                if (elementoActual > elementoSiguiente) {
                    // Intercambiar
                    arrayNumeros[y] = elementoSiguiente;
                    arrayNumeros[y + 1] = elementoActual;
                    ordenado = false;
                }
            }
        }
        return ordenado;
    }
    public static void main(String[] args) {
       Ordenamiento programa = new Ordenamiento();
        
        // 1. Definir el array a ordenar
        int[] misNumeros = {5, 2, 9, 1, 5, 6};
        
        System.out.println("Array original: " + Arrays.toString(misNumeros));

        // 2. Llamar al método burbuja
        boolean fueModificado = !programa.burbuja(misNumeros);

        // 3. Mostrar resultados
        System.out.println("Array ordenado: " + Arrays.toString(misNumeros));
        System.out.println("¿El array estaba desordenado?: " + fueModificado);
    }
}
