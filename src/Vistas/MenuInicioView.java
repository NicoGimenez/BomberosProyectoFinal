package Vistas;

import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameAdapter;

public class MenuInicioView extends javax.swing.JFrame {

    public MenuInicioView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDEscritorio = new javax.swing.JDesktopPane();
        jBSiniestro = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMBombero = new javax.swing.JMenuItem();
        jMBrigada = new javax.swing.JMenuItem();
        jMCuartel = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMModificacionDeSiniestro = new javax.swing.JMenuItem();
        JMConsultaSiniestro = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMListarCuarteles = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBSiniestro.setText("Nuevo Siniestro");
        jBSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSiniestroActionPerformed(evt);
            }
        });

        jDEscritorio.setLayer(jBSiniestro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDEscritorioLayout = new javax.swing.GroupLayout(jDEscritorio);
        jDEscritorio.setLayout(jDEscritorioLayout);
        jDEscritorioLayout.setHorizontalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEscritorioLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jBSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
        );
        jDEscritorioLayout.setVerticalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEscritorioLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jBSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(416, Short.MAX_VALUE))
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
        jMBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMBrigadaActionPerformed(evt);
            }
        });
        jMenu1.add(jMBrigada);

        jMCuartel.setText("Cuartel");
        jMCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCuartelActionPerformed(evt);
            }
        });
        jMenu1.add(jMCuartel);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Siniestro");

        jMModificacionDeSiniestro.setText("Modificar Siniestro");
        jMModificacionDeSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMModificacionDeSiniestroActionPerformed(evt);
            }
        });
        jMenu2.add(jMModificacionDeSiniestro);

        JMConsultaSiniestro.setText("Consulta Siniestro");
        JMConsultaSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMConsultaSiniestroActionPerformed(evt);
            }
        });
        jMenu2.add(JMConsultaSiniestro);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("cuartel");

        jMListarCuarteles.setText("Listar Cuarteles");
        jMListarCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListarCuartelesActionPerformed(evt);
            }
        });
        jMenu3.add(jMListarCuarteles);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMBomberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMBomberoActionPerformed
        BomberoView bombero = new BomberoView();
        
        mostrarVentanaNueva(bombero);
    }//GEN-LAST:event_jMBomberoActionPerformed

    private void jBSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSiniestroActionPerformed
        NuevoSiniestro ns = new NuevoSiniestro();
        mostrarVentanaNueva(ns);
    }//GEN-LAST:event_jBSiniestroActionPerformed

    private void jMCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCuartelActionPerformed
        CuartelView cuartel = new CuartelView();
        mostrarVentanaNueva(cuartel);
    }//GEN-LAST:event_jMCuartelActionPerformed

    private void JMConsultaSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMConsultaSiniestroActionPerformed
        ConsultarSiniestro csv = new ConsultarSiniestro();
        mostrarVentanaNueva(csv);
    }//GEN-LAST:event_JMConsultaSiniestroActionPerformed

    private void jMModificacionDeSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMModificacionDeSiniestroActionPerformed
        ModificarSiniestroView csv = new ModificarSiniestroView();
        mostrarVentanaNueva(csv);
    }//GEN-LAST:event_jMModificacionDeSiniestroActionPerformed

    private void jMListarCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListarCuartelesActionPerformed
        ListarCuartelesView listarCuarteles = new ListarCuartelesView();
        mostrarVentanaNueva(listarCuarteles);
    }//GEN-LAST:event_jMListarCuartelesActionPerformed

    private void jMBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMBrigadaActionPerformed
       BrigadasView1 listarbrigadas = new BrigadasView1();
        mostrarVentanaNueva(listarbrigadas);
    }//GEN-LAST:event_jMBrigadaActionPerformed
    
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
    private javax.swing.JMenuItem JMConsultaSiniestro;
    private javax.swing.JButton jBSiniestro;
    private javax.swing.JDesktopPane jDEscritorio;
    private javax.swing.JMenuItem jMBombero;
    private javax.swing.JMenuItem jMBrigada;
    private javax.swing.JMenuItem jMCuartel;
    private javax.swing.JMenuItem jMListarCuarteles;
    private javax.swing.JMenuItem jMModificacionDeSiniestro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    public void mostrarVentanaNueva(JInternalFrame ventana) {
        
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        ventana.setVisible(true);
        jDEscritorio.add(ventana);
        jDEscritorio.moveToFront(ventana);
        
    }
    
}
