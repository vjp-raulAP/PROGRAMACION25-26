/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9t09;

import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Ejercicio9T09 {
    
    // Comprueba longitud mínima
    public static boolean longitudCorrecta(String password) {
        if (password.length() >= 6) {
            return true;
        } else {
            return false;
        }


    }
    
    // Comprueba que tenga al menos 2 dígitos
    public static boolean tieneDosDigitos(String password) {

        int contador = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                contador++;
            }
        }

        if (contador >= 2) {
            return true;
        } else {
            return false;
        }
    }

    // Comprueba que el usuario no esté dentro de la contraseña
    public static boolean contieneUsuario(String usuario, String password) {
         if (password.toLowerCase().contains(usuario.toLowerCase())) {  //Condicion contiene el nombre de usuario en contraseña
        return true;
    } else {
        return false;
    }
}

    //Metodo validar usuario y contraseña
 public static boolean validarPassword(String usuario, String password) {

        boolean valida = true;

        if (!longitudCorrecta(password)) {
            System.out.println("Error: La contraseña debe tener al menos 6 caracteres.");
            valida = false;
        }

        if (!tieneDosDigitos(password)) {
             System.out.println("Error: La contraseña debe contener al menos 2 dígitos.");
            valida = false;
        }

        if (contieneUsuario(usuario, password)) {
             System.out.println("Error: La contraseña no puede contener el nombre de usuario.");
            valida = false;
        }

        return valida;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre de usuario:");
        String usuario = entrada.nextLine();
        System.out.print("Introduce la contraseña: ");
        String password = entrada.nextLine();
        if (validarPassword(usuario, password)) {
            System.out.println("Contraseña válida ");
        } else {
            System.out.println("Contraseña no válida ");

        }
    }
}

