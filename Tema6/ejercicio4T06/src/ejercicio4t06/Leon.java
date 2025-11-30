/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4t06;

/**
 *
 * @author rulaa
 */
public class Leon extends Felinos {
    public Leon (){
        super();
    }
    public Leon(String nombre, int edad, int peso){
        super(nombre, edad, peso);
    }
    
     @Override
    public void mostrarSonido(){
        System.out.println("Rugido");
    }
    @Override
    public void mostrarAlimentacion(){
        System.out.println("Carnívora");
    }
    @Override
    public void mostrarHabitat(){
        System.out.println("Sabana");
    }
    @Override
    public void mostrarNombreCientifico(){
        System.out.println("Panthera leo");
    }
    
   
    
    
}
