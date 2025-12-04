/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3t06;

/**
 *
 * @author rulaa
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         // Crear objetos de cada figura
        Circulo c = new Circulo("Rojo",5);
        Rectangulo r = new Rectangulo("Azul",4, 6);
        Cuadrado q = new Cuadrado("Verde",3 );
        TrianguloRectangulo t = new TrianguloRectangulo(3, 4);
        
         // Mostrar información usando toString
        System.out.println(c);
        c.calcularPerimetro();
        System.out.println(r);
        System.out.println(q);
        System.out.println(t);
        
        
        TrianguloRectangulo triangulo1 = new TrianguloRectangulo(4,4);
        triangulo1.tipoTriangulo();        // Calcula e imprime el tipo
        System.out.println(triangulo1);    // Muestra todo, incluyendo el tipo
    }
    
}
