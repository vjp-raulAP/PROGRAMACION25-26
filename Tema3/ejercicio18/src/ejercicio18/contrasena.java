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
        boolean aciertos = false; //
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Introduzca la contraseña: ");
            entradaContrasena = entrada.nextInt(); //leemos la contraseña 
            contadorIntentos ++; //aumenta el contador
            
            //comprobamos si la contraseña es correcta
            if (contraseña == entradaContrasena){
                aciertos = true; //
                System.out.println("Contraseña correcta");
                
            }else {
                System.out.println("Contraseña incorrecta. intento numero " + contadorIntentos + " de 3 intentos");
            }
            
        }while (aciertos == false && contadorIntentos < 3);//se repite mientras no haya acertado y el contador sea menor a 3
             
        //si falla los tres intentos mensaje de no superado
        if (aciertos == false && contadorIntentos == 3 ){
            System.out.println("Has superado los 3 intentos permitidos");
        }
        
        
        
        
    }
    
}
