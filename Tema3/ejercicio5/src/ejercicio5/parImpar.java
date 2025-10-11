/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class parImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //Creo el scanner que lea los datos
        Scanner numero = new Scanner(System.in);
        int num;
        System.out.println("Por favor, introduzca un numero:  ");
        //declaro varibles
        num =  numero.nextInt();
        
        if (num %2 ==0 ) { 
            System.out.println("El número introducido es par");
        }
    
        else { 
            System.out.println("El número introducido es impar");
        }
    }
    
}
