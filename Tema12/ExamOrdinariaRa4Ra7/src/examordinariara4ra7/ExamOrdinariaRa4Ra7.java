/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examordinariara4ra7;

/**
 *
 * @author alumno
 */
public class ExamOrdinariaRa4Ra7 {

    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ubicacion ubicacion1 = new Ubicacion("Jerte","Plasencia","España");
        Ubicacion ubicacion2 = new Ubicacion("Cánovas","Cáceres","España");
        
        //crea el objeto Habitacion pasandole los datos por parametros  y la ubicacion 1
        Habitacion habitacion1 = new Habitacion(2,43,ubicacion1.toString());
        Habitacion.aumentarNumHabitaciones();
         //muestro  la informacion de la Habitación
        System.out.println("La habitacion  1 contiene los siguientes datos: "+habitacion1.toString());
        
        //Creo un objeto Habitacion premium
        
        HabitacionPremium habitacion2 = new HabitacionPremium(3,8,85,ubicacion2.toString());
         Habitacion.aumentarNumHabitaciones();
             //muestro  la informacion de la Habitación2
        System.out.println("La habitacion  2 contiene los siguientes datos: "+habitacion2.toString());
        habitacion2.calcularPrecioReserva();
        //muestro total de las habitaciones
        
        System.out.println("El total de las habitaciones es "+Habitacion.aumentarNumHabitaciones());
        
    }
    
}
