/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1t06;

/**
 *
 * @author rulaa
 */
public class Multiplicacion extends Calculadora {
    //Atributos 
    private double multiplicador;
    //construct defecto
    public Multiplicacion(){
        super();
        this.multiplicador = 0;
    }
    //Construct param
    public Multiplicacion(double numero , double multiplicador){
        super(numero);
        this.multiplicador= multiplicador;
    }
    
    @Override
    public void realizarOperacion(){
        double resultado = getNumero()* multiplicador;
        System.out.println("El resultado de la multiplicación es: "+resultado);
    }
}

