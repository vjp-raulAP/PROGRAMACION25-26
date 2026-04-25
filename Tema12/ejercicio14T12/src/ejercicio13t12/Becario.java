/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13t12;

/**
 *
 * @author rulaa
 */
public class Becario {
    //atributos
     private String nombre;
    private String sexo;
    private int edad;
    private int suspensos;
    private String residencia;
    private double ingresos;
    //constructor 

    public Becario(String nombre, String sexo, int edad, int suspensos, String residencia, double ingresos) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.suspensos = suspensos;
        this.residencia = residencia;
        this.ingresos = ingresos;
    }
    
    public Becario(){
        this.nombre = "";
        this.sexo = "";
        this.edad =  0;
        this.suspensos = 0;
        this.residencia = "";
        this.ingresos = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSuspensos() {
        return suspensos;
    }

    public void setSuspensos(int suspensos) {
        this.suspensos = suspensos;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public String toString() {
        return "Nombre y apellidos: " + nombre + "\n" +
                    "Sexo (H-M): " + sexo + "\n" +
                    "Edad (20-60): " + edad + "\n" +
                    "Número de suspensos del curso anterior (0-4): " + suspensos + "\n" +
                    "Residencia familiar (SI-NO): " + residencia + "\n" +
                    "Ingresos anuales de la familia: " + ingresos + "\n";
    }
 
    
    
}
