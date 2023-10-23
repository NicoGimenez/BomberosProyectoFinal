package Vistas;

import AccesoADatos.BrigadaData;
import Entidades.Brigada;
import Entidades.Especialidad;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class AdmBrigada extends javax.swing.JInternalFrame {

    private BrigadaData bdata = new BrigadaData();

    public AdmBrigada() {
        initComponents();
        this.setTitle("ADMINISTRAR BRIGADAS");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTNombreBrigada = new javax.swing.JTextField();
        jTNumeroDeCuartel = new javax.swing.JTextField();
        jRBActivo = new javax.swing.JRadioButton();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRBLibre = new javax.swing.JRadioButton();
        jBuscar = new javax.swing.JButton();
        jCEspecialidad = new javax.swing.JComboBox<>();

        setClosable(true);

        jTCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodigoActionPerformed(evt);
            }
        });

        jLabel1.setText("CODIGO BRIGADA");

        jLabel2.setText("NOMBRE DE BRIGADA");

        jLabel3.setText("ESPECIALIDAD");

        jLabel4.setText("LIBRE");

        jLabel5.setText("NRO DE CUARTEL");

        jLabel6.setText("ACTIVO");

        jBGuardar.setText("AGREGAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBEliminar.setText("ELIMINAR");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBModificar.setText("MODIFICAR");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jLabel7.setText("ADMINISTRACION DE BRIGADAS");

        jRBLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBLibreActionPerformed(evt);
            }
        });

        jBuscar.setText("BUSCAR");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jCEspecialidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCEspecialidadFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBLibre)
                            .addComponent(jTNumeroDeCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jBGuardar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jBEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jBModificar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jRBActivo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBuscar))
                            .addComponent(jTNombreBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombreBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBLibre)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTNumeroDeCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBActivo)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBEliminar)
                    .addComponent(jBModificar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if (!jTCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de código no hace falta agregar ya que no se tiene en cuenta");
        }

        Brigada brigada = CrearBrigada();
        bdata.agregarBrigada(brigada);

        // Limpiar el campo de código
        jTCodigo.setText("");

        JOptionPane.showMessageDialog(this, "Brigada guardada.");
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jRBLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBLibreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBLibreActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        try {
        int codBrigada = Integer.parseInt(jTCodigo.getText());
        Brigada brigada = bdata.buscarBrigadaPorCodigo(codBrigada);

        if (brigada != null) {
            jTNombreBrigada.setText(brigada.getNombre_br());
            
            String descripcionTipoSiniestro = "";
            if (brigada.getTipo() != null) {
                descripcionTipoSiniestro = brigada.getTipo().getDescripcion();
            }
            
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement(descripcionTipoSiniestro);
            
            jCEspecialidad.setModel(model);
            jRBLibre.setSelected(brigada.isLibre());
            jTNumeroDeCuartel.setText(brigada.getCodCuartel() + "");
            jRBActivo.setSelected(brigada.isActivo());
        } 

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Por favor, introduzca un código válido.");
    }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jTCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCodigoActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed

        try {
            Brigada brigada = CrearBrigada();
            brigada.setCodBrigada(Integer.parseInt(jTCodigo.getText()));
            System.out.println(brigada.toString());
            if (brigada != null) {
                bdata.actualizarBrigada(brigada);
            } else {
                JOptionPane.showMessageDialog(null, "no existe brigada con ese codigo ingrese uno valido");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Revisar los campos ingresados" + ex);
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        try {
            bdata.eliminarBrigada(Integer.parseInt(jTCodigo.getText()));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El código debe ser un número entero." + ex);
            limpiarCampos();
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jCEspecialidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCEspecialidadFocusGained
        cargarEspecialidadesComboBox();
    }//GEN-LAST:event_jCEspecialidadFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBuscar;
    private javax.swing.JComboBox<String> jCEspecialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRBActivo;
    private javax.swing.JRadioButton jRBLibre;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTNombreBrigada;
    private javax.swing.JTextField jTNumeroDeCuartel;
    // End of variables declaration//GEN-END:variables

//    public Brigada CrearBrigada() {
//
//        Brigada brigada = new Brigada();
//
//        brigada.setActivo(jRBActivo.isSelected());
//        brigada.setCodCuartel(Integer.parseInt(jTNumeroDeCuartel.getText()));
//        String descripcionSeleccionada = (String) jCEspecialidad.getSelectedItem();
//
//        Especialidad tipo = null;
//        Especialidad[] especialidadesArray = Especialidad.values();
//        for (Especialidad especialidad : especialidadesArray) {
//            if (descripcionSeleccionada.equals(especialidad.getDescripcion())) {
//                tipo = especialidad;
//                break;
//            }
//        }
//        //  brigada.setEspecialidad(jTEspecialidad.getText());
//        brigada.setLibre(jRBLibre.isSelected());
//        brigada.setNombre_br(jTNombreBrigada.getText());
//
//        return brigada;
//    }
    public void limpiarCampos() {

        jTCodigo.setText("");
        jRBActivo.setSelected(false);
        jTNumeroDeCuartel.setText("");
        //  jTEspecialidad.setText("");
        jRBLibre.setSelected(false);
        jTNombreBrigada.setText("");

    }

    private void cargarEspecialidadesComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Especialidad especialidad : Especialidad.values()) {
            model.addElement(especialidad.getDescripcion());
        }
        jCEspecialidad.setModel(model);
    }

    public Brigada CrearBrigada() {
        Brigada brigada = new Brigada();
        if (!jTCodigo.getText().isEmpty()) {

        }

        if (jTNombreBrigada.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de nombre de brigada no puede estar vacío.");
            return null;
        }

        brigada.setNombre_br(jTNombreBrigada.getText());

        String descripcionSeleccionada = (String) jCEspecialidad.getSelectedItem();
        Especialidad tipo = obtenerEspecialidadDesdeDescripcion(descripcionSeleccionada);
        if (tipo == null) {
            JOptionPane.showMessageDialog(this, "Especialidad no válida.");
            return null;
        }
        brigada.setTipo(tipo);

        brigada.setLibre(jRBLibre.isSelected());

        try {
            int numeroCuartel = Integer.parseInt(jTNumeroDeCuartel.getText());
            brigada.setCodCuartel(numeroCuartel);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Número de cuartel no válido.");
            return null;
        }

        brigada.setActivo(jRBActivo.isSelected());

        return brigada;
    }

    private Especialidad obtenerEspecialidadDesdeDescripcion(String descripcion) {
        for (Especialidad especialidad : Especialidad.values()) {
            if (especialidad.getDescripcion().equals(descripcion)) {
                return especialidad;
            }
        }
        return null;
    }

}
