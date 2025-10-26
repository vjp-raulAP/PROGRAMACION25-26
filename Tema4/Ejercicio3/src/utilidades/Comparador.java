/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

/**
 *
 * @author rulaa
 */
public class Comparador {
    /**
     *  Metodo para encontrar el número mayor de tres variables.
     * @param num1
     * @param num2
     * @param num3
     * @return numMayor que será un int 
     */
    //creo el metodo "encontrarMayor"  estatico para que pueda llamarlo desde cualquier clase que recibe 3 parametros (num1,num2,num3)
    public static int encontrarMayor (int num1,int num2, int num3){
        //declaro variable donde guardaré el resultado y inicializo suponiendo que "num1" es mayor.
        int numMayor;
        numMayor = num1;
        if(num2 > num1){
            numMayor = num2;
        }
        if(num3 > numMayor){
            numMayor = num3;
        }
        //introduzco return para que me devuelva resultado.
        return numMayor;
    }
    
}
