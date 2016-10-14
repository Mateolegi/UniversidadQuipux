package co.com.universidad.forms;

import co.com.universidad.manager.UniversidadManager;
import co.com.universidad.model.Estudiante;
import co.com.universidad.model.EstudianteMateria;
import co.com.universidad.model.Profesor;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author mateo
 */
public class EstudianteMateriaForm extends javax.swing.JFrame {

    ArrayList<EstudianteMateria> notas;
    EstudianteMateria estudianteMateriaVO = new EstudianteMateria();
    UniversidadManager um = new UniversidadManager();

    javax.swing.table.DefaultTableModel tableModel = new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{
                "Estudiante", "Profesor", "Nota"
            }
    ) {
        Class[] types = new Class[]{
            java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
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

    public EstudianteMateriaForm() {
        initComponents();
        btnActualizar.setVisible(false);
        jTable1.setModel(tableModel);
        notas = um.getEstudianteMateria();
        cargarNotas();
    }

    private void cargarNotas() {

        for (EstudianteMateria nota : notas) {
            tableModel.addRow(new Object[]{nota.getEstudiante(), nota.getProfesor(), nota.getNotas().get(0)});
        }
    }

    private DefaultComboBoxModel cargarCmbEstudiante() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<Estudiante> estudiantes = um.getEstudiante();
        modelo.addElement("Seleccione un estudiante");
        for (Estudiante estudiante : estudiantes) {
            modelo.addElement(estudiante);
        }
        return modelo;
    }

    private DefaultComboBoxModel cargarCmbProfesor() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<Profesor> profesores = um.getProfesor();
        modelo.addElement("Seleccione un profesor");
        for (Profesor profesor : profesores) {
            modelo.addElement(profesor);
        }
        return modelo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdentificacion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtNota = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblMateria = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        cmbProfesor = new javax.swing.JComboBox<>();
        cmbEstudiante = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notas    |    Universidad Quipux");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdentificacion.setText("* Estudiante");
        getContentPane().add(lblIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estudiante", "Profesor", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
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
        getContentPane().add(txtNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 210, 30));

        lblNombre.setText("* Profesor");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 30));

        lblMateria.setText("* Nota");
        getContentPane().add(lblMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 30));

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/universidad/images/btnCrear.png"))); // NOI18N
        btnCrear.setBorder(null);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, -1, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/universidad/images/btnBuscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, -1, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/universidad/images/btnActualizar.png"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/universidad/images/btnEliminar.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, -1, -1));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/universidad/images/btnInicio.png"))); // NOI18N
        btnInicio.setBorder(null);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, 160, -1));

        cmbProfesor.setModel(cargarCmbProfesor());
        getContentPane().add(cmbProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 210, 30));

        cmbEstudiante.setModel(cargarCmbEstudiante());
        getContentPane().add(cmbEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 210, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/universidad/images/frmForms.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1087, 643));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        if (cmbEstudiante.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un estudiante");
            return;
        }
        if (cmbProfesor.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un profesor");
            return;
        }
        if (txtNota.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la nota");
            return;
        }

        Estudiante estudiante = (Estudiante) cmbEstudiante.getSelectedItem();
        Profesor profesor = (Profesor) cmbProfesor.getSelectedItem();
        Double nota;
        try {
            nota = Double.parseDouble(txtNota.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nota inválida");
            e.printStackTrace();
            return;
        }
        ArrayList<Double> nots = new ArrayList<>();
        nots.add(nota);

        try {
            estudianteMateriaVO.setEstudiante(estudiante);
            estudianteMateriaVO.setProfesor(profesor);
            estudianteMateriaVO.setNotas(nots);
            um.crearEstudianteMateria(estudiante, profesor, nots);

            tableModel.addRow(new Object[]{estudianteMateriaVO.getEstudiante(), estudianteMateriaVO.getProfesor(), nota});

            cmbEstudiante.setSelectedIndex(0);
            cmbProfesor.setSelectedIndex(0);
            txtNota.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar.\nError " + e, "Error", ERROR);
        }

    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (cmbEstudiante.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el estudiante");
            return;
        }
        if (cmbProfesor.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el profesor");
        }

        try {
            Estudiante estudiante = (Estudiante) cmbEstudiante.getSelectedItem();
        Profesor profesor = (Profesor) cmbProfesor.getSelectedItem();
        estudianteMateriaVO = um.getEstudianteMateria(estudiante, profesor);

        cmbEstudiante.setSelectedItem(estudianteMateriaVO.getEstudiante());
        cmbProfesor.setSelectedItem(estudianteMateriaVO.getProfesor());
        txtNota.setText(String.valueOf(estudianteMateriaVO.getNotas().get(0)));

        btnActualizar.setVisible(true);
        btnCrear.setVisible(false);
        btnEliminar.setEnabled(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No existe registro", "Error", JOptionPane.ERROR_MESSAGE);
            cmbEstudiante.setSelectedIndex(0);
            cmbProfesor.setSelectedIndex(0);
            txtNota.setText("");
            
            btnActualizar.setVisible(false);
            btnCrear.setVisible(true);
            btnEliminar.setEnabled(false);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        JOptionPane.showMessageDialog(null, "No disponible", "Proximamente", JOptionPane.ERROR_MESSAGE);
       
//        if (cmbEstudiante.getSelectedIndex() == 0) {
//            JOptionPane.showMessageDialog(null, "Ingrese el estudiante");
//            return;
//        }
//        if (cmbEstudiante.getSelectedIndex() == 0) {
//            JOptionPane.showMessageDialog(null, "Ingrese el estudiante");
//        }
//        if (txtNota.getText().equals("")) {
//            JOptionPane.showMessageDialog(null, "Por favor ingrese la nota");
//            return;
//        }
//
//        Estudiante estudiante = (Estudiante) cmbEstudiante.getSelectedItem();
//        Profesor profesor = (Profesor) cmbProfesor.getSelectedItem();
//        Double nota;
//        try {
//            nota = Double.parseDouble(txtNota.getText());
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Nota inválida");
//            e.printStackTrace();
//            return;
//        }
//        ArrayList<Double> nots = new ArrayList<>();
//        nots.add(nota);
//
//        try {
//            estudianteMateriaVO.setEstudiante(estudiante);
//            estudianteMateriaVO.setProfesor(profesor);
//            estudianteMateriaVO.setNotas(nots);
//            um.actualizarEstudianteMateria(estudiante, profesor, nots);
//
//            String estudiante2 = cmbEstudiante.getSelectedItem().toString();
//            String profesor2 = cmbProfesor.getSelectedItem().toString();
//
//            int pos = 0;
//            for (int i = 0; i < jTable1.getRowCount(); i++) {
//                if (jTable1.getValueAt(i, 0).toString().equals(estudiante2) && jTable1.getValueAt(i, 1).toString().equals(profesor2)) {
//                    pos = i;
//                }
//            }
//            jTable1.setValueAt(estudianteMateriaVO.getNotas().get(0), pos, 3);
//
//            cmbEstudiante.setSelectedIndex(0);
//            cmbProfesor.setSelectedIndex(0);
//            txtNota.setText("");
//
//            btnCrear.setEnabled(true);
//            btnActualizar.setEnabled(false);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error al guardar.\nError " + e, "Error", ERROR);
//        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (cmbEstudiante.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el estudiante");
            return;
        }
        if (cmbProfesor.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el estudiante");
        }
        
        Estudiante estudiante = (Estudiante) cmbEstudiante.getSelectedItem();
        Profesor profesor = (Profesor) cmbProfesor.getSelectedItem();

        int conf = JOptionPane.showConfirmDialog(null, "¿Seguro quieres eliminar el registro? ");
        if (conf == JOptionPane.YES_OPTION) {
            um.eliminarEstudianteMateria(estudiante, profesor);
            btnActualizar.setVisible(false);
            btnCrear.setVisible(true);
            btnEliminar.setEnabled(false);

            int pos = 0;
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                if (jTable1.getValueAt(i, 0).toString().equals(estudiante.getNombre()) && jTable1.getValueAt(i, 1).toString().equals(profesor.getNombre())) {
                    pos = i;
                }
            }
            tableModel.removeRow(pos);
        } else if (conf == JOptionPane.NO_OPTION) {
            btnActualizar.setVisible(false);
            btnCrear.setVisible(true);
            btnEliminar.setEnabled(false);
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        new Main().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed

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
            java.util.logging.Logger.getLogger(EstudianteMateriaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstudianteMateriaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JComboBox<String> cmbEstudiante;
    private javax.swing.JComboBox<String> cmbProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
