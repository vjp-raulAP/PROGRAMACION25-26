/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.busquedabinaria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rulaa
 */
public class BusquedaBinariaTest {
    
  
        
         @Test
    public void testBusquedaBinariaCajaNegra() {
        System.out.println("busquedaBinariaCajaNegra");

        BusquedaBinaria instance = new BusquedaBinaria();

        // Número dentro del array
        assertEquals(4, instance.busquedaBinaria(5));
        assertEquals(7, instance.busquedaBinaria(8));
        assertEquals(-1, instance.busquedaBinaria(11));
        

        // Número por debajo del rango
        assertEquals(-1, instance.busquedaBinaria(0));
        assertEquals(-1, instance.busquedaBinaria(-5));

        // Número por encima del rango
        assertEquals(-1, instance.busquedaBinaria(20));
    
    }

    }

