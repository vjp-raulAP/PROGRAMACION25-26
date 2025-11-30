/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4t06;

/**
 *
 * @author alumno
 */
public class Lobo extends Canidos {
    public Lobo(){
        super();
    }
    
    public Lobo (String nombre,int edad, int peso){
      super(nombre,edad,peso);  
    }
    
    @Override
    public void mostrarSonido(){
        System.out.println("Aullido");
    }
    @Override
    public void mostrarAlimentacion(){
        System.out.println("Carnivoro");
    }
    @Override
    public void mostrarHabitat(){
        System.out.println("Bosque");
    }
    @Override
    public void mostrarNombreCientifico(){
        System.out.println("Canis lupus");
    }
   
}
