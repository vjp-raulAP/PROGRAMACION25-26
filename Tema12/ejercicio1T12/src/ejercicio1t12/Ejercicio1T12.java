/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1t12;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1T12 {

   
    public final String FICHERO = "agenda.txt";
    
    //1. Metodo pedir nombre 
    public static String pedirNombre() throws InputMismatchException{
        System.out.println("Nombre:  ");
        Scanner entrada = new Scanner (System.in);
        return entrada.nextLine();
    }
    
    //2. Metodo pedir edad 
    public static int pedirEdad()  throws InputMismatchException{
        System.out.println("Edad: ");
        Scanner entrada = new Scanner( System.in);
        return entrada.nextInt();
        
    }
    //3. Metodo pedir numeroMovil 
    public static int pedirMovil()  throws InputMismatchException{
        System.out.println("Movil: ");
        Scanner entrada = new Scanner( System.in);
        return entrada.nextInt();
        
    }
    
    
    
    //Metodo Añadir a la lista 
    public static String pedirSeguir() throws  InputMismatchException {
        System.out.println("¿Quieres añadir otro nombre? (s/n):");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    
    public static void mostrarMenu(){
        System.out.println("-------MENU AGENDA -------");
        System.out.println("1.- Añadir contactos a la agenda.");
        System.out.println("2.- Visualizar listas de contactos.");
        System.out.println("3.-Eliminar contactos de la lista");
        System.out.println("4.- Mostrar todos los contactos ordenados");
        System.out.println("5.- Salir del programa");
    }


    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lNombres = new ArrayList<>();
  
    }
    
}
