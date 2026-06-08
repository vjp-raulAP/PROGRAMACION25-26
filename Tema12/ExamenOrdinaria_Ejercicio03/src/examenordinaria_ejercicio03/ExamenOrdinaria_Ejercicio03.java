/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenordinaria_ejercicio03;

import static examenordinaria_ejercicio03.Practica.pedirNombreTitulo;
import static examenordinaria_ejercicio03.Practica.pedirNota;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Eva Cantero Abad
 */
public class ExamenOrdinaria_Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        // Importamos el método con las opciones al main()
        menuProfesor();
    }

    /**
     * Método para mostrar al usuario las opciones que tiene para elegir
     */
    public static void opcionesMenu() {
        System.out.println("- MENÚ DEL PROFESOR -");
        System.out.println("1. Registrar práctica");
        System.out.println("2. Mostrar prácticas registradas");
        System.out.println("3. Calcular y mostrar la nota media de las prácticas");
        System.out.println("4. Salir del menú");
        System.out.println("\nIntroduzca una de las opciones del menú:");
    }

    /**
     * Método que gestiona las opciones del menú del profesor
     *
     * @throws IOException
     */
    public static void menuProfesor() throws IOException {
        // Declaro esta variable para poder elegir una opcion en el menú que se le va a mostrar al profesor
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        // Hacemos uso del try-catch para posible errores que se creen
        try {

            // Importamos el método que muestra las opciones que tiene el usuario para elegir
            opcionesMenu();
            opcion = entrada.nextInt();

            // Bucle do-while, ya que, se iterará al menos una vez 
            do {

                // Para gestionar los métodos de una forma más sencilla
                switch (opcion) {
                    case 1 ->
                        registrarPractica();
                    case 2 ->
                        mostrarPracticas();
                    case 3 ->
                        calcularNotaMedia();
                    case 4 ->
                        System.out.println("Saliendo del menú...");
                    default ->
                        System.out.println("Opción incorrecta.");
                }

            } while (opcion != 4);
        } catch (InputMismatchException e) {
            System.out.println("Por favor, introduzca un número entre el 1 y el 4.");
        }
    }

    /**
     * Método que registra la práctica
     *
     * @throws IOException
     */
    public static void registrarPractica() throws IOException {

        // Creamos el archivo practica.txt
        FileWriter fw = new FileWriter("practica.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        // Creamos un objeto tipo Practica para poder trabajar con la clase
        Practica practica = new Practica();
        System.out.println(practica.getNombreAlumno(practica.pedirNombre()) + "#" + practica.getTituloPractica(pedirNombreTitulo()) + "#" + practica.getNotaObtenida(pedirNota()));

        // Mostramos este mensaje en caso de error
        System.out.println("ERROR: ha ocurrido un error.");

        fw.close();

    }

    /**
     * Método que muestra las prácticas registradas
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void mostrarPracticas() throws FileNotFoundException, IOException {
        System.out.println("- PRÁCTICAS REGISTRADAS -");
        FileReader fr = new FileReader("practica.txt");
        BufferedReader br = new BufferedReader(fr);

        // Mostramos en este formato los datos obtenidos
        Practica practica = new Practica();
        System.out.println("PRÁCTICA " + practica.getTituloPractica());
        System.out.println("   Alumno: " + practica.getNombreAlumno());
        System.out.println("   Nota: " + practica.getNotaObtenida());

        fr.close();
    }

    /**
     * Método que calcula la nota media total de todas las prácticas
     */
    public static void calcularNotaMedia() {
        System.out.println("- NOTA MEDIA DE LAS PRÁCTICAS REGISTRADAS -");
        double notaMedia = 0.0;
        System.out.println("La nota media de todas las prácticas es " + notaMedia);
    }

}
