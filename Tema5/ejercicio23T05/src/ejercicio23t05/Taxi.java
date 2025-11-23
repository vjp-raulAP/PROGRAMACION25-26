/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23t05;

/**
 *
 * @author rulaa
 */
public class Taxi extends Vehiculo {
    
    //atributos
    private String numLicencia;
    //contructor defecto
    public Taxi(){
        super();  //llamo al constructor vacio de vehiculo
        this.numLicencia="";
    }
    //constructor param
    public Taxi (String matricula, String modelo,int potenciaCV, String numLicencia){
        super(matricula,modelo,potenciaCV);
        this.numLicencia = numLicencia;
    }
    //getter y setter
    public String getNumLicencia(){
        return numLicencia;
    }
    
    public void setNumLicencia(String numLicencia){
        this.numLicencia=numLicencia;
    }
    
    //metodo para mostrar informacion
    public String mostrar(){
        return "Taxi " +informacion()+", Licencia: "+numLicencia ;
    }
    
    //toString
    @Override
    public String toString(){
        return mostrar();
    }
}
