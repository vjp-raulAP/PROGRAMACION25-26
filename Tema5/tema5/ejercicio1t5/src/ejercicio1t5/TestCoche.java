/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1t5;

/**
 *
 * @author rulaa
 */
public class TestCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear dos coches
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();

        // Establecer marca, modelo y color
        miCoche.establecerMarca("Toyota");
        miCoche.establecerModelo("Corolla");
        miCoche.establecerColor("Rojo");

        cochePadre.establecerMarca("Ford");
        cochePadre.establecerModelo("Focus");
        cochePadre.establecerColor("Azul");

        // Arrancar los coches
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();

        // Acelera y frena
        for (int i = 0; i < 5; i++) miCoche.acelerarCoche();
        for (int i = 0; i < 2; i++) miCoche.frenarCoche();
        for (int i = 0; i < 3; i++) cochePadre.acelerarCoche();

        // Apaga el coche padre
        cochePadre.apagarCoche();

        // Muestra los estados
        miCoche.obtenerEstado();
        cochePadre.obtenerEstado();
  
    }
    
}
