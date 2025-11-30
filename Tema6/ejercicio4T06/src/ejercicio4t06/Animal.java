/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4t06;

/**
 *
 * @author alumno
 */
public abstract class Animal {
    
    //atributos
    private String nombre;
    private int edad;
    private int peso;
    //constructor defecto
    
    public Animal(){
        this.nombre="";
        this.edad = 0;
        this.peso = 0;
        
    }
    //const parametrizado
    public Animal(String nombre, int edad, int peso){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
                
    }
    
   //getter   y setter
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getPeso(){
        return peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    /*
     Método abstracto. 
     * Lo declaramos, pero no lo implementamos;
     * deben hacerlo las subclases (cada una a su manera),
     * 
    */
    public abstract void mostrarSonido();
    public abstract void mostrarAlimentacion();
    public abstract void mostrarHabitat();
    public abstract void mostrarNombreCientifico();
    
    // Método común para mostrar la información completa
 
   // Método para mostrar info
    public void mostrarInfo() {
        
        System.out.print("Nombre Científico: ");
        mostrarNombreCientifico();
        System.out.println("Nombre: " + nombre );
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.print("Sonido: " );
        mostrarSonido();
        System.out.print("Alimentación: ");
        mostrarAlimentacion();
        System.out.print("Hábitat: " );
        mostrarHabitat();
        System.out.println("------------------------------------------------");
    }
}
