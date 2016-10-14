package co.com.universidad.forms;

import co.com.universidad.manager.UniversidadManager;
import co.com.universidad.model.Estudiante;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mateo
 */
public class EstudianteForm extends javax.swing.JFrame {

    ArrayList<Estudiante> estudiantes;
    Estudiante estudianteVO = new Estudiante();
    UniversidadManager um = new UniversidadManager();
    javax.swing.table.DefaultTableModel tableModel = new javax.swing.table.DefaultTableModel(
            new Object[][]{}, new String[]{"Identificación", "Nombre", "Semestre"}) {
        Class[] types = new Class[]{
            java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
        };
        boolean[] canEdit = new boolean[]{
            false, false, false
        };

        @Override
        public Class getColumnClass(int columnIndex) {
            return types[columnIndex];
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };

    public EstudianteForm() {
        initComponents();
        jTable1.setModel(tableModel);
        estudiantes = um.getEstudiante();
        cargarEstudiantes();
    }

    private void cargarEstudiantes() {

        for (Estudiante estudiante : estudiantes) {
            tableModel.addRow(new Object[]{estudiante.getIdentificacion(), estudiante.getNombre(), estudiante.getSemestre()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdentificacion = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtSemestre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblSemestre = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estudiante    |    Universidad Quipux");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdentificacion.setText("* Identificación");
        getContentPane().add(lblIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 30));
        getContentPane().add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 210, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Nombre", "Semestre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(22, 160, 133));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 1027, 266));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 210, 30));
        getContentPane().add(txtSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 210, 30));

        lblNombre.setText("* Nombre");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 30));

        lblSemestre.setText("* Semestre");
        getContentPane().add(lblSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 30));

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/universidad/images/btnCrear.png"))); // NOI18N
        btnCrear.setBorder(null);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, -1, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/universidad/images/btnBuscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, -1, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/universidad/images/btnActualizar.png"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/universidad/images/btnEliminar.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, -1, -1));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/universidad/images/btnInicio.png"))); // NOI18N
        btnInicio.setBorder(null);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/universidad/images/frmForms.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1087, 643));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        if (txtIdentificacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la identificación");
            return;
        }
        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre");
            return;
        }
        if (txtSemestre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el semestre");
            return;
        }
        
        String id = txtIdentificacion.getText();
        String nombre = txtNombre.getText();
        int semestre = Integer.parseInt(txtSemestre.getText());

        try {
            estudianteVO.setIdentificacion(id);
            estudianteVO.setNombre(nombre);
            estudianteVO.setSemestre(semestre);
            um.crearEstudiante(id, nombre, semestre);
            
            tableModel.addRow(new Object[]{estudianteVO.getIdentificacion(), estudianteVO.getNombre(), estudianteVO.getSemestre()});
            
            txtIdentificacion.setText("");
            txtNombre.setText("");
            txtSemestre.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar.\nError " + e, "Error", ERROR);
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtIdentificacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la identificación");
        } else {

            String estudiante = txtIdentificacion.getText();
            estudianteVO = um.getEstudiante(estudiante);

            txtNombre.setText(estudianteVO.getNombre());
            txtSemestre.setText(Integer.toString(estudianteVO.getSemestre()));

            btnActualizar.setEnabled(true);
            btnCrear.setEnabled(false);
            btnEliminar.setEnabled(true);

            if (txtNombre.getText().equals("")) {
                JOptionPane.showMessageDialog(null, estudiante + " no existe");
                txtIdentificacion.setText("");
                txtNombre.setText("");
                txtSemestre.setText("");

                btnActualizar.setEnabled(false);
                btnCrear.setEnabled(true);
                btnEliminar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtIdentificacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la identificación");
            return;
        }
        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre");
            return;
        }
        if (txtSemestre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el semestre");
            return;
        }
        
        String id = txtIdentificacion.getText();
        String nombre = txtNombre.getText();
        int semestre = Integer.parseInt(txtSemestre.getText());

        try {
            estudianteVO.setIdentificacion(id);
            estudianteVO.setNombre(nombre);
            estudianteVO.setSemestre(semestre);
            um.actualizarEstudiante(id, nombre, semestre);
            
            String cod = txtIdentificacion.getText();
            int pos = 0;
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                if (jTable1.getValueAt(i, 0).toString().equals(cod)) {
                    pos = i;
                }
            }
            jTable1.setValueAt(estudianteVO.getNombre(), pos, 1);
            jTable1.setValueAt(estudianteVO.getSemestre(), pos, 2);

            txtIdentificacion.setText("");
            txtNombre.setText("");
            txtSemestre.setText("");
            
            btnCrear.setEnabled(true);
            btnActualizar.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar.\nError " + e, "Error", ERROR);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtIdentificacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la identificación", "Campo vacío", JOptionPane.WARNING_MESSAGE);
        } else {
            String id = txtIdentificacion.getText();

            int conf = JOptionPane.showConfirmDialog(null, "Seguro quieres eliminar el estudiante " + id);
            if (conf == JOptionPane.YES_OPTION) {
                um.eliminarEstudiante(id);
                btnActualizar.setEnabled(false);
                btnCrear.setEnabled(true);
                btnEliminar.setEnabled(false);
                
                String cod = txtIdentificacion.getText();
                int pos = 0;
                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    if (jTable1.getValueAt(i, 0).toString().equals(cod)) {
                        pos = i;
                    }
                }
                tableModel.removeRow(pos);
            } else if (conf == JOptionPane.NO_OPTION) {
                btnActualizar.setEnabled(false);
                btnCrear.setEnabled(true);
                btnEliminar.setEnabled(false);
            }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        new Main().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstudianteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstudianteForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}
