/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */package exament12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ExamenT12 {

    public static void rellenarInventario(ArrayList<Producto> lista){
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
        
    
        
    }
    }
            
        
        //creamos te
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
