/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bis2t12;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Ejercicio12Bis2T12 {

    public static void escribirCadenasEnArchivo(String[] cadenaChar, String nombreArchivo) throws FileNotFoundException, IOException {
        //validar que el array sea de 4
        if (cadenaChar.length != 4) {
            System.out.println("El array debe tener exactamente 4 cadenas");
            return;
        }
        try (FileWriter fw = new FileWriter(nombreArchivo); PrintWriter pw = new PrintWriter(fw)) {
            for (int i = 0; i < cadenaChar.length; i++) {
                pw.print(cadenaChar[i]);  //escribo la frase actual sin pasar a la siguiente linea 

                if (i < cadenaChar.length - 1) {
                    pw.print("*");
                }

            }

        }

    }

    public static  String [] pedirCadenas(){
          
        Scanner entrada = new Scanner(System.in);
        String [] cadenas = new String [4];
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println("Introduce la cadena en la posicion "+ (i + 1)+ ":");
            cadenas[i]= entrada.nextLine();
            
        }
        return cadenas;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            String[] cadenas = pedirCadenas();
             Scanner entrada = new Scanner(System.in);
         // Pedimos el nombre del archivo 
        System.out.println("Escriba el nombre del  archivo a crear : ");
        String nombreArchivo = entrada.nextLine();
        
        
        //creamo el try catch para capturar las excepciones.
        try{
             escribirCadenasEnArchivo(cadenas, nombreArchivo);
             //feedback
             System.out.println("Archivo creado..");
        }catch (FileNotFoundException e) {
            System.out.println("Error: No se encuentra el archivo.");
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error : " + e.toString());
        }
    
}
}
