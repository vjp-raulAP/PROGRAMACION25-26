/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25t05;

/**
 *
 * @author rulaa
 */
import java.util.Scanner; //creo el objeto Scanner

public class TestOrdenadores {

    private static Scanner entrada = new Scanner(System.in);

    private static int leerRam(String nombrePC) {
        System.out.print("Introduce RAM (GB) para " + nombrePC + ": ");
        int ram = entrada.nextInt();
        return ram;
    }

    //método validar capacidad de disco.
    private static int leerDisco(String nombre) {
        int disco;
        do {

            System.out.println("Introduce la capacidad de disco para" + nombre + " que sea multiplo de 5GB :");
            disco = entrada.nextInt();
            if (disco % 5 != 0) {
                System.out.println(" ERROR: " + disco + " NO es múltiplo de 5.");
                System.out.println(" Inténtalo de nuevo. Ejemplos válidos: 5, 10, 15, 20, 25...");
            }
        } while (disco % 5 != 0);
        return disco;
    }

    //método que resuelve el que el precio tiene que ser mayor a 0
    private static double leerPrecio(String nombrePC) {
        double precio;
        do {
            System.out.println("Introduce el precio para " + nombrePC + " que sea mayor que 0: ");
            precio = entrada.nextDouble();
            if (precio <= 0) {
                System.out.println(" ERROR: El precio no puede ser " + precio + ".");
                System.out.println("   Debe ser un valor mayor que 0. Intenta nuevamente.");
            }
        } while (precio <= 0);
        return precio;
    }

    //metodo para introducir la tarjeta gráfica
    private static String leerGrafica(String nombrePC) {
        entrada.nextLine(); // limpiar buffer antes de leer línea
        System.out.print("Introduce tarjeta gráfica para " + nombrePC + ": ");
        return entrada.nextLine();
    }

    //Metodo para resolver que el tamaño del monitor debe de ser mayor a 14"
    private static int leerMonitor(String nombrePC) {
        int monitor;
        do {
            System.out.println("Introduce el tamaño del monitor para " + nombrePC + ". Debe ser mayor a 14 pulgadas: ");
            monitor = entrada.nextInt();
            if (monitor <= 14) {
                System.out.println("❌ ERROR: " + monitor + " pulgadas no es válido.");
                System.out.println("   El monitor debe ser mayor a 14 pulgadas. Inténtalo de nuevo.");
            }
        } while (monitor <= 14);
        return monitor;
    }

    //Metodo para intorducir el tio de teclado
    private static String leerTeclado(String nombrePC) {
        entrada.nextLine();
        System.out.print("Introduce modelo de teclado para " + nombrePC + ": ");
        return entrada.nextLine();
    }

    //Metodo para introducir el tipo de ratón
    private static String leerRaton(String nombrePC) {
        System.out.print("Introduce modelo de ratón para " + nombrePC + ": ");
        return entrada.nextLine();
    }

    //Metodo leer Marca 
    private static String leerMarca(String nombrePC) {
        entrada.nextLine();
        System.out.print("Introduce marca para " + nombrePC + ": ");
        return entrada.nextLine();
    }
    //Metodo para introducir tamaño pantalla

    private static double leerPantalla(String nombrePC) {
        System.out.print("Introduce tamaño de pantalla (pulgadas) para " + nombrePC + ": ");
        return entrada.nextDouble();
    }

    //Método para introducir el peso
    private static double leerPeso(String nombrePC) {
        System.out.print("Introduce peso (kg) para " + nombrePC + ": ");
        return entrada.nextDouble();
    }

