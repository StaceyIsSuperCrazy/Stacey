/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacey;


/**
 *
 * @author Jota
 */
public class Producto {
    private static int codigo=0;
    private String codigoP;
    private String nombre;
    private float precio;
    private byte descuento;
    private int unidades;
    
    public Producto(String nombre,float precio,byte descuento,int unidades){
        this.codigoP=String.valueOf(codigo++);
        this.nombre=nombre;
        this.precio=precio;
        this.descuento=descuento;
        this.unidades=unidades;
    }

    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public byte getDescuento() {
        return descuento;
    }

    public void setDescuento(byte descuento) {
        this.descuento = descuento;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigoP=" + codigoP + ", nombre=" + nombre + ", precio=" + precio+"€" + ", descuento=" + descuento +"%"+ ", unidades=" + unidades + '}';
    }
    
    
}
