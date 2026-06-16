/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra6extraordinaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ExamenRA6Extraordinaria {
    
    //metodo en el que Añadimos el nombre de la plataforma, así como la cantidad de videojuegos que como máximo serán 3
    public static void anadirPlataforma(HashMap<String, Plataforma> plataformas) {
        Scanner entrada = new Scanner(System.in);
        int cantidad;
        System.out.println("Nombre de la plataforma; ");
        String nombre = entrada.nextLine();
        do {
            System.out.println("¿Cuantos videojuegos quiere añadir ?");
            cantidad = entrada.nextInt();
            if (cantidad < 1 || cantidad > 3) {
                System.out.println("El número máximo de videojuegos es de 3");
            }
        } while (cantidad < 1 || cantidad > 3);
        Plataforma plataforma = new Plataforma(nombre);
        plataforma.rellenarVideojuegos(cantidad);
        plataformas.put(nombre, plataforma);

        System.out.println("Plataforma creada.");

    }

 //Metodod que nos muestra las plataformas así como los videojuegos que contienen pasando por parametros el Hashmap
    public static void mostrarPlataforma(HashMap<String, Plataforma> plataformas) {
        //Primero comprobamos  si la hay alguna plataforma  creada.
        if (plataformas.isEmpty()) {
            System.out.println("No hay plataformas creadas.");
            return;
        }
        //utilizo un iterador para recorrer el hashmap
        Iterator<Map.Entry<String, Plataforma>> it = plataformas.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Plataforma> entrada = it.next();
            Plataforma plataforma = entrada.getValue();

            System.out.println("===============");
            System.out.println(" PLATAFORMA " + plataforma.getNombre());
            System.out.println("===============");
            plataforma.MostrarVideojuegos();

        }
    }
    
 //Metodo que ordena los videojuegos por el numero de jugadores de manera desdendente(to Compare) aplicado en Videojuego
 
    public static void ordenarVideojuegos(HashMap<String, Plataforma> plataformas) {
        Scanner entrada = new Scanner(System.in);

        //creamos el Arraylist  auxiliar donde vamos a guardar los datos
        ArrayList<Videojuego> lista = new ArrayList<>();

        //recorremos la plataforma para obtener todos los videojuegos
        for (Plataforma plataforma : plataformas.values()) {
            for (Videojuego videojuego : plataforma.getVideojuego()) {
                //si el videojuego existe lo añadimos al arrayList
                if (videojuego != null) {
                    lista.add(videojuego);
                }
            }
        }
     //utilizamos compare to para ordenar la lista de videojuegos.
     Collections.sort(lista);
     //recorremos la lista e imprimimos los videojuegos ordenados
     for (Videojuego videojuego : lista) {
         System.out.println(videojuego);
     }

 }

    
   
    
    //Método para pedir el menú
    public static void menu(){
        System.out.println("------MENÚ--------");
        System.out.println("1.- Añadir Plataforma");
        System.out.println("2.- Mostrar Plataforma");
        System.out.println("3.- Mostrar videojuegos (orden descendente)");
        System.out.println("4.- Salir");
        System.out.print("Selecione una opción: ");
    }
    
     /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner entrada =  new Scanner (System.in);
        //Creo el HashMap plataformas 
        HashMap<String,Plataforma> plataformas = new HashMap<>();
        int opcion = -1 ;   //variable opción para el menú
        do {   
            try {
            menu();
            opcion = entrada.nextInt();
            entrada.nextLine(); //limpiabuffer
            switch (opcion) {
                case 1:
                    anadirPlataforma(plataformas);
                    break;
                case 2:
                    mostrarPlataforma(plataformas);
                    break;
                case 3:
                    ordenarVideojuegos(plataformas);
                    break;
                case 4:
                    System.out.println("Saliendo .....");
                    break;
                default:
                    System.out.println("Error. debe de elegir una opcion del 1 al 4");
            }
             } catch (InputMismatchException e) {
                 System.out.println("Error. debe introducir una opción numérica del 1 al 4");
                 entrada.nextLine();//limpia buffer
            }
        } while (opcion != 4);
            
        
        
    }
    
}
