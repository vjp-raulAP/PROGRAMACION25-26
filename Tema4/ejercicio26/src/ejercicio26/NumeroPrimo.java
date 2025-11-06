/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
public class NumeroPrimo {
    
    
    public static int numeroUsuario(){
        int numUsuario;
        Scanner entrada =  new Scanner (System.in);
        System.out.println("Por fvor, introduzca un número. ");
        numUsuario = entrada.nextInt();
        return numUsuario;
    }
    
    public static boolean esPrimo(int numeroUsuario){
        boolean esPrimo = true;
        //Condicionate en el que los números menor a 1 no son primos
           if (numeroUsuario <= 1) {
               return false;
            }  
           for (int i = 2; i < numeroUsuario; i++) {
               if (numeroUsuario % i == 0){ //Condicion con bucle for en la que si el resto es 0, no sería nuemro primo
                   return false;
               }
            }
            return esPrimo;
            
        }
    
    
    

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        int numero = numeroUsuario();
        if (esPrimo(numero)){
            System.out.println(numero+" es un numero primo ");
        }else {
         
            System.out.println(numero+" no es un numero primo ");  
        
        }
    }
    
}
