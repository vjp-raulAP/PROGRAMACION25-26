/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionfiguras;

/**
 *
 * @author alumno
 */
public class Figura {
     //Atributos
    private float valor;
    private String nombre;
    private String coleccion;

     //Constructores
    public Figura() {
        valor = 0f;
        nombre= "";
        coleccion = "";
    }
    public Figura(float valor, String nombre, String coleccion) {
        this.valor = valor;
        this.nombre = nombre;
        this.coleccion = coleccion;
    }
 
    
    //getter
    public float getValor() {
        return valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColeccion() {
        return coleccion;
    }
    
    // setter

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }
//tostring
    @Override
    public String toString() {
        return "El valor de la figura es " + valor + ",  el nombre de la figura  es  " + nombre + " de la coleccion = " + coleccion ;
        
    }
    
    
    
    
    
}
