package co.com.universidad.forms;

import co.com.universidad.manager.UniversidadManager;

/**
 *
 * @author mateo
 */
public class Start {
    
    UniversidadManager um = new UniversidadManager();
    public Start() {
        um.crearMateria(1000, "Cálculo", "Cálculo I", 60);
        um.crearMateria(1001, "Ciencias", "Ciencias I", 50);
        um.crearMateria(1002, "Deportes", "Deportes I", 40);
        
        um.crearEstudiante("991215", "Mateo Leal", 1);
        um.crearEstudiante("100012", "Julián Castaño", 1);
        um.crearEstudiante("996584", "Andrés Cardona", 2);
        
        new Main().setVisible(true);
    }
    public static void main(String[] args) {
        
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
            java.util.logging.Logger.getLogger(MateriaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        new Start();
    }
}