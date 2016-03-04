
package Stacey;
import javax.swing.JOptionPane;

public class App {
    final static String rutaEmployers = "src/Ficheros/empleados.txt";
    final static String rutaProducts = "src/Ficheros/productos.txt";
    
    public static void main(String[] args) {
        Tienda.cargarEmpleados(rutaEmployers);
        Tienda.login();
        Tienda.cargarProductos(rutaProducts);
        do{
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1)Vender Producto\n2)Buscar Producto\n3)Crear producto\n4)Salir"));
        switch(opcion){
            case 1:
                Tienda.venderProducto();
                break;
            case 2:
                String buscar = JOptionPane.showInputDialog("Introduce el nombre del producto:");
                Tienda.buscarProducto(buscar);
                break;
            case 3:
                Tienda.crearProducto();
                break;
            case 4:
                ManipularFichero.ManipularFichero.escribirLista(Tienda.getProductos(), rutaProducts);
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "No es una opción válida.");
        }
        }while(true);
    }
    
}
