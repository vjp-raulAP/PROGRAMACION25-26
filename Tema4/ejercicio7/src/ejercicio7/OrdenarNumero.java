/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
public class OrdenarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro las variables que usaré.
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int i = 0;
        Scanner entrada = new Scanner(System.in);
        
        //hago un bucle for con un switch para introducir lso numeros
        
        do {
            
        
            switch (i){
                case 0:
                    System.out.println("Por favor, introduzca el primer número: ");
                    num1 = entrada.nextInt();
                    break;
                case 1:
                    System.out.println("Por favor, introduzca el segundo número: ");
                    num2 = entrada.nextInt();
                    break;
                case 2:
                    System.out.println("Por favor, introduzca el tercer número: ");
                    num3 = entrada.nextInt();
                    break;
                case 3:
                    System.out.println("Por favor, introduzca el cuarto número: ");
                    num4 = entrada.nextInt();
                    break;
                } 
                i++;
            }while (i < 4);
            
            System.out.println(num1 + " , " + num2 + "  , " + num3 +" , " +num4);
            
        }
        
    
    
}
