/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
public class desgloseBilletes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Declaro las variables que voy a usar al principio
        int cantidadTotal, billetes50, resto50, billetes20, resto20, billetes10, resto10,
            billetes5, resto5, monedas2, monedas1;
        //creo la entrada de billetes que voy a pedir al usuario
        Scanner eurosTotal = new Scanner(System.in);
        System.out.println("Por favor, indique una cantidad de dinero: "); 
        cantidadTotal = eurosTotal.nextInt();

        // Cálculo de billetes y monedas
        billetes50 = cantidadTotal / 50; //division para ver cuantos de 50 entran
        resto50 = cantidadTotal % 50; // Resto que usare para calcular demás billetes

        billetes20 = resto50 / 20; //division para ver los de 20 
        resto20 = resto50 % 20; // Hago el módulo.  Usare para calcular el resto de monedas
        //hacemos lo mismo con los de 10
        billetes10 = resto20 / 10;
        resto10 = resto20 % 10;
        //hacemos lo mismo con los de 5
        billetes5 = resto10 / 5;
        resto5 = resto10 % 5;
        // Sacamos lad monedas de 2 y el resto son de 1€
        monedas2 = resto5 / 2;
        monedas1 = resto5 % 2;

        // Mostrar resultados
        System.out.println( cantidadTotal + " euros se descomponen en:");
        //Creo el condicional para que si el billete es mayos a 50 me lo imprima
        if (billetes50 > 0) {
            System.out.println("Billetes de 50: " + billetes50);
        }
        if (billetes20 > 0) {
            System.out.println("Billetes de 20: " + billetes20);
        }
        if (billetes10 > 0) {
            System.out.println("Billetes de 10: " + billetes10);
        }
        if (billetes5 > 0) {
            System.out.println("Billetes de 5: " + billetes5);
        }
        if (monedas2 > 0) {
            System.out.println("Monedas de 2: " + monedas2);
        }
        if (monedas1 > 0) {
            System.out.println("Monedas de 1: " + monedas1);
        }
        
        
        
        
    }
    
}
