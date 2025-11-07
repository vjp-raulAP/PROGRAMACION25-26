/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;

/**
 *
 * @author rulaa
 */

import java.util.InputMismatchException;

import utilidades.Utilidades;//importo la clase Utilidades que está en el paquete utilidades 

public class MetodosEstaticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaro variables de tipo entero para almacenar el numero que introduce por parametros el usuario
       // llamando al método para pedirselo.
       int num1 = Utilidades.pedirNumero();
       int num2 = Utilidades.pedirNumero();
       double resultado; //almaceno el resultado de las operaciones
       //Declaro las variables de tipo char  para el reto2. 
       char letra1 = 'a';
       char letra2 = 'z';
       
       
       //llamo al método suma de la clase Calculadora  y almacena el cálculo en la variable resultado
       resultado = Calculadora.suma(num1, num2);
        System.out.println(num1 + " + " +num2 +" = " +resultado);
        
        //llamo al método resta de la clase Calculadora  y almacena el cálculo en la variable resultado
        resultado = Calculadora.resta(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + resultado);

        //llamo al método multiplicación de la clase Calculadora  y almacena el cálculo en la variable resultado
        resultado = Calculadora.multiplicacion(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + resultado);

        //llamo al método division de la clase Calculadora  y almacena el cálculo en la variable resultado
        resultado = Calculadora.division(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + resultado);
        
        System.out.println("-------LOS MÉTODOS DE LA CLASE MATH SON -------");
        
        System.out.println("-----RETO1-----");
        
        //impimo el resultado del los diferentes métodos de la clase Math que se encuentran el la clase Calculadora
        System.out.println("La raiz cuadrada de " + num1 + " es: " + Calculadora.raizCuadrada(num1));
        System.out.println("El cuadrado de "+num1 + " es: "+Calculadora.cuadrado(num1) );
        System.out.println("El Cubo de " +num1 + " y " +num2 + " es: " +Calculadora.cubo(num1));
        System.out.println("El logaritmo de " +num1 + " es:  " + Calculadora.logaritmo(num1));
        System.out.println("El Valor máximo entre  " +num1 + " y "+num2 + " es: " +Calculadora.valorMaximo(num1, num2));
        System.out.println("El Valor minimo entre  " +num1 + " y "+num2 + " es: " +Calculadora.valorMinimo(num1, num2));
        System.out.println("El redondeo al alza de " +num1 + " es:" +Calculadora.redondeoAlza(num1));
        System.out.println("El redondeo al a baja de " +num1 + " es " +Calculadora.redondeBaja(num1));
        
        
        System.out.println("-----RETO2-----");
        
        System.out.println("la letra aleatoria generada  entre a y la z es:" +utilidades.Utilidades.generarLetraAleatoria(letra1, letra2));
        
       

    }
    
}
