package manejoproductosapp;

import javax.swing.*;

public class MENUPRINCIPAL extends javax.swing.JFrame {

    public MENUPRINCIPAL() {
        initComponents();
        setLocationRelativeTo(null); // Centrar la ventana
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        btnAgregar = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        canvas2 = new java.awt.Canvas();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar2 = new javax.swing.JButton();
        btnAgregar3 = new javax.swing.JButton();
        btnAgregar4 = new javax.swing.JButton();
        btnAgregar5 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregar.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 0, 0));
        btnAgregar.setText("VER INVENTARIO");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Proyecto Final\\ManejoProductosApp\\menu.png")); // NOI18N
        jLabel3.setLabelFor(this);
        jLabel3.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(this);
        jLabel1.setText("MENU DE TIENDA DE SUPLEMENTOS DEPORTIVOS");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnAgregar2.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregar2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAgregar2.setForeground(new java.awt.Color(255, 0, 0));
        btnAgregar2.setText("AGREGAR PRODUCTO");
        btnAgregar2.setMargin(new java.awt.Insets(2, 15, 2, 14));
        btnAgregar2.setMaximumSize(new java.awt.Dimension(200, 30));
        btnAgregar2.setMinimumSize(new java.awt.Dimension(200, 300));
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });

        btnAgregar3.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregar3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAgregar3.setForeground(new java.awt.Color(255, 0, 0));
        btnAgregar3.setText("SALIR DEL SISTEMA");
        btnAgregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar3ActionPerformed(evt);
            }
        });

        btnAgregar4.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregar4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAgregar4.setForeground(new java.awt.Color(255, 0, 0));
        btnAgregar4.setText("ACERCA DE ");
        btnAgregar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar4ActionPerformed(evt);
            }
        });

        btnAgregar5.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregar5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAgregar5.setForeground(new java.awt.Color(255, 0, 0));
        btnAgregar5.setText("VER LISTA DE PROVEEDORES Y CATEGORIAS");
        btnAgregar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAgregar5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnAgregar4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(canvas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregar5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(btnAgregar4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
  // Abrir ventana de INVENTARIO
        INVENTARIO ventanaInventario = new INVENTARIO();
        ventanaInventario.setVisible(true);
        this.dispose(); // Opcional: cerrar el menú principal  
    }//GEN-LAST:event_btnAgregarActionPerformed

    
    
    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
    // Abrir ventana para agregar productos (SuplementosFrame)
        SuplementosFrame ventanaAgregar = new SuplementosFrame();
        ventanaAgregar.setVisible(true);
         this.dispose(); // Opcional: cerrar el menú principal 
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void btnAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar3ActionPerformed
 // Confirmar salida del sistema
        int confirmacion = JOptionPane.showConfirmDialog(
            this, 
            "¿Está seguro que desea salir?", 
            "Confirmar salida", 
            JOptionPane.YES_NO_OPTION
        );
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }       
    }//GEN-LAST:event_btnAgregar3ActionPerformed

    private void btnAgregar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar4ActionPerformed
   ACERCADE acercaDe = new ACERCADE();
    acercaDe.setVisible(true);
    this.dispose(); // Opcional: cerrar el menú principal 
    }//GEN-LAST:event_btnAgregar4ActionPerformed

    private void btnAgregar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar5ActionPerformed

    PROVEEDORES proveedoresForm = new PROVEEDORES();
    proveedoresForm.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnAgregar5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btnAgregar4;
    private javax.swing.JButton btnAgregar5;
    private java.awt.Canvas canvas1;
    private java.awt.Canvas canvas2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables


public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new MENUPRINCIPAL().setVisible(true);
        });

    // End of variables declaration                   
}
}

