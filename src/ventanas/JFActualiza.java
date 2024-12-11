/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import crud.CActualiza;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import utilitarios.CUtilitarios;

/**
 *
 * @author HP
 */
public class JFActualiza extends javax.swing.JFrame {

    CActualiza modelos = new CActualiza();
    ArrayList<String[]> resultados = new ArrayList<>();
    ArrayList<String[]> tipo = new ArrayList<>();
    int numero;

    private void combo_box() {
        try {
            jCBCivil.removeAllItems();
            tipo = modelos.carga_tipo_pasajero();
            for (String[] opciones : tipo) {
                int id = Integer.parseInt(opciones[0]);
                String tipo = opciones[1];
                String cadena = id + "  " + tipo;
                jCBCivil.addItem(cadena);
            }
        } catch (Exception e) {
        }
    }

    private void combo_box1() {
        try {
            jCBDireccion.removeAllItems();
            tipo = modelos.carga_tipo_direccion();
            for (String[] opciones : tipo) {
                int id = Integer.parseInt(opciones[0]);
                String tipo = opciones[1];
                String cadena = id + "  " + tipo;
                jCBCivil.addItem(cadena);
            }
        } catch (Exception e) {
        }
    }

    private void combo_box2() {
        try {
            jCBNacionalidad.removeAllItems();
            tipo = modelos.carga_tipo_nacionalidad();
            for (String[] opciones : tipo) {
                int id = Integer.parseInt(opciones[0]);
                String tipo = opciones[1];
                String cadena = id + "  " + tipo;
                jCBCivil.addItem(cadena);
            }
        } catch (Exception e) {
        }
    }

    private void limpiar_tabla() {
        DefaultTableModel modelTabla
                = (DefaultTableModel) jTDatos.getModel();
        for (int i = (modelTabla.getRowCount() - 1); i >= 0; i--) {
            modelTabla.removeRow(i);
        }
    }

    private void limpiar_campos() {
        jTFNombre.setText("");
        jTFPaterno.setText("");
        jTFMaterno.setText("");
        jTFRfc.setText("");
        jTFCorreo.setText("");
    }

    private boolean campos_vacios() {
        return jTFNombre.getText().isEmpty()
                || jTFPaterno.getText().isEmpty()
                || jTFMaterno.getText().isEmpty()
                || jTFRfc.getText().isEmpty()
                || jTFCorreo.getText().isEmpty();

    }

    private void lee_datos() {
        numero = 1;
        //2.- obtener modelo de la tabla de datos
        DefaultTableModel modelTabla
                = (DefaultTableModel) jTDatos.getModel();
        try {
            //3. leer los dtos
            resultados = modelos.busca_objetos_model();
            limpiar_tabla();
            //asignar dtos a la tabla
            for (String[] resultado : resultados) {
                //añadir datos al modelo de la tabla
                modelTabla.addRow(new Object[]{
                    resultado[0],
                    resultado[1],
                    resultado[2],
                    resultado[3],
                    resultado[4],
                    resultado[5],
                    resultado[6],
                    resultado[7],
                    resultado[8],});
            }

        } catch (SQLException e) {
        }
    }

    private int lee_fila_seleccionada() {
        int id = -1;
        DefaultTableModel modelTabla
                = (DefaultTableModel) jTDatos.getModel();
        if (modelTabla.getRowCount() != 0) {//tabla con filas
            if (jTDatos.getSelectedRow() != -1) {
                id = Integer.parseInt((String) modelTabla.getValueAt(jTDatos.getSelectedRow(), 0));
                jTFNombre.setText((String) modelTabla.getValueAt(jTDatos.getSelectedRow(), 1));
                jTFPaterno.setText((String) modelTabla.getValueAt(jTDatos.getSelectedRow(), 2));
                jTFMaterno.setText((String) modelTabla.getValueAt(jTDatos.getSelectedRow(), 3));
                jTFRfc.setText((String) modelTabla.getValueAt(jTDatos.getSelectedRow(), 4));
                jTFCorreo.setText((String) modelTabla.getValueAt(jTDatos.getSelectedRow(), 4));
                //  jTFTipo.setText((String) modelTabla.getValueAt(jTpasajero.getSelectedRow(), 5));

            }

        }
        return id;
    }

