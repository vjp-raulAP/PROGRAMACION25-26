/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01t11;

/**
 *
 * @author rulaa
 */
public class Dia {
    private String nombreDia;
    private int temperatura;
    
    //constructor
    public Dia(String nombreDia, int temperatura){
        this.nombreDia=nombreDia;
        this.temperatura= temperatura;
    }
    
    public Dia ( ){
        this.nombreDia=" ";
        this.temperatura= 0;
    }
    
    //Getter y setter

    public String getNombreDia() {
        return nombreDia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Dia{" + "nombreDia=" + nombreDia + ", temperatura=" + temperatura + '}';
    }
    
}
