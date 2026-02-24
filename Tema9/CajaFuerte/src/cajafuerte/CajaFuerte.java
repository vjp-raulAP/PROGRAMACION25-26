/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajafuerte;

import java.util.Scanner;

/**
 *
 * @author rulaa
 */
public class CajaFuerte {
  //Scanner global para no tener que ponerlo en cada método
   public static Scanner entrada = new Scanner(System.in);
    
 //Constantes para las matrices
    public static final int FIL = 3;
    public static final int COL = 3;
    
    
     //Metodo que muestra el menu
    public static void mostrarMenu() {
        System.out.println("-----------MENU CAJA FUERTE--------------------");
        System.out.println("1. Rellenar la caja fuerte de monedas");
        System.out.println("2. Mostrar todas las monedas fabricadas con un material determinado");
        System.out.println("3. Mostrar la moneda mas valiosa");
        System.out.println("4. Salir del programa");
        System.out.println("----------------------------------------------------------");
        System.out.print("Introduce una opcion:   ");
    }
     //Metodo que rellena las monedas de la caja fuerte
    public static void rellenarCajaFuerteMonedas(Moneda[][] matriz) {
        //declaramos los atributos de la matiz
        float valor;
        String pais;
        String material;
        System.out.println();
        for(int i = 0; i < FIL; i++){
            for(int j = 0; j < COL ; j++){
                System.out.println("------- Posición [" + i + "][" + j + "]------");   //Nos muestra la posición del en cada moneda,valor, pais
                System.out.println("Por favor, introduzca el valor de la moneda:   ");
                valor = entrada.nextFloat();
                entrada.nextLine();
                System.out.println("Ahora, introduzca el pais de la moneda:  ");
                pais = entrada.nextLine();
                System.out.println("Por ultimo, introduzca el material de la moneda:   ");
                material = entrada.nextLine();
                matriz[i][j] = new Moneda(valor, pais, material);//Se guardan los datos en la matriz en la s posiciones i j 
            }
        }
    }
    
     //Metodo que muestra la moneda que se desea
    public static void mostrarMonedasFabricadas(Moneda[][] matriz) {
        //Antes de recorrer la matriz, comprobar si está inicializada NullPointerException.
            if (matriz[0][0] == null) {
            System.out.println("Primero debes rellenar la caja fuerte. opción 1");
            return;
        }
        
        //Declaramos boleano para recorrer matriz y compare la entrada de usuario con los datos de la matriz
        boolean encontrado = false;
        
        System.out.println();
        System.out.print("Introduce el material de la moneda deseada: ");
        String material = entrada.nextLine();
        
        
        
        for(int i = 0; i < FIL; i++){
            for(int j = 0; j < COL; j++){
                if(matriz[i][j].getMaterial().equalsIgnoreCase(material)) {  //ignoramos mayusculas 
                    System.out.println(matriz[i][j].toString());
                    encontrado = true;
                }
            }
        }
        
        //Sino hay ninguna moneda
        if(!encontrado) {
            System.out.println("No se ha encontrado ninguna moneda con ese material");
        }
    }
    
     //Metodo que muestra la moneda mas valiosa
    public static void mostrarMonedaValiosa(Moneda[][] matriz) {
        //Antes de recorrer la matriz, comprobar si está inicializada NullPointerException.
            if (matriz[0][0] == null) {
            System.out.println("Primero debes rellenar la caja fuerte. opción 1");
            return;
        }
        System.out.println();
        Moneda mayor = matriz[0][0];//Primer  valor elemento de matriz como referencia para realizar la comparación  
        //Almacenamos  los datos de la i y la j
        int letraI = 0;
        int letraJ = 0;
        for(int i = 0; i < FIL; i++){
            for(int j = 0; j < COL; j++){
                if(matriz[i][j].getValor() > mayor.getValor()){  //si valor de matriz > valor elemento primero  lo guardo .
                    mayor = matriz[i][j];
                    //Coge la informacion de i y la j
                    letraI = i;
                    letraJ = j;
                }
            }
        }
        //Muestra los datos de la moneda y en que posicion esta
        System.out.println(matriz[letraI][letraJ].toString() +" y se encuentra en la posicion [" + letraI + "][" + letraJ + "]");
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo la matriz moneda de 3 x3  de objeto Moneda
        Moneda[][] moneda = new Moneda[FIL][COL];
        
        int opcion;  //variable opción para le while
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            entrada.nextLine(); //limpia buffer
            switch(opcion){
                case 1:
                    rellenarCajaFuerteMonedas(moneda);
                    break;
                case 2:
                    mostrarMonedasFabricadas(moneda);
                    break;
                case 3:
                    mostrarMonedaValiosa(moneda);
                    break;
                case 4:
                    System.out.println("Saliendo del programaa...");
                    break;
                default:
                    System.out.println("Opcion no valida, intentelo de nuevo con las opciones de 1 al 4");
            }
        }while(opcion != 4);
    
}
}
