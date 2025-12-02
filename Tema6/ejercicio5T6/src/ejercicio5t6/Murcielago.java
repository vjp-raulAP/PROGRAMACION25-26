/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5t6;

/**
 *
 * @author alumno
 */
public class Murcielago extends Mamifero implements Volador{
    
    //atributos
    private int alturaVuelo;
    
    //contruct defecto
    
    public Murcielago(){
        super();
        this.alturaVuelo =0;
    }
    
    //Construct parametric
    
    public Murcielago(String nombre,String sexo,String color, int edad,int alturaVuelo){
        super(nombre,sexo,color,edad);
        this.alturaVuelo = alturaVuelo;
    }
    
    @Override
    
    public void obtenerMensajeVolador(){
        System.out.println("El murciélago es un animal volador");
    }
    
    @Override
    public void aumentarAlturaVuelo(){
        alturaVuelo = alturaVuelo+5;
        System.out.println("Aumenta la altura de vuelo del murciélago en 5 metros");
    }
    @Override
    public void bajarAlturaVuelo(){
        alturaVuelo = alturaVuelo-5;
        System.out.println("Aumenta la altura de vuelo del murciélago en 5 metros");
    }
    @Override
    public void mostrarAlturaVuelo(){
        System.out.println("El Muercielago esta volando a "+alturaVuelo+ " Metros");
    }
    
    
    
    
    
}
