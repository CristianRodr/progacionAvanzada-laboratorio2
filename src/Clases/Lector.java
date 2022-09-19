/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases ;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 *
 * @author roger
 */
public class Lector implements Serializable{
    String nombre;
    int identificador;
    String direccion;
    int telefono;
    int copias;
    LocalDate Fecha_Multa;
    List<Prestamo> Prestamos = new ArrayList<Prestamo>();

    public Lector() {
    }

    public Lector(String nombre, int identificador, String direccion, int telefono, int copias, LocalDate Fecha_Multa) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.direccion = direccion;
        this.telefono = telefono;
        this.copias = copias;
        this.Fecha_Multa = Fecha_Multa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public LocalDate getFecha_Multa() {
        return Fecha_Multa;
    }

    public void setFecha_Multa(LocalDate Fecha_Multa) {
        this.Fecha_Multa = Fecha_Multa;
    }

    public List<Prestamo> getPrestamos() {
        return Prestamos;
    }

    public void setPrestamos(List<Prestamo> Prestamos) {
        this.Prestamos = Prestamos;
    }

    public void Generar_Prestamo(int Identificador,Copia copia){
       LocalDate fechaActual =  LocalDate.now();
       LocalDate fechaDevolucion =fechaActual.plusDays(30);
       if (this.copias>=3) {
           System.out.println("El número de copias es máximo 3, debe devolver un libro");
       } else {
               if ((this.Fecha_Multa==null) || (this.Fecha_Multa.isAfter(fechaActual))){
                    if (copia.getEstado().equals("Biblioteca")) {
                        Prestamo prestamo = new Prestamo(Identificador,fechaActual,fechaDevolucion,null,copia);
                        this.Prestamos.add(prestamo);
                        this.copias=this.copias+1;
                        copia.setEstado("Prestámo");
                        System.out.println(prestamo.toString());   
                    } else {
                        System.out.println("La copia no se puede prestar.");
                    }
               } else {
                    if (this.Fecha_Multa.isAfter(fechaActual)) {
                        System.out.println("Tiene multa pendiente");
                    }
               }
        }
    }

    @Override
    public String toString() {
        return "Lector{" + "nombre=" + nombre + ", identificador=" + identificador + ", direccion=" + direccion + ", telefono=" + telefono + ", copias=" + copias + ", Fecha_Multa=" + Fecha_Multa + ", Prestamos=" + Prestamos + '}';
    }
    
    public void Generar_Devolución(int identificacion){
        long diasMulta;
        boolean encontrado;
        encontrado=false;
        for (int x = 0; x < this.Prestamos.size(); x++) {
            Prestamo p = this.Prestamos.get(x);
            if (p.getIdentificador()==identificacion) {
                if (p.Fecha_Devolucion.isBefore(LocalDate.now())){
                    diasMulta = (DAYS.between(p.Fecha_Devolucion, LocalDate.now()))*2;
                    System.out.println("Numero de dias: " + diasMulta); // 365 dias
                    if (diasMulta>0){
                       this.Fecha_Multa = this.Fecha_Multa.plusDays(diasMulta);    
                    }                    
                }
                this.copias=this.copias-1;
                this.Prestamos.remove(x);
                encontrado=true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Devolución Exitosa."); 
        } else {
            System.out.println("Devolución Fallida.");
        }
    }
}
