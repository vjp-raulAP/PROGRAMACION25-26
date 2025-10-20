/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int numeroAleatorio = (int)(Math.random()*100+1);
        int contador=0;
        int numeroJugador;
        System.out.println(numeroAleatorio);
        System.out.println("------ADIVINA EL NUMERO ENTRE 1 Y 100---------");
        
        do {
            System.out.println("Introduce un numero entre 0 y 100: ");
            numeroJugador = num.nextInt();
            contador++;
            
            
            if(numeroJugador < numeroAleatorio){
                System.out.println("El numero introducido es **MENOR** al número oculto");
            }
            else if(numeroJugador > numeroAleatorio){
                System.out.println("El numero introducido es **MAYOR** al número oculto");
            }
            else{
                System.out.println("¡¡¡¡¡HAS ACERTADO¡¡¡¡¡");
                System.out.println("Lo has acertado en el intento: " + contador);
            }
        } while (numeroJugador != numeroAleatorio);
    }
    
}
