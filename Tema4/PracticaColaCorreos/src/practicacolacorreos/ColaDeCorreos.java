/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicacolacorreos;

/**
 *
 * @author alumno
 */
//importo de java util tanto scanner para pedir al usuario la opcion, InputMismatchException para control de excepciones y Randompara el numero aleatorio
import java.util.Scanner;  
import java.util.InputMismatchException;
import java.util.Random;
public class ColaDeCorreos {

    /**
     * @param args the command line arguments
     */
    
    
     //2. CONSTANTES Y VARIABLES DE LA CLASE PRINCIPAL
    //Creo las constantes que usare en el ejercicio
    public static final char LETRA_INICIAL_MESAS= 'A';
    public static final char LETRA_FINAL_MESAS = 'F';
    
    //VARIABLES GLOBALES 
    public static int numeroEnvio = 1;
    public static int numeroRecogida = 1;
    
    //3. SUBPROGRAMAS
    
    public static void mostrarMenu(){
        System.out.println("------MENU CORREOS ----");
        System.out.println("1. Enviar");
        System.out.println("2.Recoger");
        System.out.println("3. Salir");

    } 
    /**
     * Metodo pedir una opcion al usuario con objete Scanner y control de excepciones
     * @return  nos retorna la opcion del usuario
     */

    public static int pedirOpcion (){
        //Declaro variables al principio
    Scanner entrada = new Scanner (System.in);
    int entradaUsuario = -1; //declaro la variable de tipo entero donde guardare 
        System.out.println("introduce una opción");
        //creo un bucle while que me repita la entrada mientras no se elija una de las 3 opciones.
        while(true){  
            //creo un control de escepciones en la entrada de usuario para que solo pueda ser numérico
             try {
                
                entradaUsuario = entrada.nextInt();
                if (entradaUsuario >= 1 && entradaUsuario <= 3) { //condicional para que retorne true en el que entrada usuario sea  > 1  y < 3;
                    return entradaUsuario;
                } else {
                    System.out.print("Opción no válida. Introduzca 1, 2 o 3: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debe introducir un número entre (1–3).  P0r favor Inténtelo de nuevo: ");
                entrada.nextLine(); // limpiar buffer
            }
        }
    }
      
    /**
     * Método para generar una letra aleatoria,`pasando un rango de letras sobre el que se generará
     * @param letraInicio
     * @param letraFinal
     * @return La letra aleatoria
     */
    public static  char generarLetraAleatoria(char letraInicio, char letraFinal){
        //Declaro las variables que usaré al principio. 
        int rango; //guardo el rango
        int numAleatorio; //guardo el numero aleatorio
        char letra; //almaceno resultado que sera una letra 
        rango = letraFinal -letraInicio +1;  //obtengo el rango que va a ser un int.
        numAleatorio = (int)Math.floor(Math.random()*rango); //Calculo el número aleatorio con la random y redondeo la la baja con Math.floor.
        letra = (char)(letraInicio + numAleatorio); 
         return letra;       
        
    }
    
    /**
     * Metodo usado para incrementar en 1 el número de envio.
     */
    public static void incrementarNumeroEnvio(){
        numeroEnvio  ++;  //incrementa numero de envio que inicialmente estaba a 1
    }
    /**
     * Método usado para incrementa en 1 el número de recogida
     */
    public static void incrementarNumeroRecogida(){
        numeroRecogida  ++;  //incremeta Numero de recogida que inicialmente estaba a 1
    }
    
    /**
     * Método usado para mostrar un número  de Envio de tipo (E-numeroEnvio)
     */
    public static void generarNumeroEsperaEnvio(){
        System.out.println("Su número de envio es: E-"+numeroEnvio);
        incrementarNumeroEnvio(); //llamo al método para que me incremente el número de envio en 1
    }
    /**
     * Método usado para mostrar un número de Recogida de tipo (R-numeroRecogida)
     */
    public static void generarNumeroEsperaRecogida(){
        System.out.println("Su número de recogida es: R-"+numeroRecogida);
        incrementarNumeroRecogida(); //lamo al método para que me incremente el número de recogida en 1
    }
    
    
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
       //Declaro las variables que usaré  al principio
       char mesaEnvio;
       char mesaRecogida;
       int opcion;
       //creo un bucle do -while el cual me mostrará las opciones mientras no pulse la opción 3.
        do {
            mostrarMenu();
            opcion = pedirOpcion(); //muestra el menú opciones.
            switch(opcion){ //creo un switch para cada opción y dentro de cada opción llamará a los métodos correspondientes.
                case 1:   //opción primera de enviar
                    System.out.println("----------------------------");
                    System.out.println(" OPCION 1 ");
                    System.out.println("Has elegido Enviar. ");
                    generarNumeroEsperaEnvio();
                    mesaEnvio = generarLetraAleatoria(LETRA_INICIAL_MESAS,LETRA_FINAL_MESAS);
                    System.out.println("La mesa de envío asignada es: "+mesaEnvio);
                    break;
                    
                    
                case 2:   //opción segunda para recoger 
                    System.out.println("----------------------------");
                    System.out.println(" OPCION 2 ");
                    System.out.println("Has elegido Recoger. ");
                    generarNumeroEsperaRecogida();
                    mesaRecogida = generarLetraAleatoria(LETRA_INICIAL_MESAS,LETRA_FINAL_MESAS);
                    System.out.println("La mesa de Recogida asignada es: "+mesaRecogida);
                    break;
                    
                case 3:  //opción tercera para salir
                    System.out.println("-----------------------------");
                    System.out.println("Has elegido salir.");
                    break;
                default: //cuando se elija opciones que no sean las 3 posibles.
                    System.out.println("La opción introducida no es válida. Por favor  introduzca una opción del 1 al 3");
            }
            
        } while (opcion !=3); //el bucle se repetirá mientras opción sea diferente de 3
        
        System.out.println("Gracias Hasta pronto"); //mensaje final 
       
    }
    
}
