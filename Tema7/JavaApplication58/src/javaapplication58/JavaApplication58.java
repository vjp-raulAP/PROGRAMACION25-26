/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication58;

import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class JavaApplication58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //1. DECLARAR E INICIALIZAR UN ARRAY
        float[]notas = new float [6];
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
        
        System.out.println(Arrays.toString(notas));
        System.out.println(Arrays.toString(diasSemana));
        System.out.println(diasSemana[2]);
        
        notas[1]= 3.2f;
        System.out.println(notas[1]);
        
        //4. recorrer array
        //for (int i = 0; i < diasSemana.length; i++) {
            //System.out.println(diasSemana[i]);
            
         
         //5. rellenar array
         
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (float) (Math.random() * 10);

        }

          
         
            
    for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);

        }
        
        
    }
    
}
