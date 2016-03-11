
package Stacey;


public class Empleado {
    private String nombre;
    private String apellidos;
    private String dni;
    private Usuario usuario;
   
    
    public Empleado(String nombre,String apellidos,String dni,Usuario usuario){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.usuario=usuario;
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
    
    
}
