/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author rulaa
 */
public class Ejercicio14 {
    //Declaro la contante pi
    final static double PI=3.141592;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaro la variable radio de circunferencia
        float radio = 5.2f;
        
        //creo la formula del area del Círculo = pi *( radio * radio)
        double areaCirculo= PI * (radio * radio) ;
        
        //imprimo resultado del area del circulo
        System.out.println("El area del circulo con radio " + radio + "cm" + " es igual a: " +areaCirculo );
    }
    
}
