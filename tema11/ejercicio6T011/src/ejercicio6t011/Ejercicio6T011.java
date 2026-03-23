/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6t011;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio6T011 {
 /**
     * Método que muestra las opciones del menú
     */
    public static void mostrarMenu(){
        System.out.println("1. Añadir donación");
        System.out.println("2. Mostrar donaciones");
        System.out.println("3. Buscar donaciones de un donante");
        System.out.println("4. Mostrar número de donaciones");
        System.out.println("5. Mostrar dinero total recaudado");
        System.out.println("6. Mostrar donaciones ordenadas (de mayor a menor)");
        System.out.println("7. Salir");
        System.out.println("----------------------------------------------------");
    }
    
     /**
     * Método que pide un número
     *
     * @return el número
     */
    public static int pedirNum() {
        int num;
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        entrada.nextLine();
        return num;
    }
    
     /**
     * Método que pide un String
     *
     * @return la cadena
     */
    public static String pedirString() {
        String cadena;
        Scanner entrada = new Scanner(System.in);
        cadena = entrada.nextLine();
        
        return cadena;
    }
    
    
     public static void añadirDonacion(Donacion[] donaciones) {
        Scanner entrada = new Scanner(System.in);
        int cantidadDonaciones;
        System.out.println("Introduce la cantidad de donaciones");
        cantidadDonaciones = entrada.nextInt();
        
        for (int i = 0; i < cantidadDonaciones; i++) {
            System.out.println("Introduce el nombre del donante");
            String nombre = entrada.nextLine();
            System.out.println("Introduce la cantidad a donar");
            double cantidad = entrada.nextDouble();
            
            donaciones[i] = new Donacion(nombre,cantidad);
        }
    
     /**
     * Método que ejecuta el menú
     *
     * 
     */
    public static void menu() {
         Scanner entrada = new Scanner(System.in);
        int opcion = -1;

<<<<<<< HEAD
    
    pu
=======
        do {
             try {
            mostrarMenu();
            System.out.println("Elija una opción");
            opcion = pedirNum();

            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Número introducido inválido");
            }
              } catch (InputMismatchException e) {
                System.out.println("Error, introduce una opción entre 1 y 7");
                entrada.nextLine();
            }

        } while (opcion != 7);
    }
    
>>>>>>> bcdc84b567fca3fedebbcbfa44444a8127ea81bf
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
