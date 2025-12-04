/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3t06;

/**
 *
 * @author rulaa
 */
public class Triangulo {
    private double base;
    private double altura;

    // Constructor por defecto
    public Triangulo() {
        this.base = 0.0;
        this.altura = 0.0;
    }

    // Constructor parametrizado
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Getters y setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Área común
    public double calcularArea() {
        return (base * altura) / 2.0;
    }
    //metodo calculo de hipotenusa
    public double hipotenusa(){  //a2 = b2+c2 --> 
        return Math.sqrt((Math.pow(getBase(), 2))+(Math.pow(getAltura(), 2)));
    }
    // Perímetro = suma de los 3 lados
    public double perimetro() {
        return getBase() + getAltura() + hipotenusa();
    }
    
    @Override
    public String toString() {
        return "Triangulo de base=" + base +" cm, altura=" + altura+" cm" ;
}
}
