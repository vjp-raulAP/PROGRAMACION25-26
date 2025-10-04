/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15tiempo;

/**
 *
 * @author rulaa
 */
public class Tiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaro las variables
        int tiempoTotal= 1000;
        int horas,resto,minutos,segundos;
        
        //Realizo el cáculo
        
        horas = tiempoTotal / 3600;
        resto = tiempoTotal % 3600;
        minutos = resto/60;
        segundos = resto % 60;
        
        System.out.println(tiempoTotal + " segundos hacen un total de: "
                + horas + " horas, "
                + minutos + " minutos y "
                + segundos + " segundos.");
    }
    
}
