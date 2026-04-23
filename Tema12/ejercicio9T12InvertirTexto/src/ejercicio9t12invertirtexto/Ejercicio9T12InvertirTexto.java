/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9t12invertirtexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author alumno
 */
public class Ejercicio9T12InvertirTexto {
    
    //Metodo invertir un texto  pasando por parametro un texto.
    
    public static String invertirTexto(String texto){
        //declaro variable donde guado el texto invertido
         String textoInvertido= "";
        
        //creamos u bucle que recorrera el texto empezando por el final
                for (int i = texto.length() - 1; i >= 0; i--) {
                 textoInvertido =  textoInvertido + texto.charAt(i); //uso charAt para  obtener cada caracter 
         }
                return textoInvertido;
    }
    
    //Metodo que lee un archivo  y devuelve otro archivo escrito al reves.
    
   public static void transformarTexto() throws FileNotFoundException,IOException{
        String archivoEntrada = "frase.txt";  //declaro la variable en la que estara el texto
        String archivoSalida = "fraseinvertida.txt"; //variable donde guardo textoinvertido.
        
        try (FileReader fr = new FileReader(archivoEntrada);
              BufferedReader br=  new BufferedReader(fr)){
            //1º leer el texto de archivoEntrada 
            String  textoEntrada= br.readLine();
            
            //2º comprobamos que el archivo no esta a null. si no está llamamos al  metodo invertir
            if (textoEntrada != null){
                
                String textoReves = invertirTexto(textoEntrada);
                
            //3º Abrimos flujo de escritura para guardar el texto al reves en otro archivo
            try(FileWriter fw = new FileWriter(archivoSalida);
                 PrintWriter pw = new PrintWriter(fw)){
                //imprimimos el texto al reves que hemos guardado 
                pw.print(textoReves); 
                //damos un feedback al usuario
                System.out.println("Archivo guardado correctamente en: " + archivoSalida);
                
            }
            }else{
                System.out.println("El archivo está vacio");
            }
        }
       
   }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   

        //Try catch para capturar las excepciones lanzadas en los métodos 
        try {
            transformarTexto();
            //feedBack usuario
            System.out.println("Ejecución completada");
            
        } catch (FileNotFoundException e) {
            System.out.println("Error. No se encuentra el archivo 'frase.txt' ."); 
        } catch (IOException e) {
            System.out.println("Error al procesar los archivos: " + e.getMessage());
        }catch (Exception e) {
            System.out.println("Error inesperado: " + e.toString());
        }
    }
    }
    

