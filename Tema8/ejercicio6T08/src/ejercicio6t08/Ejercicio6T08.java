/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6t08;

import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Ejercicio6T08 {
// Método para pedir el número de empleados
    public static int pedirNumeroEmpleados() {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos empleados quiere introducir? ");
        int numEmpleados = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        return numEmpleados;
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

        int numEmpleados = pedirNumeroEmpleados();

        // Crear array de empleados
        Empleado[] empleados = new Empleado[numEmpleados];

        // Pedir datos de cada empleado
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Empleado " + (i + 1));
            empleados[i] = new Empleado();
            empleados[i].introducirDatos();
        }
        
         // Mostrar sueldos
        System.out.println("--- SUELDOS BRUTOS ---");
        for (int i = 0; i < empleados.length; i++) {
            empleados[i].calcularSueldoBruto();
        }
    }
    
}
