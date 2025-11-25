/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16t05;

/**
 *
 * @author rulaa
 */
public class Alumno {
    //1 Atributos
    private String nombre;
    private int nota;
    
    
    //2. constructor por defecto
    public Alumno(){
        this.nombre= "";
        this.nota = 0;
    }
    
    //2.1 constructor parametrizado
    public Alumno(String nombre,int nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //3. getter y setter
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getNota(){
        return nota;
    }
    public void setNota(int nota){
        this.nota = nota; 
    }
    
    //4 metodos
    /**
     * Metodo para clasificar la notas en funcion del valor
     * @return la nota clasificada
     */
    public String calcularCalificacion() {
        if (this.nota >= 0 && this.nota <= 4) {
            return "Suspenso";
        } else if (this.nota >= 5 && this.nota <= 6) {
            return "Bien";
        } else if (this.nota >= 7 && this.nota <= 8) {
            return "Notable";
        } else if (this.nota >= 9 && this.nota <= 10) {
            return "Sobresaliente";
        } else {
            return "Nota inválida"; // caso de nota fuera de rango
        }
    }
    
    
    
    
    //5 toString
    @Override
    public String toString(){
        return "Alumno; " + this.nombre+" , Nota : "+this.nota+ " , Calificación final: " +calcularCalificacion();
    }
    
}
