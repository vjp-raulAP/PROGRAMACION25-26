/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
 import java.util.Scanner; //importamos Scanner para que pueda introducir numeros el usuario
public class sumaProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo el scanner que lea los datos
        Scanner numero = new Scanner(System.in);
        //Declaro las variables que usare
        int num1;
        int num2;
        int resultado1;       
        System.out.println("Por favor, introduzca un Primer numero:  ");
          num1 =  numero.nextInt(); //guardo el numero introducido por usuario en la variable num1
        System.out.println("Introduzca el segundo número: ");
          num2 = numero.nextInt();  //guardo el numero introducido por usuario en la variable num2
        
          if (num1 > 10) {   // Condicion. Si es mayor a 10 entra en el "if" y realiza el cálculo.
            System.out.println("El  primer número introducido es " +num1  + ". Es mayor a 10.");
           //realizo el cálculo
           resultado1 = num1* num2;
              System.out.println("La operación que realizó es ** PRODUCTO **  y el resultado es : "  + num1 + " x " + num2 + " = " + resultado1);
            }
    
            else {   //si no se cumple el "if" es que es
            System.out.println("El  primer número introducido es " +num1  + ". Es menor a 10.");
            //realizo calculo
            resultado1 = num1 + num2;
            System.out.println("La operación que realizó es ** SUMA ** y el resultado es : "  + num1 + " + " + num2 + " = " + resultado1);
          
        }
    }
    
}
