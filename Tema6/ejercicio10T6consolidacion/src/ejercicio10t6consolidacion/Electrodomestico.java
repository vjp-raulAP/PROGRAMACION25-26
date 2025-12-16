/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10t6consolidacion;

/**
 *
 * @author alumno
 */
public class Electrodomestico implements ConsumoEnergetico {
    
    //Atributos
    private float kwh;
    private float precioKwh;
    private String eficiencia;
    
    
    //constructores
    public Electrodomestico(){
        this.kwh = 0f;
        this.precioKwh = 0f;
        this.eficiencia = "";
        
    }
    
    public Electrodomestico(float kwh, float precioKwh, String eficiencia){
        this.kwh = kwh;
        this.precioKwh = precioKwh;
        this.eficiencia = eficiencia;
    }
    
    //getter y setter
    
    public float getKwh(){
        return kwh;
    }
    
    public void setKwh(float kwh){
        this.kwh = kwh;
    }
    
    public double getPrecioKwh(){
        return precioKwh;
    }
    public void setPrecioKwh(float precioKwh){
        this.precioKwh = precioKwh;
    }
    
    public String getEficiencia(){
        return eficiencia;
    }
    
    public void setEficiencia(String eficiencia){
        this.eficiencia = eficiencia;
        
        
    }
    
    //Metodos
    
    public float obtenerFactorEficiencia() {
        switch (eficiencia.toUpperCase()) {  //
            case "A++":
                return 0.5f;
            case "A+":
                return 0.7f;
            case "A":
                return 1.0f;
            case "B":
                return 1.2f;
            default:
                return 1.0f;
        }
    }

    @Override
    public float calcularConsumo(float horasDeUso) {
       
       float consumo   = horasDeUso * kwh * obtenerFactorEficiencia();
            return consumo;    
    }

    @Override
    public float calcularFactura(float horasDeUso) {
        float factura = calcularConsumo(horasDeUso) * precioKwh;
        return factura;
    }
    
    
    @Override
    public String toString(){
        return "Electrodomestico con kwh "+kwh+" y precio del Kwh de : "+precioKwh+" , con una eficiencia de "+ eficiencia;
    }
    
}
