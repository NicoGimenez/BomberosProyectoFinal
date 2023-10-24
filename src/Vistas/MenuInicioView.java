package Vistas;

import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.event.InternalFrameAdapter;

public class MenuInicioView extends javax.swing.JFrame {

    public MenuInicioView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jDEscritorio = new javax.swing.JDesktopPane();
        jBSiniestro = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMListadoCompleto = new javax.swing.JMenuItem();
        jMBombero = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMBrigada1 = new javax.swing.JMenuItem();
        jMListarBrigadas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMCuartel1 = new javax.swing.JMenuItem();
        jMListarCuartele1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMModificacionDeSiniestro = new javax.swing.JMenuItem();
        JMConsultaSiniestro = new javax.swing.JMenuItem();
        jMNuevoSiniestro = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

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
                .addGap(270, 270, 270)
                .addComponent(jBSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );
        jDEscritorioLayout.setVerticalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEscritorioLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jBSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(669, Short.MAX_VALUE))
        );

        jMenu1.setText("Administracion");
        jMenu1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N

        jMListadoCompleto.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jMListadoCompleto.setText("Listado Completo");
        jMListadoCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListadoCompletoActionPerformed(evt);
            }
        });
        jMenu1.add(jMListadoCompleto);

        jMBombero.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jMBombero.setText("Bombero");
        jMBombero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMBomberoActionPerformed(evt);
            }
        });
        jMenu1.add(jMBombero);

        jMenu3.setText("Brigada");
        jMenu3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N

        jMBrigada1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jMBrigada1.setText("Brigada Adm.");
        jMBrigada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMBrigada1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMBrigada1);

        jMListarBrigadas.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jMListarBrigadas.setText("Listar Brigadas");
        jMListarBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListarBrigadasActionPerformed(evt);
            }
        });
        jMenu3.add(jMListarBrigadas);

        jMenu1.add(jMenu3);

        jMenu4.setText("Cuartel");
        jMenu4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N

        jMCuartel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jMCuartel1.setText("Cuartel Adm.");
        jMCuartel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCuartel1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMCuartel1);

        jMListarCuartele1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jMListarCuartele1.setText("Listar Cuarteles");
        jMListarCuartele1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListarCuartele1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMListarCuartele1);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Siniestro");
        jMenu2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N

        jMModificacionDeSiniestro.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jMModificacionDeSiniestro.setText("Modificar Siniestro");
        jMModificacionDeSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMModificacionDeSiniestroActionPerformed(evt);
            }
        });
        jMenu2.add(jMModificacionDeSiniestro);

        JMConsultaSiniestro.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        JMConsultaSiniestro.setText("Consulta Siniestro");
        JMConsultaSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMConsultaSiniestroActionPerformed(evt);
            }
        });
        jMenu2.add(JMConsultaSiniestro);

        jMNuevoSiniestro.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jMNuevoSiniestro.setText("Nuevo Siniestro");
        jMNuevoSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMNuevoSiniestroActionPerformed(evt);
            }
        });
        jMenu2.add(jMNuevoSiniestro);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio)
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

    private void JMConsultaSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMConsultaSiniestroActionPerformed
        ConsultarSiniestro csv = new ConsultarSiniestro();
        mostrarVentanaNueva(csv);
    }//GEN-LAST:event_JMConsultaSiniestroActionPerformed

    private void jMModificacionDeSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMModificacionDeSiniestroActionPerformed
        ModificarSiniestroView csv = new ModificarSiniestroView();
        mostrarVentanaNueva(csv);
    }//GEN-LAST:event_jMModificacionDeSiniestroActionPerformed

    private void jMNuevoSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMNuevoSiniestroActionPerformed
        NuevoSiniestro ns = new NuevoSiniestro();
        mostrarVentanaNueva(ns);
    }//GEN-LAST:event_jMNuevoSiniestroActionPerformed

    private void jMListarCuartele1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListarCuartele1ActionPerformed
        ListarCuartelesView listarCuarteles = new ListarCuartelesView();
        mostrarVentanaNueva(listarCuarteles);
    }//GEN-LAST:event_jMListarCuartele1ActionPerformed

    private void jMCuartel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCuartel1ActionPerformed
        CuartelView cuartel = new CuartelView();
        mostrarVentanaNueva(cuartel);
    }//GEN-LAST:event_jMCuartel1ActionPerformed

    private void jMBrigada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMBrigada1ActionPerformed

        AdmBrigada administrarBri = new AdmBrigada();
        mostrarVentanaNueva(administrarBri);
    }//GEN-LAST:event_jMBrigada1ActionPerformed

    private void jMListarBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListarBrigadasActionPerformed
        BrigadasView1 brigada = new BrigadasView1();
        mostrarVentanaNueva(brigada);
    }//GEN-LAST:event_jMListarBrigadasActionPerformed

    private void jMListadoCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListadoCompletoActionPerformed
        ListadoCompletoView listita = new ListadoCompletoView();
        mostrarVentanaNueva(listita);
    }//GEN-LAST:event_jMListadoCompletoActionPerformed

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
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDesktopPane jDEscritorio;
    private javax.swing.JMenuItem jMBombero;
    private javax.swing.JMenuItem jMBrigada1;
    private javax.swing.JMenuItem jMCuartel1;
    private javax.swing.JMenuItem jMListadoCompleto;
    private javax.swing.JMenuItem jMListarBrigadas;
    private javax.swing.JMenuItem jMListarCuartele1;
    private javax.swing.JMenuItem jMModificacionDeSiniestro;
    private javax.swing.JMenuItem jMNuevoSiniestro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
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
