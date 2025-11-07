/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author rulaa
 */
public class Calculadora {
    /**
     * Método que devueve la suma de los numeros pasados por parametros
     * @param num1
     * @param num2
     * @return la suma de l os dos números
     */
    public static int suma(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }
    
    /**
     *  Método que devueve la resta de los numeros pasados por parametros
     * @param num1
     * @param num2
     * @return  la resta de los números 1 y 2
     */
     public static int resta(int num1, int num2){
      
        return num1 -num2;
    }
     
     /**
      * Método que multiplica los dos números pasados por parametro
      * @param num1
      * @param num2
      * @return  el producto de los dos números 
      */
    public static int multiplicacion(int num1,int num2){
        return num1 * num2;
    }
    /**
     * Método que divide los dos números pasados por parámetros 
     * @param num1
     * @param num2
     * @return la división de los dos números
     */
    public static int division(int num1 ,int num2){
        int resultado;
         try{
            resultado = num1/num2;
        }
        catch(ArithmeticException e){
            resultado = 0;
        }
           
        return resultado;
    }
    
    //
    //RETO 1: Termina la clase Calculadora creando métodos que utilicen métodos estáticos de la clase Math: raíz cuadrada, cuadrado, cubo, logaritmo, valor máximo,
    //valor mínimo y redondeo al alza y a la baja.
    
    /**
     * Método que devuelve el cuadrado 
     * @param num1
     * @return devulve cuadrado del número  introduce
     */
    
    public static double raizCuadrada(int num1){
        return Math.sqrt(num1);
    }
    
    /**
     * Método que devuelve el cuadrado de un número
     * @param num1
     * @return devuelve el cuadrado
     */
    public static double cuadrado (int num1){
        return Math.pow(num1, 2);
    }
    /**
     * Método que devuelve el cubo de un numero pasado por parametro
     * @param num1
     * @return devuelve el cubo
     */
    public static double cubo(int num1){
        return Math.pow(num1, 3);
    }
    
    /**
     * Método que devuelve el logarito pasando un parámetro
     * @param num1
     * @return logaritmo del número  
     */
    public static double logaritmo(int num1){
        return Math.log(num1);
    }
    
    /**
     * Método que devuelve el valor máximo de los dos que se pasan por parametro
     * @param num1
     * @param num2
     * @return el valor máximo de los dos
     */
    public static int valorMaximo(int num1, int num2) {
        return Math.max(num1, num2);
    }
    
    /** 
     * Método que devuelve el valor mínimo de los dos 
     * pasados por parametro
     * @param num1
     * @param num2
     * @return el valor menor de los dos.
     */
    public static int valorMinimo(int num1 , int num2){
        return Math.min(num1, num2);
    }
    
    /**
     * Método que devulve el  número pasado por parametro
     * y lo redondea al alza
     * @param num
     * @return 
     */
    public static double redondeoAlza(double num){
        return Math.ceil(num);
    }
    
    /**
     * Metodo que devuelve el número pasado por parametro
     * y lo redondea a la baja
     * @param num
     * @return 
     */
    public static double redondeBaja(double num){
        return Math.floor(num);
    }
}




