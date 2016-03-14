
package Stacey;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * Clase principal de la aplicación, es donde se encuentran la mayoría de los métodos utilizados
 * @author jota
 */
public class Principal extends javax.swing.JFrame {
    private static ArrayList<Producto> productos=new ArrayList();
    private static ArrayList<Empleado> empleados=new ArrayList();
    private static Empleado empleadoLogueado;
    private static DefaultListModel modeloLista =new DefaultListModel();

    public static ArrayList<Producto> getProductos() {
        return productos;
    }

    public static void setProductos(ArrayList<Producto> productos) {
        Principal.productos = productos;
    }

    public static ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public static void setEmpleados(ArrayList<Empleado> empleados) {
        Principal.empleados = empleados;
    }

    public static Empleado getEmpleadoLogueado() {
        return empleadoLogueado;
    }

    public static void setEmpleadoLogueado(Empleado empleadoLogueado) {
        Principal.empleadoLogueado = empleadoLogueado;
    }

    public static DefaultListModel getModeloLista() {
        return modeloLista;
    }

    public static void setModeloLista(DefaultListModel modeloLista) {
        Principal.modeloLista = modeloLista;
    }
    
    public Principal(){
        initComponents();
        cargarProductos("src/Ficheros/productos.txt");
        usuario_lbl.setText(empleadoLogueado.getNombre()+" "+empleadoLogueado.getApellidos());
        empleadoVendido_lbl.setText(String.valueOf(empleadoLogueado.getVendido()));
        for(Producto p:productos){
            modeloLista.addElement(p.getNombre());
        }
        productos_jlist.setModel(modeloLista);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario_lbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        productos_jlist = new javax.swing.JList<String>();
        vender_btn = new javax.swing.JButton();
        codigo_text = new javax.swing.JTextField();
        precio_text = new javax.swing.JTextField();
        nombre_text = new javax.swing.JTextField();
        unidades_text = new javax.swing.JTextField();
        codigo_lbl = new javax.swing.JLabel();
        precio_lbl = new javax.swing.JLabel();
        nombre_lbl = new javax.swing.JLabel();
        unidades_lbl = new javax.swing.JLabel();
        empleadoVendido_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stacey");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        usuario_lbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        productos_jlist.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        productos_jlist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                productos_jlistValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(productos_jlist);

        vender_btn.setText("Vender");
        vender_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vender_btnActionPerformed(evt);
            }
        });

        codigo_text.setEditable(false);

        precio_text.setEditable(false);

        nombre_text.setEditable(false);

        unidades_text.setEditable(false);

        codigo_lbl.setText("Código:");

        precio_lbl.setText("Precio:");

        nombre_lbl.setText("Nombre:");

        unidades_lbl.setText("Unidades:");

        jLabel1.setText("productos vendidos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre_lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codigo_lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(precio_lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(unidades_lbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codigo_text, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(empleadoVendido_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_text, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unidades_text, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precio_text, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vender_btn))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(509, 509, 509)
                .addComponent(usuario_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(usuario_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empleadoVendido_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(codigo_lbl)
                                .addComponent(codigo_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_lbl)
                            .addComponent(nombre_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precio_lbl)
                            .addComponent(precio_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unidades_lbl)
                            .addComponent(unidades_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(vender_btn)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método que carga en un arrayList los objetos de tipo producto
     * @param ruta Ruta al fichero
     */
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
    /**
     * Método que carga en un arrayList los objetos de tipo empleado
     * @param ruta Ruta al fichero
     */
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
    /**
     * Vende un producto de la tienda, resta una unidad al producto en el caso de que el importe introducido
     * sea mayor al establecido
     * @param evt 
     */
    private void vender_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vender_btnActionPerformed
        String nombreP = productos_jlist.getSelectedValue();
        for(Producto p:productos){
            if(p.getNombre().equals(nombreP)){
                if(p.getUnidades()==0){
                    JOptionPane.showMessageDialog(this,"Producto agotado");
                }else{
                    float importe = Float.parseFloat(JOptionPane.showInputDialog("El precio de ese producto es de " + p.getPrecio() + "€" + ", introduzca el importe del cliente:"));
                    if(importe<p.getPrecio()){
                        JOptionPane.showMessageDialog(this, "Esa cantidad es menor a la estipulada");
                    }else{
                        p.setUnidades(p.getUnidades()-1);
                        empleadoVendido_lbl.setText(String.valueOf(Integer.parseInt(empleadoVendido_lbl.getText())+1));
                        empleadoLogueado.setVendido(empleadoLogueado.getVendido()+1);
                        JOptionPane.showMessageDialog(this, "Producto vendido. Quedan " + p.getUnidades() +" unidades\nLa cantidad a devolver es "+(float)(importe-p.getPrecio()) + "€");
                    }
                }
                break;
            }
        }
    }//GEN-LAST:event_vender_btnActionPerformed
    /**
     * Escribe en los dos ficheros donde se guardan los datos antes de cerrar la aplicación
     * @param evt 
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ManipularFichero.ManipularFichero.escribirLista(productos, "src/Ficheros/productos.txt");
        ManipularFichero.ManipularFichero.escribirLista(empleados, "src/Ficheros/empleados.txt");
    }//GEN-LAST:event_formWindowClosing
    
    /**
     * Escribe en el formulario los atributos del producto seleccionado en el jlist
     * @param evt 
     */
    private void productos_jlistValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_productos_jlistValueChanged
        Producto p = productos.get(productos_jlist.getSelectedIndex());
        nombre_text.setText(p.getNombre());
        codigo_text.setText(p.getCodigoP());
        precio_text.setText(String.valueOf(p.getPrecio())+"€");
        unidades_text.setText(String.valueOf(p.getUnidades())+"u");
    }//GEN-LAST:event_productos_jlistValueChanged

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codigo_lbl;
    private javax.swing.JTextField codigo_text;
    private javax.swing.JLabel empleadoVendido_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombre_lbl;
    private javax.swing.JTextField nombre_text;
    private javax.swing.JLabel precio_lbl;
    private javax.swing.JTextField precio_text;
    private javax.swing.JList<String> productos_jlist;
    private javax.swing.JLabel unidades_lbl;
    private javax.swing.JTextField unidades_text;
    private javax.swing.JLabel usuario_lbl;
    private javax.swing.JButton vender_btn;
    // End of variables declaration//GEN-END:variables
}
