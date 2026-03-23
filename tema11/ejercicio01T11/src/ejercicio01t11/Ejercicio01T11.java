/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01t11;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Ejercicio01T11 {
    
  //metodo pedir int y String
    public static int pedirInt(String mensaje) {
         Scanner entrada = new Scanner(System.in);
    int num = 0;
    boolean correcto = false;

    while (!correcto) {
        try {
            System.out.print(mensaje);
            num = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer
            correcto = true;
        } catch (InputMismatchException e) {
            System.out.println("Error: debes introducir un número.");
            entrada.nextLine(); // limpiar buffer
        }
    }

    return num;
}

public static String pedirString(String mensaje) {
     Scanner entrada = new Scanner(System.in);
    System.out.print(mensaje);
    return entrada.nextLine();
}
    
    

    //Método para rellenar el HashMap
    public static void rellenarMes(Map<Integer, Dia> temperaturas) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 1; i <= 31; i++) {

            System.out.println("Día " + i);

            
           String nombre = pedirString("Nombre del día: ");
            int temp = pedirInt("Temperatura media: ");

            temperaturas.put(i, new Dia(nombre, temp));
        }
    }

    //Método para mostrar datos
    public static void mostrarDatos(Map<Integer, Dia> temperaturas) {

        System.out.println("\n--- TEMPERATURAS DEL MES ---");

        for (Integer dia : temperaturas.keySet()) {
            System.out.println("Día " + dia + ": " + temperaturas.get(dia));
        }
    }
    //Método para calcular temperatura media
    public static void calcularMedia(Map<Integer, Dia> temperaturas) {
         if (temperaturas.isEmpty()) {
        System.out.println("No hay datos de temperaturas.");
        return; // Salimos del método
      }

        int suma = 0;

        for (Dia d : temperaturas.values()) {
            suma += d.getTemperatura();
        }

        double media = (double) suma / temperaturas.size();

        System.out.println("\nTemperatura media del mes: " + media + "ºC");
    }
    
    
     //Método para obtener el día más caluroso
    public static void diaMasCaluroso(Map<Integer, Dia> temperaturas) {
     if (temperaturas.isEmpty()) {
    System.out.println("No hay datos de temperaturas.");
    return; // Salimos del método, no hay nada que calcular
}
      //tomo la temperatura primera como valor inicial
        Dia diaCaluroso = temperaturas.get(1);
        int maxTemp = diaCaluroso.getTemperatura();
        //recorro todos los dias para encontrar el maximo. con while
       
       int dia = 1; // empezamos desde el día 1
        Dia d = temperaturas.get(dia); // obtenemos el objeto Dia
    while (dia <= 31) { // recorremos hasta el día 31
       
        if (d != null) { // verificamos que exista
            if (d.getTemperatura() > maxTemp) {
                maxTemp = d.getTemperatura();
                diaCaluroso = d;
            }
        }
        dia++; // pasamos al siguiente día
    }

    System.out.println("Día más caluroso: " + diaCaluroso);
}

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // HashMap: clave = día  y como  valor = objeto Dia
        Map<Integer , Dia> temperaturas = new HashMap<>();
     
         rellenarMes(temperaturas);
        mostrarDatos(temperaturas);
        calcularMedia(temperaturas);
        diaMasCaluroso(temperaturas);
    }
}
