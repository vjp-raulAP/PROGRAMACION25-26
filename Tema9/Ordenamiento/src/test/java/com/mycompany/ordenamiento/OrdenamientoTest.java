/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ordenamiento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author rulaa
 */
public class OrdenamientoTest {
    
    public OrdenamientoTest() {
    }

    private Ordenamiento ordenacion;

    @BeforeEach
    void setUp() {
        ordenacion = new Ordenamiento();
    }

    @Test
    void deberiaOrdenarArrayDesordenado() {
        int[] datos = {5, 3, 8, 1, 2};

        boolean resultado = ordenacion.burbuja(datos);

        assertFalse(resultado);
        assertArrayEquals(new int[]{1, 2, 3, 5, 8}, datos);
    }

    @Test
    void deberiaDetectarArrayYaOrdenado() {
        int[] datos = {1, 2, 3, 4, 5};

        boolean resultado = ordenacion.burbuja(datos);

        assertTrue(resultado);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, datos);
    }

    @Test
    void deberiaFuncionarConUnSoloElemento() {
        int[] datos = {10};

        boolean resultado = ordenacion.burbuja(datos);

        assertTrue(resultado);
        assertArrayEquals(new int[]{10}, datos);
    }

    @Test
    void deberiaFuncionarConArrayVacio() {
        int[] datos = {};

        boolean resultado = ordenacion.burbuja(datos);

        assertTrue(resultado);
        assertArrayEquals(new int[]{}, datos);
    }

    @Test
    void deberiaOrdenarArrayConNumerosNegativos() {
        int[] datos = {3, -1, 2, -5};

        boolean resultado = ordenacion.burbuja(datos);

        assertFalse(resultado);
        assertArrayEquals(new int[]{-5, -1, 2, 3}, datos);
    }
}
