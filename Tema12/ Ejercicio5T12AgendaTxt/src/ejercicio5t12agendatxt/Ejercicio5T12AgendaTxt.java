/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5t12agendatxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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
public class Ejercicio5T12AgendaTxt {

     public static void añadirContacto() throws FileNotFoundException, IOException{
         
       //Scanner petición de datos-
        Scanner entrada = new Scanner(System.in);
        

        System.out.println("Introduce nombre: ");
        String nombreCont = entrada.nextLine();
        System.out.println("Introduce edad: ");
        String edad = entrada.nextLine();
        System.out.println("Introduce teléfono: ");
        String telefono = entrada.nextLine();
        
        
        
        // Creamos un try catch
        try(FileWriter fw = new FileWriter("agenda.txt", true);
            PrintWriter pw = new PrintWriter(fw)){
           
                pw.println("----------------------");
                pw.println("Nombre: " + nombreCont);
                pw.println("Edad: " + edad);
                pw.println("Número Teléfono: " + telefono);
                pw.println("---------------------");

            System.out.println("Contacto guardado con éxito");
        }catch(IOException e){   // Capturamos errores
            
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
  
    }
    
    /**
     * Método muestra el contenido del fichero agenda.txt
     */
    public static void mostrarContenido(){
        // Apuntamos al fichero
        File archivo = new File("agenda.txt");
        
        // Comprobamos si el archivo existe
        if (!archivo.exists()) {
            System.out.println("La agenda todavía no existe");
            return;
        }
        
        // Creamos un try catch FileReader y BufferedReader
        try (FileReader fr = new FileReader(archivo);
                
             BufferedReader br = new BufferedReader(fr)){
            String linea;
            System.out.println("---CONTENIDO DE LA AGENDA---");
            
            // Leemos línea a línea hasta nos devuelva null
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
            
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("--AGENDA--");
        System.out.println("1.Añadir contacto");
        System.out.println("2.Visualizar contactos");
        System.out.println("3.Salir");
        System.out.println("---------------------------------------------------");
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

        // Creamos el menú controlando excpeciones
        int opcion = 0;
        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        añadirContacto();
                        break;
                    case 2:
                        mostrarContenido();
                        break;
                    case 3:
                        System.out.println("Saliendo.....");
                        break;
                    default:
                        System.out.println("Opción incorrecta, introducir una opcion de 1-3 ");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. debes introducir una opcion de 1-3");
                entrada.nextLine();
            } catch (Exception e) {
                System.out.println("Error .... vuelve a intentarlo");
                entrada.nextLine();
            }

        } while (opcion != 3);

    }

    }
    

