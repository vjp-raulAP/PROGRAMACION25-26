/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.busquedabinaria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author rulaa
 */
public class BusquedaBinariaTest {
    private BusquedaBinaria busqueda;
    
    @BeforeEach
    void setup(){
        busqueda = new BusquedaBinaria();
    }
 
    // C1 = 1,2,10
    // Número NO está en el array → ejemplo: 15
    @Test
    void testNumeroNoExiste() {
        int resultado = busqueda.busquedaBinaria(15);
        assertEquals(-1, resultado);
    }
    
     // C2 = 1,2,3,4,6,8,9,10
    // Número menor que el central → ejemplo: 2
    @Test
    void testNumeroMenorQueCentral() {
        int resultado = busqueda.busquedaBinaria(2);
        assertEquals(1, resultado); // posición real en el array
    }
    
     // C3 = 1,2,3,4,5,2,10
    // Número exactamente el central → ejemplo: 5
    @Test
    void testNumeroCentral() {
        int resultado = busqueda.busquedaBinaria(5);
        assertEquals(4, resultado);
    }
    // C4 = 1,2,3,4,5,6,7,2,10
    // Número mayor que el central → ejemplo: 8
    @Test
    void testNumeroMayorQueCentral() {
        int resultado = busqueda.busquedaBinaria(8);
        assertEquals(7, resultado);
    }
    
}