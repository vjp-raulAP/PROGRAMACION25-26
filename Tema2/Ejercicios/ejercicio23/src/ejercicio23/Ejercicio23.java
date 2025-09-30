/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

/**
 *
 * @author alumno
 */
 import  java.util.Scanner;
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //pedimos datos al usuario por teclado
        Scanner entrada = new Scanner (System.in) ;
        
          //Mostramos el mensaje por pantalla para indicar la usuario lo que tienen que escribir
        
        System.out.println("Por favor, introduzca el precio de ordenador que desea comprar:  ");
        
         //leemos los datos dle usuario
        
        float precioProducto = entrada.nextFloat();
        
        
        System.out.println("¿Cuantas unidades quiere llevarse?");
        
        int unidades = entrada.nextInt();
        
        //calculamos el resultado de multiplicar el precio * las unidades.
        
        float precioTotal = precioProducto * unidades;
        
        System.out.println("El precio total de su compra es : " +  precioTotal +" euros");
        
    }
    
}
