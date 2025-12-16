/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra4ra7;

/**
 *
 * @author alumno
 */
public class  CiclistaEscalador extends Ciclista implements Pedaleable  {
    //Atrbibutos
    private double potencia;
    private double fuerza;
    
    // constructor por defecto
    
    public CiclistaEscalador(){
        super();//de la superclase
        this.potencia = 0;
        this.fuerza = 0;
    }
    
    //constructor parametrizado
    
    public CiclistaEscalador(String nombre, int energia,boolean estaEscapado, double kmMeta,int numBidones,double velocidad, int nivelHidratacion,double potencia, double fuerza){
        super(nombre,energia,estaEscapado,kmMeta,numBidones,velocidad,nivelHidratacion); //pertenece a la superclase
        this.potencia = potencia;
        this.fuerza = fuerza;
    }
    
    
    //getter y Setter
    public double getPotencia(){
        return potencia;
    }
    
    public void setPotencia(double potencia){
        
        this.potencia =  potencia;
    }
    
    
    public double getFuerza(){
        return fuerza;
    }
    
    public void getFuerza(double fuerza){
        this.fuerza = fuerza;
    }
    
    
    
    
            
            
            

    @Override
    public void comer() {    
        if (getKmMeta()> 20) {
            //aumenta en 30
          this.setEnergia(getEnergia()+30);
          
          //mensaje
        System.out.println("El escalador " + getNombre() + " acaba de tomar gel. Su energía ahora es " + getEnergia());
    }
    }

    @Override
    public void beber() {   //si no tiene bidones los coge. posteriormente aumenta su nivel de hidratacion en 10 , tira 2 bidones y muestra mensaje, el escalador nnombre

        // Si no tiene bidones, los coge
        if (super.getNumBidones() == 0) {
            System.out.println("El escalador " + getNombre() + " no tiene bidones y va a coger más.");
            super.setNumBidones(3);  // Por ejemplo, coger 3 nuevos
        }

        // aumenta hidratación
        this.setNivelHidratacion(getNivelHidratacion() + 10);

        // tira 2 bidones
        super.setNumBidones(getNumBidones() - 2);

        System.out.println("El escalador " + getNombre() + " se ha hidratado.  Su nivel de Hidratación actual: " + getNivelHidratacion());

    }

    @Override
    public void sprintar() {
       if(super.getKmMeta()< 0.3 && super.getEnergia()>= 20){
           super.setVelocidad(this.potencia/this.fuerza);
           super.setEnergia(super.getEnergia()-20);
           System.out.println("El escalador "+ getNombre() + " está sprintando a "+getVelocidad());
            }else{
           System.out.println("Aún no puedes sprintar.");
       }
                   
                   
        
    
    }

    @Override
    public void atacar() {
    if (!super.getEstaEscapado()) {
        super.setEstaEscapado(true);
        super.setNivelHidratacion(super.getNivelHidratacion()-20);
        System.out.println("El escalador está atacando");
    }
    }

    @Override
    public float recuperar() {
       return 
    }

    
    
    
             
        
         
    }
    

