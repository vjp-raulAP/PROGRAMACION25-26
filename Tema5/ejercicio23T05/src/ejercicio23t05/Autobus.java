/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23t05;

/**
 *
 * @author rulaa
 */
public class Autobus extends Vehiculo {
    //1. atributos
    private int numeroPlazas;
    //2. constructor
    public Autobus(){
        super();
        this.numeroPlazas = 0;
    }
    //constr param
    public Autobus(String matricula,String modelo,int potenciaCV, int numeroPlazas){
        super(matricula, modelo, potenciaCV);
        this.numeroPlazas = numeroPlazas;
        
    }
    
    //getter y setter
    public int getNumeroPlazas(){
        return numeroPlazas;
    }
    public void setNumeroPlazas(int numeroPlazas){
        this.numeroPlazas=numeroPlazas;
    }
    //metodos    
    public String mostrar(){
        return "Autobus: " +informacion()+", Plazas: "+numeroPlazas;
    }
    
    //toString
    
    @Override
    public String toString(){
    return "Autobus: "+ informacion()+", Plazas: "+numeroPlazas;
    }
}
