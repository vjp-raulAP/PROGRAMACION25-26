/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15t08;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Pelicula {
    
    private static final int AFORO = 4;
     //atributos
    private String titulo;
    private double costeLicencia;
    private Socios[] socios;
    private int numSocios; //contador para controlar numero de socios
    
    // constructores
    public Pelicula() {
        this.titulo = "";
        this.costeLicencia = 0;
        this.socios = new Socios[AFORO]; 
        this.numSocios = 0;
    }

    public Pelicula(String titulo, double costeLicencia) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.socios = new Socios[4]; 
    }
    
    // setters

    public void setCosteLicencia(double costeLicencia) {
        this.costeLicencia = costeLicencia;
    }

    public void setSocios(Socios[] socios) {
        this.socios = socios;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
   public void setNumSocios(int numSocios){
       this.numSocios = numSocios;
   }
    
    //  getters

    public double getCosteLicencia() {
        return costeLicencia;
    }

    public Socios[] getSocios() {
        return socios;
    }

    public String getTitulo() {
        return titulo;
    }
     public int getNumSocios() {
        return numSocios;
    }
    
    // pide el nombre del socio
    public String pedirNombre() {
    
        Scanner entrada = new Scanner(System.in);
        String nombreSocio;
        
        System.out.println("Introduzca el nombre del socio: ");
        nombreSocio = entrada.nextLine();
        
        return nombreSocio;
        
    }
    
    // pide el precio abonado del socio
    public double precioAbonadoAleatorio() {

        Scanner entrada = new Scanner(System.in);
        double precioAbonado = (int) (Math.random()*1000000); // numero aleatorio del 0- 1M

        return precioAbonado;
        
    }
    
    // método que rellena 
    public void rellenarSocio(Socios socio) {
        
        if (numSocios < socios.length) {
            socios[numSocios] = socio;
            numSocios++;
        } else{
            System.out.println("No se pueden añadir más socios a esta película");
        }
    
    }
    
    // método mostrar
    public void mostrar() {
    
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Coste de la licencia: "+this.costeLicencia);
        System.out.println("Beneficio: " + beneficioNeto());
        // tanbien mostraremos los valores del atributo socios[]
        for (int i = 0; i < numSocios; i++) {
            socios[i].mostrar();
        }
        
    }
    
        // Beneficio neto
        public double beneficioNeto() {
            double total = 0;
            for (int i = 0; i < numSocios; i++) {
                total += socios[i].getPrecioAbonado();
            }
            return total - costeLicencia;
        }
}
