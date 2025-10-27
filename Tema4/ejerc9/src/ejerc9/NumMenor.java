/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc9;

/**
 *
 * @author alumno
 */
public class NumMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Por favor, introduzca el primer numero");
        int num1 = PideNum.pidenum();
         System.out.println("Por favor, introduce el segundo numero ");
        int num2 = PideNum.pidenum();
        System.out.println("Por favor, introduce el tercer numero ");
        int num3 = PideNum.pidenum();
        
        int numeroMenor = Compara.comparador(num1, num2, num3);
        System.out.println("El menor de los tres numeros introducidos  es: " + numeroMenor);
    }
    
}
