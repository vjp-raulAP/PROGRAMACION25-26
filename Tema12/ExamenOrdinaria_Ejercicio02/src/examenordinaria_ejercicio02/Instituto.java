/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenordinaria_ejercicio02;

import java.util.HashMap;

/**
 *
 * @author alumno
 */
public class Instituto {

    // Atributos
    private String nombreInstituto;
    private String nombreLocalidad;
    private HashMap alumnos;

    // Constructores
    // Constructor por defecto
    public Instituto() {
        this.nombreInstituto = "";
        this.nombreLocalidad = "";
        this.alumnos = null;
    }

    // Constructor parametrizado
    public Instituto(String nombreInstituto, String nombreLocalidad, HashMap alumnos) {
        this.nombreInstituto = nombreInstituto;
        this.nombreLocalidad = nombreLocalidad;
        this.alumnos = alumnos;
    }

    //Getters y Setters
    // Getters
    public String getNombreInstituto() {
        return nombreInstituto;
    }

    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    public HashMap getAlumnos() {
        return alumnos;
    }

    // Setters
    public void setNombreInstituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }

    public void setNombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }

    public void setAlumnos(HashMap alumnos) {
        this.alumnos = alumnos;
    }

    // toString
    @Override
    public String toString() {
        return "Nombre Instituto: " + nombreInstituto + "\nLocalidad: " + nombreLocalidad + ", alumnos=" + alumnos + '}';
    }
}
