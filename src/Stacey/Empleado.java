
package Stacey;


public class Empleado {
    private String nombre;
    private String apellidos;
    private String dni;
    private Usuario usuario;
    private int vendido;
   
    
    public Empleado(String nombre,String apellidos,String dni,Usuario usuario,int vendido){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.usuario=usuario;
        this.vendido=vendido;
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

    public int getVendido() {
        return vendido;
    }

    public void setVendido(int vendido) {
        this.vendido = vendido;
    }

    @Override
    public String toString() {
        return nombre + "," + apellidos + "," + dni + "," + usuario + "," + vendido;
    }
    
    
}
