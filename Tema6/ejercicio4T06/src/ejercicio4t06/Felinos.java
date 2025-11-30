/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4t06;

/**
 *
 * @author alumno
 */
public class  Felinos extends Animal {
     public Felinos() {
        super();
    }

    public Felinos(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void mostrarSonido() {
        System.out.println("El felino emite un sonido característico de su especie.");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Los felinos suelen ser carnívoros.");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Los felinos viven en sabanas, selvas o áreas domésticas.");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Familia Felidae.");
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
