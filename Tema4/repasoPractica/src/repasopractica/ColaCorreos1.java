/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasopractica;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
public class ColaCorreos1 {

    /**
     * @param args the command line arguments
     */
    
    //2. CONSTANTES Y VARIABLES DE LA CLASE PRINCIPAL
    public static final char LETRA_INICIAL_MOST = 'A';
    public static final char LETRA_FINAL_MOST = 'C';
    
    //VARIABLES GLOBALES.
    public static int numeroCompra = 1;
    public static int numeroPedido = 1;
    
    //3.SUBPROGRAMAS
    
    /**
     * Metodo Muestra opciones del programa
     */
    public static void mostrarMenu(){
        System.out.println("----MENU CARNICERIA ---");
        System.out.println("1. Comprar");
        System.out.println("2. Recoger pedido");
        System.out.println("3. Salir");
       
    }
    /**
     * .
     * @return nos devuelve la opcion del usuario
     */
    public static int pedirOpcion(){
       Scanner entrada = new Scanner(System.in);
       int entradaUsuario = -1;
       System.out.println("introduzca una opcion");
        while (true) {
            try {
                
                entradaUsuario = entrada.nextInt();
                if (entradaUsuario >= 1 && entradaUsuario <= 3) {
                    return entradaUsuario;
                } else {
                    System.out.print("Opción no válida. Introduzca 1, 2 o 3: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debe introducir un número entero (1–3). Inténtelo de nuevo: ");
                entrada.nextLine(); // limpiar buffer
            }
        }
    }
    /**
     * metodo generar letra aleatoria con rango inicio - fin
     * @param inicio
     * @param fin
     * @return letra
     */
    public static char generarLetraAleatoria(char inicio,char fin){
        int rango;
        int numAleatorio;
        char letra;        
        rango = fin -inicio +1;
        numAleatorio = (int)Math.floor(Math.random()*rango );
        letra = (char)(inicio+numAleatorio);
        return letra;
        
    }
    
    public static void incrementarNumeroCompra(){
        numeroCompra ++;
    }
    
    public static void incrementarNumeroPedido(){
        numeroPedido ++;
    }
    
    public static void generarNumeroCompra(){
        System.out.println("Su numero de compra es: C-" +numeroCompra);
        incrementarNumeroCompra();
    }
    public static void generarNumeroPedido(){
        System.out.println("Su numero de pedido es: P-"+numeroPedido);
        incrementarNumeroPedido();
    }
    public static void main(String[] args) {
        char mostradorC;
        char mostradorP;
        int opcion;
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion){
                case 1:
                    System.out.println("-------OPCION 1-----------");
                    System.out.println("Has elegido comprar ");
                    generarNumeroCompra();
                    mostradorC = generarLetraAleatoria(LETRA_INICIAL_MOST,LETRA_FINAL_MOST);
                    System.out.println("Mostador asignado es: "+mostradorC);
                    break;
                case 2:
                    System.out.println("Hs elegido recoger pedido");
                    generarNumeroPedido();
                    mostradorP = generarLetraAleatoria(LETRA_INICIAL_MOST,LETRA_FINAL_MOST);
                    System.out.println("pedido asignado es el"+mostradorP);
                    
                    break;
                case 3:
                    System.out.println("Has elegido salir");
                    break;
                default:
                    System.out.println("La opcion introducida no es válida");
                    
                    
            }
        } while (opcion !=3);
        System.out.println("Gracias hasta pronto!!!");
    }
    
}
