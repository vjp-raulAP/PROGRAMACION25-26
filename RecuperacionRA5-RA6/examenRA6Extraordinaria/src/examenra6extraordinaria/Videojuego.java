/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra6extraordinaria;

/**
 *
 * @author alumno
 */
public class Videojuego implements  Comparable<Videojuego>{
    
    //Atributos
    private String codigo;
    private String titulo;
    private int numJugadores;
    
    //constructor por defecto
      public Videojuego() {
        this.codigo = "";
        this.titulo = "";
        this.numJugadores = 0;
    }
    
    
    //constructor parametrizado

    public Videojuego(String codigo, String titulo, int numJugadores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.numJugadores = numJugadores;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }
    
    //Metodo ToString para ver los juegos
    @Override
    public String toString() {
        return "Videojuego{" + "codigo=" + codigo + ", titulo=" + titulo + ", numJugadores=" + numJugadores + '}';
    }

//metodo compareto para obtener los juegos ordenados de mayor a menor para ello, primero es "otros" y luego "this."
    @Override
    public int compareTo(Videojuego otros) {
        return Integer.compare(otros.numJugadores,this.numJugadores);
    }
    
    
    
    
}

