/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6t06;

/**
 *
 * @author rulaa
 */
public class Libro implements Trasformable{
    //atributos
    private String titulo;
    private String autor;
    private String genero;
    
    //construct defecto
    public Libro(){
        this.titulo = "";
        this.autor = "";
        this.genero = "";
    }
    public Libro (String titulo, String autor, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    //getter y settet
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    //metodos
    
    
    

    @Override
    public String concatenarTodo() {
        return "Titulo: "+ titulo +" ,Autor: "+autor+", genero: "+genero;
    }

    @Override
    public String obtenerIniciales() {
        return titulo.charAt(0)+" , " + autor.charAt(0)+ " , " + genero.charAt(0);
    }

    @Override
    public int contarVocales() {
        String texto = titulo + autor + genero;  
        int contador = 0;                        

        texto = texto.toLowerCase();          //convierto el texto a minusculas

        for (int i = 0; i < texto.length(); i++) { 
            char c = texto.charAt(i);             
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { 
                contador++;                    
            }
        }

    return contador; // 8
    }

    @Override
    public String ObtenerCadenaMasLArga() {
    return;
    }

    @Override
    public boolean buscarCadena(String cadena) {

    if (titulo.equals(cadena)) {
        return true;
    }

    if (autor.equals(cadena)) {
        return true;
    }

    if (genero.equals(cadena)) {
        return true;
    }

    return false;
}
    
}
