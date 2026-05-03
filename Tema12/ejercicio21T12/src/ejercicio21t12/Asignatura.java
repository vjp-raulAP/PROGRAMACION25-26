/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio21t12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  
 * @author rulaa
 */
public class Asignatura {
    //Atributos
    private String nombre;
    private double nota;
    
    //constructor por defecto
    public Asignatura(){
        this.nombre = "";
        this.nota= 0;
    }
  //constructor parametrizado
    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    //metodo que controle que la nota tenga un valor
    //numérico (no letras) entre 0 y 10.
    public void introducirNota() {
        Scanner entrada = new Scanner(System.in);
        boolean valido = false;
        do {
            System.out.println("Introduce la nota de " + this.nombre + ": ");

            try {
                this.nota = entrada.nextDouble();
                entrada.nextLine(); // limpiar buffer

                if (this.nota >= 0 && this.nota <= 10) {
                    valido = true;
                } else {
                    System.out.println("Error. La nota debe estar entre 0 -10");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Introduce un número válido.");
                entrada.nextLine(); // limpiar entrada incorrecta
            }

        } while (!valido);
    }

    //To String
    @Override
    public String toString() {
        return "Asignatura ["+" Nombre: "+ nombre+"  Nota: "+nota +"]";
    }
    
    
}
