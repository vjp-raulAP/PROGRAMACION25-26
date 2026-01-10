/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9consolidacion;

/**
 *
 * @author alumno
 */
public class Vehiculo  implements Gravable{
    //Atributos
    private  int cc;
    private String matricula;
    private String dni;
    
    //constructores pòr defecto
    
    public Vehiculo(){
        this.cc = 0;
        this.matricula="" ;
        this.dni = "";
       
    }
    
    public Vehiculo (int cc, String matricula, String dni){
        this.cc = cc;
        this.matricula = matricula;
        this.dni = dni;
    }
    
    
    //getter y setter
     
    public int getCc(){
        return cc;
    }
    
    public void setCc(int cc){
        this.cc = cc;
    }
    

    @Override
    public double calcularImpuesto() {
        int tarifaMinima=0;
        if(cc <= 1000){
            tarifaMinima = 12; 
            }
            else if (cc >=1001 && cc <= 1499){
                    tarifaMinima= 34;
            }
            else if (cc >=1500 && cc <= 1999 ){
                    tarifaMinima= 71;
            }
            else if(cc >=2000 && cc <=2999 ){
                    tarifaMinima = 122;
            } 
            else{
                    tarifaMinima = 152;
            }
        return tarifaMinima;
    }
    
    //toString
    @Override
    public String toString(){
        return "Vehiculo con cilindrada:"+cc+ " centrimetos cúbicos,  con matricula "+matricula + " y con dni: "+dni+" tiene que pagar una tarifa mínima de:"+calcularImpuesto()+" Euros";
    }
}
    
 
                    
        
        
    
    

