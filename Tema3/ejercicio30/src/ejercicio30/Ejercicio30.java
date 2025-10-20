/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio30;

/**
 *
 * @author rulaa
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int numeroAleatorio = (int)(Math.random()*100+1);
        int contador=0;
        int numeroJugador;
        boolean acierto = false;
        System.out.println(numeroAleatorio); //Para ver que funciona correctamente el aleatorio
        System.out.println("------ADIVINA EL NUMERO ENTRE 1 Y 100---------");
        
        do {
           
            try{
            System.out.println("Introduce un numero entre 0 y 100: ");
            numeroJugador = num.nextInt();
            contador++;
          
            if (numeroJugador < 1 || numeroJugador > 100) {
                System.out.println("Debes introducir un numero entre 1 y 100");
            }
            
            else if(numeroJugador < numeroAleatorio){
                System.out.println("El numero introducido es ** MENOR ** al número oculto");
            }
            else if(numeroJugador > numeroAleatorio){
                System.out.println("El numero introducido es ** MAYOR ** al número oculto");
            }
            else{
                System.out.println("****************************");
                System.out.println("******  HAS ACERTADO  ******");
                System.out.println("****************************");
                System.out.println("Lo has acertado en el intento: " + contador);
                acierto = true;
            }
            }catch (InputMismatchException e){
                System.out.println("Debes introducir un número valido entre 1 y 100");
                num.nextLine();
                contador++;
            }
        } while (!acierto);
    }
    
}
