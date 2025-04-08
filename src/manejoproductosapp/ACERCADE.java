package manejoproductosapp;

import javax.swing.*;

public class ACERCADE extends javax.swing.JFrame {

    public ACERCADE() {
        initComponents();
        setLocationRelativeTo(null); // Centrar la ventana
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnRegresar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDescripcion.setBackground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setText("Sistema de Gestión de Inventarios\n\nDesarrollado como proyecto final para el curso de Programación Orientada a Objetos (VIR/DO-2, ciclo 1P25), este sistema permite gestionar de manera eficiente el inventario de una empresa de suplementos deportivos, incorporando funcionalidades clave como:\n\nRegistro y modificación de productos, categorías y proveedores\n\nControl de stock con seguimiento de entradas y salidas\n\nSistema de alertas para productos con bajo inventario\n\nGeneración de reportes en diferentes formatos\n\nEl proyecto aplica los principios de POO (Encapsulación, Herencia, Polimorfismo y Abstracción) y utiliza Java para garantizar un código organizado y escalable.\n\nIntegrantes del Equipo\n\nJosue Alejandro Sandoval Galindo\n#Cuenta: 201630010142\nResponsable del módulo de productos y categorías\n\nJosé Ramón Hernández Dubón\n#Cuenta: 202130010067\nResponsable del sistema de alertas y validaciones\n\nCarlos Manuel Vides Martínez\n#Cuenta: 202410011012\nResponsable de la base de datos y generación de reportes\n\nObjetivo final\nEste proyecto fue desarrollado como parte de los requerimientos académicos del curso de Programación Orientada a Objetos, aplicando los conceptos aprendidos durante el perido para crear una solución funcional y bien estructurada. \nEl sistema demuestra cómo la POO puede ser utilizada para resolver problemas del mundo real de manera eficiente.");
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
        jLabel3.setText(" DESCRIPCIÓN DEL PROYECTO");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
 public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new ACERCADE().setVisible(true);
        });
    }
  }






