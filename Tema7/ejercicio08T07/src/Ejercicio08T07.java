/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08T07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio08T07 {

    // Método que pide el número al usuario
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numeroUsuario;

        do {
            System.out.print("Introduzca un número entero de 5 cifras: ");
            numeroUsuario = entrada.nextInt();
        } while (numeroUsuario < 10000 || numeroUsuario > 99999);

        return numeroUsuario;
    }

    // Método que divide el número en cifras y las guarda en un array
    public static int[] dividirEnCifras(int numero) {
        int[] cifras = new int[5];
        for (int i = 0; i < cifras.length; i++) {
            cifras[i] = numero % 10;  //hago el modulo de tal manera que si  divido x ejemplo 12345, me quedari con el 5 y  numero /10 =1234;  vuelvo a iterar con 1234. 
            numero /= 10;
        }

        return cifras;
    }

    // Método que muestra el número al revés
    public static void mostrarAlReves(int[] cifras) {
        System.out.print("El número introducido escrito al revés es: ");
        for (int i = 0; i < cifras.length; i++) {
            System.out.print(cifras[i]);
        }
        System.out.println();
    }

    // Método principal
    public static void main(String[] args) {
        int numero = pedirNumero();
        int[] cifras = dividirEnCifras(numero);
        mostrarAlReves(cifras);
    }
}