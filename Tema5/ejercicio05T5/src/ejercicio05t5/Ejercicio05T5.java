/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05t5;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
public class Ejercicio05T5 {

    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //creo las asignaturas usando el contructor
       Scanner entrada = new Scanner(System.in);
       
       Asignatura programacion = new Asignatura();
       Asignatura lenguajeMarcas = new Asignatura();
       Asignatura basesDeDatos = new Asignatura();
       Asignatura entornoDesarrollo = new Asignatura();
       Asignatura sistemasInformaticos = new Asignatura();
       Asignatura fOL= new Asignatura();
       
       programacion.setNombre("Programación");
       lenguajeMarcas.setNombre("lenguaje de Marcas");
       basesDeDatos.setNombre("Bases de datos");
       entornoDesarrollo.setNombre("Entorno de Desarrollo");
       sistemasInformaticos.setNombre("Sistemas Informaticos");
       fOL.setNombre("FOL");
       
       //pedir notas la usuario
        System.out.println("Por favor, introduzca la nota de "+ programacion.getNombre()+" :");
        programacion.setNota(entrada.nextDouble());
        
        System.out.println("Por favor, introduzca la nota de "+ lenguajeMarcas.getNombre()+" :");
        lenguajeMarcas.setNota(entrada.nextDouble());
        
        System.out.println("Por favor, introduzca la nota de "+ basesDeDatos.getNombre()+" :");
        basesDeDatos.setNota(entrada.nextDouble());
        
        System.out.println("Por favor, introduzca la nota de "+ entornoDesarrollo.getNombre()+" :");
        entornoDesarrollo.setNota(entrada.nextDouble());
        
        System.out.println("Por favor, introduzca la nota de "+ sistemasInformaticos.getNombre()+" :");
        sistemasInformaticos.setNota(entrada.nextDouble());
        
        System.out.println("Por favor, introduzca la nota de "+ fOL.getNombre()+" :");
        fOL.setNota(entrada.nextDouble());
        
        //Calcular Nota media
        
    
        double media = Asignatura.CalculoNotaMedia(programacion.getNota(),lenguajeMarcas.getNota(),basesDeDatos.getNota(), entornoDesarrollo.getNota(),sistemasInformaticos.getNota(), fOL.getNota());
        //mostrar resultado
        System.out.println("Su nota media del curso es "+media);
        
    }
    
    
}
