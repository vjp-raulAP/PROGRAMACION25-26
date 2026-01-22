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
    
      static Scanner ENTRADA = new Scanner(System.in);

    static String[] ALUMNOS = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
    static String[] ASIGNATURAS = {"Lengua", "Mates", "Historia", "Física"};
    static float[][] NOTAS = new float[6][4];

    public static void main(String[] args) {

        int opcion;

        do {
            mostrarMenu();
            opcion = ENTRADA.nextInt();

            switch (opcion) {
                case 1:
                    rellenarNotas();
                    break;
                case 2:
                    mostrarNotas();
                    break;
                case 3:
                    mejorAlumno();
                    break;
                case 4:
                    alumnoConMasSuspensos();
                    break;
                case 5:
                    asignaturaMasDificil();
                    break;
                case 6:
                    System.out.println("Gracias. Un saludo");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        } while (opcion != 6);
    }

    // ---------- MÉTODOS ----------

    static void mostrarMenu() {
        System.out.println("\nOPCIONES");
        System.out.println("1. Rellenar notas");
        System.out.println("2. Mostrar notas");
        System.out.println("3. Mejor alumno");
        System.out.println("4. Alumno con más suspensos");
        System.out.println("5. Asignatura más difícil");
        System.out.println("6. Salir");
        System.out.print("Elige opción: ");
    }

    static void rellenarNotas() {
        for (int i = 0; i < ALUMNOS.length; i++) {
            System.out.println("Alumno: " + ALUMNOS[i]);
            for (int j = 0; j < ASIGNATURAS.length; j++) {
                System.out.print("Nota de " + ASIGNATURAS[j] + ": ");
                NOTAS[i][j] = ENTRADA.nextFloat();
            }
        }
    }

    static void mostrarNotas() {
        //asignaturas
        for (int i = 0; i < ASIGNATURAS.length; i++) {
            System.out.print(ASIGNATURAS[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < ALUMNOS.length; i++) {
            System.out.print(ALUMNOS[i] + ": ");
            for (int j = 0; j < ASIGNATURAS.length; j++) {
                System.out.print(NOTAS[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void mejorAlumno() {
        float mejorMedia = 0;
        int mejorAlumno = 0;

        for (int i = 0; i < ALUMNOS.length; i++) {
            float suma = 0;
            for (int j = 0; j < ASIGNATURAS.length; j++) {
                suma += NOTAS[i][j];
            }
            float media = suma / ASIGNATURAS.length;

            if (media > mejorMedia) {
                mejorMedia = media;
                mejorAlumno = i;
            }
        }

        System.out.println("Mejor alumno: " + ALUMNOS[mejorAlumno]);
    }

    static void alumnoConMasSuspensos() {
        int maxSuspensos = 0;
        int alumnoSuspensos = 0;

        for (int i = 0; i < ALUMNOS.length; i++) {
            int suspensos = 0;
            for (int j = 0; j < ASIGNATURAS.length; j++) {
                if (NOTAS[i][j] < 5) {
                    suspensos++;
                }
            }
            if (suspensos > maxSuspensos) {
                maxSuspensos = suspensos;
                alumnoSuspensos = i;
            }
        }

        System.out.println("Alumno con más suspensos: " + ALUMNOS[alumnoSuspensos]);
    }

    static void asignaturaMasDificil() {
        float peorMedia = 10;
        int asignaturaPeor = 0;

        for (int j = 0; j < ASIGNATURAS.length; j++) {
            float suma = 0;
            for (int i = 0; i < ALUMNOS.length; i++) {
                suma += NOTAS[i][j];
            }
            float media = suma / ALUMNOS.length;

            if (media < peorMedia) {
                peorMedia = media;
                asignaturaPeor = j;
            }
        }

        System.out.println("Asignatura más difícil: " + ASIGNATURAS[asignaturaPeor]);
    }
}