/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplovideo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author rulaa
 */
public class EjemploVideo {
    
    //pedir datos al jugador
    public static int pedirInt(String texto) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("introduzca un numero");
        return entrada.nextInt();
    }
 
    public static String pedirString(String texto) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("texto");
        return entrada.nextLine();
    }
    /**
     * Método que añade un jugador al mapa con su id , nickname y edad
     * @param mJugadores 
     */
    public static void insertarJugador(Map<Integer, Jugador> mJugadores){
        int id = pedirInt("ID: ");
        mJugadores.put(id, new Jugador(
                    id, 
                    pedirString("Nickname: "),
                    pedirInt("Edad: ")
                ));
        System.out.println("Jugador añadido al mapa");
    }
    /**
     * Metodo que nos muestra todos los jugadores del mapa
     * @param args the command line arguments
     */
    //*
    
   public static void mostrarJugadores( Map<Integer, Jugador> mJugadores){
       if(!mJugadores.isEmpty()){
            for(Integer id: mJugadores.keySet()){
           System.out.println(mJugadores.get(id));
       }
       
       }else{
           System.out.println("No hay jugadores registrados");
       }
   }
   /**
    * Metodo para buscar un jugador en concreto por su id y mostrarlo.
    * @param id
    * @param mJugadores 
    */
   
   public static void buscarJugador(int id,  Map<Integer, Jugador> mJugadores ){
        if(!mJugadores.isEmpty()){
            if(mJugadores.containsKey(id)){
                System.out.println(mJugadores.get(id));
            }
        }
            else {
           System.out.println("No hay jugadores registrados");
       }
   }
   
   /**
    * Método que inserta un juego favorito
    * @param mJugadores 
    */
   public static void agregarJuegoFav(Map<Integer, Jugador> mJugadores){
       
          if(!mJugadores.isEmpty()){
                int id = pedirInt("ID del jugador: ");
                   if(mJugadores.containsKey(id)){
                Jugador jugador = mJugadores.get(id);
                jugador.insertarJuegosFav();
                   }
        }
            else {
           System.out.println("No hay jugadores registrados");
       }
      
   }
   
   public static void eliminarJugador(int id,Map<Integer, Jugador> mJugadores){
         if(!mJugadores.isEmpty()){
              
                   if(mJugadores.containsKey(id)){
                mJugadores.remove(id);
                       System.out.println("\nJugador con id " +id + " eliminado correctamente.");
                   }
        }
            else {
           System.out.println("No hay jugadores registrados");
       }
      
   
   }
   
   
   public static void mostrarJugadoresPorJuego(String juego, Map<Integer, Jugador> mJugadores){
        if(!mJugadores.isEmpty()){
              //recorrer mapa
              for(Integer id: mJugadores.keySet()){
                  //filtrar por juego
                
                  if(mJugadores.get(id).getJuegosFav().contains(juego)){
                      //mostrar jugaores
                      System.out.println(mJugadores.get(id));
                  }
              
                   }
        }
            else {
           System.out.println("No hay jugadores registrados");
       }
   
   }
   
   public static void mostrarJuegoMasPopular(Map<Integer, Jugador> mJugadores ){
       //Creamos un mapa para guardar como clave el nombre del juego 
       //y como valor ir contando las veces que aparece.
        Map<String, Integer> cuentaJuegos = new HashMap<>();
        
       //Recorremos el mapa 
       for(Integer id : mJugadores.keySet()){
           //Recorremos el conjunto e juegos de cada jugador.
           for(String juego :  mJugadores.get(id).getJuegosFav()){
               //comporbamos si el juego esta o no en el mapa
               //si no está, lo añadimos(nombre como clave y 1 valor)
               if(cuentaJuegos.containsKey(juego)){
                   cuentaJuegos.put(juego, 1);
                   //si está , lo aññadimos e incrementamos en 1 su contador.
               } else {
                   cuentaJuegos.put(juego, cuentaJuegos.get(juego)+1);
               }
           }
       }
       //Buscamos el juego con mayor número de apariciones
       int max =  0;
       for(String clave : cuentaJuegos.keySet()) {
           if(cuentaJuegos.get(clave) > max){
               max = cuentaJuegos.get(clave);
           }
       }
       //Mostrar los juegos mas populares
       System.out.println("Juegos más populares");
        for(String clave : cuentaJuegos.keySet()) {
           if(cuentaJuegos.get(clave) == max){
               System.out.println(clave);
         }
        }
   }
   public static void recomendarJugadores(int idJugador, Map<Integer, Jugador> mJugadores){
       //tomamos como referencia el conjunto de juegos del jugaor recibido por parametro
       Set<String>  cRef = new HashSet(mJugadores.get(idJugador).getJuegosFav());
       boolean enc = false;
       //Recorremos el mapa comparando el conjunto e referencia con el conjunto de juegos de cada jugaor que no sea el recibio por parametros.
       for(Integer id : mJugadores.keySet()){
           if(id != idJugador) {
               //creamos un conjunto donde guardar los juegos comunes de los 2 jugadores
               Set<String> juegosComunes = new HashSet(mJugadores.get(id).getJuegosFav());
               if(juegosComunes.retainAll(cRef)){
                   enc = true;
                   System.out.println(mJugadores.get(id).getNickname()+": "+ juegosComunes.toString());
               }
           }
       }
       if(!enc){
           System.out.println("No hay jugadores con gustos similares.");
       }
   }
   
    public static void main(String[] args) {
       Map<Integer, Jugador> mJugadores = new HashMap<>();
       int opcion = 0;
        do {            
            try{
                System.out.println("--MENÚ--");
                System.out.println("1.- Añadir Jugador");
                System.out.println("2. - Añadir Juego favorito a un jugador");
                System.out.println("3. - Mostrar todos los jugadores");
                System.out.println("4. - Buscar jugador por ID");
                System.out.println("5. - Filtrar jugadores por juego");
                System.out.println("6. - Eliminar jugador");
                System.out.println("7. - Mostrar juego más popular");
                System.out.println("8. - Recomendar jugadores con gustos similares");
                System.out.println("9. - Salir");
                System.out.println("\nOpción: ");
                
                opcion = pedirInt("\nOpcion: ");
                switch(opcion) {
                    case 1 -> insertarJugador(mJugadores);
                    case 2 -> agregarJuegoFav(mJugadores);
                    case 3 -> mostrarJugadores(mJugadores);
                    case 4 -> buscarJugador(pedirInt("ID: "),mJugadores);
                    case 5 -> mostrarJugadoresPorJuego(pedirString("Juego: "),mJugadores);
                    case 6 -> eliminarJugador(pedirInt("ID: "),mJugadores);
                    //case 7 -> mostrarJuegoMasPopular(mJugadores);
                    //case 8 -> recomendarJugadores(pedirInt("ID: "),mJugadores);
                    case 9 -> insertarJugador(mJugadores);
                }
            } catch(InputMismatchException e) {
                System.out.println("Error: Introduce un número entre 1 y 9. ");
            }
        } while (opcion !=9);
    }
    
}
