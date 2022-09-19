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
public class Copia implements Serializable{
    int identificador;
    String estado;
    Libro libro;

    public Copia() {
    }

    public Copia(int identificador, String estado, Libro libro) {
        this.identificador = identificador;
        this.estado = estado;
        this.libro = libro;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "Copia{" + "identificador=" + identificador + ", estado=" + estado + ", libro=" + libro + '}';
    }
    
    
}
