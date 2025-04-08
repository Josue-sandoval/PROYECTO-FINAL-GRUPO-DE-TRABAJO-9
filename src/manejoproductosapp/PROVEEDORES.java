package manejoproductosapp;

import javax.swing.*;

public class PROVEEDORES extends javax.swing.JFrame {

    public PROVEEDORES() {
        initComponents();
        setLocationRelativeTo(null); // Centrar la ventana
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbTipoSuplemento = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnRegresar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("TIPO DE SUPLEMENTO");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("DESCRIPCION DE LOS TIPOS DE PROVEEDORES POR SUPLEMENTO");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white));

        cmbTipoSuplemento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbTipoSuplemento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proteína", "Creatina", "BCAA", "Pre-entreno", "Quemadores", "Vitaminas", " " }));
        cmbTipoSuplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoSuplementoActionPerformed(evt);
            }
        });

        txtDescripcion.setBackground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtDescripcion);

        btnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 0, 0));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(0, 0, 0));
        btnsalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 0, 0));
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LISTA DE PROVEEDORES DEPORTIVOS");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipoSuplemento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbTipoSuplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
          MENUPRINCIPAL mainForm = new MENUPRINCIPAL();
    mainForm.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(
            this, 
            "¿Está seguro que desea salir?", 
            "Confirmar salida", 
            JOptionPane.YES_NO_OPTION
        );
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            System.exit(0); // Cierra la aplicación completamente
        }
    }//GEN-LAST:event_btnsalirActionPerformed

    private void cmbTipoSuplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoSuplementoActionPerformed
     String tipoSeleccionado = (String) cmbTipoSuplemento.getSelectedItem();
    StringBuilder descripcion = new StringBuilder();

    switch (tipoSeleccionado) {
        case "Proteína":
            descripcion.append(" PRINCIPALES PROVEEDORES DE PROTEÍNA:\n")
                      .append("• Optimum Nutrition (EE.UU.)\n")
                      .append("• Dymatize (Alemania)\n")
                      .append("• Quest Nutrition (EE.UU.)\n")
                      .append("• MuscleTech (Canadá)\n")
                      .append("• BSN (EE.UU.)\n")
                      .append("• Myprotein (Reino Unido)\n")
                      .append("• Sascha Fitness (México)\n")
                      .append("• BULK (Reino Unido)\n");
            break;

        case "Creatina":
            descripcion.append("PROVEEDORES DE CREATINA:\n")
                      .append("• Optimum Nutrition (EE.UU.)\n")
                      .append("• MuscleTech (Canadá)\n")
                      .append("• Creapure® (Ingrediente premium alemán)\n")
                      .append("• Nutrabolt (C4 - EE.UU.)\n")
                      .append("• Kaged Muscle (EE.UU.)\n")
                      .append("• BulkSupplements (EE.UU.)\n");
            break;

        case "BCAA":
            descripcion.append(" PROVEEDORES DE BCAA:\n")
                      .append("• Optimum Nutrition (EE.UU.)\n")
                      .append("• Scivation Xtend (EE.UU.)\n")
                      .append("• Cellucor Alpha Amino (EE.UU.)\n")
                      .append("• Nutrabolt C4 BCAA (EE.UU.)\n")
                      .append("• Evlution Nutrition BCAA Energy (EE.UU.)\n")
                      .append("• Myprotein (Reino Unido)\n");
            break;

        case "Pre-entreno":
            descripcion.append("MEJORES PRE-ENTRENOS:\n")
                      .append("• Cellucor C4 (EE.UU.)\n")
                      .append("• Nutrabolt C4 Original (EE.UU.)\n")
                      .append("• Bucked Up (EE.UU.)\n")
                      .append("• Pre JYM (EE.UU.)\n")
                      .append("• Beyond Raw LIT (EE.UU.)\n")
                      .append("• Gorilla Mind (EE.UU.)\n");
            break;

        case "Quemadores":
            descripcion.append(" PROVEEDORES DE QUEMADORES:\n")
                      .append("• Nutrex Research Lipo-6 (EE.UU.)\n")
                      .append("• MuscleTech Hydroxycut (Canadá)\n")
                      .append("• Evlution Nutrition Lean Mode (EE.UU.)\n")
                      .append("• NLA for Her Shred Her (EE.UU.)\n")
                      .append("• Applied Nutrition Green Tea Fat Burner (Reino Unido)\n")
                      .append("• Transparent Labs Fat Burner (EE.UU.)\n");
            break;

        case "Vitaminas":
            descripcion.append(" PRINCIPALES MARCAS DE VITAMINAS:\n")
                      .append("• Optimum Nutrition Opti-Men/Women (EE.UU.)\n")
                      .append("• Nature Made (EE.UU.)\n")
                      .append("• Centrum (EE.UU.)\n")
                      .append("• GNC (Global)\n")
                      .append("• Now Foods (EE.UU.)\n")
                      .append("• Garden of Life (EE.UU.)\n");
            break;

        default:
            descripcion.append("ℹ️ Seleccione un tipo de suplemento válido.");
    }

    txtDescripcion.setText(descripcion.toString());
    txtDescripcion.setCaretPosition(0); // Scroll al inicio
          
    }//GEN-LAST:event_cmbTipoSuplementoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cmbTipoSuplemento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
 public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new PROVEEDORES().setVisible(true);
        });
    }
  }






