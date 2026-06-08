/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examordinariara4ra7;

/**
 *
 * @author alumno
 */
public  class Habitacion {
    private int numero;
    private float precio;
    private String ubicacion;
     static int numHabitaciones = 0;

    //constructor parametrizado
    
    public Habitacion(int numero, float precio, String ubicacion) {
        this.numero = numero;
        this.precio = precio;
        this.ubicacion = ubicacion;
         
    }
    
    //constructor por defecto
      public Habitacion() {
        this.numero = 0;
        this.precio = 0;
        this.ubicacion = "";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
      //metodo para aumentar el numero de habitaciones en 1 unidad 
    public static int aumentarNumHabitaciones(){
       numHabitaciones++;
         return numHabitaciones;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numero=" + numero + ", precio=" + precio + ", ubicacion=" + ubicacion + '}';
    }
    
  
       
    
}


