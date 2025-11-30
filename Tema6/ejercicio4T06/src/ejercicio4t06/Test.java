/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4t06;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---objetos de subclases con Instanciacion directa----");
        // Creo objetos directamente de su clase específica (Perro, Lobo, etc.)
        Perro perro1 = new Perro("Jagüer",5,20);
        Lobo lobo1 = new Lobo("Colmillo Blanco",7,35);
        Leon leon1 = new Leon("Simba",8,60);
        Gato gato1 = new Gato("Nala",3,9);
        
        // Creamos un Gato usando el constructor por defecto y luego los setters
        Gato gato2 = new Gato();
        gato2.setNombre("Garfield");
        gato2.setEdad(4);
        gato2.setPeso(5);
        
        System.out.println("--- PERRO ---");
        perro1.mostrarInfo();
        
        System.out.println("\n--- LOBO ---");
        lobo1.mostrarInfo();
        
        System.out.println("\n--- LEÓN ---");
        leon1.mostrarInfo();
        
        System.out.println("\n--- GATO ---");
        gato1.mostrarInfo();
        
        //con POLIMORFISMO (Referencia de Superclase)
        
        System.out.println("Polimorfismo referencia a Animal");
        System.out.println("-----------------------------------------------");
        //Declaro varibles como superclase ANIMAL, pero inicializamos con 
        //los objetos de la subclase(Perro,Lobo)etc.
        
        Animal perroPol = new Perro("Boby",3,15);
        Animal loboPol = new Lobo("Raksha",6,30);
        Animal leonPol = new Leon("Mufasa",7,70);
        Animal gatoPol = new Gato("Silvestre",4,10); 
        
        System.out.println("Ejemplo polimorfismo de Perro");
        perroPol.mostrarInfo();
        System.out.println("Ejemplo polimorfismo de Lobo");
        loboPol.mostrarInfo();
        System.out.println("Ejemplo polimorfismo de León");
        leonPol.mostrarInfo();
        System.out.println("Ejemplo polimorfismo de Gato");
        gatoPol.mostrarInfo();
        
       
        
        
                
    }
    
}
