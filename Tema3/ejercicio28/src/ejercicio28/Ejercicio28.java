/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

/**
 *
 * @author rulaa
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro la variable entera
        int numero ;
        
        //uso Math.random para un numero aleatorio y lo convierto a int. para que sea entre 1 y 100 sera 100+1
        numero= (int)(Math.random()*100+1); //!!ojo parentesis!!
            if(numero %2 == 0){ //condición para que sea par
                System.out.println("El numero aletatorio es par: " + numero); 
            }else{ 
                System.out.println("El numero aleatorio es impar: " +numero); 
        }
    }
    
}
