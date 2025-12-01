/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1t06;

/**
 *
 * @author rulaa
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Sin polimorfismo
        System.out.println("Sin polimorfismo");
        Suma suma1 = new Suma();
        suma1.setNumero(10);
        //Por defecto suamndo = 0;
        suma1.realizarOperacion();
        //parametrizado
        Suma suma2 = new Suma(10,3);
        suma2.realizarOperacion();
        
       
        Multiplicacion mult1 = new Multiplicacion(5,4);
        mult1.realizarOperacion();
        
        Potencia pot1 = new Potencia(5,3);
        pot1.realizarOperacion();
        
        System.out.println("con polimorfismo");
        Calculadora calculadora1 = new Suma(7, 3);
        Calculadora calculadora2 = new Multiplicacion(4, 2);
        Calculadora calculadora3 = new Potencia(5, 3);

        calculadora1.realizarOperacion();
        calculadora2.realizarOperacion();
        calculadora3.realizarOperacion();
        
    }
    
}
