/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15t05;

/**
 *
 * @author rulaa
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // el ejercicio pide crear 3 direcciones
        Direccion dir1 = new Direccion("Avenida de la Vera",12,3,"Plasencia");
        Direccion dir2 = new Direccion("Calle trujillo",11,3,"Plasencia");
        Direccion dir3 = new Direccion("Plaza del Convento",4,2,"Coria");
        
        
        
        //el ejercicio pide crear 3 empleados
        
        Empleado emp1 = new Empleado("Raul Albalat ",1500,dir1);
        Empleado emp2 = new Empleado("Raul Albalat ",1500,dir2);
        Empleado emp3 = new Empleado("Raul Albalat ",1500,dir3);
        
        
        //imprimo resultados de los 3 empleados.
        System.out.println("EMPLEADO 1: "+emp1);
        System.out.println("EMPLEADO 2: "+emp2);
        System.out.println("EMPLEADO 3: "+emp3);
        
    }
    
}
