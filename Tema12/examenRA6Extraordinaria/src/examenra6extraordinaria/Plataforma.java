/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra6extraordinaria;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Plataforma {
    //Atributos
    private String nombre;
    private Videojuego [] videojuego;
    
    //constructor
    
    

    public Plataforma(String nombre, Videojuego[] videojuego) {
        this.nombre = nombre;
        this.videojuego = videojuego;
    }
    
    
    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.videojuego = new Videojuego[3];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Videojuego[] getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(Videojuego[] videojuego) {
        this.videojuego = videojuego;
    }
   
    
    //metodo para rellenar los videojuegos pasandole por parametros la cantidad.
    public void rellenarVideojuegos(int cantidad){
        Scanner entrada = new Scanner (System.in);
        for (int i = 0; i < cantidad; i++) {
             System.out.println("Videjuego "+(i+1)+":");
             System.out.println("Código: ");
             String codigo  = entrada.nextLine();
             System.out.println("Título:");
             String titulo = entrada.nextLine();
             System.out.println("Número jugadores: ");
             int numJugadores = entrada.nextInt();
             entrada.nextLine();
             videojuego[i]= new Videojuego(codigo,titulo,numJugadores);
            
        }
    }
    
    //metodo para mostrar los videojuegos 
   public void MostrarVideojuegos(){
       for (Videojuego videojuego : videojuego) {
           if(videojuego != null){
               System.out.println(videojuego);
           
       }
       }
   }
    
    
}
