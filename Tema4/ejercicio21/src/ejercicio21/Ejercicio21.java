/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
public class Ejercicio21 {
    
    /**
     * Método para pedir al Usuario un PRIMER NUMERO.
     * @return  respuesta del usuario.
     */
    public static int pedirPrimerNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        return entrada.nextInt(); 
    }
    
    /**
     * Metodo para pedir SEGUNDO NUMERO comparando con primer numero
     * @param num1Usuario
     * @return 
     */
    public static int pedirSegundoNumero(int num1Usuario){
        //declaro variables 
        boolean numCorrecto = false;
        int num2Usuario;
        
        Scanner entrada = new Scanner(System.in); //Creo el objeto Scanner para leer la entrada del usuario
       
        //me creo un bucle do-while para que me pida un número mayor a num1Usuario y mientras no se cumpla lo repite
        do {
            System.out.println("Introduzca un segundo número: ");
            num2Usuario = entrada.nextInt(); 
            if (num2Usuario < num1Usuario){   //condicion para que mientras no se cumpla lo ejecute
                System.out.println("El segundo número es menor que " +num1Usuario);
                System.out.println(" Por favor, introduzca un numero mayor que  " + num1Usuario);  
            } else{  //si se cumple. numCorrecto cambia de valor a True y se saldrá del bucle.
                numCorrecto = true;
            }
              
        } while (!numCorrecto);
        return num2Usuario;
    }
    /**
     * Método para calcular los pares entre num1Usuario y num2Usuario  
     * @param num1Usuario paso el primer numero
     * @param num2Usuario paso segundo numero 
     * imprimo resultado fuera del bucle for para que no me lo repita
     */
    public static void  resultadoSumaPares(int num1Usuario,int num2Usuario ){
        //Declaro la variable donde voy a guardar la suma y la inicializo a 0
        int sumaPares = 0;
        //Me creo un bucle for para que recorra todos los numeros  pares entre num1Usuario y num2Usuario y me los sume
        for (int i = num1Usuario; i < num2Usuario; i++) { 
            if (i % 2 == 0){
                sumaPares += i;
            }
            
        }
         //imprimo resultado
        System.out.println("La suma de los números pares entre " +num1Usuario +" y " +num2Usuario +" es: " +sumaPares);
        
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1Usuario = pedirPrimerNumero();         // metodo para obtener el primer número
        int num2Usuario = pedirSegundoNumero(num1Usuario);   // metodo para obtener el primer número
        resultadoSumaPares(num1Usuario, num2Usuario);    //  llamo al método Mostrar el resultado final pasando los parametros num1Usuario y num2Usuario
        
       
    }
    
}
