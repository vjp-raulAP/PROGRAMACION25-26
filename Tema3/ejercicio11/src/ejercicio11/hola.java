/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author rulaa
 */
public class hola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Creamos una variable  que usaremos como contador y la inicilizamos a 1
       int i = 1;
       //Uso el condicionante while  y pongo la condicion mientras i <= 6 
       while (i <= 6){
           System.out.print("- Hola"+i + " ");  //introduzco guiones y lo imprimo todo en la linea como pide el ejercicio
           //incrementamos en 1 la varible para que continue
           i++;  
       }
       //Para el último guión lo imprimo fuera del while 
       System.out.println(" - ");
    }
    
}
