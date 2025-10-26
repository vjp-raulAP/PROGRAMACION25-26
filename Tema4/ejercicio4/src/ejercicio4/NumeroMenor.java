/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author rulaa
 */


import java.util.Scanner;

public class NumeroMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro las variables que voy a usar 
       int num1, num2, num3, numMenor;
       //Creo el Scanner de entrada de datos del usuario
       Scanner numeroUsuario = new Scanner(System.in);
       //Pido al usuario el ingreso de numeros guardandolos en  num1 , num2 y num3
        System.out.println("Por favor introduzca el primer número: ");
        num1 = numeroUsuario.nextInt();
        System.out.println("Introduzca un segundo número: ");
        num2 = numeroUsuario.nextInt();
        System.out.println("Introduzca un tercer número");
        num3 = numeroUsuario.nextInt();
        
        //Guardo en numMenor el resultado obtenido del método comparador que está en el mismo paquete.
        numMenor = Utilidades.comparador(num1, num2, num3);
         System.out.println("El menor de los tres numeros introducidos  es: " + numMenor);
        
    }
    
}
