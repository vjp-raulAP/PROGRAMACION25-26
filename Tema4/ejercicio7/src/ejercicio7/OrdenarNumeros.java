/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author rulaa
 */
public class OrdenarNumeros {
    /**
     * Método que ordena 4 numeros de menor a mayor
     * @param num1
     * @param num2
     * @param num3
     * @param num4 
     */
    public static void ordenMenosMas (int num1,int num2,int num3, int num4){
        //Declaro una variable axiliar 
        int aux;
        if (num1 > num2){
            aux = num1;
            num1 = num2;
            num2 = aux;       
        }
        if (num1 > num3){
            aux = num1;
            num1 = num3;
            num3 = aux;
        }
        if (num1 > num4){
            aux = num1;
            num1 = num4;
            num4 =aux;
        }
        if (num2 > num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        if (num2 > num4) {
            aux = num2;
            num2 = num4;
            num4 = aux;  
        }
        if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        
        System.out.println("El orden de los numeros introducidos es el " + num1 + " - " + num2 + " - "+ num3 +" - " + num4);
    }
}
