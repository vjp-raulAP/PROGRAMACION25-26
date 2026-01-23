/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10t07rellenovector;

/**
 *
 * @author rulaa
 */
public class Ejercicio10T07 {
    /**
     * Metodo introduce un vector pasando por parametro
     * @param vector 
     */
  
    public static void rellenarVector (int[] vector){
        int i;
        for ( i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*8)+1; //aleatorio de 1 al 8;
        }
    }
    /**
     * metodo para mostrar los valores de un vector pasando el vector por parametros
     * @param vectorUsuario 
     */
    public static void mostrarVector(int [] vectorUsuario){
        int i;
        for (i = 0; i < vectorUsuario.length; i++) {
           
            System.out.print(vectorUsuario[i] + " ");
        }
    }
    
    
    public static void repetidosCambiar(int [] array){
       int [] contador = new int [9];  ///creo un array contador que usare para que me cuente las veces que se repiten los numeros del vector.
       int i;
        //cuento las veces que aparece cada numero
        for (i = 0; i < array.length ; i++) {
            contador[array[i]]++;
        }
       // Sustituir los repetidos por 0 usando while
        i = 0;
        while (i < array.length) {
            if (contador[array[i]] > 1) {
                array[i] = 0;
                }
                i++;
            }
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[10];  //creo un array de 1o valores
        rellenarVector(array);
        System.out.print("Se han generado los siguiente numeros: ");
        mostrarVector(array);
        repetidosCambiar(array);
        System.out.println();
        System.out.print("Sustituimos los elementos repetidos por un 0: ");
        mostrarVector(array);
    }
    
}
