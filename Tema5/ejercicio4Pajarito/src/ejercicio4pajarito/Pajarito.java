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

    public static void muestraPajaro(){
        System.out.println("El numero de objetos creados es de: " +numpajaros);
    }
    
    //El método “muestraPajaros” contenga la sentencia return.
    static int muestraPajaros() {
        return numpajaros;
    }
    
    
}
