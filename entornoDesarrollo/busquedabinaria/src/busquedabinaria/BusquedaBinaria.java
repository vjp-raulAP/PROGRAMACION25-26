/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busquedabinaria;

/**
 *
 * @author alumno
 */


public class BusquedaBinaria {
   private int[] array;

    // Constructor
    public BusquedaBinaria() {
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public int busquedaBinaria(int numero) {                                                        //instruccion 1

        int umbral_inferior = 0;                                                                                 // instruccion 2
        int umbral_superior = array.length - 1;
        int respuesta = -1;
        int index;

        while (umbral_inferior <= umbral_superior) {                                            //instruccion 3    // nodo1

            index = (umbral_inferior + umbral_superior) / 2;                                  // instruccion 4

            if (array[index] == numero) {                                                                   // instruccion 5    //nodo 2
                respuesta = index;
                umbral_inferior = umbral_superior + 1; // Fuerza salida del bucle // intruccion 6
            } 
            else if (array[index] < numero) {                                                             // instruccion 7     //nodo 3
                
                
                umbral_inferior = index + 1;                                                                // instruccion 8
            } 
            else {                                                                                                          // instruccion 9   //nodo 4
                umbral_superior = index - 1;                                                             
            }
        }

        return respuesta;                                                                                          // instruccion 10
    }                                                                                                                           //instruccion  11 fiin
    public static void main(String[] args) {
         BusquedaBinaria bb = new BusquedaBinaria();
        int resultado = bb.busquedaBinaria(7);

        if (resultado != -1) {
            System.out.println("Número encontrado en la posición: " + resultado);
        } else {
            System.out.println("Número no encontrado");
        }
    }
}
