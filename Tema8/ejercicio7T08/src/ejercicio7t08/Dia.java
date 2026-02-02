/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7t08;

/**
 *
 * @author alumno
 */
public class Dia {
    //atributos
    private String nombreDia;
    private float temperatura;
    
    //constructor parametrizado

    public Dia(String nombreDia, int temperatura) {
        this.nombreDia = nombreDia;
        this.temperatura = temperatura;
    }
    
    //constructor por defecto
    
    public Dia(){
        this.nombreDia = "";
        this.temperatura = 0.0f;
    }

    
    //getter y setter
    public String getNombreDia() {
        return nombreDia;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    
    //metodos
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return "Dia{" + "nombreDia=" + nombreDia + ", temperatura=" + temperatura + '}';
    }
    
    
    
}
