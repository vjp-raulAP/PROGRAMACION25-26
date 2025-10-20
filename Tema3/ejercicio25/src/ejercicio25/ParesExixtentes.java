/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author rulaa
 */
public class ParesExixtentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaro variable que usare. "i" para el bucle for y "suma" como contador 
        int i; 
        int suma = 0;
               
        System.out.println("Los números pares entre 17 y 139 son: "); 
        //creo un bucle for que recorra del 17 al 139 
        for (i = 17; i <= 139; i++) {
            if (i % 2 == 0) {  //obtengo los numeros pares 
                System.out.print(i); //imprimo numeros  .
                suma = suma + i; //uso este contador para ir sumando los numeros pares que salgan
                if (i < 138) {   //creo un condicionante para que solo me imprima hasta el último numero par
                    System.out.print(", ");    
                }
            }
          
        }
        System.out.println();//creo un salto de linea para que me imprima la linea siguiente debajo 
        System.out.println("El total de la suma de los pares entre 17 y 139 es: " +suma);
    }
    
}
