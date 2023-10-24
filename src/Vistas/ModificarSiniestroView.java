package Vistas;

import AccesoADatos.BrigadaData;
import AccesoADatos.SiniestroData;
import Entidades.Brigada;
import Entidades.Especialidad;
import Entidades.Siniestro;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ModificarSiniestroView extends javax.swing.JInternalFrame {

    private SiniestroData sd = new SiniestroData();
    private BrigadaData bd=new BrigadaData();

    public ModificarSiniestroView() {

        initComponents();

    }
int b = 0;
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
        JCSiniestro = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jBBorrar = new javax.swing.JButton();
        panel2 = new java.awt.Panel();
        jBAsignarBrigada = new javax.swing.JButton();
        jLBrigada = new java.awt.Label();
        panel1 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jDFechaResol = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jSPuntuacion = new javax.swing.JSpinner();

        setClosable(true);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(719, 719));

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

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel2.setText("Fecha");

        jDateChooser1.setEnabled(false);
        jDateChooser1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N

        jTCoordx.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jTCoordx.setText("Coordenadas x");
        jTCoordx.setToolTipText("Coordenadas x");
        jTCoordx.setEnabled(false);

        jTCoordy.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jTCoordy.setText("Coordenadas Y");
        jTCoordy.setToolTipText("Coordenadas Y");
        jTCoordy.setEnabled(false);
        jTCoordy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCoordyActionPerformed(evt);
            }
        });

        jTDescrip.setColumns(20);
        jTDescrip.setRows(5);
        jTDescrip.setText("Describa el siniestro..");
        jTDescrip.setEnabled(false);
        jScrollPane1.setViewportView(jTDescrip);

        JCSiniestro.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        JCSiniestro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        JCSiniestro.setToolTipText("Seleccione tipo de siniestro");
        JCSiniestro.setEnabled(false);
        JCSiniestro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JCSiniestroFocusGained(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel5.setText("Tipo");

        jBGuardar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setEnabled(false);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jTCoordx, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCSiniestro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTCoordy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCoordx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCoordy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTextField3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jTextField3.setText("Buscar por id");
        jTextField3.setToolTipText("Coordenadas x");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });

        jBBorrar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jBBorrar.setText("Borrar");
        jBBorrar.setEnabled(false);
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        panel2.setBackground(new java.awt.Color(204, 204, 204));
        panel2.setEnabled(false);

        jBAsignarBrigada.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jBAsignarBrigada.setText("Asignar Brigada");
        jBAsignarBrigada.setEnabled(false);
        jBAsignarBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAsignarBrigadaActionPerformed(evt);
            }
        });

        jLBrigada.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLBrigada.setText("Brigada");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(jBAsignarBrigada)
                .addGap(21, 21, 21))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAsignarBrigada))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel3.setText("Fecha resolución");

        jDFechaResol.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel4.setText("Puntuar resolución");

        jSPuntuacion.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jSPuntuacion.setEnabled(false);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDFechaResol, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDFechaResol, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBEditar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBBorrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(panel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(panel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBBorrar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar)
                    .addComponent(jBEditar)
                    .addComponent(jBBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if (jTextField3.getText() == "") {
            jTextField3.setText("Buscar por id");
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        vaciarTextField(jTextField3);
        limpiarCampos();
        desHabilitarCampos();
        deshabilitarBotones();
    }//GEN-LAST:event_jTextField3FocusGained

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        editarSiniestro(Integer.parseInt(jTextField3.getText()));
        deshabilitarBotones();
        desHabilitarCampos();
        limpiarCampos();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void JCSiniestroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JCSiniestroFocusGained
        cargarEspecialidadesComboBox();
    }//GEN-LAST:event_JCSiniestroFocusGained

    private void jTCoordyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCoordyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCoordyActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            int numero = Integer.parseInt(jTextField3.getText());
            limpiarCampos();
            buscarSiniestroPorId(numero);
            habilitarBotones();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un id válido.", "Error de selección", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        int cod = Integer.parseInt(jTextField3.getText());
        int opcion = JOptionPane.showConfirmDialog(
                null,
                "¿Estás seguro de que deseas borrar el siniestro con ID " + cod + "?",
                "Confirmar Borrado",
                JOptionPane.YES_NO_OPTION
        );

        if (opcion == JOptionPane.YES_OPTION) {

            borrarSiniestro(cod);
            limpiarCampos();
        } else {

        }
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBAsignarBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAsignarBrigadaActionPerformed
         int siniestroId = Integer.parseInt(jTextField3.getText());
    Especialidad especialidadSeleccionada = getEspecialidadSeleccionada();

    if (especialidadSeleccionada == null) {
        JOptionPane.showMessageDialog(this, "Selecciona una especialidad válida.", "Error de selección", JOptionPane.ERROR_MESSAGE);
        return;
    }
        asignarBrigada(siniestroId, especialidadSeleccionada);
     limpiarCampos();
     buscarSiniestroPorId(siniestroId);
      deshabilitarBotones();
        desHabilitarCampos();

    }//GEN-LAST:event_jBAsignarBrigadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCSiniestro;
    private javax.swing.JButton jBAsignarBrigada;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBGuardar;
    private com.toedter.calendar.JDateChooser jDFechaResol;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private java.awt.Label jLBrigada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSPuntuacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCoordx;
    private javax.swing.JTextField jTCoordy;
    private javax.swing.JTextArea jTDescrip;
    private javax.swing.JTextField jTextField3;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables

    private void vaciarTextField(JTextField textField) {
        textField.setText("");
    }

    private void vaciarTextArea(JTextArea ta) {
        ta.setText("");
    }

    private void buscarSiniestroPorId(int id) {
        try {
            Siniestro sin = sd.BuscarSiniestroPorId(id);
            String descripcionTipoSiniestro = sin.getTipo().getDescripcion();
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement(descripcionTipoSiniestro);
            JCSiniestro.setModel(model);

            LocalDate fechaS = sin.getFecha_siniestro();
            java.util.Date fechaSiniestroComoDate = java.util.Date.from(fechaS.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jDateChooser1.setDate(fechaSiniestroComoDate);
            jTCoordx.setText(sin.getCoord_x() + "");
            jTCoordy.setText(sin.getCoord_Y() + "");
            jTDescrip.setText(sin.getDetalles());
            jSPuntuacion.setValue(sin.getPuntuacion());
            int a = sin.getCodBrigada();
            if (a < 1 || a == 0) {
                sd.asignarBrigada(sin, sin.getTipo());
            }
            b=sin.getCodBrigada();
            jLBrigada.setText("Brigada: " + b);
            try {
                LocalDate fechaR = sin.getFecha_resol();
                java.util.Date fechaResolucionComoDate = java.util.Date.from(fechaR.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jDFechaResol.setDate(fechaResolucionComoDate);
            } catch (Exception e) {
                jDFechaResol.setDate(null);
            }
        } catch (NullPointerException ex) {
        }
    }

    private void limpiarCampos() {
        jDateChooser1.setDate(null);
        jTCoordx.setText("Coordenadas x");
        jTCoordy.setText("Coordenadas Y");
        jTDescrip.setText("Describa el siniestro..");
        jSPuntuacion.setValue(0);
        jDFechaResol.setDate(null);
        jLBrigada.setText("Brigada");
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) JCSiniestro.getModel();
        model.removeAllElements();
        b=0;
    }

    private void habilitarCampos() {
        jDateChooser1.setEnabled(true);
        jTCoordx.setEnabled(true);
        jTCoordy.setEnabled(true);
        jTDescrip.setEnabled(true);
        jSPuntuacion.setEnabled(true);
        jDFechaResol.setEnabled(true);
       
        jBGuardar.setEnabled(true);
        JCSiniestro.setEnabled(true);
        jBAsignarBrigada.setEnabled(true);
    } 

    private void desHabilitarCampos() {
        jDateChooser1.setEnabled(false);
        jTCoordx.setEnabled(false);
        jTCoordy.setEnabled(false);
        jTDescrip.setEnabled(false);
        jSPuntuacion.setEnabled(false);
        jDFechaResol.setEnabled(false);
       
        jBGuardar.setEnabled(false);
        JCSiniestro.setEnabled(false);
        jBAsignarBrigada.setEnabled(false);
    }

    private void habilitarBotones() {
        jBBorrar.setEnabled(true);
        jBEditar.setEnabled(true);
    }

    private void deshabilitarBotones() {
        jBBorrar.setEnabled(false);
        jBEditar.setEnabled(false);
    }

    private void cargarEspecialidadesComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Especialidad especialidad : Especialidad.values()) {
            model.addElement(especialidad.getDescripcion());
        }
        JCSiniestro.setModel(model);
    }

    private void editarSiniestro(int id) {
        Siniestro siniestro = new Siniestro();
        siniestro.setCodigo(id);
        String descripcionSeleccionada = (String) JCSiniestro.getSelectedItem();

        Especialidad tipo = null;

        for (Especialidad especialidad : Especialidad.values()) {
            if (descripcionSeleccionada.equals(especialidad.getDescripcion())) {
                tipo = especialidad;
                break;
            }
        }
        if (tipo != null) {
            siniestro.setTipo(tipo);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una especialidad válida.", "Error de selección", JOptionPane.ERROR_MESSAGE);
        }

        LocalDate fecha_siniestro = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        siniestro.setFecha_siniestro(fecha_siniestro);
        siniestro.setCoord_x(Integer.parseInt(jTCoordx.getText()));
        siniestro.setCoord_Y(Integer.parseInt(jTCoordy.getText()));
        siniestro.setDetalles(jTDescrip.getText());
        siniestro.setPuntuacion((int) jSPuntuacion.getValue());
        try{
        LocalDate fecha_res = jDFechaResol.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        siniestro.setFecha_resol(fecha_res);
        }catch(Exception ex){
            siniestro.setFecha_resol(null);
        }
        
        siniestro.setCodBrigada(siniestro.getCodBrigada());
        sd.modificarSiniestro(siniestro);
    }

    private void borrarSiniestro(int id) {
        sd.eliminarSiniestro(id);
    }
    private Especialidad getEspecialidadSeleccionada() {
    String especialidadSeleccionadaString = (String) JCSiniestro.getSelectedItem();
    Especialidad especialidad = null;
    
    for (Especialidad esp : Especialidad.values()) {
        if (esp.getDescripcion().equals(especialidadSeleccionadaString)) {
            especialidad = esp;
            break;
        }
    }
    
    return especialidad;
}
    private void asignarBrigada(int siniestroId, Especialidad especialidadSeleccionada){
        Siniestro siniestro = sd.BuscarSiniestroPorId(siniestroId);
    Brigada brigada = sd.buscarBrigadaParaAsignarSiniestro(siniestro, especialidadSeleccionada);
    if (brigada != null) {
        siniestro.setCodBrigada(brigada.getCodBrigada());
        brigada.setLibre(false);
        sd.modificarSiniestro(siniestro);
        bd.actualizarBrigada(brigada);
       

        JOptionPane.showMessageDialog(this, "Siniestro asignado a la brigada: " + brigada.getCodBrigada(), "Asignación Exitosa", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "No se encontró una brigada disponible con la especialidad requerida.", "Asignación Fallida", JOptionPane.ERROR_MESSAGE);
    }
    }
}





