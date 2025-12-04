/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3t06;

/**
 *
 * @author rulaa
 */
public class TrianguloRectangulo extends Triangulo {
    
    
    //constructor defecto
    public TrianguloRectangulo(){
        super();
    }
    //constructor Parametrizado
    public TrianguloRectangulo(double base,double altura){
        super(base,altura);
    }
    
    //getter y setter
    
    //metodos 
    
    
    
    //metodo de calculo de 
   public void tipoTriangulo() {
    double a = hipotenusa();  // Hipotenusa
    double b = getBase();     // Cateto 1
    double c = getAltura();   // Cateto 2

    if (a == b && b == c) {
        System.out.println("El triángulo es Equilátero"); // Imposible en un rectángulo, pero lo pide el ejercicio
    } 
    else if (a == b || b == c || a == c) {
        System.out.println("El triángulo es Isósceles");   // Solo pasa si los catetos son iguales
    } 
    else {
        System.out.println("El triángulo es Escaleno");    // Lo normal
    }
    
   }
   @Override
    public String toString() {
        return "TrianguloRectangulo: base = " + getBase() 
               + ", altura = " + getAltura() 
               + ", hipotenusa = " + hipotenusa();
               
    }
   
}
