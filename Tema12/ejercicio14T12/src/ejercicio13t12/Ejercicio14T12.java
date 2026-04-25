/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13t12;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Ejercicio14T12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = pedirString("Nombre y Apellidos: ");
        String sexo = pedirString("Sexo: ");
        int edad = pedirInt("Edad: ");
        int suspensos = pedirInt("Suspensos : ");
        String residencia = pedirString("Residencia: ");
        double ingresos = pedirDouble("Ingresos: ");
                
         Becario becario = new Becario(nombre,sexo,edad,suspensos,residencia,ingresos);
         
         
        //escribimos el fichero con try-with-recourses
        try {
             escribirBecarioEnFichero(becario);

        System.out.println("Becario guardado correctamente.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: no se encuentra o no se puede crear el archivo.");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
    
public static void escribirBecarioEnFichero(Becario becario) throws FileNotFoundException, IOException {

    try (FileWriter fw = new FileWriter("DatosBeca.txt", true);
         PrintWriter pw = new PrintWriter(fw)) {

        pw.println(becario); // usa toString()

    }
}
    
    
    public static String pedirString(String mensaje) {
    
        Scanner entrada = new Scanner(System.in);

    System.out.print(mensaje);
    return entrada.nextLine();
}
    
    public static int pedirInt(String mensaje){
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        return entrada.nextInt();
    }
    public static double pedirDouble(String mensaje){
        Scanner entrada = new Scanner (System .in);
        System.out.print(mensaje);
        return entrada.nextDouble();
    }
}
 

