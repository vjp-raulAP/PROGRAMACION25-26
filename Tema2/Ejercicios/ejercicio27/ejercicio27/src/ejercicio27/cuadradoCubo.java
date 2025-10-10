/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

/**
 *
 * @author alumno
 */
 import java.util.Scanner;
public class cuadradoCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero: ");
        float numero = entrada.nextFloat();
        
        //calculo de cuadrado y cubo
        float cuadrado = numero * numero;
        float cubo = numero * numero * numero;
        
        //imprimo por pantalla
        System.out.println("El doble de " + numero + "es: " +cuadrado);
        System.out.println("El cubo de " + numero +"es: " +cubo);
        
    }
    
}
