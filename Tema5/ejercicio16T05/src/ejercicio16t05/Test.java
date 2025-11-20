/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16t05;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;

public class Test {

    /*
       Metodo para pedir el nombre del usuario. Nos devuelve el  nombre de usuario.
    */
    public static String pedirNombreAlumno() {
        String nombreAlumno;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir el nombre del alumno: ");
        nombreAlumno = entrada.nextLine();
        return nombreAlumno;

    }
    
    
    public static int pedirNota(){
        int notaAlumno;
        //booleno usado para el bucle dowhile
        boolean correcto = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la nota: ");
        //bucle que pedira al alumno la nota mientras no se cumpla la condicion
        do {            
            notaAlumno = entrada.nextInt();
            if (notaAlumno >=0 && notaAlumno <=10) {
                correcto = true;
            }else{
                System.out.println("Error, las notas son de 0 a 10.");
                System.out.println("Vuelva a introducir la nota del Alumno");
            }
        } while (!correcto);
        return notaAlumno;
          
    }
    
    
    
    
    
     /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
       
        //Creo un Alumno 
        Alumno alumno1 = new Alumno(pedirNombreAlumno(),pedirNota());
        Alumno alumno2 = new Alumno(pedirNombreAlumno(),pedirNota());
        Alumno alumno3 = new Alumno(pedirNombreAlumno(),pedirNota());
        
        //imprimo los 3 alumnos
        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(alumno3);
    }

}
