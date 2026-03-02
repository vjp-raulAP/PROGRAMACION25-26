/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Ejercicio01T10 {
// Método para rellenar la lista de nombres
    public static void rellenarLista(ArrayList<String> nombres) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String respuesta;

        do {
            System.out.print("Introduce el nombre de la persona: ");
            nombre = entrada.nextLine();
            nombres.add(nombre);

            System.out.print("¿Deseas introducir otro nombre? (si ó no): ");
            respuesta = entrada.nextLine().toLowerCase();

        } while (respuesta.equals("si")); // mientras la respuesta sea ejecuta bucle "si"
    }
    
      // Método para mostrar la lista
    public static void mostrarLista(ArrayList<String> nombres) {
        System.out.println("\nLista de nombres:");
        for (String n : nombres) {
            System.out.println(n);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        rellenarLista(nombres); // Rellenar la lista

        mostrarLista(nombres);  // Mostrar la lista
    }
    
}
