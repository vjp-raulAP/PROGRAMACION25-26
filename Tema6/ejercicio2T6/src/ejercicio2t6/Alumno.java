/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2t6;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona {
    //Atributos
    private String grupo;
    //Constructores
    public Alumno(){
        super();
        this.grupo = "";
    }
    
    public  Alumno(String nombre,String grupo){
        super(nombre);
        this.grupo = grupo;
    }
}
