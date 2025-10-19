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
public class positivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Creo el scanner que lea los datos
        Scanner num = new Scanner(System.in);
       
        int numero;
       
        System.out.println("Por favor, introduzca un numero:  ");
        //declaro varibles
        numero =  num.nextInt();
       
        
        if (numero > 0) { 
           
            System.out.println("El número introducido es positivo");
        }
    
        else { 
            System.out.println("El número introducido es negativo");
        }
    }
}

    

