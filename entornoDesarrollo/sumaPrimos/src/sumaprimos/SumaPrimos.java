/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaprimos;

/**
 *
 * @author alumno
 */
public class SumaPrimos {
 public static int sumaPrimos(int numeroMaximo) {

        int acumulador = 0;
        int numero = 2;
        int contador;
        boolean primo;

        do {
            System.out.println(numero);
            contador = 2;
            primo = true;

            while ((primo) && (contador != numero)) {
                if (numero % contador == 0) {
                    primo = false;
                }
                contador++;
            }

            if (primo) {
                acumulador = acumulador + numero;
            }

            numero++;

        } while (numero <= numeroMaximo);

        return acumulador;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int resultado = sumaPrimos(32) ;
        System.out.println("La suma de los primos es: " + resultado);
    }
    
}
