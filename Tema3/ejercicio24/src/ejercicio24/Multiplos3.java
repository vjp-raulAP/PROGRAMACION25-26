/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
public class Multiplos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero;
       int i;
       int contador = 0;
       Scanner num = new Scanner(System.in);
        do {
            System.out.println("Por favor introduzca un numero mayor a 0: ");
            numero = num.nextInt(); //usuario introduce numero por consola
            if (numero <= 0) {
                System.out.println("Error: el numero es igual o inferior a 0.");
            }
        } while (numero <=0);
        System.out.println("Los multiplos de 3 entre 1 y " +numero + " son: ");
        for ( i = 1; i <= numero; i++) {
            
            if (i % 3 == 0) {
                
                System.out.print(i + " ");
                
                contador++;   
            }
        }
        System.out.println();
        if (contador == 0) {
            System.out.println("No hay multiplos de 3 en ese rango");
        }
        else{
        System.out.println("El  total de multiplos de 3 entre 1 y " + numero + " son: " + contador);
        }
    }
}
