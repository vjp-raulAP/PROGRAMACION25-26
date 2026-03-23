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
    
    
     public static void anadirDonacion(Donacion[] donaciones) {
        Scanner entrada = new Scanner(System.in);
       int cantidadDonaciones;
        System.out.println("Introduce la cantidad de donaciones");
        cantidadDonaciones = entrada.nextInt();
        entrada.nextLine();
        
        for (int i = 0; i < cantidadDonaciones; i++) {
            System.out.println("Introduce el nombre del donante");
            String nombre = entrada.nextLine();
            System.out.println("Introduce la cantidad a donar");
            double cantidad = entrada.nextDouble();
            
            donaciones[i] = new Donacion(nombre,cantidad);
            entrada.nextLine();
        }
     
        }
        public static void buscarDonante(Donacion[]donaciones) {
            
            System.out.println("Introduce el nombre del donante a buscar: ");
        String nombre = pedirString();
        boolean encontrado = false;
        for (Donacion d : donaciones) {
            if (d != null && d.getDonante().equalsIgnoreCase(nombre)) {
                System.out.println(d);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No se encontraron donaciones de ese donante.");
    }

     
   public static void mostrarDonaciones(Donacion[]donaciones){
        for (int i = 0; i < donaciones.length; i++) {
        if (donaciones[i] != null) {
            System.out.println(donaciones[i]);
        }
        
        
    }
   }
   
   public static void mostrarNumeroDonaciones(Donacion[]donaciones) {
        int contador = 0;
        for (Donacion d : donaciones) {
            if (d != null) contador++;
        }
        System.out.println("Número de donaciones: " + contador);
    }
   
    public static void mostrarTotalRecaudado(Donacion[]donaciones) {
        double total = 0;
        for (Donacion d : donaciones) {
            if (d != null) total += d.getDonacion();
        }
        System.out.println("Total dinero recaudado: " + total + "€");
    }

    public static void menu(){
                  Donacion[] donaciones = new Donacion[100];
                    Scanner entrada = new Scanner(System.in);
                   int opcion = -1;

                   do {
                        try {
                       mostrarMenu();
                       System.out.println("Elija una opción");
                       opcion = pedirNum();

                       switch (opcion) {
                           case 1:
                               anadirDonacion(donaciones);
                               break;
                           case 2:
                               mostrarDonaciones(donaciones);
                               break;
                           case 3:
                                buscarDonante(donaciones);
                               break;
                           case 4:
                               mostrarNumeroDonaciones(donaciones);
                               break;
                           case 5:
                                mostrarTotalRecaudado(donaciones);
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
                           entrada.nextLine();//limpia buffer
                       }

                   } while (opcion != 7);
               }
  
    public static void main(String[] args) {
        menu();
    }
    
}
