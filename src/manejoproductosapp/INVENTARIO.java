package manejoproductosapp;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class INVENTARIO extends javax.swing.JFrame {
    private DefaultTableModel model;
    private String[] tiposSuplemento = {"Proteína", "Creatina", "BCAA", "Pre-entreno", "Quemadores", "Vitaminas"};
    private String[] marcasSuplemento = {"Optimum Nutrition", "Dymatize", "Quest Nutrition", "MuscleTech", "BSN", "Myprotein", "Sascha Fitness"};
    private Random random = new Random();

    public INVENTARIO() {
       initComponents();
        inicializarModeloTabla();
        inicializarMarcasPorTipo(); // Inicializar el mapa de marcas por tipo
        cargarRegistrosPredefinidos();
        verificarStockBajo();
        setLocationRelativeTo(null);
        
    }

    private void inicializarModeloTabla() {
        model = new DefaultTableModel();
        model.addColumn("Código");
        model.addColumn("Tipo");
        model.addColumn("Marca");
        model.addColumn("Cantidad");
        model.addColumn("Precio Unitario (LPS)");
        model.addColumn("Descripción");
        tblProductos.setModel(model);
    }

 
       
 
    private void cargarMarcasPorTipo(String tipo) {
        DefaultComboBoxModel<String> marcaModel = new DefaultComboBoxModel<>();
        List<String> marcas = marcasPorTipo.getOrDefault(tipo, new ArrayList<>());
        for (String marca : marcas) {
            marcaModel.addElement(marca);
        }
     
    }

 private Map<String, List<String>> marcasPorTipo = new HashMap<>(); // Asegúrate de que esta línea esté descomentada al inicio de la clase

private void inicializarMarcasPorTipo() {
    marcasPorTipo.put("Proteína", List.of("Optimum Nutrition", "Dymatize", "Quest Nutrition", "BSN"));
    marcasPorTipo.put("Creatina", List.of("MuscleTech", "Myprotein", "Creapure"));
    marcasPorTipo.put("BCAA", List.of("Scivation Xtend", "Cellucor Alpha Amino"));
    marcasPorTipo.put("Pre-entreno", List.of("Cellucor C4", "Beyond Raw LIT", "Gorilla Mind"));
    marcasPorTipo.put("Quemadores", List.of("Nutrex Research", "Evlution Nutrition", "Transparent Labs"));
    marcasPorTipo.put("Vitaminas", List.of("Optimum Nutrition", "Nature Made", "Centrum"));
    // Puedes añadir más marcas específicas por tipo si lo deseas
}
    

    // Método para agregar productos desde SuplementosFrame
    public void agregarProductoATabla(Object[] rowData) {
        model.addRow(rowData);
        verificarStockBajo();
    }

    private void cargarRegistrosPredefinidos() {
         // Limpiar la tabla si ya tiene datos (opcional)
        model.setRowCount(0);

        // Definir los registros predefinidos
        Object[] producto1 = {"001", "Proteína", "Optimum Nutrition", 15, 750.00, "Proteína de suero de leche Gold Standard"};
        Object[] producto2 = {"002", "Creatina", "MuscleTech", 50, 300.00, "Creatina monohidratada Cell-Tech"};
        Object[] producto3 = {"003", "BCAA", "Scivation Xtend", 30, 550.00, "BCAA en polvo con electrolitos"};
        Object[] producto4 = {"004", "Pre-entreno", "Cellucor C4", 15, 600.00, "Pre-entreno energético original"};
        Object[] producto5 = {"005", "Quemadores", "Nutrex Research", 20, 450.00, "Quemador de grasa Lipo-6 Black"};
        Object[] producto6 = {"006", "Vitaminas", "Centrum", 40, 350.00, "Multivitaminas para adultos"};
        Object[] producto7 = {"001", "Proteína", "Dymatize", 18, 700.00, "Proteína ISO 100 hidrolizada"};
        Object[] producto8 = {"002", "Creatina", "Myprotein", 19, 250.00, "Creatina monohidratada en polvo"};
        Object[] producto9 = {"003", "BCAA", "Cellucor Alpha Amino", 22, 500.00, "BCAA con aminoácidos esenciales"};
        Object[] producto10 = {"004", "Pre-entreno", "Beyond Raw LIT", 10, 650.00, "Pre-entreno con ingredientes de vanguardia"};
         Object[] producto11 = {"001", "Proteína", "MusclePharm", 35, 680.00, "Combat Protein Powder"};
        Object[] producto12 = {"002", "Creatina", "Kaged Muscle", 45, 320.00, "CreaPure pH10"};
        Object[] producto13 = {"003", "BCAA", "Optimum Nutrition", 28, 520.00, "BCAA Boost"};
        Object[] producto14 = {"004", "Pre-entreno", "Gorilla Mind", 16, 700.00, "Gorilla Mode"};
        Object[] producto15 = {"005", "Quemadores", "Evlution Nutrition", 25, 420.00, "Lean Mode"};
        Object[] producto16 = {"006", "Vitaminas", "Nature Made", 50, 300.00, "Multivitamínico con hierro"};
        Object[] producto17 = {"001", "Proteína", "Quest Nutrition", 20, 800.00, "Quest Protein Powder"};
        Object[] producto18 = {"002", "Creatina", "NOW Foods", 70, 220.00, "Creatina Monohidrato Pura"};
        Object[] producto19 = {"003", "BCAA", "RSP Nutrition", 32, 480.00, "Amino Lean"};
        Object[] producto20 = {"004", "Pre-entreno", "Nutrabolt", 18, 580.00, "C4 Original"};
        Object[] producto21 = {"005", "Quemadores", "Transparent Labs", 15, 500.00, "Fat Burner"};
        Object[] producto22 = {"006", "Vitaminas", "GNC", 30, 400.00, "Mega Men"};
        Object[] producto23 = {"001", "Proteína", "BSN", 27, 720.00, "Syntha-6"};
        Object[] producto24 = {"002", "Creatina", "Allmax Nutrition", 55, 280.00, "Creatine Monohydrate"};
        Object[] producto25 = {"003", "BCAA", "Myprotein", 38, 450.00, "Essential BCAA 2:1:1"};


        // Agregar los registros a la tabla
        model.addRow(producto1);
        model.addRow(producto2);
        model.addRow(producto3);
        model.addRow(producto4);
        model.addRow(producto5);
        model.addRow(producto6);
        model.addRow(producto7);
        model.addRow(producto8);
        model.addRow(producto9);
        model.addRow(producto10);
         model.addRow(producto11);
        model.addRow(producto12);
        model.addRow(producto13);
        model.addRow(producto14);
        model.addRow(producto15);
        model.addRow(producto16);
        model.addRow(producto17);
        model.addRow(producto18);
        model.addRow(producto19);
        model.addRow(producto20);
        model.addRow(producto21);
        model.addRow(producto22);
        model.addRow(producto23);
        model.addRow(producto24);
        model.addRow(producto25);


        verificarStockBajo(); // Verificar stock después de cargar los predefinidos
    }

    private void verificarStockBajo() {
        for (int i = 0; i < model.getRowCount(); i++) {
            int cantidad = (int) model.getValueAt(i, 3); // Columna de Cantidad
            String nombreProducto = model.getValueAt(i, 1) + " (" + model.getValueAt(i, 2) + ")"; // Tipo (Marca)
            if (cantidad < 15) {
                JOptionPane.showMessageDialog(this, "¡Alerta de stock bajo para: " + nombreProducto + "! Quedan " + cantidad + " unidades.", "Alerta de Stock", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblProductos.setAutoCreateRowSorter(true);
        tblProductos.setBackground(new java.awt.Color(0, 0, 0));
        tblProductos.setBorder(new javax.swing.border.MatteBorder(null));
        tblProductos.setForeground(new java.awt.Color(255, 255, 255));
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "TIPO", "MARCAR", "CANTIDAD ", "PRECIO UNITARIO", "TOTAL LPS", "DESCRIPCIÓN"
            }
        ));
        tblProductos.setToolTipText("");
        tblProductos.setName(""); // NOI18N
        jScrollPane1.setViewportView(tblProductos);
        tblProductos.getAccessibleContext().setAccessibleName("1");

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("INVENTARIO DE SUPLEMENTOS DEPORTIVOS EN EXISTENCIA");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 0, 0));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
 int filaSeleccionada = tblProductos.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un producto para eliminar");
        } else {
            model.removeRow(filaSeleccionada);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
    int respuesta = JOptionPane.showConfirmDialog(
        this, 
        "¿Está seguro que desea salir de la aplicación?", 
        "Confirmar salida", 
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE
    );
    
    if (respuesta == JOptionPane.YES_OPTION) {
        // Cerrar todas las ventanas y terminar la aplicación
        System.exit(0);
    }
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
      MENUPRINCIPAL mainForm = new MENUPRINCIPAL();
    mainForm.setVisible(true);
    this.dispose();     // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new INVENTARIO().setVisible(true);
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables

        
    

    //<editor-fold defaultstate="collapsed" desc="comment">
    
}