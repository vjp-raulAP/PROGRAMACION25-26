/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25t05;

/**
 *
 * @author rulaa
 */
public class Portatil extends Ordenador {
    
    //1, atributos
    private String marca;
    private double tamanoPantalla;
    private double peso;
    
    //constructores
    public Portatil(){
        super();
        this.marca = "";
        this.tamanoPantalla = 0;
        this.peso = 0;
        
    }
    
    public Portatil(int ram, int disco, String procesador, String grafica, double precio,
                    String marca, double tamanoPantalla, double peso) {
        super(ram, disco, procesador, grafica, precio);
        this.marca = marca;
        this.tamanoPantalla = tamanoPantalla;
        this.peso = peso;
    }
    
      // Getters y setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public double getTamanoPantalla() { 
        return tamanoPantalla; 
    }
    public void setTamanoPantalla(double tamañoPantalla) {
        this.tamanoPantalla = tamañoPantalla; 
    }

    public double getPeso() { 
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    

    @Override
    public String toString() {
        return "Portátil (" + super.toString() + ", Marca: " + marca + ", Pantalla: " +
                tamanoPantalla + " pulgadas, Peso: " + peso + " kg)";
    }
    
}
