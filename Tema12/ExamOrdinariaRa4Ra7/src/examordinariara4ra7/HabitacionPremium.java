/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examordinariara4ra7;

/**
 *
 * @author alumno
 */
public class HabitacionPremium extends Habitacion implements Reservable{
    private int diasReserva;
    
    
    
    //constructor por defecto
    public HabitacionPremium() {
        super();
        this.diasReserva = 0;
    }

    
    //constructor parametrizado
    public HabitacionPremium(int diasReserva, int numero, float precio, String ubicacion) {
        super(numero, precio, ubicacion);
        this.diasReserva = diasReserva;
    }

    public  int getDiasReserva() {
        return diasReserva;
    }

    public void setDiasReserva(int diasReserva) {
        this.diasReserva = diasReserva;
    }

    public static int getNumHabitaciones() {
        return numHabitaciones;
    }

    public static void setNumHabitaciones(int numHabitaciones) {
        Habitacion.numHabitaciones = numHabitaciones;
    }

    @Override
    public void calcularPrecioReserva() {
        float precioTotal;
        precioTotal = HabitacionPremium.this.getPrecio()*HabitacionPremium.this.getDiasReserva(); 
                
        System.out.print("El precio total de la reserva es: "+precioTotal);
    }

    
    

    
}
