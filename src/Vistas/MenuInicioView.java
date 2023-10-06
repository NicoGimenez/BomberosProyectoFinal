/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Lucas E. Sayago
 */
public class MenuInicioView extends javax.swing.JFrame {

    /**
     * Creates new form MenuInicioView
     */
    public MenuInicioView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDEscritorio = new javax.swing.JDesktopPane();
        jBSiniestro = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMBombero = new javax.swing.JMenuItem();
        jMBrigada = new javax.swing.JMenuItem();
        jMCuartel = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMConsultaSiniestros = new javax.swing.JMenu();
        jMModificacionDeSiniestro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBSiniestro.setText("Nuevo Siniestro");

        jDEscritorio.setLayer(jBSiniestro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDEscritorioLayout = new javax.swing.GroupLayout(jDEscritorio);
        jDEscritorio.setLayout(jDEscritorioLayout);
        jDEscritorioLayout.setHorizontalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEscritorioLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jBSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(619, Short.MAX_VALUE))
        );
        jDEscritorioLayout.setVerticalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEscritorioLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jBSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(620, Short.MAX_VALUE))
        );

        jMenu1.setText("Administracion");

        jMBombero.setText("Bombero");
        jMBombero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMBomberoActionPerformed(evt);
            }
        });
        jMenu1.add(jMBombero);

        jMBrigada.setText("Brigada");
        jMenu1.add(jMBrigada);

        jMCuartel.setText("Cuartel");
        jMenu1.add(jMCuartel);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Siniestro");

        jMConsultaSiniestros.setText("Consulta Siniestros");
        jMenu2.add(jMConsultaSiniestros);

        jMModificacionDeSiniestro.setText("Modificar Siniestro");
        jMenu2.add(jMModificacionDeSiniestro);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMBomberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMBomberoActionPerformed
        BomberoView bombero = new BomberoView();
     /*      
        jDEscritorio.removeAll();
        jDEscritorio.repaint();      
        bombero.setVisible(true);
        jDEscritorio.add(bombero);
        jDEscritorio.moveToFront(bombero);
        */
     bombero.setVisible(true);
     bombero.moveToFront();
        
    }//GEN-LAST:event_jMBomberoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSiniestro;
    private javax.swing.JDesktopPane jDEscritorio;
    private javax.swing.JMenuItem jMBombero;
    private javax.swing.JMenuItem jMBrigada;
    private javax.swing.JMenu jMConsultaSiniestros;
    private javax.swing.JMenu jMCuartel;
    private javax.swing.JMenuItem jMModificacionDeSiniestro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
