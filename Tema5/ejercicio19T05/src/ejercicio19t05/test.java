/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19t05;

/**
 *
 * @author rulaa
 */
import java.util.Scanner;
public class Test {

    //metodo introducir usuario
    public static  String pedirNombre(){
        String nombreEmp;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre del empleado: ");
        nombreEmp = entrada.nextLine();
        return nombreEmp;
    }
    
    public static int pedirNumeroHoras(){
        int numHorasEmp;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero de horas trabajadas: ");
        numHorasEmp = entrada.nextInt();
        return numHorasEmp;
    }
    
    public static float pedirTarifEmp(){
        float tarifaEmp;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la tarifa que se paga al empleado: ");
        tarifaEmp = entrada.nextFloat();
        return tarifaEmp;
        
    }
    
    //metodo para el calculo de las horas.
    
    public static float CalculoTarifaTotal(float tarifaEmp,int numHorasEmp){
        
        float tarifaHorasExtra = tarifaEmp * 1.5f;  //Calculo de la tarifa extra del empleado.
        float SalarioTotalEmp;
        int horasExtra;
        
        if(numHorasEmp > 40){
            horasExtra = numHorasEmp - 40;
            SalarioTotalEmp = (tarifaEmp * 40) + (horasExtra*tarifaHorasExtra);
            
        }else{
            SalarioTotalEmp = tarifaEmp * numHorasEmp; 
        }
        return SalarioTotalEmp;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Crear 3 objetos empleado
        Empleado empleado1 = new Empleado(pedirNombre(),pedirNumeroHoras(),pedirTarifEmp());
        Empleado empleado2 = new Empleado(pedirNombre(),pedirNumeroHoras(),pedirTarifEmp());
        Empleado empleado3 = new Empleado(pedirNombre(),pedirNumeroHoras(),pedirTarifEmp());
        
        
        //implimir el resultado de los 3
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
    }
    
}
