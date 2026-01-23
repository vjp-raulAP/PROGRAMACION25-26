/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorestaurante;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioRestaurante {
    public final static Scanner  ENTRADA = new Scanner(System.in);
    
    public final static String [] MENU = {"Menu1", "Menu2", "Menu3", "Menu4"};
   
  
    
    public static void mostrarMenu(){
        System.out.println("opciones");
        System.out.println("1.- Tomar Comanda");
        System.out.println("2.- Mostrar comanda");
        System.out.println("3.- Salir");
    }
    
    public static void  tomarComanda(){
        
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int opcion;
        do {      
           mostrarMenu();
           opcion = ENTRADA.nextInt();
           
            switch (opcion) {
                case 1:
                     
                    break;
                default:
                    throw new AssertionError();
            }
            
            
        } while (opcion !=3);
    }
    
}
