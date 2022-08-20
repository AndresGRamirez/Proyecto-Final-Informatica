/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.programacion.proyectofinal;


/**
 *
 * @author Emiliano
 */
public class Peliculas {
    
    String pelicula;
    String edad;
    String sala;

    public Peliculas(String pelicula, String edad, String sala) {
        this.pelicula = pelicula;
        this.edad = edad;
        this.sala = sala;
    }
    
    public Peliculas(){
        
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "pelicula=" + pelicula + ", edad=" + edad + ", sala=" + sala + '}';
    }
    
    
    
}
