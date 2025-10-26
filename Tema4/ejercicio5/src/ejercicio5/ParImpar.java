/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 * Dentro de este paquete estla la clase ParImpar que contiene el main que solicita al usuario un numero y 
 * determinina si es par o impar llamando a un metodo de otra clase.
 * @author rulaa
 */
import java.util.Scanner;
import utilidades.VerificarPar;
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro las variables que voi a usar
        int num1;
        //Creamos el Scanner para pedir un número al usuario 
        Scanner numeroUsuario = new Scanner(System.in);
        //Pedimos la usuario un numero por teclado
        System.out.println("Por favor, introduzca un numero. ");
        num1 = numeroUsuario.nextInt();
        
        utilidades.VerificarPar.parOimpar(num1);
        
    }
    
}
