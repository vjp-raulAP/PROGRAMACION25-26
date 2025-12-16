/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10t6consolidacion;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico frigorifico = new Electrodomestico(0.5f,0.24f, "A++");
        System.out.println(frigorifico);
        System.out.println("Consumo de Frigorifico =  "+frigorifico.calcularConsumo(5 )+" Kwh");
        System.out.println("Factura = "+frigorifico.calcularFactura(5)+" euros");
       
    }
    
    
    
   
}
