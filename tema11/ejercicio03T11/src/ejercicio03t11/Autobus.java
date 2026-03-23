/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03t11;

import java.util.HashMap;

/**
 *
 * @author rulaa
 */
public class Autobus {
     //Atributos
     private String matricula;                              
    private HashMap<String, String> conductores;

          //Constructores
    public Autobus() {                                
        
        this.matricula = "";
        this.conductores = new HashMap<>(); 
    }

    public Autobus(String matricula, HashMap<String, String> conductores) {
        this.matricula = matricula;
        this.conductores = new HashMap<>();
    }
              //Getters y setters
    public String getMatricula() {            
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public HashMap<String, String> getConductores() {
        return conductores;
    }

    public void setConductores(HashMap<String, String> conductores) {
        this.conductores = conductores;
    }
    
    /**
     * Métodopara  añadir conductores
     * 
     * @param dni
     * @param nombre 
     */
    public void meterConductor(String dni, String nombre){
        this.conductores.put(dni, nombre);
    }
    
    /**
     * Método para comprobar  número de conductores
     * 
     * @return cantidad de conductores
     */
    public int numConductores() {
        return this.conductores.size();
    }

    @Override
    public String toString() {
        return "Autobus{" + "matricula=" + matricula + ", conductores=" + conductores + '}';
    }
    
}
