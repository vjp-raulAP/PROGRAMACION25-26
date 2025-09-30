/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areas;

/**
 *
 * @author alumno
 */
public class Areas {
    private final static float PI = 3.141592f;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro las variables de los lados y radio.
        float x;
        float y;
        float radio;
        float areaTriangulo;
        float areaCirculo;
        //asigno valores a esa variable
        x = 5;
        y = 3;
        radio = 5;
        
        //Calculo del area de triangulo.
        areaTriangulo = (x * y)/2;
             
            System.out.println("El resultado del area de triangula de base "+ x +"y altura " + y +"es : " +areaTriangulo);
        
       //Calculo de are del cirulo
        areaCirculo = 2 * PI * radio; 
            System.out.println("El resultado del area del circulo con radio "+ radio + "es: " +areaCirculo);
            
    }
    
}
