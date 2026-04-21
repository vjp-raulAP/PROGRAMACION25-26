/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06t11ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06T11Ficheros {
  static String NOMBREFICHERO = "";

    /**
     * Método para guardar los 100 primeros números pares
     */
   /**
     *  1: Metodo Volcar array de los 100 primeros números pares a fichero
     */
 public static void volcarArray() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el nombre del fichero: ");
        NOMBREFICHERO  = entrada.nextLine();

        int[] numerosPares = new int[100];
        int contador = 0;
        int num = 1;
           int contador2 = 0;
        // Generar pares 
        while (contador < 100) {
            if (num % 2 == 0) {
                numerosPares[contador] = num;
                contador++;
            }
            num++;
        }

        // Escribir en fichero
        try (FileWriter fw = new FileWriter(NOMBREFICHERO );
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println("--- Numeros pares ---");
            for (int n : numerosPares) {
                contador2++;
                pw.print(contador2 + "º----> ");
                pw.println(n);
                
            }

            System.out.println("Fichero creado y array volcado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }

    /**
     * Método para mostrar el contenido del fichero
     */
    public static void mostrarContenido() {
        //comprobacion de que existe el fichero
        if (NOMBREFICHERO.isEmpty()) {
            System.out.println("Error. Archivo no creado.");
            return;
        }

        File archivo = new File(NOMBREFICHERO);

        if (!archivo.exists()) {
            System.out.println("El fichero no existe.");
            return;
        }

        try (FileReader fr = new FileReader(archivo);
             BufferedReader br = new BufferedReader(fr)) {

            String linea;
            System.out.println("---CONTENIDO DEL FICHERO---");

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    /**
     * Método menú
     */
    public static void mostrarMenu() {
        System.out.println("-----------------------------------");
        System.out.println("1. Volcar números pares a fichero");
        System.out.println("2. Mostrar contenido del fichero");
        System.out.println("3. Salir");
        System.out.println("-----------------------------------");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                entrada.nextLine(); // limpiar buffer

                switch (opcion) {
                    case 1:
                        volcarArray();
                        break;
                    case 2:
                        mostrarContenido();
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción incorrecta (1-3)");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un número válido.");
                entrada.nextLine();
            } catch (Exception e) {
                System.out.println("Error inesperado.");
                entrada.nextLine();
            }

        } while (opcion != 3);
    }
    }
    

