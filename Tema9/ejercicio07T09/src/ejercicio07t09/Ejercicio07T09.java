/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07t09;

import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Ejercicio07T09 {
    //metodo para pedir al usuario una frase
    public static String pedirFrase(){
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Inserte una frase");
        String frase = entrada.nextLine();
        return frase;
    }
    
    //metodo para invertir las palabras
    public static String invertirFrase(String frase){
        String[] palabras = frase.split(" "); // Separar en palabras
    String resultado = "";

    
    for (int i = 0; i < palabras.length; i++) {
        String invertida = "";
        String palabra = palabras[i];

        // Invertir cada palabra letra por letra
        for (int j = palabra.length() - 1; j >= 0; j--) {
            invertida += palabra.charAt(j);
        }

        resultado += invertida + " "; // Agregar palabra invertida al resultado
    }

    return resultado;
}

    //metodo para mostrar el resultado
    public static void mostrarResultado(String fraseReves){
        System.out.println("La frase al revés es :");
        System.out.println(fraseReves);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = pedirFrase();
        String fraseInvertida = invertirFrase(frase);
        mostrarResultado(fraseInvertida);
    }
    
}
