/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10t07rellenovector;

/**
 *
 * @author rulaa
 */
public class Ejercicio10T07 {
  
    public static void rellenarVector (int[] vector){
        int i;
        for ( i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*8)+1; //aleatorio de 1 al 8;
        }
    }
    
    public static void mostrarVector(int [] vectorUsuario){
        int i;
        for (i = 0; i < vectorUsuario.length; i++) {
           
            System.out.print(vectorUsuario[i] + " ");
        }
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[10];
        rellenarVector(vector);
        System.out.print("Se han generado los siguiente numeros: ");
        mostrarVector(vector);
    }
    
}
