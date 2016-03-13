
package Stacey;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {
    
    static DefaultListModel modeloLista =new DefaultListModel();
    
    public Principal() {
        initComponents();
        Tienda.cargarProductos("src/Ficheros/productos.txt");
        usuario_lbl.setText(Login.empleadoLogueado.getNombre()+" "+Login.empleadoLogueado.getApellidos());
        empleadoVendido_lbl.setText(String.valueOf(Login.empleadoLogueado.getVendido()));
        for(Producto p:Tienda.getProductos()){
            modeloLista.addElement(p.getNombre());
        }
        productos_jlist.setModel(modeloLista);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario_lbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        productos_jlist = new javax.swing.JList<>();
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
        engadirProducto_btn = new javax.swing.JButton();
        eliminarProducto_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stacey");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        usuario_lbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usuario_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuario_lblMouseClicked(evt);
            }
        });

        productos_jlist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
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

        codigo_lbl.setText("Código:");

        precio_lbl.setText("Precio:");

        nombre_lbl.setText("Nombre:");

        unidades_lbl.setText("Unidades:");

        jLabel1.setText("productos vendidos");

        engadirProducto_btn.setText("Añadir Producto");
        engadirProducto_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engadirProducto_btnActionPerformed(evt);
            }
        });

        eliminarProducto_btn.setText("Eliminar Producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombre_lbl)
                    .addComponent(codigo_lbl)
                    .addComponent(precio_lbl)
                    .addComponent(unidades_lbl))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(509, 509, 509)
                .addComponent(usuario_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(engadirProducto_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarProducto_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(usuario_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigo_lbl)
                            .addComponent(codigo_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empleadoVendido_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
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
                .addGap(18, 18, 18)
                .addComponent(engadirProducto_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarProducto_btn)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void vender_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vender_btnActionPerformed
        String nombreP = productos_jlist.getSelectedValue();
        for(Producto p:Tienda.getProductos()){
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
                        Login.empleadoLogueado.setVendido(Login.empleadoLogueado.getVendido()+1);
                        JOptionPane.showMessageDialog(this, "Producto vendido. Quedan " + p.getUnidades() +" unidades\nLa cantidad a devolver es "+(importe-p.getPrecio()) + "€");
                    }
                }
                break;
            }
        }
    }//GEN-LAST:event_vender_btnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ManipularFichero.ManipularFichero.escribirLista(Tienda.getProductos(), "src/Ficheros/productos.txt");
        ManipularFichero.ManipularFichero.escribirLista(Tienda.getEmpleados(), "src/Ficheros/empleados.txt");
    }//GEN-LAST:event_formWindowClosing

    private void productos_jlistValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_productos_jlistValueChanged
        Producto p = Tienda.getProductos().get(productos_jlist.getSelectedIndex());
        nombre_text.setText(p.getNombre());
        codigo_text.setText(p.getCodigoP());
        precio_text.setText(String.valueOf(p.getPrecio())+"€");
        unidades_text.setText(String.valueOf(p.getUnidades())+"u");
    }//GEN-LAST:event_productos_jlistValueChanged

    private void usuario_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuario_lblMouseClicked
        
    }//GEN-LAST:event_usuario_lblMouseClicked

    private void engadirProducto_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engadirProducto_btnActionPerformed
        NewProducto newp = new NewProducto();
        newp.setVisible(true);
    }//GEN-LAST:event_engadirProducto_btnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codigo_lbl;
    private javax.swing.JTextField codigo_text;
    private javax.swing.JButton eliminarProducto_btn;
    private javax.swing.JLabel empleadoVendido_lbl;
    private javax.swing.JButton engadirProducto_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombre_lbl;
    private javax.swing.JTextField nombre_text;
    private javax.swing.JLabel precio_lbl;
    private javax.swing.JTextField precio_text;
    protected static javax.swing.JList<String> productos_jlist;
    private javax.swing.JLabel unidades_lbl;
    private javax.swing.JTextField unidades_text;
    private javax.swing.JLabel usuario_lbl;
    private javax.swing.JButton vender_btn;
    // End of variables declaration//GEN-END:variables
}
