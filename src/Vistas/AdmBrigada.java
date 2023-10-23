package Vistas;

import AccesoADatos.BrigadaData;
import Entidades.Brigada;
import Entidades.Especialidad;
import java.awt.AWTException;
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
        jLabel8 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JLabel();

        setClosable(true);

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

        jLabel8.setText("CODIGO BRIGADA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCEspecialidad, 0, 164, Short.MAX_VALUE)
                                    .addComponent(jTNombreBrigada)
                                    .addComponent(jRBLibre)
                                    .addComponent(jTNumeroDeCuartel)
                                    .addComponent(jRBActivo)
                                    .addComponent(jTCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(67, 67, 67))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jBEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTNombreBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jRBLibre))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTNumeroDeCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jRBActivo))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBEliminar)
                    .addComponent(jBModificar)
                    .addComponent(jBuscar))
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
        
        Brigada brigada = bdata.buscarBrigadaPorNombre(jTNombreBrigada.getText());

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
            jTCodigo.setText(brigada.getCodBrigada()+"");
        } 

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Por favor, introduzca un código válido.");
    }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed

        try {
            Brigada brigada = CrearBrigada();
            brigada.setCodBrigada(Integer.parseInt(jTCodigo.getText()));
            //System.out.println(brigada.toString());
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
        int codigoBrigada = bdata.buscarCodigoPorNombre(jTNombreBrigada.getText());

        if (codigoBrigada != -1) {
            bdata.eliminarBrigada(codigoBrigada);
        } else {
            JOptionPane.showMessageDialog(this, "Imposible encontrar brigada con ese nombre.");
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Imposible eliminar brigada." + ex);
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRBActivo;
    private javax.swing.JRadioButton jRBLibre;
    private javax.swing.JLabel jTCodigo;
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
