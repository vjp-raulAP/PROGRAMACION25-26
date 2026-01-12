/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08t07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio08T07 {

// Método que pide el número al usuario
    public static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        int numeroUsuario;

        do {
            System.out.print("Introduzca un número entero de 5 cifras: ");
            numeroUsuario = sc.nextInt();
        } while (numeroUsuario < 10000 || numeroUsuario > 99999);

        return numeroUsuario;
    }

    // Método que divide el número en cifras y las guarda en un array
    public static int[] dividirEnCifras(int numero) {
        int[] cifras = new int[5];

        for (int i = 0; i < cifras.length; i++) {
            cifras[i] = numero % 10;
            numero /= 10;
        }

        return cifras;
    }

    // Método que muestra el número al revés
    public static void mostrarAlReves(int[] cifras) {
        System.out.print("El numero introducido escrito al revés es el: ");

        for (int i = 0; i < cifras.length; i++) {
            System.out.print(cifras[i]);
        }

        System.out.println();
    }
}


     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
    

