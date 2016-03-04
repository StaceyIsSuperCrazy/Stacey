
package Stacey;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Tienda {
    private static final ArrayList<Producto> productos=new ArrayList();
    private static final ArrayList<Empleado> empleados=new ArrayList();

    public static ArrayList<Producto> getProductos() {
        return productos;
    }

    public static ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    
    public static void cargarEmpleados(String ruta){
        String[] cadena;
        try{
        Scanner lector = new Scanner(new File(ruta));
        while(lector.hasNextLine()){
            cadena=lector.nextLine().split(",");
            empleados.add(new Empleado(cadena[0],cadena[1],cadena[2],new Usuario(cadena[3],cadena[4])));
        }
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void login(){
        JPasswordField password = new JPasswordField();
        JLabel contrasena = new JLabel("Contraseña:");
        JLabel usuario = new JLabel("Usuario:");
        JTextField user = new JTextField();
        boolean condicionFin = true;
        boolean incorrecto = true;
        Object[] ob={usuario,user,contrasena,password};
        do{
        int option = JOptionPane.showConfirmDialog(null, ob, "Login",JOptionPane.OK_CANCEL_OPTION);
        if(option==JOptionPane.OK_OPTION){
            for(Empleado e:empleados){
                if(e.getUsuario().equals(new Usuario(user.getText(),password.getText()))){
                    JOptionPane.showMessageDialog(null,"Bienvenido " + e.getNombre());
                    incorrecto=false;
                    condicionFin=false;
                    break;
                }
            }
            if(incorrecto){
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        }else{
            System.exit(0);
        }
        }while(condicionFin);
    }

    private static void deseaSalir(){
        String respuesta = JOptionPane.showInputDialog("Quiere salir de la aplicacion? (y/n)");
        if(respuesta.equalsIgnoreCase("y")){
            System.exit(0);
        }else if(respuesta.equalsIgnoreCase("n")){
            
        }else{
            JOptionPane.showMessageDialog(null, "Eso no es ni sí ni no, lo interpretaré como un no");
        }
    }
    
    public static void buscarProducto(String busqueda){
        boolean notFound = true;
        for(Producto p:productos){
            if(p.getNombre().contains(busqueda)){
                notFound=false;
                JOptionPane.showMessageDialog(null, p.show());
            }
        }
        if(notFound){
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }
    }
    
    public static void venderProducto(){
        boolean notFound = true;
        String codVender = JOptionPane.showInputDialog("Codigo del producto a vender: ");
        for(int i=0;i<productos.size();i++){
            if(productos.get(i).getCodigoP().equals(codVender)){
                notFound=false;
                if(productos.get(i).getUnidades()==0){
                    JOptionPane.showMessageDialog(null, "Producto agotado");
                }else{
                    productos.get(i).setUnidades(productos.get(i).getUnidades()-1);
                    float precioFinal = productos.get(i).getPrecio();
                    //No funciona cuando el producto tiene descuento
                    if(productos.get(i).getDescuento()!=0){
                        precioFinal = (float)Math.floor(productos.get(i).getPrecio()-(productos.get(i).getPrecio()*productos.get(i).getDescuento()/100));
                    }
                    float importe;
                    do{
                    importe = Float.parseFloat(JOptionPane.showInputDialog("El precio del producto es de " + precioFinal + "€\nIntroduzca importe del cliente:"));
                    if(importe<precioFinal)
                        JOptionPane.showMessageDialog(null, "Introduzca un importe mayor al precio del producto");
                    else
                        JOptionPane.showMessageDialog(null, "La vuelta es de " + (importe-precioFinal) + "€");
                    }while(importe<precioFinal);
                    JOptionPane.showMessageDialog(null, "Producto vendido\nQuedan " + productos.get(i).getUnidades() + " unidades\nGracias por su compra :)");
                }
            }
        }
        if(notFound){
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }
    }
    
    public static void cargarProductos(String ruta){
        String[] cadena;
        try{
        Scanner lector = new Scanner(new File(ruta));
        while(lector.hasNextLine()){
            cadena=lector.nextLine().split(",");
            productos.add(new Producto(cadena[0],Float.parseFloat(cadena[1]),Byte.parseByte(cadena[2]),Integer.parseInt(cadena[3])));
        }
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void crearProducto(){
        JLabel nombre = new JLabel("Nombre: ");
        JLabel precio = new JLabel("Precio: ");
        JLabel descuento = new JLabel("Descuento: ");
        JLabel unidades = new JLabel("Unidades: ");
        JTextField nombre_text = new JTextField();
        JTextField precio_text = new JTextField();
        JTextField descuento_text = new JTextField();
        JTextField unidades_text = new JTextField();
        Object[] ob = {nombre,nombre_text,precio,precio_text,descuento,descuento_text,unidades,unidades_text};
        JOptionPane.showConfirmDialog(null, ob, "Registrar producto", JOptionPane.OK_CANCEL_OPTION);
        productos.add(new Producto(nombre_text.getText(),Float.parseFloat(precio_text.getText()),Byte.parseByte(descuento_text.getText()),Integer.parseInt(unidades_text.getText())));
        JOptionPane.showMessageDialog(null, "Producto creado");
    }
    
    
    
    
}
