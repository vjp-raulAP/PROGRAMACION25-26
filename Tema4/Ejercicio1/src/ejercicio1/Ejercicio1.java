/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 1 
     * 
     */
    //creo el metodo que que me pida el numero al usuario
    public static int pedirNum (){
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = entrada.nextInt();
        return numero;
    }
     //
    public static void main(String[] args) {
         int numero = Ejercicio1.pedirNum();
         if(numero > 0){
             System.out.println("El número es positivo. ");
         }
         else {
             System.out.println(" El número es  nesgativo");
         }
        
    }
    
}
