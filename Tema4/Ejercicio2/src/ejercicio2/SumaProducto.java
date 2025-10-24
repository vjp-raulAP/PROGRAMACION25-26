/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
import java.util.Scanner; 
public class SumaProducto {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        //Declaro las variables que voy a usar
        int num1;
        int num2;        
        int resultado;
        //Creo la entrada de datos del usuario
       Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor , Introduce un numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Ahora, Introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        //Creo la condicion que me hace ejecutar uno metodo u otro. en este caso si es mayos a 10 multiplicación y si es menor a 10 la suma.
            if(num1 > 10){
                resultado = Operaciones.multiplicacion(num1, num2);
                System.out.println("La operación que se realizó es producto y el resultado es " + resultado);
            }
            else{
                resultado = Operaciones.suma(num1, num2);
                 System.out.println("La operación que se realizó es suma y el resultado es " + resultado);
            }
        }
        
        
        
    }
    

