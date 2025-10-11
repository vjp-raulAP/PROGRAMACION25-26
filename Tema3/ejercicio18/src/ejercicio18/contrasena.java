/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
public class contrasena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro variables que usare.
        int contraseña = 5432;  // contraseña correcta
        int entradaContrasena; // Entrada de la contraseña por teclado del usuario
        int contadorIntentos= 0; // contador de intentos
     
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Introduzca la contraseña: ");
            entradaContrasena = entrada.nextInt();
            contadorIntentos ++;
            
            if (contraseña == entradaContrasena){
              
                System.out.println("Contraseña correcta");
                
            }else {
                System.out.println("Contraseña incorrecta. intento numero " + contadorIntentos + " de 3 intentos");
            }
            
        }while ( contadorIntentos < 3);
                
        System.out.println(contadorIntentos);
        if (contadorIntentos == 3 ){
            System.out.println("Has superado los 3 intentos permitidos");
        }
        
        
        
        
    }
    
}
