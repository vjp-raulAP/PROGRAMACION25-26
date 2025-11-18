/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03t05;

/**
 *
 * @author rulaa
 */
public class Coche {
    //1atributos
    private String marca;
    private String modelo;
    private Rueda rueda; //objeto Rueda  
    
    //2constructores
      // 2.1 por defecto
    public Coche(){
        this.marca = "";
        this.modelo = "";
    }
    
    // 2.2 construc parametrizado
    
    public Coche( String marca,String modelo,Rueda rueda){
        this.marca=marca;
        this.modelo = modelo;
        this.rueda = rueda;
    }
    
    // 3 getter y setter
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public Rueda getRueda(){
        return rueda;
    }
    public void setRueda(Rueda rueda){
        this.rueda = rueda;
    }
    
    //4 toString
    @Override
    public String toString(){
        return "Coche (marca = "+this.marca  + ", modelo = "+this.modelo+" y rueda "+this.rueda + " )";
    }
    
}
