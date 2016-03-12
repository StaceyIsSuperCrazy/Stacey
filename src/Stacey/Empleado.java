
package Stacey;

import java.util.TimerTask;

public class Empleado {
    private String nombre;
    private String apellidos;
    private String dni;
    private Usuario usuario;
    private int productosVendidos;
    private double tiempoTrabajado;
    private TimerTask tiempo = new TimerTask() {
        @Override
        public void run() {
            tiempoTrabajado++;
        }
    };
    
    public Empleado(String nombre,String apellidos,String dni,Usuario usuario,int productosVendidos){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.usuario=usuario;
        this.productosVendidos=productosVendidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(int productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public double getTiempoTrabajado() {
        return tiempoTrabajado;
    }

    public void setTiempoTrabajado(double tiempoTrabajado) {
        this.tiempoTrabajado = tiempoTrabajado;
    }

    public TimerTask getTiempo() {
        return tiempo;
    }

    public void setTiempo(TimerTask tiempo) {
        this.tiempo = tiempo;
    }
    
    

    @Override
    public String toString() {
        return this.nombre+","+this.apellidos+","+this.dni+","+this.usuario+","+this.productosVendidos;
    }
    
    
}
