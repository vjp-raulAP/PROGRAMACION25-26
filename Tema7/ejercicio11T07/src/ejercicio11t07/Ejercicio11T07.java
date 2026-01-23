/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11t07;





/**
 *
 * @author rulaa
 */
public class Ejercicio11T07 {
    
    

    public static void rellenarArraySinRepetir(int [] array){
        int i = 0;
        int numAleatorio;
        boolean repetido= false;
        while (i < array.length    ) {
            numAleatorio = (int)(Math.random()*10);
            repetido = false;
            
            
         int j = 0;
         while(j < i){
             if(array[j] == numAleatorio){
                 repetido = true; //sabemos si esta repetido o no
             }
             j++;
         }
         if(!repetido){     //si el numero no se repite lo guardamos en el array
             array[i] = numAleatorio;
             i++;
         }
         
        }
        
    }
    
    /**
     *  Mostrar array
     */
   
    public static void mostrarArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numeros = new int[10];
        rellenarArraySinRepetir(numeros);
        System.out.println("Se ha generado el siguiente array:");
        mostrarArray(numeros);
    }
    
}
