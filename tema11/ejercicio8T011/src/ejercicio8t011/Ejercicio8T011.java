/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8t011;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Ejercicio8T011 {
    
    //metodo para pedir String
    public static String pedirString(String texto) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(texto);
        return entrada.nextLine();
    }
    
    //metodo para pedir Double
     public static double pedirDouble(String texto) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(texto);
        return entrada.nextDouble();
    }
/**
 *  opcion 1 metodo para insertar un nombre de ciudad y sede  con ingresos hasta que usuario lo pare (S/N)
 * @param mCiudades 
 */
     public static void insertarCiudad(Map<String, Ciudad> mCiudades) {
        String nombreCiudad = pedirString("Nombre de la ciudad: ");
        Ciudad ciudad = new Ciudad(nombreCiudad);

        String opcion;
        do {
            String nombreSede = pedirString("Nombre de la sede: ");
            double ingresos = pedirDouble("Ingresos: ");
            
            //agragamos Sede con ingresos al objeto Ciudad usando el metodo "agregarSede"
            ciudad.agregarSede(new Sede(nombreSede, ingresos));
            //preguntamos para ver si salimos del do/while
            opcion = pedirString("¿Otra sede? (s/n): ");
        } while (opcion.equalsIgnoreCase("s"));
        //añadimos la  ciudad al mapa con la clave nombre de ciudad y el valor seria el objeto Ciudad
        mCiudades.put(nombreCiudad, ciudad);
        
        System.out.println("Ciudad añadida."); //feedback para informar que se ha añadido la ciudad
    }
     
     /**
      * opcion 2  Método para mostrar ciudades
      * recorremos el mapa con  for each
      */
       public static void mostrarCiudades(Map<String, Ciudad> mCiudades) {
        if (!mCiudades.isEmpty()) {  //comprobamos si no esta vacio. 
            for (String nombre : mCiudades.keySet()) {  //recorremos el mapa con la KeySet().
                System.out.println(mCiudades.get(nombre));
            }
        } else {
            System.out.println("No hay ciudades.");
        }
       }
       
     /**
      * Opcion 3 Metodo 
      * @param mCiudades 
      */
     public static void sedesSobreMedia(Map<String, Ciudad> mCiudades) {
    double suma = 0;
    int contador = 0;

    // Calculamos la suma de ingresos y el número de sedes
    for (String nombre : mCiudades.keySet()) {
        for (Sede s : mCiudades.get(nombre).getSedes()) {
            suma += s.getIngresosAnuales();
            contador++;
        }
    }

    if (contador == 0) { // Si no hay sedes
        System.out.println("No hay sedes.");
        return;
    }

    double media = suma / contador; // Calculamos la media
    System.out.println("Media de ingresos: " + media);

    // Mostramos las sedes que superan la media
    for (String nombre : mCiudades.keySet()) {
        for (Sede s : mCiudades.get(nombre).getSedes()) {
            if (s.getIngresosAnuales() > media) {
                System.out.println(s.getNombreSede());
            }
        }
    }
}
     
   /**
    * Metodo para buscar sede, pasando por parametros el nombre de la sede y las ciudades.
    * @param nombreSede
    * @param mCiudades
    * @return 
    */
public static boolean buscarSede(String nombreSede, Map<String, Ciudad> mCiudades) {
    // Iterador sobre las ciudades
    Iterator<Ciudad> itCiudades = mCiudades.values().iterator();

    while (itCiudades.hasNext()) {
        Ciudad ciudad = itCiudades.next();

        // Iterador sobre las sedes de la ciudad
        Iterator<Sede> itSedes = ciudad.getSedes().iterator();
        while (itSedes.hasNext()) {
            Sede s = itSedes.next();

            // Comprobamos si el nombre de la sede coincide
            if (s.getNombreSede().equalsIgnoreCase(nombreSede)) {
                System.out.println("Sede '" + nombreSede + "' encontrada en la ciudad: " + ciudad.getNombre());
                return true; // Se encontró la sede
            }
        }
    }

    // Si llegamos aquí, no se encontró la sede
    System.out.println("No se encontró la sede: '" + nombreSede + "'.");
    return false;
}
     
/**
 * Metodo para agregar Sede pasandole el mapa
 * @param mCiudades 
 */
public static void agregarSede(Map<String, Ciudad> mCiudades) {

        String nombreCiudad = pedirString("Ciudad: ");

        if (mCiudades.containsKey(nombreCiudad)) {

            String nombreSede = pedirString("Sede: ");
            double ingresos = pedirDouble("Ingresos: ");

            mCiudades.get(nombreCiudad).agregarSede(new Sede(nombreSede, ingresos));

            System.out.println("Sede añadida.");

        } else {
            System.out.println("Ciudad no encontrada.");
        }
    }


//No se como hacer .mostrarSedesOrdenadas



    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Map<String, Ciudad> mCiudades = new HashMap<>();
          int opcion = 0;

        do {
            try {
                Scanner entrada = new Scanner(System.in);

                System.out.println("--- MENU ---");
                System.out.println("1. Añadir ciudad");
                System.out.println("2. Mostrar ciudades");
                System.out.println("3. Sedes sobre la media");
                System.out.println("4. Buscar sede");
                System.out.println("5. Añadir sede");
                System.out.println("6. Mostrar sedes ordenadas");
                System.out.println("7. Salir");

                System.out.print("Opción: ");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1 -> insertarCiudad(mCiudades);
                    case 2 -> mostrarCiudades(mCiudades);
                    case 3 -> sedesSobreMedia(mCiudades);
                    case 4 -> buscarSede(pedirString("¿Cual es el nombre de la Sede?: "), mCiudades);
                    case 5 -> agregarSede(mCiudades);
                    //case 6 -> mostrarSedesOrdenadas;
                    case 7 -> System.out.println("Fin del programa");
                    default -> System.out.println("Opción no válida, elige una opción entre 1-7");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un número entre 1 y 7");
            }

        } while (opcion != 7);
    }
    }
    

