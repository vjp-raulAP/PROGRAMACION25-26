/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author rulaa
 */
public class paresWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaro la variable "i" y la inicializo a 11 
        int i = 11;
        while(i<= 133){  //pongo la condición para el bucle hasta 133
            if (i% 2 == 0){  //creo la condicion de par /impar
                System.out.println(i); 
            }
           i++;  //incremento en 1 la variable fuera del if. si lo hago dentro me haria bucle  
        }
    }
    
}
