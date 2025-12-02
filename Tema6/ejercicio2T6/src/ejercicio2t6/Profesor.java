/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2t6;

/**
 *
 * @author alumno
 */
public class Profesor extends Persona {
    //Atributo
    private String especialidad;
    
    //contructor defecto
    
    public Profesor(){
        super();
        this.especialidad = "";
    }
    public Profesor(String nombre, String especialidad){
        super(nombre);
        this.especialidad = especialidad;
    }
    
    //getter y setter
    public String getEspecialidad(){
        return especialidad;
    }
    
   public void setEspecialidad(String especialidad){
       this.especialidad = especialidad;
   }
   
   //metodos
           
    @Override
    public void saludar() {
        
    }
    
    
    
    
}
