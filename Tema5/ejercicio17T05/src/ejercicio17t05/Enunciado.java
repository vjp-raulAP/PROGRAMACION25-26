/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17t05;

/**
 *
 * @author rulaa
 */
//1 atributos
public class Enunciado {
    private String pregunta;
    private String respuesta;
    
    //2 constructor defcto
    
    public Enunciado(){
        this.pregunta = "";
        this.respuesta = "";
    }
    
    //2.1 Const parametrizado
    
    public Enunciado(String pregunta,String respuesta){
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    
    public String getPregunta(){
        return this.pregunta;
    }
    
    public void setPregunta(String pregunta){
        this.pregunta = pregunta;
    }
    
    
    public String getRespuesta(){
        return this.respuesta;
    }
    
    
}
