/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1t06;

/**
 *
 * @author rulaa
 */
public class Suma extends Calculadora {
    //Atributos
    private double sumando;
    
    //Constructor por defecto
    public Suma(){
        super();
        this.sumando=0;
    }
    //Cosntructor parametrzado
    public Suma(double numero,double sumando ){
        super(numero);
        this.sumando = sumando;
    }  
    //metodo realizarOperacion (suma d elos atributos)
    @Override
    public void realizarOperacion(){
        double resultado = getNumero()+sumando;
        System.out.println("El resultado de la suma es : "+resultado);
    }
}
