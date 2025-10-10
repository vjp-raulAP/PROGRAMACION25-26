/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
<<<<<<< HEAD
 * @author alumno
 */
=======
 * @author rulaa
 */
import java.util.Scanner;
>>>>>>> 0175fe201dd3cf8344413eaeccc6376dc8dc98fd
public class desgloseBilletes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD
        // TODO code application logic here
=======
        //declaro las variables que voy a usar
        int cantidadTotal,billetes50,resto50,billetes20,resto20,billetes10,resto10,billetes5,resto5,monedas2,monedas1;
        Scanner  eurosTotal= new Scanner(System.in);
         System.out.println("Por favor, indique una cantidad de dinero: ");
         cantidadTotal = eurosTotal.nextInt();
         
         
         //calculo de billetes
         
        billetes50 = cantidadTotal/50; 
        resto50 = cantidadTotal % 50; 
        
        billetes20 = resto50 /20;
        resto20 = resto50 % 20;
        
        billetes10 = resto20 /10;
        resto10 = resto20 % 10;
        
        billetes5 = resto10 / 5;
        resto5 = resto10 % 5;
        
        monedas2 = resto5 / 2;
        monedas1= resto5 % 2;
        
        
        System.out.println(cantidadTotal + " Euros de descomponen en ");
        //condicionantes para que salga por pantalla o no
        if (billetes50 > 0){
            System.out.println("Billetes de 50: " + billetes50);
        }
        if (billetes20 > 0){
            System.out.println("Billetes de 20: "+ billetes20);
        }
        if (billetes10 > 0){
            System.out.println("Billetes de 10: "+ billetes10);
        }
        if (billetes5 > 0){
            System.out.println("Billetes de 5: "+ billetes5);
        }
        if (monedas2 > 0){
            System.out.println("monedas de 2: "+ monedas2);
        }
        if (monedas1 > 0) {
            System.out.println("monedas de 1: "+ monedas1);
        }
        
>>>>>>> 0175fe201dd3cf8344413eaeccc6376dc8dc98fd
    }
    
}
