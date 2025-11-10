/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class ProgramacionOrientadaAObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //1. Instancia un objeto del tipo que he creado
       
       //1.1 Con constructor parametrizado y estableciendo valores con setters
       
       
//       Coche miCoche = new Coche();
//        System.out.println(miCoche.toString());
//        miCoche.setEspejos(5);
//        System.out.println(miCoche.toString());
//       
//        miCoche.acelerar();
//        
//        System.out.println(miCoche.getEspejos());
//        
//        
//       //1.2 Con constructor parametrizado, inicializando los atributos.
//       //con los valores pasados por parámetro.
//       Coche tuCoche = new Coche("Michelin", "Bajo", 3);
//        System.out.println(tuCoche.toString());
//        //lo mismo que la linea  anterior, porque detecta el toString() automaticamente
//        System.out.println(tuCoche);
//        
//        System.out.println(tuCoche.getRuedas());
//    Bicicleta bicicleta = new Bicicleta();
//        System.out.println(bicicleta.ruedas);
//        System.out.println(bicicleta.getEstaPedaleando());
//        
//        
//        Bicicleta bicicleta2= new Bicicleta();
//        System.out.println("¿Cuantas bicis hemos creado?");
//        System.out.println(bicicleta.getNumBicicletas());
//        
         // Crear una bicicleta
        Bicicleta bici = new Bicicleta();
        System.out.println("¿Está pedaleando al principio? " + bici.getEstaPedaleando());

        // Llamar al método para empezar a pedalear
        empezarAPedalear(bici);

        System.out.println("¿Está pedaleando después? " + bici.getEstaPedaleando());
    }

    // Método estático, fuera del main
      public static void empezarAPedalear(Bicicleta bici) {
        bici.setEstaPedaleando(true);
        System.out.println("¡La bicicleta ha comenzado a pedalear!");
        }
      
}
