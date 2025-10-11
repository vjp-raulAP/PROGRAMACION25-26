/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
 import java.util.Scanner;
public class sumaProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            //Creo el scanner que lea los datos
        Scanner numero = new Scanner(System.in);
        int num1;
        int num2;
        int resultado1;
        int resultado2;        
        System.out.println("Por favor, introduzca un Primer numero:  ");
        //declaro varibles
        num1 =  numero.nextInt();
        
        System.out.println("Introduzca el segundo número: ");
        
        num2 = numero.nextInt();
        
          if (num1 > 10) { 
            System.out.println("El número introducido es mayor a 10");
           //realizo el cálculo
           resultado1 = num1* num2;
              System.out.println("La operación que realizó es producto  y el resultado es :" + resultado1);
        }
    
        else { 
            System.out.println("El número introducido es menor a 10");
            //realizo calculo
           resultado2 = num1 + num2;
            System.out.println("La operación que realizó es suma  y el resultado es :" + resultado2);
          
        }
    }
    
}
