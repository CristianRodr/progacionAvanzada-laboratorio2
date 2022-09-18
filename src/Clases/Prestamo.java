/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author roger
 */
public class Prestamo {
    int Identificador;
    LocalDate Fecha_Prestamo;
    LocalDate Fecha_Devolucion;
    LocalDate Fecha_Entrega;
    Copia copia;

    public Prestamo() {
    }

    public Prestamo(int Identificador, LocalDate Fecha_Prestamo, LocalDate Fecha_Devolucion, LocalDate Fecha_Entrega, Copia copia) {
        this.Identificador = Identificador;
        this.Fecha_Prestamo = Fecha_Prestamo;
        this.Fecha_Devolucion = Fecha_Devolucion;
        this.Fecha_Entrega = Fecha_Entrega;
        this.copia = copia;
    }

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }

    public LocalDate getFecha_Prestamo() {
        return Fecha_Prestamo;
    }

    public void setFecha_Prestamo(LocalDate Fecha_Prestamo) {
        this.Fecha_Prestamo = Fecha_Prestamo;
    }

    public LocalDate getFecha_Devolucion() {
        return Fecha_Devolucion;
    }

    public void setFecha_Devolucion(LocalDate Fecha_Devolucion) {
        this.Fecha_Devolucion = Fecha_Devolucion;
    }

    public LocalDate getFecha_Entrega() {
        return Fecha_Entrega;
    }

    public void setFecha_Entrega(LocalDate Fecha_Entrega) {
        this.Fecha_Entrega = Fecha_Entrega;
    }

    public Copia getCopia() {
        return copia;
    }

    public void setCopia(Copia copia) {
        this.copia = copia;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "Identificador=" + Identificador + ", Fecha_Prestamo=" + Fecha_Prestamo + ", Fecha_Devolucion=" + Fecha_Devolucion + ", Fecha_Entrega=" + Fecha_Entrega + ", copia=" + copia + '}';
    }

  


    
}
