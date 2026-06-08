/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenordinaria_ejercicio02;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Eva Cantero Abad
 */
public class ExamenOrdinaria_Ejercicio02 {

    /**
     * Método que va a pedir al usuario queintroduzca un valor tipo String
     */
    public static void pedirString() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca por teclado el String: ");
        String teclado = entrada.nextLine();
    }

    /**
     * Método que va a pedir al usuario que introduzca un valor tipo entero
     */
    public static void pedirInt() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca por teclado el int: ");
        int teclado = entrada.nextInt();
    }

    /**
     * Método que gestiona el menú de la Conserjería de Educación y Cultura
     */
    public static void menuConserjeria() {
        // Declaro esta variable para poder elegir una opcion en el menú que se le va a mostrar a la Conserjería
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        // Usamos un try-catch para capturar posibles excepciones
        try {

            // Importamos este método para que se muestren las opciones del menú 
            opcionesMenu();
            opcion = entrada.nextInt();

            // Usamos un bucle do-while, ya que, al menos se va a mostrar una vez
            do {

                // Se usa un switch para que el usuario al elegir una opción, se realice el método correspondiente
                switch (opcion) {
                    case 1 ->
                        rellenarInstitutos();
                    case 2 ->
                        mostrarInstitutos();
                    case 3 ->
                        mostrarInstitutosDNI();
                    case 4 ->
                        System.out.println("\nSaliendo...");
                    default ->
                        System.out.println("Opción incorrecta.");
                }

            } while (opcion != 4);
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Por favor, introduzca un número entre el 1 y el 4.");
        }
    }

    /**
     * Método que muestra las opciones que tiene el usuario para elegir en el
     * menú
     */
    public static void opcionesMenu() {
        System.out.println("- MENÚ -");
        System.out.println("1. Rellenar Institutos");
        System.out.println("2. Mostrar Institutos");
        System.out.println("3. Mostrar Instituto por DNI de alumno");
        System.out.println("4. Salir del menú");
        System.out.println("\nIntroduzca una de las opciones del menú:");
    }

    /**
     * Método para rellenar una lista de Institutos
     */
    public static void rellenarInstitutos() {
        ArrayList<Instituto> institutos = new ArrayList<>();
        //institutos.add(pedirNombreInstituto(),pedirNombreLocalidad());
    }

    public static String pedirNombreInstituto() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre Instituto: ");
        String nombreInstituto = entrada.nextLine();
        return nombreInstituto;
    }

    public static String pedirNombreLocalidad() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Localidad: ");
        String nombreLocalidad = entrada.nextLine();
        return nombreLocalidad;
    }

    public static void mostrarInstitutos() {

    }

    public static void mostrarInstitutosDNI() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menuConserjeria();
    }

}
