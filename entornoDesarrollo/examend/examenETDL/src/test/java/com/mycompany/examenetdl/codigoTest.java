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

        assertEquals(true,codigo.ordenarPorSeleccion(new int [] {1,2,3,4}))  ;       
   // Caso 1: lista ya ordenada
        assertEquals(true,codigo.ordenarPorSeleccion(new int [] {1,2,3,4}))  ; 

        // Caso 2: lista desordenada
           assertEquals(false,codigo.ordenarPorSeleccion(new int [] {1,3,2,5}))  ; 

        // Caso 3: lista con un solo número
         assertEquals(true,codigo.ordenarPorSeleccion(new int [] {1}))  ;

        // Caso 4: lista vacía
          assertEquals(true,codigo.ordenarPorSeleccion(new int [] {}))  ; 
         
          //Caso 5 : numero negativo
          
          assertEquals(true,codigo.ordenarPorSeleccion(new int [] {-5}))  ;
    }
   @Test 
   public void testOrdenarPorSeccionCajaBlanca(){
        System.out.println("Test de caja blanca  para comprobar caminos");
        
        //Caso1 : lista ordenada        Camino1-2-3-4-3-2-6 
       
         assertEquals(true,codigo.ordenarPorSeleccion(new int [] {1,2,3,4,5,6,7,8,9,10}))  ;   
        
        // Caso 4: lista vacía              Camino 1-2-6
         assertEquals(true,codigo.ordenarPorSeleccion(new int [] {}))  ; 
                
                
           // Caso 2: lista desordenada    Camino 1-2-3-4-5-3-2-6
          assertEquals(false,codigo.ordenarPorSeleccion(new int [] {1,3,2,5,44,22,38}))  ; 
        
         // Caso 3: lista con un solo número    Camino 1-2-3-2-6
        assertEquals(true,codigo.ordenarPorSeleccion(new int [] {100}))  ;
        
   }
   
   
}

