/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerc9;

/**
 *
 * @author alumno
 */
public class Compara {
    public static int comparador (int num1,int num2, int num3){

        //declaro variable donde guardaré el resultado y inicializo suponiendo que "num1" es mayor.
        int numMenor;
        numMenor = num1;
        if(num2 < num1){ //si num2 es menor a num1 guardo num2 en la variable numMenor
            numMenor = num2;
        }
        
        if(num3 < numMenor){ //si num3 es menor a numNmenor guardo en numMenor
            numMenor = num3;
        }
        //nos retorna el numMenor
       return numMenor;
    }
}
