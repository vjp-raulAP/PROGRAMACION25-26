/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author alumno
 */

import java.util.Scanner;  //importo el Scanner para trabajar con el
public class numeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Creo el scanner que lea los datos
        Scanner numero = new Scanner(System.in); //creo un escaner para que el usuario introduzca los datos
        //Declaro las variables que voy a usar
        float num1;
        float num2;
        float num3;
        System.out.println("Por favor, introduzca un Primer numero:  ");
        num1 =  numero.nextFloat(); //guardo el numero introducido por el usuario en la variable num1;
        System.out.println("Introduzca el segundo número: ");
        num2 = numero.nextFloat(); //guardo el numero introducido por el usuario en la variable num2;
        System.out.println("Introduzca el tercer número: ");
        num3 = numero.nextFloat(); //guardo el numero introducido por el usuario en la variable num3;
        //creo los condicionales
        if ((num1 > num2)&(num1 > num3)){ //si num1 es mayor que num2 y num3. num1 es el mayor
            System.out.println("El numero mayor de los introducidos es: " +num1);
            
        }
        else if ((num2 > num1)&(num2 >num3)){ //lo mismo con num2
            System.out.println("El numero mayor de los introducidos es: " +num2);
        }
        else if ((num3 > num1)&(num3 > num2)){ //lo mismo con num3
            System.out.println("El numero mayor de los introducidos es: " +num3);
        }
    }
}

