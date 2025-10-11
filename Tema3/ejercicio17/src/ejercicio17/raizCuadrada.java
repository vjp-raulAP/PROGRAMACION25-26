/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author rulaa
 */
import java.util.Scanner; // importamos Scanner para que el usuario introduzca por teclado
public class raizCuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double numero; //declaro la variable numero para la entrada de usuario
        double raiz; //declaro variable donde almaceno el resultado de la raiz
        //creo la entrada scanner
        Scanner entrada = new Scanner(System.in);
        
        do{
            //primero pedimos al usuario que introdzca un numero
            System.out.println("Por favor, introduca un numero para calcular la raiz");
            numero = entrada.nextDouble(); //leemos el numero
            
            //Si el numero es negativo, muestra error.
            if (numero < 0){
                System.out.println("Error, ha metido un numero negativo. ");  
            }
            
        }while (numero < 0); //repetimos el bucle cuando sea numero negativo
              
        //hago la raiz.
        raiz = Math.sqrt(numero);
        
        //Mostramos resultado
        
        System.out.println("La raiz cuadrada de " + numero + " es " + raiz);
        
        
    }
    
}
