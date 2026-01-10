/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra4ra7;

/**
 *
 * @author alumno
 */
public class CiclistaSprinter extends Ciclista {

    //Atributos
    private double aceleracion;

    //constructor por defecto
    public CiclistaSprinter() {
        super();
        this.aceleracion = 0;

    }

    //constructor parametrizado
    public CiclistaSprinter(String nombre, int energia, boolean estaEscapado, double kmMeta, int numBidones, double velocidad, int nivelHidratacion, double aceleracion) {
        super(nombre, energia, estaEscapado, kmMeta, numBidones, velocidad, nivelHidratacion);
        this.aceleracion = aceleracion;
    }

    @Override
    public void comer() {
        if (getKmMeta() < 10) {
            //aumenta en 10
            this.setEnergia(getEnergia() + 25);
            System.out.println("El Sprinter " + super.getNombre() + "acaba de tomar gel. Su energia ahora es de " + super.getEnergia());

        }
    }

    @Override
    public void beber() {
        // Si no tiene bidones, los coge
        if (super.getNumBidones() == 0) {
            System.out.println("El escalador " + getNombre() + " no tiene bidones y va a coger más.");
            super.setNumBidones(3);  // Por ejemplo, coger 3 nuevos

            // aumenta hidratación en 5
            this.setNivelHidratacion(getNivelHidratacion() + 5);

            // tira 2 bidones
            super.setNumBidones(getNumBidones() - 1);

            //mensaje
            System.out.println("El sprinter " + getNombre() + " se ha hidratado.  Su nivel de Hidratación actual: " + getNivelHidratacion());

        }

    }

}
