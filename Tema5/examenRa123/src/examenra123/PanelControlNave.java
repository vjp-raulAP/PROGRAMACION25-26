/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra123;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class PanelControlNave {

    /**
     * @param args the command line arguments
     */
    /**
     * Método que muestra el menu de inicio correspondiente a 3 opciones.
     */
    //declaro la contante PI
    public static void mostrarMenu() {
        System.out.println("-----PANEL DE CONTROL DE NAVE-----");
        System.out.println("-----opciones: ----- ");
        System.out.println("1. Analizar señal recibida del espacio");
        System.out.println("2. Ajustar las potentias de los motores");
        System.out.println("3. Calcular el volumen del planeta.");
    }

    /**
     * Metodo que pide al usuario el valor de la frecuencia.
     *
     * @return frecuencia introducida por le usuario.
     */
    public static int pedirFrecuenciaUsuario() {
        int frecuencia;
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Por favor introduca un numero entero de frecuencia");
            frecuencia = entrada.nextInt();
            return frecuencia;
        } catch (InputMismatchException e) {
            System.out.println("Error , debes introducir un valor numérico");

        }

    }

    public static void divisor() {
        int numf = pedirFrecuenciaUsuario();
        int i;
        for (i = 2; i <= numf; i++) {
            if (numf % i == 0) {
                System.out.println("Frecuencia encontada :" + i);
            } else {
                System.out.println("Numero no encontrado en el  rango de frecuencias.");
            }

        }
    }

    public static int valoresPotenciaUsuario() {
        int num1;
        Scanner entrada = new Scanner(System.in);
        num1 = entrada.nextInt();

        return num1;
    }

    public static void ajustarPotencia() {
        int aux;
        int contador = 1;
        System.out.println("Introduzca la primera potencia");
        int num1 = valoresPotenciaUsuario();
        System.out.println("Introduzca la segunda potencia ");
        int num2 = valoresPotenciaUsuario();
        System.out.println("Introduzca la tercera potencia ");
        int num3 = valoresPotenciaUsuario();
        do {
            if (num1 > num2) {
                aux = num1;
                num1 = num2;
                num2 = aux;
            }
            if (num1 > num3) {
                aux = num1;
                num1 = num3;
                num3 = aux;
            }
            if (num2 > num3) {
                aux = num3;
                num2 = num3;
                num3 = aux;
            }
            contador++;
        } while (contador < 3);

    }

    /**
     * Metodo para calcular el volumen
     */
    public static double calcularVolumenPlaneta() {
        int radio;
        double volumen;
        Scanner entrada = new Scanner(System.in);
        radio = entrada.nextInt();
        //calculo de radio
        volumen = (4 / 3) * (Math.PI) * (Math.pow(radio, 3));

        return volumen;

    }

    public static void main(String[] args) {
        int opcion = 0;
        double volumenPlaneta;
        int valorpotencia1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Elija una opcion");
        try {
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido la opcion 1 ");
                    divisor();

                    break;
                case 2:
                    System.out.println("Ha elegido la opción 2 ");
                    ajustarPotencia();

                    break;
                case 3:
                    System.out.println("Ha elegido la opcion 3 ");
                    volumenPlaneta = calcularVolumenPlaneta();
                    System.out.println("El volumen del planeta es " + volumenPlaneta);

                    break;
                default:
                    System.out.println("Debe de elegir entre las opciones 1-3 ");

            }
        } catch (InputMismatchException e) {
            System.out.println("Error, debe introducir un valor numerico");
        }

    }
}
