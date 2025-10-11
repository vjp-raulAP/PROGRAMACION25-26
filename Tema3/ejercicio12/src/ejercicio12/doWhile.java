/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author rulaa
 */
public class doWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Creo una variable y la voy a inicializar a 11 que es desde donde nos piden.
       int i = 11;
       //ejecuto el bucle do..while
       do {
           
           if (i %2 == 0){         //realizaremos el módulo de dividir por 2 con un condicionante.
               System.out.println(i); //imprimo por pantalla el par
           } 
           i++;   //incrementamos en 1 la variable para pasar al siguiente numero 
        }while (i <= 133);
    }
    
    
}
