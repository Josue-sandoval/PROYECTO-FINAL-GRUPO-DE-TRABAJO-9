package manejoproductosapp;

import javax.swing.*;
import javax.swing.DefaultComboBoxModel;

public class SuplementosFrame extends javax.swing.JFrame {

    public SuplementosFrame() {
        initComponents();
        setLocationRelativeTo(null); // Centrar la ventana
        cargarMarcasPorTipo(cmbTipoSuplemento.getSelectedItem().toString()); // Cargar marcas iniciales
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbTipoSuplemento = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbMARCA = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        spnCantidad1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        cmbCodigo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TXTPRECIO = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("TIPO DE SUPLEMENTO");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("MARCA");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("DESCRIPCION");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white));

        cmbTipoSuplemento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbTipoSuplemento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proteína", "Creatina", "BCAA", "Pre-entreno", "Quemadores", "Vitaminas", " " }));
        cmbTipoSuplemento.setToolTipText("");
        cmbTipoSuplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoSuplementoActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtDescripcion);

        btnAgregar.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 0, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 0, 0));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("CANTIDAD");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white));

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
        jLabel3.setText("TIENDA DE SUPLEMENTOS DEPORTIVOS");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cmbMARCA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbMARCA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Optimum Nutrition", "Dymatize", "Quest Nutrition", "MuscleTech", "BSN", "Myprotein", "Sascha Fitness" }));
        cmbMARCA.setToolTipText("");
        cmbMARCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMARCAActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("PRECIO UNITARIO");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white));

        spnCantidad1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        spnCantidad1.setModel(new javax.swing.SpinnerNumberModel());
        spnCantidad1.setToolTipText("");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("CODIGO ");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white));

        cmbCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "001", "002", "003", "004", "005", "006" }));
        cmbCodigo.setToolTipText("");
        cmbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("DE UNIDADES");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("LEMPIRAS");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white));

        TXTPRECIO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TXTPRECIO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXTPRECIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPRECIOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(cmbTipoSuplemento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbMARCA, javax.swing.GroupLayout.Alignment.LEADING, 0, 217, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spnCantidad1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(TXTPRECIO))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cmbCodigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbTipoSuplemento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnCantidad1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(TXTPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    // Obtener los datos del formulario
        String codigo = cmbCodigo.getSelectedItem().toString();
        String tipo = cmbTipoSuplemento.getSelectedItem().toString();
        String marca = cmbMARCA.getSelectedItem().toString();
        String descripcion = txtDescripcion.getText();
        String precio = TXTPRECIO.getText();
        
        // Obtener la cantidad como Number y luego convertirla a int
        Number cantidadNumber = (Number) spnCantidad1.getValue();
        int cantidad = cantidadNumber.intValue(); // Convertir a int
     

        // Validar campos obligatorios
        if (descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La descripción es obligatoria");
            return;
        }

        // Crear el array con los datos para la tabla
        Object[] rowData = {
            codigo,
            tipo,
            marca,
            cantidad,
            precio,
            descripcion
        };

        // Abrir la ventana de inventario y agregar los datos
        INVENTARIO inventario = new INVENTARIO();
        inventario.agregarProductoATabla(rowData);
        inventario.setVisible(true);

        this.dispose(); // Cierra el formulario actual
        JOptionPane.showMessageDialog(inventario, "Producto agregado al inventario");

    }//GEN-LAST:event_btnAgregarActionPerformed

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
            System.exit(0);
        }
    }//GEN-LAST:event_btnsalirActionPerformed

    private void cmbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoActionPerformed
// Obtener el código seleccionado
        String codigo = cmbCodigo.getSelectedItem().toString();

        // Mapear códigos a tipos de suplementos
        String tipo = "";
        switch (codigo) {
            case "001":
                tipo = "Proteína";
                break;
            case "002":
                tipo = "Creatina";
                break;
            case "003":
                tipo = "BCAA";
                break;
            case "004":
                tipo = "Pre-entreno";
                break;
            case "005":
                tipo = "Quemadores";
                break;
            case "006":
                tipo = "Vitaminas";
                break;
        }

        // Establecer el tipo correspondiente
        cmbTipoSuplemento.setSelectedItem(tipo);

        // Cargar marcas según el tipo
        cargarMarcasPorTipo(tipo);
    
    }//GEN-LAST:event_cmbCodigoActionPerformed

    private void cmbMARCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMARCAActionPerformed
       
    }//GEN-LAST:event_cmbMARCAActionPerformed


    private void cmbTipoSuplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoSuplementoActionPerformed
//  // Cargar marcas según el tipo seleccionado
        String tipo = cmbTipoSuplemento.getSelectedItem().toString();
        cargarMarcasPorTipo(tipo);                         
    }//GEN-LAST:event_cmbTipoSuplementoActionPerformed

    private void TXTPRECIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPRECIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPRECIOActionPerformed


    private void cargarMarcasPorTipo(String tipo) {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        switch (tipo) {
            case "Proteína":
                model.addElement("Optimum Nutrition");
                model.addElement("Dymatize");
                model.addElement("Quest Nutrition");
                model.addElement("MuscleTech");
                model.addElement("BSN");
                model.addElement("Myprotein");
                model.addElement("Sascha Fitness");
                break;
            case "Creatina":
                model.addElement("Optimum Nutrition");
                model.addElement("MuscleTech");
                model.addElement("Creapure");
                model.addElement("Nutrabolt");
                model.addElement("Kaged Muscle");
                break;
            case "BCAA":
                model.addElement("Optimum Nutrition");
                model.addElement("Scivation Xtend");
                model.addElement("Cellucor Alpha Amino");
                model.addElement("Nutrabolt C4 BCAA");
                model.addElement("Evlution Nutrition BCAA Energy");
                model.addElement("Myprotein");
                break;
            case "Pre-entreno":
                model.addElement("Cellucor C4");
                model.addElement("Nutrabolt C4 Original");
                model.addElement("Bucked Up");
                model.addElement("Pre JYM");
                model.addElement("Beyond Raw LIT");
                model.addElement("Gorilla Mind");
                break;
            case "Quemadores":
                model.addElement("Nutrex Research Lipo-6");
                model.addElement("MuscleTech Hydroxycut");
                model.addElement("Evlution Nutrition Lean Mode");
                model.addElement("NLA for Her Shred Her");
                model.addElement("Applied Nutrition Green Tea Fat Burner");
                model.addElement("Transparent Labs Fat Burner");
                break;
            case "Vitaminas":
                model.addElement("Optimum Nutrition Opti-Men/Women");
                model.addElement("Nature Made");
                model.addElement("Centrum");
                model.addElement("GNC");
                model.addElement("Now Foods");
                model.addElement("Garden of Life");
                break;
        }

        cmbMARCA.setModel(model);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuplementosFrame().setVisible(true);
            }
        });

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTPRECIO;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cmbCodigo;
    private javax.swing.JComboBox<String> cmbMARCA;
    private javax.swing.JComboBox<String> cmbTipoSuplemento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnCantidad1;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables

}







