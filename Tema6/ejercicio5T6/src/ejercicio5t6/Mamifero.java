/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5t6;

/**
 *
 * @author alumno
 */
public abstract class Mamifero {
    //Atributos
    private String nombre;
    private String sexo;
    private String color;
    private int edad;
    //constructor defecto
    public Mamifero(){
        this.nombre = "";
        this.sexo = "";
        this.color = "";
        this.edad= 0;
        
    }
       //constructor Parametrizado
       
       public Mamifero(String nombre, String sexo,String color, int edad){
           this.nombre = nombre;
           this.sexo = sexo;
           this.color=color;
           this.edad = edad;
       }
       
       //getter y setter
       
       public String getNombre(){
           return nombre;
       }
       
       public void setNombtre(String nombre){
           this.nombre = nombre;
       }
       
       public String getSexo(){
           return sexo;
           
       }
       public void setSexo(String sexo){
           this.sexo = sexo;
       }
       public String getColor(){
           return color;
       }
       public void setColor(String color){
           this.color = color;
       }
       
       public int edad(){
           return edad;
       }
       
       public void edad(int edad){
           this.edad = edad;
       }
       
       
    
       
}
