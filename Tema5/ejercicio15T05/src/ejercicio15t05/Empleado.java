/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15t05;

/**
 *
 * @author rulaa
 */
public class Empleado {
    //1. Atributos
    private String nombre;
    private int salario;
    private Direccion direccion; //defino el atributo objeto direccion perteneciente a la clase dirección
    
    //2. Costructor por defecto 
    public Empleado(){
        this.nombre = "";
        this.salario = 0;
        this.direccion = new Direccion();
    }
    
    //2.1 Constructor parametrizado
    public Empleado(String nombre, int salario,Direccion direccion){
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }
    
    //3 getter y setter
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getSalario(){
        return salario;
    }
    
    public void setSalario(int salario){
        this.salario = salario;
    }
    
    public Direccion getDireccion(){
        return direccion;
    }
    
    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }
    
    //4 metodos
    
    //5 toStrig
    
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+ " , Salario: "+this.salario+" euros , Direccion: "+this.direccion;
    }
}
