/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena;
        char caracter;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce una cadena de caracteres");
        cadena =  entrada.nextLine();
        
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            System.out.println(caracter);
        }
        
        
        
        
    }
    
}
