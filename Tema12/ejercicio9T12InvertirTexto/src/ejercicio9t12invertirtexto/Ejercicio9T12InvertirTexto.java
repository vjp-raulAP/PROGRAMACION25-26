/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9t12invertirtexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author alumno
 */
public class Ejercicio9T12InvertirTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String archivoEntrada = "frase.txt";
        String archivoSalida = "fraseinvertida.txt";
        
          
    
        

        try {
            // Leer el contenido del archivo
            BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
            String linea = br.readLine();
            String invertida = "";
            br.close();

            if (linea == null) {
                System.out.println("El archivo está vacío.");
                return;
            }

            // Invertir la cadena
                    for (int i = linea.length() - 1; i >= 0; i--) {
             invertida += linea.charAt(i);
         }

            // Escribir el resultado en el nuevo archivo
            FileWriter fw = new FileWriter(archivoSalida);
            fw.write(invertida);
            fw.close();

            System.out.println("Archivo creado correctamente: " + archivoSalida);

        } catch (IOException e) {
            System.out.println("Error al procesar los archivos: " + e.getMessage());
        }
    }
    }
    

