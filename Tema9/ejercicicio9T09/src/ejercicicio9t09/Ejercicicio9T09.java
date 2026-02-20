/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicicio9t09;

import java.util.Scanner;



/**
 *
 * @author rulaa
 */
public class Ejercicicio9T09 {
    
       // Método para pedir usuario y contraseña
    public static String[] pedirDatos() {
        Scanner scanner = new Scanner(System.in);
        String[] datos = new String[2];

        System.out.println("Ingrese su usuario:");
        datos[0] = scanner.nextLine();

        System.out.println("Ingrese su contraseña:");
        datos[1] = scanner.nextLine();

        return datos;
    }
    
    // Método para validar la contraseña usando el método de contar dígitos
    public static boolean validarContrasena(String usuario, String contrasena) {
        // 1. Verificar longitud mínima
        if (contrasena.length() < 6) {
            System.out.println("Error: La contraseña debe tener al menos 6 caracteres.");
            return false;
        }

        // 2. Verificar al menos 2 dígitos usando c >= '0' && c <= '9'
        int contadorDigitos = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);
            if (c >= '0' && c <= '9') {
                contadorDigitos++;
            }
        }
        if (contadorDigitos < 2) {
            System.out.println("Error: La contraseña debe tener al menos 2 dígitos.");
            return false;
        }

        // 3. Verificar que el usuario no esté en la contraseña
        if (contrasena.toLowerCase().contains(usuario.toLowerCase())) {
            System.out.println("Error: La contraseña no puede contener el nombre de usuario.");
            return false;
        }

        return true; // Contraseña válida
    }

    // Método para mostrar el resultado
    public static void mostrarResultado(boolean esValida) {
        if (esValida) {
            System.out.println("¡Contraseña válida!");
        } else {
            System.out.println("Contraseña inválida, intente nuevamente.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] datos = pedirDatos(); 
        String usuario = datos[0];
        String contrasena = datos[1];

        boolean esValida = validarContrasena(usuario, contrasena);
        mostrarResultado(esValida);
    }
    
}
