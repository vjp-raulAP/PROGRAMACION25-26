/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23t05;

/**
 *
 * @author rulaa
 */
public class TestVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1. Crea 2 objetos 1 por cada clase, usando const defecto y cons param
            //por param
        Taxi taxi1 = new Taxi("2636gxf","BMW",116,"EX12345");
        Autobus autobus1 = new Autobus("4562HFG","IVECO",200,54);
            //por defecto
        Taxi taxi2 = new Taxi();    
        Autobus autobus2 = new Autobus();
        
            //asignamos valores a taxi 
        taxi2.setMatricula("3456jdf");
        taxi2.setModelo("Mercedes");
        taxi2.setNumLicencia("EX69874");
        taxi2.setPotenciaCV(150);
          //asignamos valores a autobus
        
        autobus2.setMatricula("98765kln");
        autobus2.setModelo("Man");
        autobus2.setNumeroPlazas(50);
        autobus2.setPotenciaCV(150);
        
        //mostras la informacion 
        System.out.println("---Datos con parametros");
        System.out.println(taxi1);
        System.out.println(autobus1);
        System.out.println("---Datos por defecto ---");
        System.out.println(taxi2.mostrar());
        System.out.println(autobus2.mostrar());
    }
    
}