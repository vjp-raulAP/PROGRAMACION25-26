/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15t05;

/**
 *
 * @author rulaa
 */
public class Direccion {
     //1 atributos de la clase Direccion
    
    private String calle;
    private int numero;
    private int piso;
    private String ciudad;
    
    //2. contrstructor por defecto
    public Direccion(){
        this.calle = "";
        this.numero = 0;
        this.piso = 0;
        this.ciudad = "";
    }
    
    //2.1 cosntructor parametrizado.
    public Direccion(String calle, int numero,int piso,String ciudad){
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
        
    }
    
    // 3. Getter y setter
    public String getCalle(){
        return calle;
    }
    public void setCalle(String calle){
        this.calle = calle;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    
    public int getPiso(){
        return piso;
    }
    public void sePiso(int piso){
        this.piso=piso;
    }
    
    
    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    
    //4 Metodos
    
    //5 toString
    @Override
    
    public String toString(){
        return "Calle: " + this.calle + " , Numero: " + this.numero + " , Piso: "+this.piso + " , Ciudad: "+this.ciudad+".";
     }
    
}
