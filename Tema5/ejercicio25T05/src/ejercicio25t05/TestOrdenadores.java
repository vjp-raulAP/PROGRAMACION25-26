/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25t05;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
public class TestOrdenadores {
    private static Scanner entrada = new Scanner(System.in);

    
    //método validar capacidad de disco.
    private static int leerDisco(String nombre){
        int disco;
        do {
            System.out.println("Introduce la capacidad de disco para"+nombre+" que sea multiplo de 5GB :");
            disco = entrada.nextInt();
        } while (disco % 5 != 0);
        return disco;
    }
    
    //método que resuelve el que el precio tiene que ser mayor a 0
    private static double leerPrecio(){
        double precio;
        do {            
            System.out.println("Introduce el precio que sea mayor que 0: ");
            precio = entrada.nextDouble();
        } while (precio <= 0);
        return precio;
    }
    
    //Metodo para resolver que el tamaño del monitor debe de ser mayor a 14"
    private static int leerMonitor(String nombrePC){
        int tamaño;
        do {
            System.out.println("Introduce el tamaño del monitor para "+nombrePC+". Debe ser mayor a 14 pulgadas: ");
            tamaño = entrada.nextInt();
        } while (tamaño <= 14);
        return tamaño;
    }
    
    private static String elegirProcesador(String nombrePC) {
      
      String procesador = ""; // variable para guardar el resultado
      int opcion = 0;

      System.out.println("Elige procesador para "+nombrePC+":");
      System.out.println("1. Intel i5");
      System.out.println("2. Intel i7");
      System.out.println("3. Intel i9");
      System.out.println("4. AMD Ryzen 5");
      System.out.println("5. AMD Ryzen 7");

      while (opcion < 1 || opcion > 5) {
          System.out.print("Número de opción: ");
          opcion = entrada.nextInt();
      }

      switch (opcion) {
          case 1:
              procesador = "Intel i5";
              break;
          case 2:
              procesador = "Intel i7";
              break;
          case 3:
              procesador = "Intel i9";
              break;
          case 4:
              procesador = "AMD Ryzen 5";
              break;
          case 5:
              procesador = "AMD Ryzen 7";
              break;
          default:
              procesador = "Intel i5"; // caso por defecto, aunque no debería ocurrir
              break;
      }

      return procesador;
  }
    
     private static void asignarServidor(Servidor servidor, String nombre) {
        System.out.println("--- Introduciendo datos para " + nombre + " ---");
        
        
        System.out.print("Introduce RAM: ");
        servidor.setRam(entrada.nextInt());
        servidor.setDisco(leerDisco(nombre));
        servidor.setProcesador(elegirProcesador(nombre));
        entrada.nextLine(); // limpiar buffer
        
        System.out.print("Introduce tarjeta gráfica: ");
        servidor.setGrafica(entrada.nextLine());
        servidor.setPrecio(leerPrecio());
        servidor.setTamanoMonitor(leerMonitor(nombre));
        System.out.print("Introduce modelo teclado: ");
        servidor.setTeclado(entrada.nextLine());
        System.out.print("Introduce modelo ratón: ");
        servidor.setRaton(entrada.nextLine());
    }
     
     private static void asignarPortatil(Portatil portatil,String nombre) {
         System.out.println("---Datos para "+nombre+"---");
        System.out.print("Introduce RAM: ");
        portatil.setRam(entrada.nextInt());
        portatil.setDisco(leerDisco(nombre));
        portatil.setProcesador(elegirProcesador(nombre));
        entrada.nextLine(); // limpiar buffer
        
        
        System.out.print("Introduce tarjeta gráfica: ");
        portatil.setGrafica(entrada.nextLine());
        portatil.setPrecio(leerPrecio());
        System.out.print("Introduce marca: ");
        portatil.setMarca(entrada.nextLine());
        entrada.nextLine();
        System.out.print("Introduce tamaño de pantalla: ");
        portatil.setTamañoPantalla(entrada.nextDouble());
        System.out.print("Introduce peso: ");
        portatil.setPeso(entrada.nextDouble());
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // Crear 2 servidores con constructor parametrizado
        Servidor servidor1 = new Servidor(32, 500, elegirProcesador("Servidor1"), "RTX 3090", 2500,
                                   leerMonitor("Servidor 1"), "Teclado Mecánico", "Raton Óptico");
        Servidor servidor2 = new Servidor(16, 1000, elegirProcesador("Servidor2"), "GTX 1660", 1800,
                                   leerMonitor("Servidor 2"), "Teclado Normal", "Raton Básico");

        // Crear 2 portátiles con constructor parametrizado
        Portatil portatil1 = new Portatil(16, 500, elegirProcesador("Portatil1"), "MX450", 1200,
                                   "Dell", 15.6, 1.8);
        Portatil portatil2 = new Portatil(8, 250, elegirProcesador("Portatil2"), "Intel UHD", 900,
                                   "HP", 14.0, 1.5);

        // Crear 1 servidor y 1 portátil con constructor por defecto
        Servidor servidor3 = new Servidor();
        asignarServidor(servidor3, "Servidor 3");

        Portatil portatil3 = new Portatil();
        asignarPortatil(portatil3,"Portátil 3");

        // Mostrar todos los objetos
        System.out.println("--- Servidores ---");
        System.out.println("Servidor 1: "+servidor1);
        System.out.println("Servidor 2: "+servidor2);
        System.out.println("Servidor 3: "+servidor3);

        System.out.println("--- Portátiles ---");
        System.out.println("Portatil 1:"+portatil1);
        System.out.println("Portatil 2:"+portatil1);
        System.out.println("Portatil 3:"+portatil1);
    }
    }
    

