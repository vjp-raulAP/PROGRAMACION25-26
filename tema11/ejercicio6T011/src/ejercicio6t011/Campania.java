/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6t011;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author rulaa
 */
public class Campania {
     Set<String> donaciones = new HashSet<>();
      String nombreCampania;

    public Campania(String nombreCampania) {
        this.nombreCampania = nombreCampania;
    }

    public Set<String> getDonaciones() {
        return donaciones;
    }

    public String getNombreCampania() {
        return nombreCampania;
    }

    public void setDonaciones(Set<String> donaciones) {
        this.donaciones = donaciones;
    }

    public void setNombreCampania(String nombreCampania) {
        this.nombreCampania = nombreCampania;
    }
    
    
   //metodos
    

    @Override
    public String toString() {
        return "Campania{" + "donaciones=" + donaciones + ", nombreCampania=" + nombreCampania + '}';
    }

      
      
}
