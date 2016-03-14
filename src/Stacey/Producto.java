
package Stacey;

/**
 * Permite instanciar objetos de tipo producto
 * @author jota
 */
public class Producto {
    private static int codigo=0;
    private String codigoP;
    private String nombre;
    private float precio;
    private int unidades;
    
    public Producto(String nombre,float precio,int unidades){
        this.codigoP=String.valueOf(codigo++);
        this.nombre=nombre;
        this.precio=precio;
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

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return nombre+","+precio+","+unidades;
    }
    
    /**
     * Muestra una cadena de caracteres que representa el producto en concreto
     * @return Devuelve la representación del objeto
     */
    public String show(){
        return "Codigo: "+this.codigoP+"\nNombre: "+this.nombre+"\nPrecio: "+this.precio+"\nDescuento:\nUnidades: "+this.unidades+"u";
    }
    
    
}
