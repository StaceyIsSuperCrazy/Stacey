/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacey;

/**
 *
 * @author Jorge
 */
public class NewProducto extends javax.swing.JFrame {

    public NewProducto() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevoProducto_lbl = new javax.swing.JLabel();
        precio_lbl = new javax.swing.JLabel();
        nombre_lbl = new javax.swing.JLabel();
        unidades_lbl = new javax.swing.JLabel();
        precio_text = new javax.swing.JTextField();
        nombre_text = new javax.swing.JTextField();
        unidades_text = new javax.swing.JTextField();
        engadirProducto_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nuevoProducto_lbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nuevoProducto_lbl.setText("Nuevo Producto");

        precio_lbl.setText("Precio:");

        nombre_lbl.setText("Nombre:");

        unidades_lbl.setText("Unidades:");

        engadirProducto_btn.setText("Añadir");
        engadirProducto_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engadirProducto_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nuevoProducto_lbl)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nombre_lbl)
                                    .addComponent(precio_lbl)
                                    .addComponent(unidades_lbl))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre_text, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unidades_text, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(precio_text, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(engadirProducto_btn)
                                .addGap(80, 80, 80)))
                        .addGap(100, 100, 100))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nuevoProducto_lbl)
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
                .addComponent(engadirProducto_btn)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void engadirProducto_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engadirProducto_btnActionPerformed
        Producto p = new Producto(nombre_text.getText(),Float.parseFloat(precio_text.getText()),Integer.parseInt(unidades_text.getText()));
        Tienda.getProductos().add(p);
        Principal.modeloLista.addElement(p.getNombre());
        Principal.productos_jlist.setModel(Principal.modeloLista);
        setVisible(false);
    }//GEN-LAST:event_engadirProducto_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton engadirProducto_btn;
    private javax.swing.JLabel nombre_lbl;
    private javax.swing.JTextField nombre_text;
    private javax.swing.JLabel nuevoProducto_lbl;
    private javax.swing.JLabel precio_lbl;
    private javax.swing.JTextField precio_text;
    private javax.swing.JLabel unidades_lbl;
    private javax.swing.JTextField unidades_text;
    // End of variables declaration//GEN-END:variables
}
