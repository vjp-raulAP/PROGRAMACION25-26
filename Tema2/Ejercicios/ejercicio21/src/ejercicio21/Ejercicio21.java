/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

/**
 *
 * @author alumno
 */
    import  java.util.Scanner;
            
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //pedimos datos al usuario por teclado
        Scanner entrada = new Scanner (System.in) ;
        
        //Mostramos el mensaje por pantalla para indicar la usuario lo que tienen que escribir
        
        System.out.println("Introduzca la cantidad de segundos: ");
            
        
        //leemos los datos dle usuario
        
        int segundosUsuario = entrada.nextInt();
        //divido los segundos introducidos por el usuario entre los segundos que tiene 1 dia (86400)
        int dias = segundosUsuario / (86400);
        
        //Saco el resto de dividir los segundos totales entre 86400 y eso lo divido entre 3600s que tiene un dia 
        
        int horas = (segundosUsuario % 86400) / 3600;
        
        //obtengo el resto de 
        int minutos = (segundosUsuario % 3600) / 60;
        int segundos = segundosUsuario % 60;
        
        System.out.println(+segundosUsuario +" segundos total hacen "+dias +" dias ,  "  + horas + " horas ,  " +minutos +" minutos y " + segundos + " segundos");       
       
       
        
        
    }
    
}
