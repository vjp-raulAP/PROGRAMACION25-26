/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4t06;

/**
 *
 * @author alumno
 */
public class Canidos extends Animal {
    
    
    public Canidos() {
        super();
    }

    public Canidos(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void mostrarSonido() {
        System.out.println("Sonido general de un cánido.");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Los cánidos suelen ser carnívoros.");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Hábitat general de los cánidos.");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Familia Canidae.");
    }

<<<<<<< Updated upstream
   
=======
>>>>>>> Stashed changes
}


    