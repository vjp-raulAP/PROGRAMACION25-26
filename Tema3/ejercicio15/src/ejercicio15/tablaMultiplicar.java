/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author rulaa
 
**/
import java.util.Scanner; //importamos Scanner para leer los datos del usuario
public class tablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro las variables que voy a usar 
        int i = 1;
        int numero;
        int resultado;
        
        //Creo el scanner para ller el número que escriba el usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número para ver su tabla de multiplicar: ");
        numero = entrada.nextInt();
       
        while(i <=10){    //pongo la condicion que el bucle sea hasta 10
            resultado = numero * i; //realizo el cálculo y lo guardo en la variable resultado
            System.out.println(numero +" x "+ i +" = " + resultado); //imprimo resultado
            i++; //añadimos 1 al contador
        }
        
        
    }
    
}
