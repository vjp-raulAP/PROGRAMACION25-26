/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6t08;

import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Empleado {
    
   
    //Atributos
    private String nombre;
    private float horasTrabajadas;
    private float tarifaHora;
    
    //contructor por defecto
    
    public Empleado() {
        this.nombre = "";
        this.horasTrabajadas = 0;
        this.tarifaHora = 0.0f;
    }
    
    
    //contructor parametrizado

    public Empleado(String nombre, int horasTrabajadas, float tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }
    
    // Método para pedir datos del empleado
    public void introducirDatos() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del empleado: ");
        this.nombre = entrada.nextLine();
        System.out.print("Horas trabajadas: ");
        this.horasTrabajadas = entrada.nextInt();
        System.out.print("Tarifa por hora: ");
        this.tarifaHora = entrada.nextFloat();
        entrada.nextLine(); 
    
    }   
    
    // Método para calcular sueldo bruto
    public void calcularSueldoBruto() {
        float sueldo;
        float horasExtra;
        if (horasTrabajadas <= 40) {
            sueldo = horasTrabajadas * tarifaHora;
        } else {
            horasExtra = horasTrabajadas - 40;
            sueldo = (float) ((40 * tarifaHora) + (horasExtra * tarifaHora * 1.5));
        }
        System.out.println(nombre + " ,Horas: " + horasTrabajadas + " ,Tarifa: " + tarifaHora +" ,Sueldo: " + sueldo);

    }
    
}
