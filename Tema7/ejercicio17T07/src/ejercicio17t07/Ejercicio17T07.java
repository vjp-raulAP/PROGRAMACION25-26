/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17t07;

/**
 *
 * @author rulaa
 */
public class Ejercicio17T07 {

    /**
     * Metodo crear array unidimesional de 10 num aleatorios de 0 y 9
     *
     * @return array
     */
    public static int[] arrayAleatorio() {
        int[] array = new int[10];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    /**
     * Metodo para mostrar un array pasando por parametros un array de enteros.
     *
     * @param array
     */
    public static void mostrarArray(int[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void mayorMenorArray(int[] array) {
        int auxiliar;
        int i;
        boolean cambio;
        do {
            cambio = false;
            for (i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    auxiliar = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = auxiliar;
                    cambio = true;
                }
            }
        } while (cambio);

    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int []array = arrayAleatorio();
        System.out.print("Los numeros aleatorios creados son: ");
       mostrarArray(array);
       mayorMenorArray(array);
        System.out.println("");
        System.out.print("Los números ordenados de mayor a menor son: ");
       mostrarArray(array);
       
    }
    
}
