/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
public class menorMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        //declaro primero las variables que voy a usar
        int num1,num2,num3,num4;
        //declaro variable auxiliar donde guardaré la variable para hacer cambio
        int aux;
        System.out.println("Por favor, introduzca el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        System.out.println("Por último,introduzca un cuarto numero: ");
        num4 = entrada.nextInt();
        
        //realizamos intercambio de variables en caso de ser mayor 
        
        if(num1 > num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if(num1 > num3){
            aux = num1;
            num1 = num3;
            num3 = aux;
        }
        if(num1 > num4){
            aux = num1;
            num1 = num4;
            num4 = aux;    
        }
        if(num2 > num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        if(num2 > num4){
            aux = num2;
            num2 = num4;
            num4 = aux;
        }
        if(num3 > num4){
            aux = num3;
            num3 = num4;
            num4 = aux;  
        }
        
        System.out.println("El orden de los numeros introducidos es el " + num1 + " - " + num2 + " - "+ num3 +" - " + num4);
        
        
    }
    
}
