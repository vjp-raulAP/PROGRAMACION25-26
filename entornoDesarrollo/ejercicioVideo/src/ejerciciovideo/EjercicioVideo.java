/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciovideo;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class EjercicioVideo {

    
    

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //1.1 Crear un array
        ArrayList<Integer> edades = new ArrayList<>();

        //1.2 Insertar 
        //1.2.1 Insertar un elemento al final 
        edades.add(1);
        edades.add(5);
        edades.add(8);
        edades.add(6);
        //1.2.2 Insertar un elemento en le índice.
        edades.add(1, 5);
        //1.3 obtener 
        System.out.println(edades.get(0));
        System.out.println(edades.get(1));
        System.out.println(edades.get(2));
        System.out.println(edades.get(3));
        System.out.println("------");
        for (Integer edad : edades) {
            System.out.print(edad);
        }
        //1.4 modificar un elemento
        edades.set(1, 3);
        System.out.println("");
        System.out.println("--------");
        for (Integer edad1 : edades) {
            System.out.print(edad1);

        }
        System.out.println("");
        System.out.println("------");
        //1.5 Eliminar
        //1.5.1. Eliminar 1 elemento por su indice
        edades.remove(0);
         for(Integer edad : edades){
            System.out.print(edad);
         }
        //1.5.2 eliminar 1 objeto concreto
        System.out.println("");
         edades.remove(new Integer(3));
          for(Integer edad1 : edades){
            System.out.print(edad1);
          }
          //1.5.3 Eliminar todos los elementos
         // edades.clear();
           for(Integer edad3 : edades){
            System.out.print(edad3);
           }
           
          //1.6 Sabaer si la lista esta vacia
        if (edades.isEmpty()) {
            System.out.println("El arrayList está vacio");
        } else {
            for (Integer edad : edades) {
                System.out.print(edad);
            }
        }
        //1.7 Saber su tamaño
            System.out.println("El tamaño del arraylist es "+edades.size());
            
        //    1.9 Contiene
        
        System.out.println(edades.contains(new Integer(5)));
        
        //1.10 Obtener el indice de un elemento
        //1.10.1 Obtener el primer indice
          System.out.println("El indice del numero 5 es:"+  edades.indexOf(new Integer(5)));
          //System.out.println("El indice del numero 5000 es:"+  edades.indexOf(new Integer(5000)));
        //1.10.2 Obtener el ultimo indice
        edades.add(5);
        edades.add(1);
        edades.add(8);
        edades.add(6);
        edades.remove(new Integer(7));
        System.out.println("last");
         for (Integer edad : edades) {
                System.out.print(edad);
         }
         System.out.println("");
       System.out.println( edades.lastIndexOf(new Integer(8)));
       
       //Saber si un elemento esta repetido
       if(edades.indexOf(new Integer(1))== edades.lastIndexOf(new Integer(1))){
           System.out.println("El numero no esta repetido");
       } else{
           System.out.println("El número está repetido");
       }
       //1.11 clonar
       
       
    }
    

}
