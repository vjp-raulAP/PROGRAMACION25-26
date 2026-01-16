/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16t07;

import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Ejercicio16T07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Física"};
        //creo un array bidimensional 
        float [] [] notas = new float [6] [4];
        
        //bucle do-While para las opciones
        
        int opcion;
          int i , j;
        do {            
            System.out.println("OPCIONES ");
            System.out.println("1. Rellenar notas");
            System.out.println("2. Mostrar notas");
            System.out.println("3. Mejor alumno");
            System.out.println("4. Alumno con más suspensos");
            System.out.println("5. Asignatura más difícil");
            System.out.println("6. Salir");
            System.out.print("Elige opción: ");
            
            opcion  = entrada.nextInt();
            
            switch (opcion) {
                case 1:  //Opcion para relleno de notas  con un for anidado en otro. 
                     for (i = 0; i < alumnos.length; i++) {
                        System.out.println("Alumno: " + alumnos[i]);
                        for ( j = 0; j < asignaturas.length; j++) {
                            System.out.print("Nota de " + asignaturas[j] + ": ");
                            notas[i][j] = entrada.nextFloat();
                        }
                    }
                    break;
                case 2:
                    for ( i = 0; i < alumnos.length; i++) {
                        System.out.print( alumnos[i] + ": ");
                        for ( j = 0; j < asignaturas.length; j++) {
                            System.out.print( notas[i][j] + "  ");
                        }
                        System.out.println();
                    }
                    
                    break;
                case 3:
                    float mejorMedia = 0;
                    int mejorAlumno = 0;
                    float mediaNotas;
                  
                  

                    for ( i = 0; i < alumnos.length; i++) {
                        float sumaNotas = 0;
                          for ( j = 0; j < asignaturas.length; j++) {
                           sumaNotas+= notas[i][j];
                        }
                        mediaNotas = sumaNotas / asignaturas.length;

                        if (mediaNotas> mejorMedia) {
                            mejorMedia = mediaNotas;
                            mejorAlumno = i;
                        }
                    }

                    System.out.println("Mejor alumno: " + alumnos[mejorAlumno]);
                    break;
                case 4:
                    int maxSuspensos = 0;
                    int alumnoSuspensos = 0;

                    for ( i = 0; i < alumnos.length; i++) {
                        int suspensos = 0;
                        for (j = 0; j < asignaturas.length; j++) {
                            if (notas[i][j] < 5) {
                                suspensos++;
                            }
                        }
                        if (suspensos > maxSuspensos) {
                            maxSuspensos = suspensos;
                            alumnoSuspensos = i;
                        }
                    }
                     System.out.println("Alumno con más suspensos: " + alumnos[alumnoSuspensos]);
                    break;
                case 5:
                     float peorMedia = 10;
                     int asignaturaPeor = 0;
                       float sumaNotas = 0;
                 
                
                    for ( j = 0; j < asignaturas.length; j++) {
                        
                        for ( i = 0; i < alumnos.length; i++) {
                            sumaNotas += notas[i][j];
                        }
                      mediaNotas = sumaNotas / alumnos.length;

                        if (mediaNotas < peorMedia) {
                            peorMedia = mediaNotas;
                            asignaturaPeor = j;
                        }
                    }

                    System.out.println("Asignatura más difícil: " + asignaturas[asignaturaPeor]);
                    break;
                case 6:
                    System.out.println("Gracias. un saludo");
                    break;
                default:
                    System.out.println("Opcion incorrecta. Seleccion un opción del 1 al 6: ");
            }

        } while (opcion != 6);
                
    }
    
}
