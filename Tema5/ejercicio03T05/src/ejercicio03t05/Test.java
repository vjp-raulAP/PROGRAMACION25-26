/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03t05;

/**
 *
 * @author rulaa
 */
public class Test {
    
    public static void main(String[] args) {
        //creamos 2 objetos de la clase rueda.
        
        Rueda rueda1 = new Rueda();
         rueda1.setMaterial("Goma");
         rueda1.setPulgadas (19);
         
        Rueda rueda2 = new Rueda();
         rueda2.setMaterial("Caucho");
         rueda2.setPulgadas(17);
         
        System.out.println("Ruedas Creadas");
        System.out.println(rueda1);
        System.out.println(rueda2);
        
        //creamos 2 objetos coche.
        
        Coche coche1 = new Coche();
        coche1.setMarca("toyota");
        coche1.setModelo("auris");
        coche1.setRueda(rueda1);
        
        Coche coche2 = new Coche();
        coche2.setMarca("Bmw");
        coche2.setModelo("Serie 1");
        coche2.setRueda(rueda2);
        
        Coche coche3 = new Coche();
        coche2.setMarca("Mercedes");
        coche2.setModelo("Clase A");
        coche2.setRueda(rueda1);
        
        System.out.println("Coches creados:");
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);
                
    }
    
}
