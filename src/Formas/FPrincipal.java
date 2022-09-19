/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formas;

/**
 *
 * @author an1me
 */
public class FPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FPrincipal
     */
    public FPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        mbPrincipal = new javax.swing.JMenuBar();
        mBasica = new javax.swing.JMenu();
        miAutor = new javax.swing.JMenuItem();
        miLibro = new javax.swing.JMenuItem();
        mEjecucion = new javax.swing.JMenu();
        miLector = new javax.swing.JMenuItem();
        mAcerca = new javax.swing.JMenu();
        miAyuda = new javax.swing.JMenuItem();
        miAcercade = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miSalir = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal de la Biblioteca UNIR Colombia");
        setResizable(false);

        mBasica.setText("Basicas");

        miAutor.setText("Autor");
        miAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAutorActionPerformed(evt);
            }
        });
        mBasica.add(miAutor);

        miLibro.setText("Libro");
        miLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLibroActionPerformed(evt);
            }
        });
        mBasica.add(miLibro);

        mbPrincipal.add(mBasica);

        mEjecucion.setText("Ejecucion");

        miLector.setText("Lector");
        miLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLectorActionPerformed(evt);
            }
        });
        mEjecucion.add(miLector);

        mbPrincipal.add(mEjecucion);

        mAcerca.setText("Acerca de");

        miAyuda.setText("Ayuda");
        miAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAyudaActionPerformed(evt);
            }
        });
        mAcerca.add(miAyuda);

        miAcercade.setText("About");
        miAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAcercadeActionPerformed(evt);
            }
        });
        mAcerca.add(miAcercade);
        mAcerca.add(jSeparator1);

        miSalir.setText("jMenuItem2");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        mAcerca.add(miSalir);

        mbPrincipal.add(mAcerca);

        setJMenuBar(mbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAutorActionPerformed
        new FAutor().setVisible(true);
    }//GEN-LAST:event_miAutorActionPerformed

    private void miAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAyudaActionPerformed
        new Fayuda().setVisible(true);
    }//GEN-LAST:event_miAyudaActionPerformed

    private void miAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAcercadeActionPerformed
        new fAcercade().setVisible(true);
    }//GEN-LAST:event_miAcercadeActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_miSalirActionPerformed

    private void miLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLibroActionPerformed
        new Flibro().setVisible(true);
    }//GEN-LAST:event_miLibroActionPerformed

    private void miLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLectorActionPerformed
        new FLector().setVisible(true);
    }//GEN-LAST:event_miLectorActionPerformed

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
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mAcerca;
    private javax.swing.JMenu mBasica;
    private javax.swing.JMenu mEjecucion;
    private javax.swing.JMenuBar mbPrincipal;
    private javax.swing.JMenuItem miAcercade;
    private javax.swing.JMenuItem miAutor;
    private javax.swing.JMenuItem miAyuda;
    private javax.swing.JMenuItem miLector;
    private javax.swing.JMenuItem miLibro;
    private javax.swing.JMenuItem miSalir;
    // End of variables declaration//GEN-END:variables
}
