/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14bt12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author rulaa
 */
public class Ejercicio14bT12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            leerYCalcular();

        } catch (IOException e) {
            System.out.println("Error leyendo el fichero: " + e.getMessage());
        }
    }
    
    
    public static void leerYCalcular() throws FileNotFoundException, IOException {
        String linea;
        String nombre = "";
        String sexo = "";
        int edad = 0;
        int suspensos = 0;
        String residencia = "";
        double ingresos = 0;

        try (FileReader fr = new FileReader("DatosBeca.txt"); BufferedReader br = new BufferedReader(fr)) {

       while ((linea = br.readLine()) != null) {

    if (!linea.contains(":")) {
        System.out.println("Error");
        continue;
    }

    String[] partes = linea.split(":");

    if (partes.length < 2) {
        System.out.println("Error");
        continue;
    }

    String clave = partes[0].trim();
    String valor = partes[1].trim();
                switch (clave) {
                    case "Nombre y apellidos":
                        nombre = valor;
                        break;
                    case "Sexo (H-M)":
                        sexo = valor;
                        break;
                    case "Edad (20-60)":
                        edad = Integer.parseInt(valor);
                        break;
                    case "Número de suspensos del curso anterior (0-4)":
                        suspensos = Integer.parseInt(valor);
                        break;
                    case "Residencia familiar (SI-NO)":
                        residencia = valor;
                        break;
                    case "Ingresos anuales de la familia":
                        ingresos = Double.parseDouble(valor);

                        double beca = calcularBeca(edad, suspensos, residencia, ingresos);
                        if (beca > 0) {
                            System.out.println(nombre + " -> Beca: " + beca + " €");
                        } else {
                            System.out.println(nombre + " -> No tine beca");

                        }

                        break;

                    default:
                        System.out.println("Error");
                }
            }
        }
    }
    

    public static double calcularBeca(int edad, int suspensos, String residencia, double ingresos) {

    double beca = 1500;

    if (suspensos >= 2) {
        return 0;
    }

    if (ingresos <= 12000) {
        beca += 500;
    }

    if (edad < 23) {
        beca += 200;
    }

    if (suspensos == 1) {
        beca += 200;
    }

    if (residencia.equalsIgnoreCase("NO")) {
        beca += 1000;
    }

    return beca;
}
}

