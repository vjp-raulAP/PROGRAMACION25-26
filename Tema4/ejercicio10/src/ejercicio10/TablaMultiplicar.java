/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
<<<<<<< Updated upstream
<<<<<<< Updated upstream
 * @author rulaa
 */
import java.util.Scanner;
=======
 * @author alumno
 */
>>>>>>> Stashed changes
=======
 * @author alumno
 */
>>>>>>> Stashed changes
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
        
        int num = pedirNumero();
        mostrarTabla(num);
    }
    
    public static void mostrarTabla(int numero){
        /**
         * Metodo que me calcula la tabla de multiplicar con un bucle for pasando por parametros un entero. 
         */
        System.out.println("La tabla de multiplicar del numero " + numero + " es: ");
        for (int i = 0; i < 11; i++) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " +resultado );
        }
    }
    
    public static int pedirNumero(){
        /**
         * Metodo por el que recojo un numero introducido por el usuario y lo retorno.
         */
        int numeroTabla;
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Introduzca un numero para hacer la tabla de multiplicar ");
        numeroTabla = entradaUsuario.nextInt();
        return numeroTabla;
    }
=======
        // TODO code application logic here
    }
    
>>>>>>> Stashed changes
=======
        // TODO code application logic here
    }
    
>>>>>>> Stashed changes
}
