/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1t06;

/**
 * 1. Creo la clase abastracta calculadora 
 * @author rulaa
 */
public abstract class Calculadora {
    //Atributos
    private double numero;
    //constructor defecto
    public Calculadora(){
        this.numero = 0;
    }
    //constructor parametrizado
    public Calculadora(double numero){
        this.numero = numero;
    }
    //getter y setter
    public double getNumero(){
        return numero;
    }
    
    public void setNumero(double numero){
        this.numero = numero;
    }
    //método abstracto realizarOperacion.
    public abstract void realizarOperacion();
     
}
