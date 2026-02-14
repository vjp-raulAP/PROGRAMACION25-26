/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03t09;

import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Ejercicio03T09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena;
        char []caracteres;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce una cadena de caracteres");
        cadena =  entrada.nextLine();
        
        System.out.println("La cadena es:");
        for (int i = 0; i < cadena.length(); i++) {
            caracteres = cadena.toCharArray();
            
            System.out.println(caracteres[i]);
        }
    }
    
}
