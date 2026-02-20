/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sumaprimos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rulaa
 */
public class SumaPrimosTest {
    
     // 🔹 Caso mínimo válido
    @Test
    public void testCasoMinimo() {
        assertEquals(2, SumaPrimos.sumaPrimos(2));
    }

    // 🔹 Caso pequeño
    @Test
    public void testCasoPequeno() {
        assertEquals(5, SumaPrimos.sumaPrimos(3));
    }

    // 🔹 Caso normal
    @Test
    public void testCasoNormal() {
        assertEquals(17, SumaPrimos.sumaPrimos(10));
    }

    // 🔹 Caso mayor
    @Test
    public void testCasoMayor() {
        assertEquals(28, SumaPrimos.sumaPrimos(12));
    }

    // 🔹 Caso negativo (según comportamiento actual del código)
    @Test
    public void testNumeroNegativo() {
        assertEquals(0, SumaPrimos.sumaPrimos(-5));
    }
}
    

