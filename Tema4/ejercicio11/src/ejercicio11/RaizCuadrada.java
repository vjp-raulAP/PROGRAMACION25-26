/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
public class RaizCuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num = peticionNumero(); //llamo al método que pide número al usuario
        double raiz = raizCuadrada(num);//llamo al metodo raiz para realizar el cálculo pasandole el parametro.
        muestraResultado(num,raiz); //llamo al metodo para que me muestre el resutlado.
        
    }
    //metodo primero pedir numero que sea positivo
    public static float peticionNumero(){
        Scanner numeroUsuario = new Scanner(System.in);  
        float numero; //declaro la variable numero que uso para el return
        
        do {   //bucle do-while para que me pida el numero positivo mientras sea menor de 0
            System.out.println("Introduzca un numero positivo. ");
            numero = numeroUsuario.nextFloat();
            if (numero < 0) {
                System.out.println("Error. El numero es negativo.");
                
            }
        } while (numero < 0);
        return numero;
    }
    
    //metodo para calculo  de raiz
    public static double raizCuadrada(double raiz){
        
        raiz = Math.sqrt(raiz);
        return raiz;
    }
    //mostrar resultado uso void porque no va a retornar nada. 
    public static void muestraResultado(float num, double raiz){
        System.out.println("La raiz cuadrada del número " + num + " es " +raiz);
    }
    
}
