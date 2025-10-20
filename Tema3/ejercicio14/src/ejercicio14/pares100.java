/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author rulaa
 */
public class pares100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //declaro la variable "i" y la inicializo a 1 
        int i = 0;
        int j = i;
        
        System.out.println("Los 100 primeros numeros pares son: ");
        do {
            if (i % 2 == 0) {
                System.out.println(i);
                j++;
            }
            i++;  //incremento en 1 la variable fuera del if. si lo hago dentro me haria bucle  
        } while (j < 100);
            System.out.println("Sacó un total de " + j + " números");
    }
}
