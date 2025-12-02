/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5t6;

/**
 *
 * @author alumno
 */
public class Ornitorrinco extends Mamifero implements Oviparo {
    //atributos
    private int numHuevos;
    
    //construc defecto
    public Ornitorrinco(){
        super();
        this.numHuevos = 0;
        
    }
    //cosntruc parametric
    public Ornitorrinco(String nombre,String sexo,String color, int edad, int numHuevos){
        super(nombre,sexo,color,edad);
        this.numHuevos = numHuevos;
    }
    
    
    @Override
    public void obtenerMensajeOviparo(){
        System.out.println("“El ornitorrinco es un mamífero ovíparo");
    }
    
    @Override
    public void  ponerHuevo(){
        numHuevos ++;
        System.out.println("El ornitorrinco a puesto "+numHuevos +" huevos");
    }
    
    @Override 
    public void incubarHuevo(){
        numHuevos --;
        System.out.println("El ornitorrinco incuba"+numHuevos  +" huevos");
    }
    @Override
    public void mostrarNumHuevos(){
        System.out.println("El  ornitorrinco tiene " + numHuevos + " huevos");
    }
    
    
    
}
    

