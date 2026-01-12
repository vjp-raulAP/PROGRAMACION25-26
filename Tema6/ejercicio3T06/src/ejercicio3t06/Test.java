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
        Circulo circulo1 = new Circulo("Rojo",5);
        Rectangulo rectangulo1 = new Rectangulo("Azul",4, 6);
        Cuadrado cuadrado1 = new Cuadrado("Verde",3 );
        TrianguloRectangulo trianguloR1 = new TrianguloRectangulo(3, 4);
        
         // Mostrar información usando toString
        System.out.println(circulo1);
        circulo1.calcularPerimetro();
        System.out.println(cuadrado1);
        System.out.println( trianguloR1);
        System.out.println(rectangulo1 );
        
        
        TrianguloRectangulo triangulo1 = new TrianguloRectangulo(4,4);
        triangulo1.tipoTriangulo();        // Calcula e imprime el tipo
        System.out.println(triangulo1);    // Muestra todo, incluyendo el tipo
        
        
        
    }
    
}
