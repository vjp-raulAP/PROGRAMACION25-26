/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasestringapuntes;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ClaseString {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
              //Declarar uan variable de tipo string
            String nombre;
            //Inicializar la variable
             nombre = "Manolo" ;
             String nombre1="manolo";
            //Declarar e inicializar una varibale de tipo String

            String apellido = "Arsanaliev";

            //Pedir una cadena al usuario

            Scanner entrada = new Scanner(System.in);
            System.out.print("¿Cual fue el último trofeo que ganaste?");
            String trofeos = entrada.nextLine();
            System.out.println("has ganado " + trofeos);

            //comparar dos valores (.equals() e  .equalsIgnoreCase())
            if (nombre.equals(nombre1)){
                System.out.println("Son iguales");
            }else {
                System.out.println("Son distintos");
            }



            if(nombre.equalsIgnoreCase(apellido)){
                System.out.println("son iguales");
            }else{
                System.out.println("Son distintos");
            }

        
    }
    
}
