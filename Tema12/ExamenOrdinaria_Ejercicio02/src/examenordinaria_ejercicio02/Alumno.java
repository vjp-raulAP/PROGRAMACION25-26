/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenordinaria_ejercicio02;

/**
 *
 * @author alumno
 */
public class Alumno {
    // Atributos
    private String DNI;
    private String nombreAlumno;
    private int edad;
    
    // Constructores
    // Constructor por defecto
    public Alumno() {
        this.DNI = "";
        this.nombreAlumno = "";
        this.edad = 0;
    }
    
    // Constructor parametrizado
    public Alumno(String DNI, String nombreAlumno, int edad) {
        this.DNI = DNI;
        this.nombreAlumno = nombreAlumno;
        this.edad = edad;
    }
    
    // Getters ySetters
    // Getters
    public String getDNI() {
        return DNI;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public int getEdad() {
        return edad;
    }
    
    // Setters
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // toString
    @Override
    public String toString() {
        return "Alumno: " + nombreAlumno + "\nDNI: " + DNI + "\nEdad: " + edad;
    }
}
