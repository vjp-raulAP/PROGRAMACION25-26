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
    //Getter y setter
    
    public String getGrupo(){
        return grupo;
    }
    public void setGrupo(String grupo){
        this.grupo = grupo;
    }
    
    @Override
    public String saludar(){
        return"Hola, soy el alumno " + getNombre() + " y estoy en el grupo " + grupo;
    }
}
