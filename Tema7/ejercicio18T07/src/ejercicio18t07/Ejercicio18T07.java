/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18t07;

/**
 *
 * @author rulaa
 */
public class Ejercicio18T07 {
    
    /**
     * Metodo crear array que de 10 numeros total
     */
    public static int[] arrayUnidos(int [] array1, int[] array2){
        int [] arrayResultado = new int [10];
        int i;
        //almaceno el primer array en arrayResultado
        for ( i = 0; i < array1.length; i++) {
            arrayResultado[i]= array1[i]; 
        }
          for ( i = 0; i < array2.length; i++) {
            arrayResultado[i+array1.length]= array2[i]; 
        }
        
          //uso el metodo del ejercicio anterior
           int auxiliar;

        boolean cambio;
        do {
            cambio = false;
            for (i = 0; i < arrayResultado.length - 1; i++) {
                if (arrayResultado[i] < arrayResultado[i + 1]) {
                    auxiliar = arrayResultado[i];
                    arrayResultado[i] = arrayResultado[i + 1];
                  arrayResultado[i + 1] = auxiliar;
                    cambio = true;
                }
            }
        } while (cambio);
          
          return arrayResultado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaro dos arrays
        
         int[] array1 = {4, 8, 1, 9, 3};
         int[] array2 = {7, 2, 6, 5, 0};
         
         int[] arrayResultado = arrayUnidos(array1, array2);
         int i;
         System.out.println("el resultado es: ");
         for ( i = 0; i < arrayResultado.length; i++) {
             System.out.print(arrayResultado[i]+ " ");
        }
         
         
                 
          
        
    }
    
}
