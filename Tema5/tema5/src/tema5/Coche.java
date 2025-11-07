/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author alumno
 */
public class Coche {
    //1 Atributos. caracteristicas,Nunca se inicializan asi.
    private String ruedas;
    private String suspension;
    private int espejos;
    
    
    //2. constructores. permiten crear o instanciar objeto de este tipo
    //inicializar todos los atributos.
        //2.1 constructor por defecto
        public Coche(){
            this.ruedas= "";
            this.suspension = "";
            this.espejos = 0;
                    
        }
        //2.2 constructor parametrizado (sobrecarga de métodos y autorreferencia this)
        public Coche(String ruedas,String suspension,int espejos){
            this.ruedas = ruedas;
            this.suspension= suspension;
            this.espejos = espejos;
        }
        
        
        //3.1 Getter y setter : devuelven y establecen el valor de los atributos.
        public String getRuedas(){
            return this.ruedas;
        }
        
        public void setRuedas(String ruedas){
            this.ruedas = ruedas;
        }
        
        public String getSuspension(){
            return this.suspension;
        }
        
        public void setSuspension(String suspension){
            this.suspension = suspension;
        }
        
        public int getEspejos(){
            return this.espejos;
        }
        public void setEspejos(int espejos){
            this.espejos = espejos;
        }
        
        //3.2 OTROS METODOS
        public void acelerar (){
            System.out.println("Acelerando coche....");
        }
        public void frenar (){
            System.out.println("Frenando coche....");
        }
        public void girar (){
            System.out.println("Girando coche...");
        }
               
        
        //4. TO STRING: devuelve un String con los datos del obeto.
         @Override
        public String toString(){
           
            return  "Mi coche tiene ruedas " + this.ruedas + " , suspension " + this.suspension + " y " +this.espejos + " espejos.";
        }
}
