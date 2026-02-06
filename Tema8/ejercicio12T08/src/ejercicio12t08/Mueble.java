/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12t08;

/**
 *
 * @author alumno
 */
public class Mueble {
    
    //Atributos
     String nombre;
    double precio;
    
    //constructor
    
    public Mueble(){
        this.nombre = "";
        this.precio = 0;
    }

    //constructor parametrizado
    public Mueble(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    
    //getter
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    //setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Mueble {" + "Nombre = " + nombre + ", precio=" + precio + " euros } ";
    }
    
} 
    
    

   
