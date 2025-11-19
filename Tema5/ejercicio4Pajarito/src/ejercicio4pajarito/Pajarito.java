/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4pajarito;

/**
 *
 * @author rulaa
 */
public class Pajarito {
     static int numpajaros = 0;
    String color;
    int edad;

    static void nuevoPajaro() {
        numpajaros++;
    }

    public void establecerColorYEdad(String col, int ed) {
        color = col;
        edad = ed;
        nuevoPajaro();
    }

    // Ahora este método usa return
    static int muestraPajaros() {
        return numpajaros;
    }
    
    
}
