/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caritmetica2;

/**
 *
 *
 */
public class CAritmetica2 {

    /**
     * @author Raul Albalat Pérez
     * Ejercicio 2 Operariones Aritméticas
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato1; //Declaro la variable entera dato1
        int dato2,dato3, resultado; // declaro , a la vez, dos variables enteras: dato2 y resultado
                
        dato1= 20; //asigno el valor 20 a  la variable dato1
        dato2= 2; //
        dato3= 5; //
        //suma
        resultado = dato1 + dato2 + dato3; //Guardo la suma de las dos variable en la varible resultado
        System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " = " + resultado); /* El método Println escribe 
                por pantalla tanto el valor de las varible así como las cadenas que están entre comillas.
                Para unir los 5 elementos se ha utilizado el 
                operador + */
        
        //resta 
        
        resultado = dato1 - dato2 - dato3;
        System.out.println(dato1 + " - " + dato2 + " - " + dato3 + " = " + resultado);
        
        //Producto
        
        resultado = dato1 * dato2 * dato3;
        System.out.println(dato1 + " * " + dato2 + " * " + dato3 +  " = " + resultado);
        
        //cociente
        resultado = (dato1 / dato2)/ dato3 ;
        System.out.println(((dato1 + " / " + dato2) + " / " + dato3)+ " = " + resultado);
    }
    
}
