/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05t09;

import java.util.Scanner;

/**
 *
 * @author rulaa
 * 
 * 
 */
public class Ejercicio05T09 {
    public static Scanner entrada = new Scanner (System.in);  //objeto entrada global
           //  Método para pedir el día
    public static String pedirDia() {

        System.out.println("Introduce un día de la semana:");
        return entrada.nextLine();
    }
    
     //  Método para buscar el día
    public static int buscarDia(String[] dias, String diaUsuario) {

        int i = 0;
        int posicion = -1;

        while (i < dias.length) {

            if (diaUsuario.equalsIgnoreCase(dias[i])) {
                posicion = i;
            }

            i++;
        }

        return posicion;
    }
      //  Método para mostrar resultado
    public static void mostrarResultado(int posicion) {

        if (posicion != -1) {
            System.out.println("Es el " + (posicion + 1) + " día de la semana.");
        } else {
            System.out.println("Día no válido.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String [] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
       String usuarioDia =pedirDia();
       
        
       
        int posicion = buscarDia(diasSemana,usuarioDia);
        
        
        mostrarResultado(posicion);
   

    }
    
}
