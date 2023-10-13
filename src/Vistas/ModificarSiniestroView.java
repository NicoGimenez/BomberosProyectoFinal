package Vistas;

import AccesoADatos.SiniestroData;
import Entidades.Especialidad;
import Entidades.Siniestro;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ModificarSiniestroView extends javax.swing.JInternalFrame {

    private SiniestroData sd = new SiniestroData();

    public ModificarSiniestroView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTCoordx = new javax.swing.JTextField();
        jTCoordy = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDescrip = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSPuntuacion = new javax.swing.JSpinner();
        jDFechaResol = new com.toedter.calendar.JDateChooser();
        jLBrigada = new java.awt.Label();
        jTextField3 = new javax.swing.JTextField();
        jBBorrar = new javax.swing.JButton();

        setClosable(true);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 34)); // NOI18N
        jLabel1.setText("Modificar Siniestro");

        jBBuscar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBEditar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.setEnabled(false);
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel2.setText("Fecha");

        jDateChooser1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N

        jTCoordx.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jTCoordx.setText("Coordenadas x");
        jTCoordx.setToolTipText("Coordenadas x");

        jTCoordy.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jTCoordy.setText("Coordenadas Y");
        jTCoordy.setToolTipText("Coordenadas Y");
        jTCoordy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCoordyActionPerformed(evt);
            }
        });

        jTDescrip.setColumns(20);
        jTDescrip.setRows(5);
        jTDescrip.setText("Describa el siniestro..");
        jScrollPane1.setViewportView(jTDescrip);

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel4.setText("Puntuar resolución");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel3.setText("Fecha resolución");

        jSPuntuacion.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N

        jDFechaResol.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N

        jLBrigada.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLBrigada.setText("Brigada");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDFechaResol, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTCoordx, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jTCoordy, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(37, 37, 37)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCoordx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCoordy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDFechaResol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jLBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTextField3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jTextField3.setText("Buscar por id");
        jTextField3.setToolTipText("Coordenadas x");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });

        jBBorrar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jBBorrar.setText("Borrar");
        jBBorrar.setEnabled(false);

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBEditar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBBorrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jBBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBEditar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBorrar)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar)
                    .addComponent(jBEditar)
                    .addComponent(jBBorrar))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTCoordyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCoordyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCoordyActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        vaciarTextField(jTextField3);
    }//GEN-LAST:event_jTextField3FocusGained

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        buscarSiniestroPorId(Integer.parseInt(jTextField3.getText()));
    }//GEN-LAST:event_jBBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private com.toedter.calendar.JDateChooser jDFechaResol;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private java.awt.Label jLBrigada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSPuntuacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCoordx;
    private javax.swing.JTextField jTCoordy;
    private javax.swing.JTextArea jTDescrip;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void vaciarTextField(JTextField textField) {
        textField.setText("");
    }

    private void vaciarTextArea(JTextArea ta) {
        ta.setText("");
    }

    private void buscarSiniestroPorId(int id) {
        Siniestro sin = new Siniestro();
        sin = sd.BuscarSiniestroPorId(id);
        LocalDate fechaS = sin.getFecha_siniestro();
        java.util.Date fechaSiniestroComoDate = java.util.Date.from(fechaS.atStartOfDay(ZoneId.systemDefault()).toInstant());
        jDateChooser1.setDate(fechaSiniestroComoDate);
        LocalDate fechaR = sin.getFecha_resol();
        jTCoordx.setText(sin.getCoord_x()+"");
        jTCoordy.setText(sin.getCoord_Y()+"");
        jTDescrip.setText(sin.getDetalles());
        jSPuntuacion.setValue(sin.getPuntuacion());
        jLBrigada.setText("Brigada: ");
        try{
        java.util.Date fechaResolucionComoDate = java.util.Date.from(fechaR.atStartOfDay(ZoneId.systemDefault()).toInstant());
        jDFechaResol.setDate(fechaResolucionComoDate);}catch(Exception e){
           jDFechaResol.setDate(null);
        }
    }
}
