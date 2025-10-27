/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerc9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PideNum {
     public static int pidenum ( ) {
       int num;
    //Creo el Scanner de entrada de datos del usuario
       Scanner numeroUsuario = new Scanner(System.in);
        num = numeroUsuario.nextInt();
        return num;
        }
}
