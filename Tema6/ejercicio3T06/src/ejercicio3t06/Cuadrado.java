/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3t06;

/**
 *
 * @author rulaa
 */
public class Cuadrado extends FiguraGeometrica {
     private double lado;

    // Constructor por defecto
    public Cuadrado() {
        super();
        this.lado = 0.0;
    }

    // Constructor parametrizado
    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    // Getter y setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double areaCuadrado = lado * lado;
        System.out.println("El area del cuadrado de lado = "+lado+" es : "+areaCuadrado);
    }

    @Override
    public void calcularPerimetro() {
        double perimetroCuadrado = lado * 4;
         System.out.println("El perimetro del cuadrado de lado = "+lado+" es : "+perimetroCuadrado);
    }
    
     @Override
     public String toString(){
         return "el cuadrado tiene color ="+getColor()+" , lado = "+lado + "El area del cuadrado es ";
     }
}
