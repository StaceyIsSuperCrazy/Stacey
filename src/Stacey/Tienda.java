
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
    private static ArrayList<Producto> productos=new ArrayList();
    private static ArrayList<Empleado> empleados=new ArrayList();

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
            empleados.add(new Empleado(cadena[0],cadena[1],cadena[2],new Usuario(cadena[3],cadena[4]),Integer.parseInt(cadena[5])));
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
    
    public static void cargarProductos(String ruta){
        String[] cadena;
        try{
        Scanner lector = new Scanner(new File(ruta));
        while(lector.hasNextLine()){
            cadena=lector.nextLine().split(",");
            productos.add(new Producto(cadena[0],Float.parseFloat(cadena[1]),Integer.parseInt(cadena[2])));
        }
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    
    
    
}
