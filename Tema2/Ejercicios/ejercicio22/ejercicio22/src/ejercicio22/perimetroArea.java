/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class perimetroArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca la medida de un lado: ");
         float base = entrada.nextFloat();
         
         System.out.println("Intoduce la altura del triangulo: ");
         
        float altura = entrada.nextFloat();
        
        //calculo
        
        float area = base * altura /2;
        float perimetro = base * 3 ;
        
        System.out.println("El area de un triangulo de lado " +base + " es: "+area);
        System.out.println("El perimetro de un triangulo de lado" +base + "es: " +perimetro);
         
         
         
        
    }
    
}
