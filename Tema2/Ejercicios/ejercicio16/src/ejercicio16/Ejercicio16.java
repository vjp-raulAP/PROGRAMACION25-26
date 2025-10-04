/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author rulaa
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro la varible totalbilletes que tengo.
        int billetesCartera = 130;
        int billetes50,restoBilletes,billetes10;
        // Calculo los billetes de 50 que tengo que tener
         billetes50 = billetesCartera / 50;
        
        // Calculo es resto de billetes que me sobran que no son de 50
        
         restoBilletes = billetesCartera % 50;
        
        // Calculo billetes de 10 dividiendo resto de billetes entre 10
        
         billetes10 = restoBilletes / 10;
        
        //imprimo por pantalla la cantidad de billetes de 50 y 10
        
        System.out.println(billetesCartera + " euros hacen un total de: "+ billetes50 + " euros y " + billetes10 +" billetes de 10 euros " );
    }
    
}
