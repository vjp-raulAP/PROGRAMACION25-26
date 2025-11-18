/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03t05;

/**
 *
 * @author rulaa
 */
public class Rueda {

    // 1 ATRIBUTOS 
    private String material;
    private int pulgadas;
    
    
    //2 CONTRUCTORES
    
    public Rueda(){
        this.material = "";
        this.pulgadas = 0;
    }
    
    public Rueda(String material, int pulgadas){
        this.material = material;
        this.pulgadas = pulgadas;
       
    }
    
    //3 getter y setter
    
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    
    
    public int getPulgadas(){
        return pulgadas;
    }
    
    public void setPulgadas(int pulgadas){
        this.pulgadas=pulgadas;
        
    }
    
    
    //metodos
    
    //toString
    @Override
    public String toString(){
        return "(Material = "+this.material+ " , pulgadas =  " +this.pulgadas +" )"  ; 
    }
 
    
}
