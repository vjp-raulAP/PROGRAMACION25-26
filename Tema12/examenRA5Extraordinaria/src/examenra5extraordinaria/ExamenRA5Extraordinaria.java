/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra5extraordinaria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.imageio.stream.FileCacheImageInputStream;

/**
 *
 * @author alumno
 */
public class ExamenRA5Extraordinaria {
  public static final   String FICHERO ="prestamos.txt" ;
  
  public static Agenda pedircontacto(){
      Scanner entrada = new Scanner (System.in);
      System.out.println("Nombre: ");
      String nombre = entrada.nextLine();
      System.out.println("Título del libro: ");
      String titulo =entrada.nextLine();
      System.out.println("Autor del libro: ");
      String autor = entrada.nextLine();
      System.out.println("Días de ptrestamo: ");
      int diasPrestamo = entrada.nextInt();
     entrada.nextLine(); //limpiar el buffer.
       Agenda contacto = new Agenda(nombre,titulo,autor,diasPrestamo);
       return contacto;
  }
  //metodo para rellenar los contactos pasando por parametros el Arraylist
    public static void rellenarContacto(ArrayList<Agenda> contactos) {
        Scanner entrada = new Scanner(System.in);
        String seguir;
        do {
            Agenda contacto = pedircontacto();
            contactos.add(contacto);
            System.out.println(" Usuario añadido");
            System.out.println("¿desea añadir mas usuario? (s/n)");
            seguir = entrada.nextLine();

        } while (seguir.equalsIgnoreCase("s"));
    }
  
    public static void registrarPrestamo(ArrayList<Agenda> contactos) throws FileNotFoundException, IOException {
        System.out.println("Registrando fichero");
        try (FileWriter fw = new FileWriter(FICHERO, true); PrintWriter pw = new PrintWriter(fw)) {
            for (Agenda contacto : contactos) {
                pw.println(contacto.getNombre() + ";" + contacto.getTitulo() + ";" + contacto.getAutor() + ";" + contacto.getDiasPrestados());

            }

        }
        System.out.println("Registrando Prestamos en el Fichero..");
    }
    
    public static void mostrarPrestamos(ArrayList<Agenda> contactos) throws FileNotFoundException, IOException {
        System.out.println("Leyendo archivo");
      
        try (FileReader fr = new FileReader(FICHERO); BufferedReader br = new BufferedReader(fr)) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                for (int i = 0; i < datos.length; i++) {
                    datos[i] = datos[i].trim();
                }
                if (datos.length == 4) {
                    System.out.println("Nombre" + datos[0]);
                    System.out.println("Título del libro" + datos[1]);
                    System.out.println("Autor del libro" + datos[2]);
                    System.out.println("Días de Prestamo" + datos[3]);

                }

            }
        }

    }
    
    public static void menu(){
        System.out.println("--------- MENU -----");
        System.out.println("1. Pedir datos de prestamo");
        System.out.println("2. Registrar datos de Prestamo");
        System.out.println("3. Mostrar Prestamos");
        System.out.println("4. Salir");
        System.out.print("Elige una opcion: ");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      ArrayList<Agenda>contactos = new ArrayList<>();
      int opcion;
        do {   
            menu();
            opcion= entrada.nextInt();
            entrada.nextLine();
            try {
                switch (opcion) {
                    case 1:
                        rellenarContacto(contactos);
                        break;
                    case 2:
                         registrarPrestamo(contactos);
                        break;
                    case 3:
                         mostrarPrestamos(contactos);
                        break;
                    case 4:
                        System.out.println("Saliendo .....");
                        break;
                    
                    default:
                        System.out.println("Error. elija una de las 3 opciones");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. debe elejir una opcion entre el 1 y el 3");
            }catch (FileNotFoundException e) {
                System.out.println("Error. fichero no encontrado");
            }catch (IOException e) {
                System.out.println("Error en la entrada y salida de fichero");
            }
        } while (opcion != 4);
      
              
    }
    
}
