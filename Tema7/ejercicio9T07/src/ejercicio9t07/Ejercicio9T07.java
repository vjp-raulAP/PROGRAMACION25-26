/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9t07;

import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Ejercicio9T07 {
/**
 * metodo pedir numero al usuario
 * @return  numeroUsuario
 */
    public static int pedirNumero() {
        int numeroUsuario;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor introduzca un numero entero. ");
        numeroUsuario = entrada.nextInt();
        System.out.println("El numero introducido es :"+numeroUsuario);
        return numeroUsuario;
    }
    
    /**
     * metodo para obtener cifras de un numero que pasamos por parametro
     * @param numeroUsuario
     * @return 
     */

    public static int cifrasNumUsuario(int numeroUsuario) {
        int contador = 0;

        do {
            numeroUsuario = numeroUsuario / 10;
            contador++;

        } while (numeroUsuario != 0);
        System.out.println("Se compone de "+contador+" cifras.");
        return contador;
    }
    
    /**
     * division de cifras intoduciendo el numero y el numero de cifras para crear el array.
     * @param contador
     * @param numero
     * @return 
     */

    public static int[] divisionCifras(int contador, int numero) {
        int[] arrayUsuario = new int[contador];
        for (int i = 0; i < arrayUsuario.length; i++) {
            arrayUsuario[i] = numero % 10;
            numero = numero / 10;
        }
        return arrayUsuario;
    }
   /**
    * Metodo mostrar array 
    * @param arrayUsuario 
    */
     public static void mostrarArrayReves(int[] arrayUsuario){
        System.out.print("El número introducido al revés es el: ");
        for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.print(arrayUsuario[i]); 
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = pedirNumero();
        
        int contador=cifrasNumUsuario(numero);

        
        int[]cifras =divisionCifras(contador,numero);
        mostrarArrayReves(cifras);
    }
    
}
