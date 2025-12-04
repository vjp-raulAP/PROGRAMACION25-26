/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3t06;

/**
 *
 * @author rulaa
 */
public class Circulo extends FiguraGeometrica {
    //atributos
    private double radio;
    
    //constructor 
    
    public Circulo(){
        super();
        this.radio = 0;
    }
    
    public Circulo(String color ,double radio){
        super(color);
        this.radio = radio;
    }
    
    
    //getter y setter
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
            this.radio = radio;
    }
    
    //metodos
    @Override
    public void calcularArea() {
        double areaCirculo = (Math.PI * radio * radio);
        System.out.println("El area del círculo de radio "+radio+" es "+ areaCirculo );
        
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = (2*Math.PI*radio);
        System.out.println("El Perimetro de un circulo es "+perimetro);
                
    }
    
    @Override
    public String toString(){
        return "El Ciculo con color = "+getColor()+", radio = "+radio+".";
    }
    
}
