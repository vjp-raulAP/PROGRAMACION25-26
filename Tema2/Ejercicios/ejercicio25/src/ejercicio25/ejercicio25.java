/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author rulaa
 */
//importo la libreria util de Java
import java.util.Scanner;
public class ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro variables
        int num1, num2, num3;
        int suma, producto;
        
        //introducimos el scanner para qu enos lea los datos del usurio
        Scanner entrada = new Scanner(System.in);
        
        //imprimo lo que le quiero pedir al usuario
        System.out.println("Por favor, introduzca el primer número: ");
        num1 = entrada.nextInt();
        
        System.out.println("Por favor, introduzca el segundo número: ");
        num2 = entrada.nextInt();
                
        System.out.println("Por favor, introduzca el tercer número: ");
        num3 = entrada.nextInt();  
        
        //Realizamos los cáculos
        
        suma = num1 + num2 + num3;
        
        producto = num1 * num2 * num3;
        
        //imprimo resultado
        
        System.out.println("La suma de los números introducidos es: "+ suma);
        System.out.println("El producto de los numeros untroducidos es: "+ producto);
        
    }
    
}
