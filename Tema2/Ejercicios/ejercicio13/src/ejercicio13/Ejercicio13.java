/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author rulaa
 */
public class Ejercicio13 {

    /**
     * Ejerciicio 13 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declara las variables num1 y num2
        int num1 = 1;
        int num2 = 2;
        //imprimo por pantalla los valores
        System.out.println("Los valores actuales de las variables son num1= " + num1 +" y la variable num2= " + num2 );
        // Declaro una variable numAux donde guadaré num1;
        int numAux = num1;
        
        //intercambio valores de num1 y num2;
        num1 = num2;
        num2 = numAux;
        //imprimo el resultado con los valores ya cambiados
         System.out.println("Ahora los valores  de las variables son num1= " + num1 +" y la variable num2= " + num2 );
        
        
    }
    
}
