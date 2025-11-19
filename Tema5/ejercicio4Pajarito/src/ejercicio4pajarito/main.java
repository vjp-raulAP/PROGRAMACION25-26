/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4pajarito;

/**
 *
 * @author rulaa
 */
public class main {
    public static void main(String[] args) {
        Pajarito pajarito1 = new Pajarito();
        Pajarito pajarito2 = new Pajarito();

        pajarito1.establecerColorYEdad("rojo", 1);
        pajarito2.establecerColorYEdad("azul", 2);

        // mostramos el valor devuelto por muestraPajaros
        System.out.println("El número de objetos creados es: " + Pajarito.muestraPajaros());
    }
}
