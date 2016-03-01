
package Stacey;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tienda {
    private static final ArrayList<Producto> productos=new ArrayList();
    private static final ArrayList<Empleado> empleados=new ArrayList();
    
    public static void cargarEmpleados(){
        String[] cadena;
        try{
        Scanner lector = new Scanner(new File("src/Stacey/empleados.txt"));
        while(lector.hasNextLine()){
            cadena=lector.nextLine().split(",");
            empleados.add(new Empleado(cadena[0],cadena[1],cadena[2],new Usuario(cadena[3],cadena[4])));
        }
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void login(){
        boolean error = true;
        do{
            String usuario = JOptionPane.showInputDialog("Usuario: ");
            String pass = JOptionPane.showInputDialog("Contraseña: ");
            Usuario userIntroducido = new Usuario(usuario,pass);
            for(Empleado e:empleados){
                if(e.getUsuario().equals(userIntroducido)){
                    JOptionPane.showMessageDialog(null,"Bienvenido " + e.getNombre());
                    error=false;
                    break;
                }
            }
            if(error){
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
                deseaSalir();
            }
        }while(error);
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
                JOptionPane.showMessageDialog(null, p);
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
                    JOptionPane.showMessageDialog(null, "Producto vendido\nQuedan " + productos.get(i).getUnidades() + " unidades\nGracias por su compra :)");
                }
            }
        }
        if(notFound){
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }
    }
    
    public static void cargarProductos(){
        String[] cadena;
        try{
        Scanner lector = new Scanner(new File("src/Stacey/productos.txt"));
        while(lector.hasNextLine()){
            cadena=lector.nextLine().split(",");
            productos.add(new Producto(cadena[0],Float.parseFloat(cadena[1]),Byte.parseByte(cadena[2]),Integer.parseInt(cadena[3])));
        }
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
