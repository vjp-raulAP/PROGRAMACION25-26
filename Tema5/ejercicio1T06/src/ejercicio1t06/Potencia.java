/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1t06;

/**
 *
 * @author rulaa
 */
public class Potencia extends Calculadora {
    //atributos
    private int exponente;
    //cosntruc defect
    public Potencia(){
        super();
        this.exponente = 0;
    }    
    public Potencia(double numero, int exponente){
     super(numero);
     this.exponente = exponente;   
    
    }
    
    @Override
    public void realizarOperacion(){
        double resultado = Math.pow(getNumero(), exponente);
        System.out.println("El resultado de la potencia: "+resultado);
    }
    
}
