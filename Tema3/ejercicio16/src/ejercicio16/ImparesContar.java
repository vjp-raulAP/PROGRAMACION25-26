/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author rulaa
 */
public class ImparesContar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro dos variables. la "i" sera para recorrer el bucle de 20 a 160. "numeroImpares" para contar el numeros impares
        int i = 20;
        int cantidadImpares = 0;
        
        
        System.out.println("Los numeros impares existentes entre el 20 y 160 son: " ); //imprimo por pantalla los numeros que complen co el if
        while(i <=160) {
            if( i % 2 !=0){
                System.out.print(i);
            if(i < 159 ){     //añado este if para poner el guón . Lo pongo hasta 159 para que no me imprima el "-" despues de 159
                System.out.print(" - ");
            }
                cantidadImpares ++;  //sumo 1 al contador de numeros impares
            }
          i++;   //sumo 1 al contador del bucle desde 20 a 160
        }
        System.out.println(); // siguiente linea
        System.out.println( "La cantidad de numeros impares impresos ha sido: " + cantidadImpares); //imprimo cantidad de impares
        
    }
    
}
