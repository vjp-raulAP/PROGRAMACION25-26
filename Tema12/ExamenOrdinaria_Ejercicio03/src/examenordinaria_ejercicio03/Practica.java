/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenordinaria_ejercicio03;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Practica {

    // Atributos
    private String nombreAlumno;
    private String tituloPractica;
    private int notaObtenida;

    // Constructores
    //Constructor por defecto
    public Practica() {
        this.nombreAlumno = "";
        this.tituloPractica = "";
        this.notaObtenida = 0;
    }

    // Constructor parametrizado
    public Practica(String nombreAlumno, String tituloPractica, int notaObtenida) {
        this.nombreAlumno = nombreAlumno;
        this.tituloPractica = tituloPractica;
        this.notaObtenida = notaObtenida;
    }

    public String getTituloPractica() {
        return tituloPractica;
    }

    public int getNotaObtenida() {
        return notaObtenida;
    }

    // Getters y Setters
    // Getters que piden mediante los métodos los valores
    public String getNombreAlumno(String pedirNombre) {
        return nombreAlumno;
    }

    public String getTituloPractica(String pedirNombreTitulo) {
        return tituloPractica;
    }

    public int getNotaObtenida(int pedirNota) {
        return notaObtenida;
    }

    // Getters 
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    // Setters
    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public void setTituloPractica(String tituloPractica) {
        this.tituloPractica = tituloPractica;
    }

    public void setNotaObtenida(int notaObtenida) {
        this.notaObtenida = notaObtenida;
    }

    // Métodos para pedir valores
    /**
     * Método que pide al usuario que escriba el nombre del alumno
     *
     * @return
     */
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el nombre del alumno:");
        String nombre = entrada.nextLine();
        return nombre;
    }

    /**
     * Método que pide al usuario que escriba la nota de la practica
     *
     * @return
     */
    public static int pedirNota() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la nota de la practica:");
        int nota = entrada.nextInt();
        return nota;
    }

    public static String pedirNombreTitulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el título de la práctica:");
        String nombreTituloPractica = entrada.nextLine();
        return nombreTituloPractica;
    }

    // Método para el valor de los atributos, como el toString, pero visualmente de otra forma
    public String mostrarInfoPractica() {
        return "- PRÁCTICA " + tituloPractica + ": " + "\n   Alumno: " + nombreAlumno + "\n   Nota: " + notaObtenida;
    }

    // toString: para mostrar los atributos de la clase Practica
    @Override
    public String toString() {
        return "Practica{" + "nombreAlumno=" + nombreAlumno + ", tituloPractica=" + tituloPractica + ", notaObtenida=" + notaObtenida + '}';
    }

}
