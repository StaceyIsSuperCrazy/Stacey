/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacey;
import javax.swing.JOptionPane;

/**
 *
 * @author Jota
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tienda.cargarUsuarios();
        Tienda.cargarProductos();
        Tienda.login();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1)Vender Producto\n2)Buscar Producto"));
        switch(opcion){
            case 1:
                Tienda.venderProducto();
                break;
            case 2:
                String buscar = JOptionPane.showInputDialog("Introduce el nombre del producto:");
                Tienda.buscarProducto(buscar);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No es una opción válida.");
        }
    }
    
}
