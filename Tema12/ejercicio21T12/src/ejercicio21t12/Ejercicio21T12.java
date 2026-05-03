/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21t12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Ejercicio21T12 {

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creo el array donde almaceno las asignaturas
        Asignatura[] listAsignatura = new Asignatura[6];
        // Inicializamos cada asignatura con su nombre
        listAsignatura[0] = new Asignatura("Programación", 0);
        listAsignatura[1] = new Asignatura("Lenguaje de marcas", 0);
        listAsignatura[2] = new Asignatura("Bases de Datos", 0);
        listAsignatura[3] = new Asignatura("Entorno de desarrollo", 0);
        listAsignatura[4] = new Asignatura("Sistemas Informaticos", 0);
        listAsignatura[5] = new Asignatura("FOL", 0);

        //pedimos la nota correspondicente a la asignatura con el metodo  creado en la clase Asisgnatura
        for (Asignatura asignatura : listAsignatura) {
            asignatura.introducirNota();
        }

        // Guardamos los datos en un fichero
        try (PrintWriter pw = new PrintWriter(new FileWriter("NotasDAM.txt"))) {

            for (Asignatura asignatura : listAsignatura) {
                // Formato: nombre:nota
                pw.println(asignatura.getNombre() + ":" + asignatura.getNota());
            }

            //feddback al usuario
            System.out.println(" Notas guardadas ....");

            leerYCalculoMedia();
        } catch (FileNotFoundException e) {
            System.out.println("Error escritura en el fichero.");

        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }

    }

    public static void leerYCalculoMedia() throws FileNotFoundException, IOException {

        double suma = 0;   // acumulador de notas
        int contador = 0;  // cuenta cuántas notas hay

        //  creamos el try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader("NotasDAM.txt"))) {

            String linea;

            // Leemos línea a línea hasta que no haya más (null)
            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(":");// Separamos la línea por ":" (nombre:nota)

                if (partes.length == 2) {

                    suma += Double.parseDouble(partes[1]);// Convierto la nota (String -> double) y la sumo

                    contador++;
                }
            }

            if (contador > 0) {
                System.out.println("Nota media del curso: " + (suma / contador));
            } else {
                System.out.println("No hay datos para calcular la media");
            }

        }

}
}
    