    private void actualiza_dato() {
        int id;
        DefaultTableModel modelTabla
                = (DefaultTableModel) jTDatos.getModel();
        if (campos_vacios()) {
            CUtilitarios.msg_adver("Datos vacios", "Actualiza datos");
        } else {
            try {
                id = Integer.parseInt((String) modelTabla.getValueAt(jTDatos.getSelectedRow(), 0));
                String nombre = jTFNombre.getText();
                String paterno = jTFPaterno.getText();
                String materno = jTFMaterno.getText();
                String rfc = jTFRfc.getText();
                String correo = jTFCorreo.getText();
                modelos.actualiza_objeto_model(id, nombre, paterno, materno, rfc, correo, jCBCivil.getSelectedIndex() + 1, jCBDireccion.getSelectedIndex() + 1, jCBNacionalidad.getSelectedIndex() + 1);
                lee_datos();
            } catch (Exception e) {
            }
        }
        limpiar_campos();
    }

    public JFActualiza() {
        initComponents();
        combo_box();
        combo_box1();
        combo_box2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDatos = new javax.swing.JTable();
        jBActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jTFPaterno = new javax.swing.JTextField();
        jTFMaterno = new javax.swing.JTextField();
        jTFRfc = new javax.swing.JTextField();
        jTFCorreo = new javax.swing.JTextField();
        jCBCivil = new javax.swing.JComboBox<>();
        jCBDireccion = new javax.swing.JComboBox<>();
        jCBNacionalidad = new javax.swing.JComboBox<>();
        jBConsulta = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ACTUALIZA DATOS");

        jButton3.setText("REGRESAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre(s)", "Apellido Materno", "Apellido Paterno", "RFC", "Correo", "Estado Civil", "Direccion", "Nacionalidad"
            }
        ));
        jTDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTDatos);

        jBActualizar.setText("Actualizar");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Paterno:");

        jLabel4.setText("Materno:");

        jLabel5.setText("RFC:");

        jLabel6.setText("Correo:");

        jLabel7.setText("Estado Civil:");

        jLabel8.setText("Direccion:");

        jLabel9.setText("Nacionalidad:");

        jTFPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPaternoActionPerformed(evt);
            }
        });

        jTFRfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRfcActionPerformed(evt);
            }
        });

        jTFCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCorreoActionPerformed(evt);
            }
        });

        jCBCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Divorciado", "Viudo", "Union Libre", "Separado", "Conviviente", "Comprometido" }));
        jCBCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCivilActionPerformed(evt);
            }
        });

        jCBDireccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "56266", " " }));
        jCBDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBDireccionActionPerformed(evt);
            }
        });

        jCBNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mexico", "EU", "Canada", "Guatemala", "El Salvador", "Honduras", "Colombia", "Venezuela", "Perú", "España", "Argentina", "Chile", "Nicaragua", "Bolivia", "Cuba", " " }));

        jBConsulta.setText("Consultar");
        jBConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jTFPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jTFMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jTFRfc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jCBCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel4)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel5)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel6)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jCBDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jCBNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBConsulta)
                                .addGap(64, 64, 64)
                                .addComponent(jBActualizar)
                                .addGap(67, 67, 67)
                                .addComponent(jButton3))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCBCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCBNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jBActualizar)
                            .addComponent(jBConsulta)))
                    .addComponent(jCBDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Crear una instancia del JFrame de destino
        JFMenu menuFrame = new JFMenu();

        // Hacer visible el JFrame de destino
        menuFrame.setVisible(true);

        // Opcional: Cerrar o esconder la ventana actual
        this.dispose(); // Esto cierra la ventana actual, quítalo si no deseas cerrar esta ventana.
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        // TODO add your handling code here:
        actualiza_dato();
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jTFPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPaternoActionPerformed

    private void jTFRfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRfcActionPerformed

    private void jTFCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCorreoActionPerformed

    private void jCBCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCivilActionPerformed

    private void jCBDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBDireccionActionPerformed

    private void jBConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultaActionPerformed
        // TODO add your handling code here:
        lee_datos();
    }//GEN-LAST:event_jBConsultaActionPerformed

    private void jTDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDatosMouseClicked
        // TODO add your handling code here:
        lee_fila_seleccionada();
    }//GEN-LAST:event_jTDatosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFActualiza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFActualiza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFActualiza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFActualiza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFActualiza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBConsulta;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCBCivil;
    private javax.swing.JComboBox<String> jCBDireccion;
    private javax.swing.JComboBox<String> jCBNacionalidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDatos;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFMaterno;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFPaterno;
    private javax.swing.JTextField jTFRfc;
    // End of variables declaration//GEN-END:variables
}
