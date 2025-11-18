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
    
    //1 Atributos
    private String nombre;
    private int numeroHoras;
    private static int numeroDeCursos;
    
    // 2 contructores 
        //2.1   
        public Curso(){
            this.nombre="";
            this.numeroHoras = 0;
            this.numeroDeCursos = 0;
         }
          //2.2 constructor parametrizado
        public Curso(String nombre, int numeroHoras,int numeroDeCusos){
            this.nombre = nombre;
            this.numeroHoras = numeroHoras;
            this.numeroDeCursos =numeroDeCursos; 
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
          public void setNumeroHoras(){
              this.numeroHoras = numeroHoras;
          }
          
          public int getNumeroDeCursos(){
              return this.numeroDeCursos;
                 
          }
          public void setNumeroDeCursos(int numeroDeCursos){
              this.numeroDeCursos = numeroDeCursos;
          }
          //4 métodos
          
          
          //to String
          
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
