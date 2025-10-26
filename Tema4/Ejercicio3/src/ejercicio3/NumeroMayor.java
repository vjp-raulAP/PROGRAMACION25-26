/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3; //paquete donde contiene la clase principal

/**
 *
 * @author rulaa
 */
import java.util.Scanner; //PAra que lea la entrada del usuario
import utilidades.Comparador; //Importamos la clase comparador del paquete utilidades.
public class NumeroMayor {

    /**
     * 
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
    
        //Creo el scanner para la entrada de datos 
        Scanner numeroUsuario = new Scanner(System.in);
        //creo las variables y la variable Mayor que recogere del la clase Comparador
        int num1,num2,num3,Mayor;
        //Pido al usuario 3 numeros
        System.out.println("Por favor,  introduzca el primer numero: ");
        num1 = numeroUsuario.nextInt();
        System.out.println("Ahora, introduzca un segundo numero: ");
        num2 = numeroUsuario.nextInt();
        System.out.println("Por último introduzca un tercer numero:  ");
        num3 = numeroUsuario.nextInt();
        //llamamos al Médoto "encontrarMayor" de la clase "comparador" y guardamos en la variable Mayor
      Mayor = Comparador.encontrarMayor(num1,num2,num3);
                
        System.out.println("El numero mayor de los introducidos es el " +Mayor);
        
        
    }
    
}
