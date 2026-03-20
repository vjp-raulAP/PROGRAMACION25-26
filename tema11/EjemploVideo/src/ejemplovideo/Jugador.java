/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplovideo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author rulaa
 */
public class Jugador {
    //Atributos
    private int id;
    private String nickname;
    private int edad;
    private Set<String> juegosFav;
    
    //Constructores
   
    public Jugador(){
        this.id = 0;
        this.nickname = "";
        this.edad = 0;
        this.juegosFav = new HashSet<>();
    }
    public Jugador(int id, String nickname, int edad) {
        this.id = id;
        this.nickname = nickname;
        this.edad = edad;
        this.juegosFav = new HashSet<>();
    }
    public Jugador(int id, String nickname, int edad, Set<String> juegosFav) {
        this.id = id;
        this.nickname = nickname;
        this.edad = edad;
        this.juegosFav = juegosFav;
    }
    
    //Getter y Setter

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public int getEdad() {
        return edad;
    }

    public Set<String> getJuegosFav() {
        return juegosFav;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setJuegosFav(Set<String> juegosFav) {
        this.juegosFav = juegosFav;
    }
    
    //metodos
    public String pedirJuego() {
        Scanner entrada = new Scanner(System .in);
        System.out.println("Nombre del juego: ");
        return entrada.nextLine();
    }
    
    public void insertarJuegosFav() {
        juegosFav.add(pedirJuego());
    }
    
    
    //ToString

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nickname=" + nickname + ", edad=" + edad + ", juegosFav=" + juegosFav + '}';
    }
    
    
}
