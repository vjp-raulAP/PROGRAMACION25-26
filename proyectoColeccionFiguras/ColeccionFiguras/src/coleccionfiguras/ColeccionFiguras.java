/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coleccionfiguras;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ColeccionFiguras {
    
    
    //Scanner global para no tener que ponerlo en cada método

    public static Scanner entrada = new Scanner(System.in);

    //Constantes para las matrices
    
    public static final int FIL = 3;
    public static final int COL = 3;

    //Metodo que muestra el menu
    public static void mostrarMenu() {
        System.out.println("-----------MENU COLECCIONISTA DE FIGURAS--------------------");
        System.out.println("1. Rellenar la vitrina");
        System.out.println("2. Mostrar todas las figuras de la colección determinada");
        System.out.println("3. Mostrar la figura mas valiosa");
        System.out.println("4. Salir del programa");
        System.out.println("----------------------------------------------------------");
        System.out.print("Introduce una opcion:   ");
    }

    //Metodo que rellena las figuras en la vitrina.
    public static void rellenarVitrinaFiguras(Figura[][] matriz) {
        //declaramos los atributos de la figura
        float valor;
        String nombre;
        String coleccion;
        System.out.println();
        //recorremos la matriz  y pedimos al usuario  valor, nombre, colección
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.println("------- Posición [" + i + "][" + j + "]------");   //Nos muestra la posición de cada figura que vamos a rellenar
                System.out.println("Por favor, introduzca el valor de la figura:   ");
                valor = entrada.nextFloat();
                entrada.nextLine();
                System.out.println("Ahora, introduzca el nombre de la figura:  ");
                nombre = entrada.nextLine();
                System.out.println("Por último, introduzca la coleccion a la que pertenece:   ");
                coleccion = entrada.nextLine();
                matriz[i][j] = new Figura(valor, nombre, coleccion);//Se guardan los datos en la matriz en las posiciones i j 
            }
        }
    }

    //Metodo que muestra la figura  que se desea de una coleccion determinadae
    public static void mostrarFiguraDeterminada(Figura[][] matriz) {
         //Declaramos boleano para recorrer matriz y comparar la entrada de usuario con los datos de la matriz
        boolean encontrado = false;
        
         //Antes de recorrer la matriz, comprobar si está inicializada  para evitar NullPointerException.
            if (!vitrinaInicializada(matriz)) {
        System.out.println("Primero debes rellenar la vitrina. opción 1");
        return;
        }
            
        System.out.println();
        System.out.print("Introduce la colección de la figura deseada: ");
        String coleccion = entrada.nextLine();

        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                if (matriz[i][j].getColeccion().equalsIgnoreCase(coleccion)) {  //ignoramos mayusculas y minusculas  y comparamos con lo elegido por usuario
                    System.out.println(matriz[i][j].toString());
                    encontrado = true;
                }
            }
        }

        //Sino hay ninguna figura
        if (!encontrado) {
            System.out.println("No se ha encontrado ninguna figura perteneciente a la colección");
        }
    }
    
    
    //Metodo que muestra la figura mas valiosa

    public static void mostrarFiguraValiosa(Figura[][] matriz) {
        //Antes de recorrer la matriz, comprobar si está inicializada  para evitar NullPointerException.
            if (!vitrinaInicializada(matriz)) {
        System.out.println("Primero debes rellenar la vitrina. opción 1");
        return;
        }
            
        System.out.println();
        
        Figura mayor = matriz[0][0];//Primer  valor elemento de matriz como referencia para realizar la comparación  
        //Almacenamos  los datos de la i y la j
        int letraI = 0;
        int letraJ = 0;
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                if (matriz[i][j].getValor() > mayor.getValor()) {  //si valor de matriz > valor elemento primero  lo guardo .
                    mayor = matriz[i][j];
                    //Coge la informacion de i y la j  y la guardamos en letraI y letraJ
                    letraI = i;
                    letraJ = j;
                }
            }
        }
        //Muestra los datos de la figura mas valiosa  y en que posicion está (i, j)
        System.out.println(matriz[letraI][letraJ].toString() + " y se encuentra en el estante [" + letraI + "] y compartimento [" + letraJ + "]");
    }

    //Creo una método para comprobar que  si la vitrina está rellena.
            public static boolean vitrinaInicializada(Figura[][] matriz) {
            for (int i = 0; i < FIL; i++) {
                for (int j = 0; j < COL; j++) {
                    if (matriz[i][j] == null) {  //comprobamos que los huecos están a null.
                        return false;
                    }
                }
            }
            return true;
        }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo la matriz Figura de 3 x3  de objeto Figura
        Figura[][] figura = new Figura[FIL][COL];

        int opcion;  //variable opción para le while
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            entrada.nextLine(); //limpia buffer
            switch (opcion) {
                case 1:
                    rellenarVitrinaFiguras(figura);
                    break;
                case 2:
                    mostrarFiguraDeterminada(figura);
                    break;
                case 3:
                    mostrarFiguraValiosa(figura);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, intentelo de nuevo con las opciones de 1 al 4");
            }
        } while (opcion != 4);

    }

}
