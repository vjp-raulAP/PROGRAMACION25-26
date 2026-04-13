/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9t11;

import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class Sorteo {
    //Atributos
    private LocalDate fecha;
    private int[] numerosGanadores;
    
    //constructor
    public Sorteo(){
         this.fecha = LocalDate.now(); // Por defecto, la fecha de hoy
        this.numerosGanadores = new int[4];
       
    }

    public Sorteo(LocalDate fecha, int[] numerosGanadores) {
        this.fecha = fecha;
        this.numerosGanadores = numerosGanadores;
    }
    
    
    //getter y setter

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int[] getNumerosGanadores() {
        return numerosGanadores;
    }

    public void setNumerosGanadores(int[] numerosGanadores) {
        this.numerosGanadores = numerosGanadores;
    }
    
    //metodos
    private void generarNumAle() {
   
        for (int i = 0; i < numerosGanadores.length; i++) {
            // Genera aleatorio entre 1 y 100
             numerosGanadores[i] = (int) (Math.random() * 100) + 1;
        }
    }
    
    //to string

    @Override
    public String toString() {
        return "Sorteo{" + "fecha=" + fecha + ", numerosGanadores=" + numerosGanadores + '}';
    }
    
    
    
    
}
