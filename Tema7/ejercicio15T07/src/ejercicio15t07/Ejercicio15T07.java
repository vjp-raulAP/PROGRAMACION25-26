/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15t07;

import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class Ejercicio15T07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaro variables
         int opcion;
        int[] ventas = new int[12];
        int i;
        boolean valido = false;
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

       

        do {
            // Menú con las opciones de usuario
            System.out.println("opciones ");
            System.out.println("1. Rellenar ventas");
            System.out.println("2. Mostrar ventas");
            System.out.println("3. Mostrar ventas al revés");
            System.out.println("4. Suma total de ventas");
            System.out.println("5. Ventas de meses pares");
            System.out.println("6. Mes con más ventas");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
           
            try {
                  opcion = entrada.nextInt();
                  valido = true;
            } catch (Exception e) {
             
                entrada.nextLine();
                opcion = -1;
                
            }
  
           
            switch (opcion) {

                case 1:
                    
                    for ( i = 0; i < ventas.length; i++) {
                        ventas[i] =(int)(Math.random()*91)+10;     // entre 10 y 100
                    }
                    System.out.println("Ventas generadas correctamente.");
                    System.out.println("--------------------------------------------");
                    break;

                case 2:
                    for ( i = 0; i < ventas.length; i++) {
                        System.out.println(meses[i] + ": " + ventas[i]);
                    }
                    System.out.println("--------------------------------------------");
                    break;

                case 3:
                    for ( i = ventas.length - 1; i >= 0; i--) {
                        System.out.println(meses[i] + ": " + ventas[i]);
                    }
                    System.out.println("--------------------------------------------");
                    break;

                case 4:
                    int suma = 0;
                    for (i = 0; i < ventas.length; i++) {
                        suma += ventas[i];  //suma total de ventas
                    }
                    System.out.println("Ventas totales del año: " + suma);
                    System.out.println("--------------------------------------------");
                    break;

                case 5:
                    int sumaPares = 0;
                    for ( i = 1; i < ventas.length; i += 2) { //recorre el bucle en los indices pares
                        sumaPares = sumaPares+ventas[i];
                    }
                    System.out.println("Ventas de los meses pares: " + sumaPares);
                    System.out.println("--------------------------------------------");
                    break;

                case 6:
                    int mayorVenta = ventas[0];
                    int mesMayor = 0;

                    for ( i = 1; i < ventas.length; i++) { 
                        if (ventas[i] > mayorVenta) {  //recorre ventas y si es mayor a lo guardo en la variable mayorventa. y guardo su indice
                            mayorVenta = ventas[i];
                            mesMayor = i;
                        }
                    }

                    System.out.println("Mes con más ventas: " + meses[mesMayor] + " (" + mayorVenta + ")");
                    System.out.println("-----------------------------------------------------------------");
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta.Debe introducir un numero entre 1 -7");
                    System.out.println("-----------------------------------------------------------------------");
                    
            }
           

        } while (opcion != 7);
        
    }
    
}
