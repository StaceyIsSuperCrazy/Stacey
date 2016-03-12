
package Stacey;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
        Tienda.cargarProductos("src/Ficheros/productos.txt");
        usuario_lbl.setText(Login.empleadoLogueado.getNombre()+" "+Login.empleadoLogueado.getApellidos());
        DefaultListModel modelo =new DefaultListModel();
        for(Producto p:Tienda.getProductos()){
            modelo.addElement(p.getNombre());
        }
        productos_jlist.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario_lbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        productos_jlist = new javax.swing.JList<>();
        vender_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        productos_jlist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(productos_jlist);

        vender_btn.setText("Vender");
        vender_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vender_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(usuario_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vender_btn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(usuario_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vender_btn)
                .addContainerGap(76, Short.MAX_VALUE))
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
                        JOptionPane.showMessageDialog(this, "Producto vendido. Quedan " + p.getUnidades() +" unidades\nLa cantidad a devolver es "+(importe-p.getPrecio()) + "€");
                    }
                }
                break;
            }
        }
    }//GEN-LAST:event_vender_btnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ManipularFichero.ManipularFichero.escribirLista(Tienda.getProductos(), "src/Ficheros/productos.txt");
    }//GEN-LAST:event_formWindowClosing

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> productos_jlist;
    private javax.swing.JLabel usuario_lbl;
    private javax.swing.JButton vender_btn;
    // End of variables declaration//GEN-END:variables
}
