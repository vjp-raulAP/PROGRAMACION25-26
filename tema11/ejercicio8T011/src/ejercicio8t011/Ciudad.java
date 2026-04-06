/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8t011;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author rulaa
 */
public class Ciudad {
    // Atributos
    private String nombre;
    private Set<Sede> sedes;
    
    // Constructor defecto
    public Ciudad() {
        this.nombre = "";
        this.sedes = new LinkedHashSet<>();
    }
    
    // Cosnt parametrizado
    public Ciudad(String nombre, Set<Sede> sedes) {
        this.nombre = nombre;
        this.sedes = sedes;
    }
    
    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.sedes = new LinkedHashSet<>();
    }
    // getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(Set<Sede> sedes) {
        this.sedes = sedes;
    }
    
    //Metodos
    
    public void agregarSede(Sede sede) {
        sedes.add(sede);
    }
    
    //to string
    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", sedes=" + sedes + '}';
    }
}