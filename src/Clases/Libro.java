/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author roger
 */
public class Libro implements Serializable{
    String nombre;
    String tipo;
    String editorial;
    int annio;
    Autor autor;

    public Libro() {
    }

    public Libro(String nombre, String tipo, String editorial, int annio, Autor autor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.annio = annio;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", tipo=" + tipo + ", editorial=" + editorial + ", annio=" + annio + ", autor=" + autor + '}';
    }
    
    
}
