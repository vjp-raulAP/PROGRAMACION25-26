/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10t07while;

/**
 *
 * @author alumno
 */
public class Ejercicio10T07 {

    /**
     * Metodo para rellanar vector
     * @param vector 
     */
    public static void rellenarVector (int[] vector){
        int i;
        for ( i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*8)+1; //aleatorio de 1 al 8;
        }
    }
    
    
      /**
     * metodo para mostrar los valores de un vector pasando el vector por parametros
     * @param vectorUsuario 
     */
    public static void mostrarVector(int [] vectorUsuario){
        int i;
        for (i = 0; i < vectorUsuario.length; i++) {
           
            System.out.print(vectorUsuario[i] + " ");
        }
    }
    
    
  public static void buscarRepetidos(int[] vector) {
 int i = 0;
    while (i < vector.length) {
        int j = i+1;

        while (j < vector.length) {
            if (vector[j] == vector[i]) {
                vector[i] = 0; // los que son repetidos los ponemos a 0
            }
          j ++;
        }
        i++;
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
        buscarRepetidos(vector);
        System.out.println("");
        System.out.print("Sustituimos los elementos repetidos por un 0: ");
        mostrarVector(vector);
    }
    
}
