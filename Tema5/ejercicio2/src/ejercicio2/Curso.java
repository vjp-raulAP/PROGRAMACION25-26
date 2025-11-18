/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
public class Curso {
    
    //1 Atributos privados. 
    private String nombre;
    private int numeroHoras;
    //Creo el atributo estático qu epertenece a la clase.
    private static int numeroDeCursos = 0;
    
    // 2 contructores 
        //2.1   
        public Curso(){
            this.nombre="";
            this.numeroHoras = 0;
            incrementarNumeroCurso();
         }
          //2.2 constructor parametrizado
        public Curso(String nombre, int numeroHoras){
            this.nombre = nombre;
            this.numeroHoras = numeroHoras;
           incrementarNumeroCurso();
        }
        
      //3 Getter y setter
          public String getNombre(){
              return this.nombre;
          }
          public void setNombre(String nombre){
              this.nombre= nombre;
          }
          
          public int getNumeroHoras(){
              return this.numeroHoras;
          }
          public void setNumeroHoras(int numeroHoras){
              this.numeroHoras = numeroHoras;
          }
          
        
          //4 métodos statico para para sumar cursos y ver numero de cursos
          //metodo privado solo debe usarse dentro de la clase para crear instancias.
          
          private static void incrementarNumeroCurso(){
              numeroDeCursos ++;
          }
             
          public static void sumarCursos(int numCursos){
              if(numCursos > 0){
                  numeroDeCursos = numeroDeCursos + numCursos;
              }
          }
           public static int verNumeroCursos() {
           return numeroDeCursos;
         }
          
          //to String
             @Override
            public String toString() {
                return "Curso con nombre = " + this.nombre + " Numero de horas = " + this.numeroHoras + " }";
            }
    
    
    
    
}
