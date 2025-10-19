/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author alumno
 */

import java.util.Scanner; //importo el Scanner
public class numeroMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Creo el scanner que lea los datos
        Scanner numeroUsuario = new Scanner(System.in);
        //declaro las variables que voy a usar
        float num1;
        float num2;
        float num3;
        System.out.println("Por favor, introduzca un Primer numero:  ");
        num1 =  numeroUsuario.nextFloat(); //guardo el primer numero introducido por usuario en la variable num1
        System.out.println("Introduzca el segundo número: ");
        num2 = numeroUsuario.nextFloat(); //guardo el primer numero introducido por usuario en la variable num2
        System.out.println("Introduzca el tercer número: ");
        num3 = numeroUsuario.nextFloat(); //guardo el primer numero introducido por usuario en la variable num3
        
        if ((num1 < num2)&(num1 < num3)){ //condicional si num1 es menor a num2 y num3 entra en el if.
            System.out.println("El numero menor de los introducidos es: " +num1);
            
        }
        else if ((num2 < num1)&(num2 <num3)){ //lo mismo con num2
            System.out.println("El numero menor de los introducidos es: " +num2);
        }
        else { //
            System.out.println("El numero menor de los introducidos es: " +num3);
        }
    }
}

