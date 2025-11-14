/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rulaa
 */
 // creo la clase coche con lso atributos marca, modelo, color,velocidad, motor encendido.
public class coche {
    // Atributos privados
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido ;

    // Constructor por defecto
    public coche() {
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.velocidad = 0;
    }
    // constructor parametrizado (sobrecarga de métodos y autorreferencia this)
    public coche(String marca, String modelo, String color, int velocidad, boolean motorEncendido) {
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.velocidad = 0;         // Inicializamos a 0 por defecto
    this.motorEncendido = false; // Inicializamos apagado
    }
    
    
    //Metemos los setter para CAMBIAR los valores
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }
    public void setMotorEncendido(boolean motorEncendido){
        this.motorEncendido = motorEncendido;
    }
    
    //metemos los getter para LEER los valores.
     public String getMarca(){
       return this.marca;
    }
    public String getModelo(){
       return this.modelo;
    }
    public String getColor(){
        return this.color;
    }
    public int getVelocidad(){
        return this.velocidad;
    }
    public boolean getMotorEncendido(){
        return this.motorEncendido;
    }
    
    // Métodos para establecer valores
    public void establecerMarca(String marca) { this.marca = marca; }
    public void establecerModelo(String modelo) { this.modelo = modelo; }
    public void establecerColor(String color) { this.color = color; }

    // OTROS METODOS
    public void arrancarCoche() {
        motorEncendido = true;
        velocidad = 10;
    }

    public void apagarCoche() {
        motorEncendido = false;
        velocidad = 0;
    }

    public void acelerarCoche() {
        velocidad += 20;
    }

    public void frenarCoche() {
        velocidad -= 6;
        if (velocidad < 0) velocidad = 0;
    }

    // Mostrar estado del coche
    public void obtenerEstado() {
        System.out.println("----- Estado del coche -----");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Motor encendido: " + motorEncendido);
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("----------------------------");
    }
    //Creo to string
    @Override
    public String toString() {
        return "Coche [Marca: " + this.marca 
                + ", Modelo: " + this.modelo 
                + ", Color: " + this.color 
                + ", Motor encendido: " + this.motorEncendido 
                + ", Velocidad: " + this.velocidad + " km/h]";
    }
}