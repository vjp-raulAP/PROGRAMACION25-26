/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
public class Contraseña {
    public static final int CONTRASENA = 1234;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean accesoOk = false;
        int contadorIntentos = 0;
       
        do {
            int contrasenaIntro = pedirContrasena();
            accesoOk = comprobacionContrasena(contrasenaIntro,CONTRASENA);
            contadorIntentos++;
            if (accesoOk) {
                
            }
                    
            
        } while (!accesoOk && contadorIntentos < 3);
        
        mostrarResultado(accesoOk);
    }
    
    public static int pedirContrasena(){
        int contrasenaUsuario;
        Scanner contrasena = new Scanner(System.in);
        System.out.println("Introduce una contraseña numérica. ");
        contrasenaUsuario = contrasena.nextInt();
        return contrasenaUsuario;
    }
    public static boolean comprobacionContrasena(int contrasenaIntro, int contrasenaCorrecta){
        boolean resultado;
            if (contrasenaIntro == contrasenaCorrecta)
                resultado = true;
            else{
                resultado = false;
            }
            return resultado;
    }        
    public static void mostrarResultado(boolean accesoCorrecto){
        if (accesoCorrecto == true){
            System.out.println("acceso permitido");
        }else {
            System.out.println("acceso no permitido, agotado los 3 intentos");
        }
    }
    
}
