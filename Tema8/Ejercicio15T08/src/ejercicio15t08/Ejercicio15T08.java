/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15t08;



import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15T08 {
    
    public static Scanner entrada = new Scanner(System.in);  //Scanner global

    public static Pelicula[] salaDeCine = new Pelicula[3]; // creamos una array de tipo Pelicula() con un tamaño de 3 posiciones
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean salir = false; // boolean que controlará el bucle do-while
        int opcionUsuario; // variable que recogerá la opcion del usuario
        
        do {            
            
            mostrarMenu(); // llamada al método 
            opcionUsuario = entrada.nextInt(); // recoge lo que el usuariointroduzca
            entrada.nextLine();
            
            switch (opcionUsuario) {
                case 1:
                    rellenarPeliculas();// rellena el array
                    break;
                case 2:
                   mostrarPeliculas(); 
                    break;
                case 3:
                    // peli mas resntable
                    break;
                case 4:
                    // peli menos rentable
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("\nSaliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Error. Inserte una opcion de entre 1-7.");
            }
            
            
        } while (!salir);
        

    }
    
    public static void mostrarMenu() {
        System.out.println("--------------------------------");
        System.out.println("-- Asociacion Nos gusta el cine --");
        System.out.println("--------------------MENU---------------------------");
        System.out.println("1. Rellenar las peliculas juntos con los socios.");
        System.out.println("2. Mostrar las peliculas y los socios que la han visto.");
        System.out.println("3. Mostrar la pelicula mas rentable.");
        System.out.println("4. Mostrar la pelicula menos rentable.");
        System.out.println("5. Pedir pelicula y mostrar la informacion.");
        System.out.println("6. Numero de socios que han abonado una cantidad mayor.");
        System.out.println("7. Salir del programa");
        System.out.println("-----------------------------");
        System.out.println("Elija una opcion");
    }
    
    public static String pedirTitulo() {

      
        String tituloUsuario;

        System.out.println("Introduzca el titulo de la pelicula: ");
        tituloUsuario = entrada.nextLine();

        return tituloUsuario;
        
    }
    
    public static double pedirCosteLicencia() {

       
        double costeLicenciaUsuario;

        System.out.println(" por favor,Inserte el coste de la licencia de la peli: ");
        costeLicenciaUsuario = entrada.nextDouble();

        return costeLicenciaUsuario;
        
    }
    
    public static void rellenarPeliculas() {

        for (int i = 0; i < salaDeCine.length; i++) {

            System.out.println("Pelicula " + (i + 1) + ":");
            System.out.println("Titulo de la pelicula: ");
            String titulo = entrada.nextLine();

            System.out.print("Coste licencia: ");
            double coste = entrada.nextDouble();
            entrada.nextLine();
            salaDeCine[i] = new Pelicula(titulo, coste);
            // Rellenar 4 socios
            for (int j = 0; j < 4; j++) {
                System.out.println("Socio " + (j + 1));
                System.out.print("Nombre: ");
                String nombre = entrada.nextLine();

                System.out.print("Cantidad abonada: ");
                double cantidad = entrada.nextDouble();
                entrada.nextLine();

                Socios socio = new Socios(nombre, cantidad);
                salaDeCine[i].rellenarSocio(socio);
            }
        }

    }
        public static void mostrarPeliculas() {

        for (int i = 0; i < salaDeCine.length; i++) {
            if (salaDeCine[i] != null) {
                salaDeCine[i].mostrar();
                System.out.println("------------------------");
            }
        }
    }

}
    
