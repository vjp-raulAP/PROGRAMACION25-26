/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9t08;

/**
 *
 * @author rulaa
 */
public class Asignatura {
       // atributos
    private String nombre;
    private float nota;

    // cosntructor defecto
    public Asignatura() {
        this.nombre = "";
        this.nota = 0.0f;
    }
    
    //constuctor parametrizado
    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.nota = 0.0f;
    }
    
    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }


  


    // to string
    @Override
    public String toString() {
        return nombre + ": " + nota;
    }
}
