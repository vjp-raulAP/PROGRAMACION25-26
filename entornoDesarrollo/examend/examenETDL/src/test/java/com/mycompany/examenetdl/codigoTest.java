/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.examenetdl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rulaa
 */
public class codigoTest {
    
    public codigoTest() {
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   @Test 
   public void testOrdenarPorSeleccionCajaNegra(){
            System.out.println("Comprobacion caja negra");
int[] lista5 = {5, 2, 2, 7, 1};
codigo.ordenarPorSeleccion(lista5);
assertArrayEquals(new int[]{1, 2, 2, 5, 7}, lista5);
            
            
   // Caso 1: lista ya ordenada
        int[] lista1 = {1, 4, 5, 6, 8, 55, 77};
        codigo.ordenarPorSeleccion(lista1);
        assertArrayEquals(new int[]{1, 4, 5, 6, 8, 55, 77}, lista1);

        // Caso 2: lista desordenada
        int[] lista2 = {1, 55, 8, 7, 77, 6, 9};
        codigo.ordenarPorSeleccion(lista2);
        assertArrayEquals(new int[]{1, 6, 7, 8, 9, 55, 77}, lista2);

        // Caso 3: lista con un solo número
        int[] lista3 = {42};
        codigo.ordenarPorSeleccion(lista3);
        assertArrayEquals(new int[]{42}, lista3);

        // Caso 4: lista vacía
        int[] lista4 = {};
        codigo.ordenarPorSeleccion(lista4);
        assertArrayEquals(new int[]{}, lista4);
    }
   @Test 
   public void testOrdenarPorSeccionCajaBlanca(){
        System.out.println("Test de caja blanca  para comprobar caminos");
        
        //Caso1 : lista ordenada        Camino1-2-3-4-3-2-6 
       
        int[] lista1 = {1, 4, 5, 6, 8, 55, 77};
        codigo.ordenarPorSeleccion(lista1);
        assertArrayEquals(new int[]{1, 4, 5, 6, 8, 55, 77}, lista1);  
        
        // Caso 4: lista vacía              Camino 1-2-6
        int[] lista4 = {};
        codigo.ordenarPorSeleccion(lista4);  
        assertArrayEquals(new int[]{}, lista4);
                
                
           // Caso 2: lista desordenada    Camino 1-2-3-4-5-3-2-6
        int[] lista2 = {1, 47, 9, 99, 27, 6, 20};
        codigo.ordenarPorSeleccion(lista2);
        assertArrayEquals(new int[]{1, 6, 9, 20, 27, 47, 99}, lista2);
        
         // Caso 3: lista con un solo número    Camino 1-2-3-2-6
        int[] lista3 = {100};
        codigo.ordenarPorSeleccion(lista3);
        assertArrayEquals(new int[]{100}, lista3);
        
   }
   
   
}

