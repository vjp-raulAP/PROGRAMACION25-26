/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;

public class CalculoPotencia {
    
    /**
     * 1º Método para que le usuario no ingrese la potencia a la cual quiere elevar un número
     * @return nor devuelve el entero al que se va a elevar
     */
    public static int pedirPotencia(){
        int potenciaUsuario;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor introduzca el numero al que vamos a elevarlo.");
        potenciaUsuario = entrada.nextInt();
        return potenciaUsuario;
    }
    
    /**
     * 2º Método para pedir el número base el que queremos elevar.
     * @return nor retorna un int con el entero elegido por el usuario.
     */
    public static int pedirNumero(){
        //Declaro la variable int donde guardo el número introducido por usuario
        int numUsuario; 
        Scanner entrada = new Scanner(System.in); //cre objeto scanner
        System.out.println("Por favor introduzca un numero que queremos calcular la potencia");
        numUsuario = entrada.nextInt(); //almaceno la entrada del usuario en la variable
        return numUsuario;
    }
    /**
     * Método void para calcular la potencia y también controla la excepción .
     */
    public static void calcularPotencia(){
        //declaro 2 variables las cuales obtienen su valor llamado a su correspondiente método.
        int numero = pedirNumero();
        int potencia = pedirPotencia();
        double resultado; //variable donde almacenaré resultado.
        
        
        
            try{
                if (numero == 0 && potencia < 0){ //condicion si número es 0 y potencia es negativa.
                    throw new ArithmeticException("No se puede elevar el  0 a un numero negativo. ");
                    }
                    
                //Cáculo de la potencia con el método de la clase Math  pasandolo las variables numero y potencia

                    resultado = Math.pow(numero, potencia);
                    System.out.println("El resultado de " +numero + "elevado a " +potencia +" es " +resultado );


                } catch (ArithmeticException e){
                    System.out.println("Error: "+ e.getMessage() );
                    }

        }
           
           
        
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calcularPotencia();
    }
    
}
