/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05t07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio05T07 {
    
    public static void rellenoArray(int array  [][]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos a rellenar un arry de 4x2");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introduce un valor para la posición ["+i+j+"] :");
                array [i][j]= entrada.nextInt();
                
            }
            
        }
        
    }
    
    public static void mostrarArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
             
        }
      
    }
    
    
   

    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int [][] array = new int [4][2]; 
         rellenoArray(array);
         mostrarArray(array);
         
    }
    
}
