/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examordinariara4ra7;

/**
 *
 * @author alumno
 */
public class Ubicacion {
    
    //atributos
    private String calle;
    private String ciudad;
    private String pais;
    
    public Ubicacion() {
        this.calle = "";
        this.ciudad = "";
        this.pais = "";
    }

    //contructor por parametros
    public Ubicacion(String calle, String ciudad, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ubicacion{" + "calle=" + calle + ", ciudad=" + ciudad + ", pais=" + pais + '}';
    }
    
    
    
    
    
    
}
