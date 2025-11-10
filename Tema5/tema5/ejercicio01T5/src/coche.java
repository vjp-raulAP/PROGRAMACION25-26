/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rulaa
 */
public class coche {
    // Atributos privados
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido = false;

    // Constructor por defecto
    public coche() {
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.velocidad = 0;
    }

    // Métodos para establecer valores
    public void establecerMarca(String marca) { this.marca = marca; }
    public void establecerModelo(String modelo) { this.modelo = modelo; }
    public void establecerColor(String color) { this.color = color; }

    // Acciones del coche
    public void arrancarCoche() {
        motorEncendido = true;
        velocidad = 10;
    }

    public void apagarCoche() {
        motorEncendido = false;
        velocidad = 0;
    }

    public void acelerarCoche() {
        velocidad += 20;
    }

    public void frenarCoche() {
        velocidad -= 6;
        if (velocidad < 0) velocidad = 0;
    }

    // Mostrar estado del coche
    public void obtenerEstado() {
        System.out.println("----- Estado del coche -----");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Motor encendido: " + motorEncendido);
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("----------------------------");
    }
}