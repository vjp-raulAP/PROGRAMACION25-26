/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author rulaa
 */
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
     
        Curso curso1 = new Curso();
         curso1.setNombre("Programación");
         curso1.setNumeroHoras(120);
        Curso curso2 = new Curso();
         curso2.setNombre("Base de datos");
         curso2.setNumeroHoras(80);
        Curso curso3 = new Curso();
         curso3.setNombre("Inglés");
         curso3.setNumeroHoras(20);
        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        // Mostrar número de cursos creados
        System.out.println("Cursos creados: " + Curso.verNumeroCursos());
        Curso.sumarCursos(4);
         System.out.println("Cursos creados: " + Curso.verNumeroCursos());
    }
}
