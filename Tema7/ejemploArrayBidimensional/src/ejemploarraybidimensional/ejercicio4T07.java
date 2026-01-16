/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploarraybidimensional;

import java.util.Scanner;




/**
 *
 * @author alumno
 */
public class ejercicio4T07 {

    
    public static int [][] rellenarArray(){
        int [] [] arrayBi = new int [4][3];
        System.out.println("Rellenamos un array 4x3");
        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {

                arrayBi[i][j] = (int) (Math.random() * (201 - 100)) + 100;
                System.out.print(arrayBi[i][j] + " ");
            }
        }
        
          return arrayBi;      
    }

    public static void mostrarPares(int[][] array) {
        System.out.println("Los numeros pares son: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.print(array[i][j] + " ");
                }
               
            }
          
        }
        
    }
        
            /**
             * @param args the command line arguments
             */
    public static void main(String[] args) {
   int [][] arrayBi =  rellenarArray();
   mostrarPares(arrayBi);
   
// TODO code application logic here
    }

}
