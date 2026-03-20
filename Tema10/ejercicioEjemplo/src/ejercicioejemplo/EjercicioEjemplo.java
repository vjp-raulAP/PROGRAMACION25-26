/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioejemplo;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class EjercicioEjemplo {

    
    //1. ARRAYLIST
    
    //.1.1 Crear un arrylist

         
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        ArrayList<Integer>edades = new ArrayList<>();
    //1.2 Insertar
    //1.2.1 Insertar un elemento al final
        
    edades.add(1);
    edades.add(8);
    edades.add(7);
    //1.2.2 Insertar elemento en indice concreto
    edades.add(1,5);
    
        //1.3obtener
        System.out.println(edades.get(1));  
        System.out.println(edades.get(0));  
    }
    

    
}
  
    

