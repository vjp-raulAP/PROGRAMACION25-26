/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examt12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Examt12 {

    
    public static void mostrarMenu(){
        System.out.println("----menu ----");
        System.out.println("1.- rellenar inventario");
        System.out.println("2.- guardar datos del inventario");
        System.out.println("3.- leer y procesar inventario"); 
        System.out.println("4.- salir");
        System.out.println("Elije una opción: ");
    }

    public static void rellenarInventario(ArrayList<Producto> lista)throws InputMismatchException{
        Scanner entrada = new Scanner (System.in);
        System.out.println("ingrese el nombre: ");
        String nombreArticulo = entrada.nextLine();
        System.out.println("Ingrese la cantidad: ");
        int cantidadArticulo = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el precio: ");
        double precioArticulo=entrada.nextDouble();
        
        lista.add(new Producto  (nombreArticulo,cantidadArticulo,precioArticulo));
        System.out.println("Articulo ingresado.");
        
    }
    
    
    public static void guardarEnFichero(ArrayList<Producto>lista)throws FileNotFoundException,IOException{
        
        
    try ( FileWriter  fr= new FileWriter("inventario.txt",true);
            PrintWriter pw = new PrintWriter(fr)){ 
        
           pw.println(lista.toString());
           
        
    }
        
    
    
    
        
        
    }
    
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //creo el array list
        ArrayList <Producto>lista =new ArrayList();
        //creo varible de opciones.
        int opcion = 0;
        do {      
            try{
                
                  mostrarMenu();
                opcion = entrada.nextInt();
                
                switch (opcion) {
                    case 1:
                        rellenarInventario(lista);
                        break;
                    case 2:
                         guardarEnFichero(lista);
                        break;
                    case 3:
                        //leer y procesar
                        break;
                    case 4:
                        System.out.println("Saliendo....");
                        break;
                    default:
                        System.out.println("Error. elija una opcion entre 1 y 4");
                }
            }catch (InputMismatchException e){
                System.out.println("introduzca una opcion numerica del 1 al 4");  
            }catch (FileNotFoundException e){
                System.out.println("Error fichero no encontrado");
            }catch (IOException e){
                System.out.println("Error desconocido"+e.getMessage());
                entrada.nextLine();
            }
                
        
        
            
        } while (opcion != 4);
        
    }
}   

