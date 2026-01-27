/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01t08;

/**
 *
 * @author alumno
 */
public class Asignatura {
    //atributos 
    
    private String asignatura;
    private float nota;
 //constructores
     public Asignatura(String programacion) {
        this.asignatura = "";
        this.nota = 0.0f;
    }
    
  
    public Asignatura(String asignatura, float nota) {
        this.asignatura = asignatura;
        this.nota = nota;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public float getNota() {
        return nota;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "asignaturas{" + "asignatura=" + asignatura + ", nota=" + nota + '}';
    }
    
    
    
    
}
