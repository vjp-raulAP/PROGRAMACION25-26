/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9t08;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Ejercicio9T08 {

    /**
     * @param args the command line arguments
     */
    
    public static void mostrarMenu(){
        System.out.println("======= MENU DE RELLENAR NOTAS ========");
        System.out.println("1. Rellenar las notas de alumnos");
        System.out.println("2. Mostrar las notas ");
        System.out.println("3. Mostrar Mejor alumno clase");
        System.out.println("4. Mostrar el alumno con más suspensos");
        System.out.println("5. Mostrar asignatura más difícil");
        System.out.println("6. Salir del programa");
        System.out.println("");
        System.out.println("Selecciona una opción:  ");
    }
    public static int pedirOpcion(){
        Scanner entrada = new Scanner(System.in);
        try{
            int opcion = entrada.nextInt();
            return opcion;
        }catch (InputMismatchException e){
            entrada.nextLine();
            System.out.println(e);
        }
        return 7;
    }
    
    public static void rellenarAlumnos(Alumno[] alumnos){
        String[] nombreAlumno = {"Pepe","Juan","Marta"};
        for (int i=0; i<alumnos.length; i++){
            alumnos[i] = new Alumno(nombreAlumno[i]);
            alumnos[i].rellenarNotas();
        }
    }
    public static void mostrarAlumnos(Alumno[] alumnos) {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
        }
    }

    
    public static void mejorAlumno(Alumno[] alumnos){
        Alumno mejorAlumno = new Alumno();
        float mejorMedia = 0.0f;
        
        for (int i = 0; i < alumnos.length; i++){
            if(alumnos[i].calcularMedia()> mejorMedia){
                mejorMedia= alumnos[i].calcularMedia();
                mejorAlumno= alumnos[i];
            }
        }
                System.out.println("El mejor alumno es " + mejorAlumno + " con una media de " + mejorMedia);
    }
    
   public static void asignaturaMasDificil(Alumno[] alumnos){
    float peorMedia = 10;
    int asignaturaPeor = 0;
    //recorre las asignaturas de un alumno
    for (int j = 0; j < alumnos[0].getNotas().length; j++){
        float suma = 0;
        
        // suma total de las notas de esa asignatura
        for (int i = 0; i < alumnos.length; i++){
            suma += alumnos[i].getNotas()[j].getNota();  // ← CORREGIDO
        }
        
        // Calcular media de esta asignatura
        float media = suma / alumnos.length;
        
        // Si es la peor media, guardarla
        if (media < peorMedia){
            peorMedia = media;
            asignaturaPeor = j;
        }
    }
    
    System.out.println("Asignatura más difícil: " + 
        alumnos[0].getNotas()[asignaturaPeor].getNombre() + 
        " (Media: " + peorMedia + ")");
}
    public static void alumnoSuspensos(Alumno[] alumnos){
    int maxSuspensos = 0;
    int alumnoIndex = 0;
    
    for (int i = 0; i < alumnos.length; i++){
        int suspensos = 0;
        
        // Contar suspensos de este alumno
        for (int j = 0; j < alumnos[i].getNotas().length; j++){
            if (alumnos[i].getNotas()[j].getNota() < 5){
                suspensos++;
            }
        }
        
        // Si tiene más suspensos que el máximo, actualizar
        if (suspensos > maxSuspensos){
            maxSuspensos = suspensos;
            alumnoIndex = i;
        }
    }
    
    System.out.println("Alumno con más suspensos: " + 
        alumnos[alumnoIndex].getNombre() + 
        " (" + maxSuspensos + " suspensos)");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Alumno [] alumnos = new Alumno[3];
        int opcion;
        do{
            mostrarMenu();
            opcion = pedirOpcion();
            switch(opcion){
                case 1: {
                    rellenarAlumnos(alumnos);
                    break;
                }
                case 2: {
                    mostrarAlumnos(alumnos);
                    break;
                }
                case 3: {
                    mejorAlumno(alumnos);
                    break;
                }
                case 4: {
                    alumnoSuspensos(alumnos);
                    break;
                }
                case 5: {
                    asignaturaMasDificil(alumnos);
                    break;
                }
                case 6: {
                    System.out.println("Gracias.Hasta pronto! ");
                    break;
                }
                default: 
                    System.out.println("Opción incorrecta. Por favor, seleccione una opción del 1 al 6");
            }
        }while (opcion != 6);
    
    }
    
}
