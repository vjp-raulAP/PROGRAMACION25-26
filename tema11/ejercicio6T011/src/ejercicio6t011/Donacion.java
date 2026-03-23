/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6t011;

/**
 *
 * @author rulaa
 */
public class Donacion {
    private String donante;
    private double cantidadDonar;

    public Donacion(String donante, double donacion) {
        this.donante = donante;
        this.cantidadDonar = donacion;
    }
    
     public Donacion(){
        this.donante = "";
        this.cantidadDonar = 0;
    }

    public String getDonante() {
        return donante;
    }

    public double getDonacion() {
        return cantidadDonar;
    }

    public void setDonante(String donante) {
        this.donante = donante;
    }

    public void setDonacion(double donacion) {
        this.cantidadDonar = donacion;
    }

    @Override
    public String toString() {
        return "Donacion{" + "donante=" + donante + ", donacion=" + cantidadDonar + '}';
    }
     
     
}
