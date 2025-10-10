/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

/**
 *
 * @author rulaa
 */
  import java.util.Scanner;
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    
    
      
    public static void main(String[] args) {
         Scanner  eurosTotal= new Scanner(System.in);
         System.out.println("Por favor, indique una cantidad de dinero: ");
         int cantidadTotal = eurosTotal.nextInt();
         
         
         //calculo de billetes
         
        int billetes50 = cantidadTotal/50; 
        int resto50 = cantidadTotal % 50; 
        
        int billetes20 = resto50 /20;
        int resto20 = resto50 % 20;
        
        int billetes10 = resto20 /10;
        int resto10 = resto20 % 10;
        
        int billetes5 = resto10 / 5;
        int resto5 = resto10 % 5;
        
        int monedas2 = resto5 / 2;
        int resto2 = resto5 % 2;
        
        
        System.out.println(cantidadTotal + " Euros de descomponen en " +billetes50 + " Billetes de 50, " +billetes20 +" billetes de 20, " +billetes10 + " billetes de 10, "+
                 billetes5 +" billetes de 5, "+ monedas2 + "monedas de 2 euros y " +resto2 + " monedas de 1 euros.");
        
        System.out.println("billetes de 50 " +billetes50);
        System.out.println("billetes de 20 " +billetes20);
        System.out.println("billetes de 10 " +billetes10);
        System.out.println("billetes de 5 " +billetes5);
        System.out.println("monedas de 2 " +monedas2);
        System.out.println("monedas de 1 " +resto2);
    }
    
}
