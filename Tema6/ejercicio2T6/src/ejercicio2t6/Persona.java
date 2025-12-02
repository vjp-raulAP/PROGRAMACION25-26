/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2t6;

/**
 *
 * @author alumno
 */
public abstract class Persona {
    //Atributos
    private String nombre;
    
    //constructor defecto
    public Persona(){
        this.nombre= "";
        
    }
    
    //const param
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    //Getter y setter
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     
    //metodos
    public abstract void saludar();
    
    
    @Override
    public String toString(){
        return "nombre" +nombre;
    }
    
}
