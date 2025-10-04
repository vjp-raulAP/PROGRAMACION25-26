/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo el scanner que lea los datos
        Scanner program = new Scanner(System.in);
        System.out.println("Por favor, introduzca la nota de Programación: ");
        float programacion =  program.nextFloat();
        
        Scanner lmsgi = new Scanner(System.in);
        System.out.println("Introduzca la nota de Lenguaje de Marcas: ");
        float lenguaje = lmsgi.nextFloat();
        
        Scanner baseD = new Scanner(System.in);
        System.out.println("Introduzca la nota de Base de Datos: ");
        float baseDatos = baseD.nextFloat();
        
        Scanner entDes = new Scanner(System.in);
        System.out.println("Introduzca la nota de Entorno de Desarrollo: ");
        float entDesarrollo = entDes.nextFloat();
        
        Scanner sisInf = new Scanner(System.in);
        System.out.println("Introduzca la nota de Sistemas informaticos: ");
        float sistemInf = sisInf.nextFloat();
        
        Scanner orientLab = new Scanner(System.in);
        System.out.println("Por ultimo, introduzca la nota de Orientación laboral: ");
        float orientacion = orientLab.nextFloat();
        
        //Calculamos la media de las asignaturas
        
        float mediaCurso = (programacion + lenguaje + baseDatos + entDesarrollo + sistemInf + orientacion)/6 ;
        
        System.out.println("Su nota media de curso es de: " + mediaCurso);
    }
    
}
