/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

/**
 *
 * @author rulaa
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           //declaro variable que usare. "i" para el bucle for y "suma" como contador 
        int i; 
        int suma = 0;
               
        System.out.println("Los números impares entre 111 y 222 son: "); 
        //creo un bucle for que recorra del 17 al 139 
        for (i = 111; i <= 222; i++) {
            if (i % 2 != 0) {  //obtengo los numeros impares 
                System.out.print(i); //imprimo numeros  .
                suma = suma + i; //uso este contador para ir sumando los numeros impares que salgan
                if (i < 221) {   //creo un condicionante para que solo me imprima hasta el último numero par
                    System.out.print(", ");    
                }
            }
          
        }
        System.out.println();//creo un salto de linea para que me imprima la linea siguiente debajo 
        System.out.println("El total de la suma de los impares entre 111 y 222 es: " +suma);
    }
    
}
