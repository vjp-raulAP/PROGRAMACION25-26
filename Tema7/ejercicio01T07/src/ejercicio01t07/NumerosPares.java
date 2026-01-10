/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01t07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NumerosPares {
    
    /**
     * metodo pide 10 num y los mete en un array unidimensional
     * @return numArray
     */
    public static int[] pedirNum(){
        //declaro variable tipo array e inicializo con 10 numeros
        int[] numArray = new int[10];
        int i;
        Scanner entrada =  new Scanner(System.in);
        for ( i = 0; i < numArray.length; i++) {
            System.out.println("Por favor introduce el numero entero "+ (i+1) + ": ");
            numArray[i] = entrada.nextInt();
        }
        return numArray;
    }
    
    public static void numerosPares(int[] numerosArray ){
        int i;
        System.out.println("Los números pares del array son: ");
        for ( i = 0; i < numerosArray.length; i++) {
            if (numerosArray[i] % 2 == 0){
                System.out.println(numerosArray[i]);
            }
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] numeros = pedirNum();
       numerosPares(numeros);
       
    }
    
}
