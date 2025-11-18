/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author alumno
 */
public class Bicicleta {

    //Atributos
    private int ruedas;
    private String manillar;
    private String pedales;
    private String frenos;
    private boolean estarPedaleando;
    //Atributo estático que pertenace a la clase. 
    private static int numBicicletas = 0;
    
    
    //1.3 ATRIBUTO DE OTRA CLASE.
    
    
   public class Ciclista{
       
   
         private String nombre;
        private int dorsal;
        private String tipo;
        //constructores
        public Ciclista (){
            this.nombre= "";
             this.dorsal = 0;
             this.tipo = "";
        }
        public Ciclista(String  nombre, int dorsal, String tipo){
            this.nombre= nombre;
            this.dorsal= dorsal;
            this.tipo=tipo;
        }
        
        //GETTER Y SETTER
        public String getNombre(){
            return this.nombre;
        }
        public void setNombre(String Nombre){
            this.nombre = nombre;
        }
        public int getDorsal(){
            return this.dorsal;
        }
        public void setDorsal(int dorsal){
            this.dorsal = dorsal;
        }
        public String getTipo(){
            return this.tipo;
        }
        public void setTipo(int String){
            this.tipo=tipo;
        }
        
   }
   
        
        //Constructores
        public Bicicleta() {
        this.ruedas = 0;
        this.pedales = "";
        this.manillar = "";
        this.frenos = "";
        this.estarPedaleando = false;
        
        
        //incrementamos el valor del atributo estático
         incrementarNumBicicletas();
    }
        
        //1.3 inicializamos un ciclista por defecto.
        private Ciclista ciclista;

    public Bicicleta(int ruedas, String manillar, String pedales, String frenos, boolean estarPedaleando) {
        this.ruedas = ruedas;
        this.pedales = pedales;
        this.manillar = manillar;
        this.frenos = frenos;
        this.estarPedaleando = estarPedaleando;
        
        //Incrementamos el valor del atributo estático
       incrementarNumBicicletas();
    }
   

    //Getter y setter
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public void setManillar(String manillar) {
        this.manillar = manillar;
    }

    public String getManillar() {
        return this.manillar;
    }

    public void setPedales(String pedales) {
        this.pedales = pedales;
    }

    public String getPedales() {
        return this.pedales;

    }

    public void setfrenos(String frenos) {
        this.frenos = frenos;
    }

    public String getFrenos() {

        return this.frenos;
    }

    public void setEstaPedaleando(boolean estaPedaleando) {
        this.estarPedaleando = estaPedaleando;
    }

    public boolean getEstaPedaleando() {
        return this.estarPedaleando;
    }
    
    public int getNumBicicletas(){
        return this.numBicicletas;
    }
    //Métodos
    private void acelerar() {
        System.out.println("Acelerando .....");
    }
    
    //Metodo estatico 
    private static void incrementarNumBicicletas(){
        numBicicletas++;
    }
    
    //to string
    @Override
    public String toString() {
        return "Mi bicicleta tiene" + this.ruedas + "ruedas "
                + ", un manillar" + this.manillar
                + ", unos pedales" + this.pedales
                + ", unos frenos" + this.frenos
                + "y ahora ¿estoy pedaleando?  " + this.estarPedaleando;
    }

    //modificadores de acceso
    
   
    
}
