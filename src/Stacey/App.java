
package Stacey;
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        Tienda.cargarEmpleados();
        Tienda.login();
        Tienda.cargarProductos();
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
