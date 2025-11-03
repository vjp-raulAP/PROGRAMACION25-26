/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package clasestring;

/**
 *
 * @author alumno
 * fecha 03/11/2025  Explicación en clase de la Clase String 
 */ 
import java.util.Scanner;
public class ClaseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarar uan variable de tipo string
        String nombre;
        //Inicializar la variable
         nombre = "Manolo" ;
               
        //Declarar e inicializar una varibale de tipo String
        
        String apellido = "Arsanaliev";
        
        //Pedir una cadena al usuario
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cual fue el último trofeo que ganaste?");
        String trofeos = entrada.nextLine();
        System.out.println("has ganado " + trofeos);
        
        //comparar dos valores (.equals() e  .equalsIgnoreCase())
        
        if(nombre.equalsIgnoreCase(apellido)){
            System.out.println("son iguales");
        }else{
            System.out.println("Son distintos");
        }
        
        
        
        
    }
    
}
