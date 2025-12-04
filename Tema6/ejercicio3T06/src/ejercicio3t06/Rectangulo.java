/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3t06;

/**
 *
 * @author rulaa
 */
public class Rectangulo extends FiguraGeometrica {
    //Atributos
    private double base;
    private double altura;
    //constructores
    public Rectangulo(){
        super();
        this.base = 0;
        this.altura = 0;
    }
    
    public Rectangulo(String color, double base, double altura ){
            super(color);
            this.base = base;
            this.altura = altura;

    }
    
    //getet y setter
    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }
    
    
    public double getAltura(){
        return altura;
        
    }
    public void setAlura(double altura){
        this.altura  = altura;
    }
    
    @Override
    public void calcularArea() {
        double resultado;
        resultado = base * altura;
        System.out.println("El area del rectangulo de base" +base+ " y altura "+altura+" es "+resultado );
    }

    @Override
    public void calcularPerimetro() {
        double resultado;
        resultado = 2*(base + altura);
        System.out.println("El perimetro del rectangulo de base" +base+ " y altura "+altura+" es "+resultado );
    }
    
    @Override
    public String toString(){
        return "El rectangulo tiene color = "+getColor()+", base= "+base+", altura= "+altura;
    }
}
