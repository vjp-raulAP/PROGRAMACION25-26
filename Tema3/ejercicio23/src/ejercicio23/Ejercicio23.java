/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //declaro las variables que voy a usar
       int numero;
       int i;
       //creo el Scanner
       Scanner num = new Scanner(System.in);
       //hago un do while para validar que el nemero sea correcto.
        do {
            System.out.println("Por favor introduzca un numero mayor que 1: ");
            numero = num.nextInt(); //usuario introduce numero por consola
            if (numero <= 1) {
                System.out.println(" Error: el numero debe ser mayor a 1. Vuelva a intentarlo: ");
            }
            
        } while (numero <=1); //mientras que el numero introducido  sea menor o igual a 1 se repetira el bucle.
        
        System.out.println("los numeros del 1 al " +numero +" son: "); //informo a usuario desde 1 hasta donde el me pide
        for ( i = 1; i <= numero; i++) {   //utilizo un for para que lea los números de 1 en 1  desde el numero 1 a el numero anterior  elejido
            
            System.out.print(i); //Lo imprimo en una misma linea, sin salto  
            
            if (i< numero ){  //He agregado este if para quitar la última ","
                System.out.print(", ");
            }
        }
    }
    
}
