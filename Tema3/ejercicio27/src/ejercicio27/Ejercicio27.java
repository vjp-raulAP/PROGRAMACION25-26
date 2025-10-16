/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos variables
        Scanner numero = new Scanner (System.in);
        float num1;
        float num2;
        int opcion;
        float resultado;
        //uso el condicionante do while para que al menos una vez me saga la introduccion de datos y opciones que el usuario va a necesitar
        do {
        //Pido al usuario los números por patallas
        System.out.println("Por favor, introduzca el primer numero: ");
            num1 = numero.nextFloat();
        System.out.println("Por favor, introduzca el segundo numero: ");
            num2 = numero.nextFloat();
            
        //creo las opciones que tiene el usuario y que se repetirá al menos una vez
        
            System.out.println("----- OPCIONES ------");
            System.out.println("1.- Sumar los números");
            System.out.println("2.- Restar los números");
            System.out.println("3.- Multiplicar los números");
            System.out.println("4.- Dividir los numeros");
            System.out.println("5.- Salir del programa");
            opcion = numero.nextInt();
            switch (opcion){  //Creo el switch para que me ejecute la opcion dada por el cliente
                case 1:
                    resultado = num1 +num2;
                    System.out.println("La suma de " +num1 + " + "+ num2 +" = " + resultado  );
                   
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("La resta de " +num1 + " - "+ num2 +" = " + resultado  );
                    
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("La multiplicacion de " +num1 + " x "+ num2 +" = " + resultado  );
                    
                    break;
                case 4:
                    if (num2 == 0){
                        System.out.println("Error: no se puede dividir entre 0"); //Control en cso de division por 0 
                        
                    }else{
                    resultado = num1 / num2;
                    System.out.println("La division de " +num1 + " / " + num2 + " = " + resultado);
                    
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa , gracias...");//opción salir del programa
                    break;
                    
                default:
                    System.out.println("Opción no valida. elija una opcion del 1 al 5"); //Para opcion diferentes a las enumeradas anteriormente
                   
                    break;
            }
            } while (opcion != 5);
        }  
    
}
