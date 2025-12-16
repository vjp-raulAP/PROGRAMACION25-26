/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3t06;

/**
 *
 * @author rulaa
 */
public abstract class FiguraGeometrica {
    //Atributos
    private String color;
    
    
    //Cosntructores
    public FiguraGeometrica(){
        this.color = "";
        
    }
    
    public FiguraGeometrica(String color){
        this.color = color;
    }
    
    //Getter y setter
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    //metodos 
    public abstract void calcularArea();
    public abstract void calcularPerimetro();
    
    //tostring
    
    @Override
    public String toString(){
        return "FiguraGeometrica con color "+ color +".";
    }
    
}
