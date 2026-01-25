/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author rulaa
 */
public class Ejercicio19 {
    
 // Método para rellenar el vector con números aleatorios entre 10 y 80
    public static void rellenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 71) + 10;
        }
    }
    // Muestra el contenido del vector
    public static void mostrarVector(int[] vector) {
        System.out.println("Vector generado:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    // Método para obtener el mayor
    public static int obtenerMayor(int[] vector) {
        int mayor = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
        }
        return mayor;
    }

    // Método para obtener el menor
    public static int obtenerMenor(int[] vector) {
        int menor = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < menor) {
                menor = vector[i];
            }
        }
        return menor;
    }

    // Método para obtener la media
    public static double obtenerMedia(int[] vector) {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return (double) suma / vector.length;
    }

    // Método para obtener el valor que más se repite
    public static int obtenerMasRepetido(int[] vector) {
        int masRepetido = vector[0];
        int maxRepeticiones = 0;
        int contador;
        int i,j;

        for ( i = 0; i < vector.length; i++) {
            contador = 0;
            for ( j = 0; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    contador++;
                }
            }
            if (contador > maxRepeticiones) {
                maxRepeticiones = contador;
                masRepetido = vector[i];
            }
        }
        return masRepetido;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];

        rellenarVector(vector);
        mostrarVector(vector);
        System.out.println("El valor mayor obtenido es: " + obtenerMayor(vector));
        System.out.println("El valor menor obtenido es: " + obtenerMenor(vector));
        System.out.println("El valor que más se repite es: " + obtenerMasRepetido(vector));
        System.out.println("La media obtenida es: " + obtenerMedia(vector));
    }
    }
    

