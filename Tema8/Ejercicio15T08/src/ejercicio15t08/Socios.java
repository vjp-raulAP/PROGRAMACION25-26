/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15t08;

/**
 *
 * @author alumno
 */
public class Socios {
     // atributos
    private String nombre;
    private double precioAbonado;
    
    // constructores

    public Socios() {
        this.nombre = "";
        this.precioAbonado = 0.0; // la voluntad
    }

    public Socios(String nombre, double precioAbonado) {
        this.nombre = nombre;
        this.precioAbonado = precioAbonado;
    }
    
    // métodos setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioAbonado(double precioAbonado) {
        this.precioAbonado = precioAbonado;
    }
    
    // métodos getters

    public String getNombre() {
        return nombre;
    }

    public double getPrecioAbonado() {
        return precioAbonado;
    }
    
    // método mostrar
    public void mostrar() {
    
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio abono: "+this.precioAbonado);
        
    }
}

