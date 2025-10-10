/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author alumno
 */

import java.util.Scanner;
public class numeroMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Creo el scanner que lea los datos
        Scanner numero = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Por favor, introduzca un Primer numero:  ");
        num1 =  numero.nextInt();
        System.out.println("Introduzca el segundo número: ");
        num2 = numero.nextInt();
        System.out.println("Introduzca el tercer número: ");
        num3 = numero.nextInt();
        
        if ((num1 < num2)&(num1 < num3)){
            System.out.println("El numero menor de los introducidos es: " +num1);
            
        }
        else if ((num2 < num1)&(num2 <num3)){
            System.out.println("El numero menor de los introducidos es: " +num2);
        }
        else if ((num3 < num1)&(num3 < num2)){
            System.out.println("El numero menor de los introducidos es: " +num3);
        }
    }
}

