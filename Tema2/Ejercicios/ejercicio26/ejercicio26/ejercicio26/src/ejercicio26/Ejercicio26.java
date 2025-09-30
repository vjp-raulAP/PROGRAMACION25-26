/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

/**
 *
 * @author rulaa
 */
    import java.util.Scanner;
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Creo el scanner que lea los datos
        Scanner numero = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero de 4 cifras: ");
        int num =  numero.nextInt();
        
        
        //calculo
        int cifraX = num / 1000;
        int cifraY = (num / 100)% 10;
        int cifraZ = (num /10)% 10;
        int cifraW = num % 10;
        
        System.out.println("La primera cifra es: " +cifraX);
        System.out.println("La segunda cifra es: " +cifraY);
        System.out.println("La tercera cifra es: " +cifraZ);
        System.out.println("La cuarta cifra es: " +cifraW);
    }
    
}
