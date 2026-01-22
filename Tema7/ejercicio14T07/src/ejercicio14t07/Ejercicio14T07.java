/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14t07;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Ejercicio14T07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        float[][] temperaturas = new float[4][7];
        boolean valido = false;
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        do {
            //menu opciones de usuario
            System.out.println("opciones");
            System.out.println("1.Rellenar temperaturas");
            System.out.println("2.Mostrar temperaturas");
            System.out.println("3.Visualizar las temperatura del mes");
            System.out.println("4. Dia mas caluroso del mes");
            System.out.println("5. Salir del programa");
            System.out.println("-------------------------------------");
            System.out.println("Elige una opcion: ");

            try {
                opcion = entrada.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error. las opciones son entre 1 y 5");
                entrada.nextLine();
                opcion = -1;

            }

            switch (opcion) {
                case 1:

                    for (int i = 0; i < temperaturas.length; i++) {
                        System.out.println("Introduce temperaturas de la semana" + (i + 1) + ": ");
                        for (int j = 0; j < temperaturas[0].length; j++) {
                            System.out.println("Introduce un valor de temperatura para el " + diasSemana[j] + " :");

                            temperaturas[i][j] = entrada.nextFloat();

                        }
                    }

                    break;

                case 2:

                    for (int i = 0; i < temperaturas.length; i++) {
                        System.out.println("----------------------------");
                        System.out.println("Semana " + (i + 1));
                        for (int j = 0; j < temperaturas[0].length; j++) {
                            System.out.print(diasSemana[j] + ": ");
                            System.out.println(temperaturas[i][j]);

                        }
                    }
                    break;
                    case 3:
                    float suma = 0;
                    float media;
                    for (int i = 0; i < temperaturas.length; i++) {

                        for (int j = 0; j < temperaturas[0].length; j++) {
                            suma += temperaturas[i][j];

                        }
                    }
                    media = suma / (temperaturas.length*temperaturas[0].length);   //serian las celdas de la matriz
                    
                    System.out.println("La media de temperaturas del mes es " + media + "Grados");

                    break;
                case 4:
                    float temperaturaMaxima = temperaturas[0][0];

                    for (int i = 0; i < temperaturas.length; i++) {
                        for (int j = 0; j < temperaturas[0].length; j++) {
                            if (temperaturas[i][j] > temperaturaMaxima) {
                                temperaturaMaxima = temperaturas[i][j];

                            }

                        }
                    }
                    System.out.println("La temperatura maxima fue" + temperaturaMaxima);
                    for (int i = 0; i < temperaturas.length; i++) {
                        for (int j = 0; j < temperaturas[0].length; j++) {
                            if (temperaturas[i][j] == temperaturaMaxima) {
                                System.out.println("latemperatura máxima se encuentra en el día" + diasSemana[j] + " del la semana " + (i + 1));
                            }

                        }

                    }

                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta.Debe introducir un numero entre 1 -5");
                    System.out.println("-----------------------------------------------------------------------");

            }

        } while (opcion != 5);

    }

}
