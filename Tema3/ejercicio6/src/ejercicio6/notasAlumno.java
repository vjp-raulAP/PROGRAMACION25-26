/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author alumno
 */
 import java.util.Scanner;
public class notasAlumno {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
       
        //Creo el scanner que lea los datos
        Scanner numero = new Scanner(System.in);
        float nota;
        System.out.println("Por favor, introduzca su calificación:  ");
        //declaro varibles
        nota =  numero.nextFloat();
        
        if (nota >= 0 & nota <=4){
              System.out.println("Su calificación es  Suspenso");
            }
            else if (nota >= 5 & nota <= 6){
                System.out.println("Su calificación es Bien ");
                
            }
            else if (nota >= 7 & nota <= 8){
                System.out.println("Su calificación es Notable");
            }
            else if (nota >=9 & nota <=10){
                System.out.println("Su calificación es Sobresaliente");
            }
            else {
                System.out.println("Error . La nota debe de estar entre 0 y 10 ");
            }
       

        }
           
    }
    

