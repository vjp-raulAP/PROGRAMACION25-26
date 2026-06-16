/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra5extraordinaria;

/**
 *
 * @author alumno
 */
public class Agenda {
    private String nombre;
    private String titulo;
    private String autor;
    private int diasPrestados;

    public Agenda(String nombre, String titulo, String autor, int diasPrestados) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.autor = autor;
        this.diasPrestados = diasPrestados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDiasPrestados() {
        return diasPrestados;
    }

    public void setDiasPrestados(int diasPrestados) {
        this.diasPrestados = diasPrestados;
    }

    @Override
    public String toString() {
        return "Agenda{" + "nombre=" + nombre + ", titulo=" + titulo + ", autor=" + autor + ", diasPrestados=" + diasPrestados + '}';
    }
    
    
    
    
      
}
