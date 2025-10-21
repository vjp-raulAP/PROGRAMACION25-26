/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

/**
 *
 * @author rulaa
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos variables
        Scanner numero = new Scanner (System.in);
        int num1;   //variable int. Si pongo float no me salta control de excepciones
        int num2;   //variabke int. Si pongo float no me salta control de excepciones
        int opcion = 0;  //variable que uso para el switch
        float resultado; // Almaceno resultado  la operaciones
        //uso el condicionante do while para que al menos una vez me saga la introduccion de datos y opciones que el usuario va a necesitar
        do {
            try{
        //Pido al usuario los números por patallas
        System.out.println("Por favor, introduzca el primer numero: ");
            num1 = numero.nextInt();
        System.out.println("Por favor, introduzca el segundo numero: ");
            num2 = numero.nextInt();
            
        //creo las opciones que tiene el usuario y que se repetirá al menos una vez
        
            System.out.println("--------- OPCIONES ----------");
            System.out.println("1.- Sumar los números");
            System.out.println("2.- Restar los números");
            System.out.println("3.- Multiplicar los números");
            System.out.println("4.- Dividir los numeros");
            System.out.println("5.- Salir del programa");
            System.out.println("-----------------------------");   
            opcion = numero.nextInt();
           
            switch (opcion){  //Creo el switch para que me ejecute la opcion introducida por el usuario
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
                    try {
                        resultado = num1 /num2;
                        System.out.println("La division de "+num1 + " / " +num2 + " = " +resultado);
                    }catch(ArithmeticException e){
                        System.out.println("Error: No se puede dividir entre 0.");
                    }
                            
                    break;
                case 5:
                    System.out.println("Saliendo del programa , gracias...");//opción salir del programa
                    break;
                    
                default:
                    System.out.println("Opción no valida. elija una opcion del 1 al 5"); //Para opcion diferentes a las enumeradas anteriormente
                   
                } 
            }catch(InputMismatchException e){   //Captura de la excepcion números
                System.out.println(" Error: Debes introducir números válidos.");

                numero.nextLine(); //limpia la entrada. sino se me ejecuata en bucle 

            }
            } while (opcion != 5);
        }  
    
}