    private static String elegirProcesador(String nombrePC) {

        String procesador = ""; // variable para guardar el resultado
        int opcion = 0;

        System.out.println("Elige procesador para " + nombrePC + ":");
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

    //METODOS PARA  CREAR OBJETOS QUE PIDE EL EJERCICIO
    //Metodo para crear servidor  por parametros
    private static Servidor crearServidorParametros(String nombre) {
        System.out.println("-> Datos para " + nombre);
        int ram = leerRam(nombre);
        int disco = leerDisco(nombre);
        String proc = elegirProcesador(nombre);
        String grafica = leerGrafica(nombre);
        double precio = leerPrecio(nombre);
        int tam = leerMonitor(nombre);
        String teclado = leerTeclado(nombre);
        String raton = leerRaton(nombre);

        return new Servidor(ram, disco, proc, grafica, precio, tam, teclado, raton);
    }

    //Metodo crear Portatil por parametros
    private static Portatil crearPortatilParametros(String nombre) {
        System.out.println("-> Datos para " + nombre);
        int ram = leerRam(nombre);
        int disco = leerDisco(nombre);
        String proc = elegirProcesador(nombre);
        String grafica = leerGrafica(nombre);
        double precio = leerPrecio(nombre);
        String marca = leerMarca(nombre);
        double tamPant = leerPantalla(nombre);
        double peso = leerPeso(nombre);

        return new Portatil(ram, disco, proc, grafica, precio, marca, tamPant, peso);
    }

    //Metodo crear servidor por defecto
    private static Servidor crearServidorDefecto(String nombre) {
        System.out.println("--- Creando " + nombre + " (constructor por defecto + setters) ---");
        Servidor servidor = new Servidor();
        servidor.setRam(leerRam(nombre));
        servidor.setDisco(leerDisco(nombre));
        servidor.setProcesador(elegirProcesador(nombre));
        servidor.setGrafica(leerGrafica(nombre));
        servidor.setPrecio(leerPrecio(nombre));
        servidor.setTamanoMonitor(leerMonitor(nombre));
        servidor.setTeclado(leerTeclado(nombre));
        servidor.setRaton(leerRaton(nombre));
        return servidor;
    }
    //Método crear portatil usando contruct por defecto

    private static Portatil crearPortatilDefecto(String nombre) {
        System.out.println("--- Creando " + nombre + " (constructor por defecto + setters) ---");
        Portatil portatil = new Portatil();
        portatil.setRam(leerRam(nombre));
        portatil.setDisco(leerDisco(nombre));
        portatil.setProcesador(elegirProcesador(nombre));
        portatil.setGrafica(leerGrafica(nombre));
        portatil.setPrecio(leerPrecio(nombre));
        portatil.setMarca(leerMarca(nombre));
        portatil.setTamanoPantalla(leerPantalla(nombre));
        portatil.setPeso(leerPeso(nombre));
        return portatil;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear 2 servidores con constructor parametrizado
        System.out.println("--- CREACIÓN DE 2 SERVIDORES (mediante constructor con parámetros) ---");
        Servidor servidor1 = crearServidorParametros("Servidor 1");
        Servidor servidor2 = crearServidorParametros("Servidor 2");
        // Crear 2 portátiles con constructor parametrizado
        System.out.println("--- CREACIÓN DE 2 PORTÁTILES (mediante constructor con parámetros) ---");
        Portatil portatil1 = crearPortatilParametros("Portátil 1");
        Portatil portatil2 = crearPortatilParametros("Portátil 2");

        // Crear 1 servidor y 1 portátil con constructor por defecto
        System.out.println("--- CREACIÓN DE 1 SERVIDOR Y 1 PORTÁTIL (constructor por defecto + setters) ---");
        Servidor servidor3 = crearServidorDefecto("Servidor 3");
        Portatil portatil3 = crearPortatilDefecto("Portátil 3");

        // Mostrar todos los objetos
        System.out.println("--- Servidores ---");
        System.out.println("Servidor 1: " + servidor1);
        System.out.println("Servidor 2: " + servidor2);
        System.out.println("Servidor 3: " + servidor3);

        System.out.println("--- Portátiles ---");
        System.out.println("Portatil 1:" + portatil1);
        System.out.println("Portatil 2:" + portatil2);
        System.out.println("Portatil 3:" + portatil3);
    }
}
