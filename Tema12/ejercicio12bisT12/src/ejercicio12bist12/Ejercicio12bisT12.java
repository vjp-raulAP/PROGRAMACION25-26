/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bist12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author rulaa
 */
public class Ejercicio12bisT12 {

   public static int leerSumarArchivo() throws FileNotFoundException,IOException{
       //variable con el nombre del archivo
       String archivo = "masnumeros.txt"; 
       int  sumatotal = 0; //variable donde sumaremos todos 
       //Creamos try-recourses
       
       try(FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr) ){
           
           //creo la linea que vamos a leer. 
           String  linea ;
            
           while( (linea = br.readLine()) !=null){  //leemos linea a linea el fichero hasta el final
               //creo array de numeros separando los numeros por el ";"
               String [] numeros = linea.split(";");
               
               //ahora recorro el array
               for(String numero : numeros){
                   sumatotal = sumatotal + Integer.parseInt(numero.trim()); //Uso trim para quitar los espacios en blanco
               }
             
           }
           
       }
       return sumatotal;
   }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumatotal;
       //capturamos las excepciones lanzadas en  el metodo anterior
       try{
           sumatotal = leerSumarArchivo();
           System.out.println("La suma total de todos los numeros del archivo es: " +sumatotal);
           
           
       } catch (FileNotFoundException e) {
            System.out.println("Error: No se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Error al procesar los archivos: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.toString());
        }
    }
    
}
