/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;

/**
 *
 * @author alumno
 */

import java.util.Scanner;
public class hipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         System.out.println("introduce el cateto a: ");
         float catetoA= entrada.nextFloat();
         
         System.out.println("introduce el cateto b: ");
         float catetoB= entrada.nextFloat();
         
         //calculo a = raiz (b2 + c2)
         
         float hipotenusa = ((catetoA * catetoA)+ (catetoB * catetoB))/2;
         
         System.out.println("La longitud de la hipotenusa con cateto A = " + catetoA + " y cateto B = " + catetoB +"es igual a: "+ hipotenusa);
    }
    
}
