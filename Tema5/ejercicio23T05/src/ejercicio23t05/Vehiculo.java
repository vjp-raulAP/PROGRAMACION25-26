/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23t05;

/**
 *
 * @author rulaa
 */
public class Vehiculo {
    //1. atributos 
    private String matricula;
    private String modelo;
    private int potenciaCV;
    
    //2. contructor por defecto
    public Vehiculo(){
        this.matricula="";
        this.modelo = "";
        this.potenciaCV = 0;
    }
    //2.1 constructor parametros
    public Vehiculo(String matricula,String modelo, int potenciaCV){
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
    }
    
    //Getter y setter
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int  getPotenciaCV(){
        return potenciaCV;
    }
    public void setPotenciaCV(int potenciaCV){
        this.potenciaCV = potenciaCV;
    }
    //Metodos
    //crea un método que permita mostrar la información del objeto cuando sea procedente
    public String informacion(){
        return "Matricula: "+this.matricula+", Modelo: "+this.modelo+", Potencia: "+this.potenciaCV+"cv";
    }
    //toString
    @Override
    public String toString(){
        return informacion();
    }
}
