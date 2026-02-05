/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12t08;


import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio12T08 {

    public static void rellenarMuebles(Mueble[] muebles) {

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < muebles.length; i++) {
            System.out.println("Mueble " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = entrada.next();
            System.out.print("Precio: ");
            double precio = entrada.nextDouble();

            muebles[i] = new Mueble(nombre, precio);
            
            
            
        }
    }
    
    
    public static void mostrarMuebles(Mueble[] mueble){
        for (int i = 0; i < mueble.length; i++) {
            System.out.println(mueble[i]);
        }
    }

    
    public static void mostrarMueblesPrecio(Mueble[]mueble){
        System.out.println("Introducir un precio ");
        Scanner entrada = new Scanner(System.in);
        double precioMax = entrada.nextDouble();
        for (int i = 0; i < mueble.length; i++) {
            if(mueble[i].getPrecio()<= precioMax){
                System.out.println(mueble[i]);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Mueble[] muebles = new Mueble[4];
        int opcion;

        do {
            System.out.println("--- MENÚ ---");
            System.out.println("1. Rellenar muebles");
            System.out.println("2. Mostrar muebles");
            System.out.println("3. Mostrar muebles por precio");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    rellenarMuebles(muebles);
                    break;
                case 2:
                    mostrarMuebles(muebles);
                    break;
                case 3:
                    mostrarMueblesPrecio(muebles);
                    break;

            case 0:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 0);
    }
}

    

  
