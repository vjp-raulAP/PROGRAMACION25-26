/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4t06;

/**
 *
 * @author rulaa
 */
public class Gato extends Felinos {
    
    public Gato (){
        super();
    }
    public Gato(String nombre,int edad, int peso){
        super(nombre,edad,peso);
    }
    
    @Override
    public void mostrarSonido(){
        System.out.println("Maullido");
    }
    @Override
    public void mostrarAlimentacion(){
        System.out.println("ratones");
    }
    @Override
    public void mostrarHabitat(){
        System.out.println("doméstico");
    }
    @Override
    public void mostrarNombreCientifico(){
        System.out.println("Felis silvestris catus");
    }
    
    @Override
    public String toString() {
        mostrarSonido();
        mostrarAlimentacion();
        mostrarHabitat();
        mostrarNombreCientifico();

         return "Nombre: " + getNombre() + ", Edad: " + getEdad()+", Peso: " + getPeso();
    }
}
