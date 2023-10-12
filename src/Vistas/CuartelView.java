/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.CuartelData;
import Entidades.Cuartel;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas E. Sayago
 */
public class CuartelView extends javax.swing.JInternalFrame {

    private final CuartelData cdata = new CuartelData();

    public CuartelView() {

        initComponents();
        this.setTitle("Administracion Cuartel");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jTDireccionCuartel = new javax.swing.JTextField();
        jTTelefonoCuartel = new javax.swing.JTextField();
        jTCorreoCuartel = new javax.swing.JTextField();
        jTNombreCuartel = new javax.swing.JTextField();
        jTCoordEnY = new javax.swing.JTextField();
        jTCoordEnX = new javax.swing.JTextField();
        jRBActivo = new javax.swing.JRadioButton();
        jBagregar = new javax.swing.JButton();
        jBBuscar1 = new javax.swing.JButton();
        jBlimpiarCampo = new javax.swing.JButton();
        jBModificar1 = new javax.swing.JButton();
        jBElimniar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel1.setText("CODIGO:");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel2.setText("ACTIVO:");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel4.setText("DIRECCION");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel5.setText("COORDENADA X");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel6.setText("COORDENADA Y");

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel7.setText("TELEFONO");

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel8.setText("CORREO");

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 34)); // NOI18N
        jLabel9.setText("CUARTEL");

        jTCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodigoActionPerformed(evt);
            }
        });

        jTDireccionCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDireccionCuartelActionPerformed(evt);
            }
        });

        jTCoordEnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCoordEnXActionPerformed(evt);
            }
        });

        jBagregar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jBagregar.setText("AGREGAR");
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });

        jBBuscar1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jBBuscar1.setText("Buscar");
        jBBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscar1ActionPerformed(evt);
            }
        });

        jBlimpiarCampo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jBlimpiarCampo.setText("LIMPIAR CAMPOS");
        jBlimpiarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarCampoActionPerformed(evt);
            }
        });

        jBModificar1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jBModificar1.setText("MODIFICAR");
        jBModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificar1ActionPerformed(evt);
            }
        });

        jBElimniar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jBElimniar.setText("ELIMINAR");
        jBElimniar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBElimniarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(32, 32, 32)))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTNombreCuartel)
                                        .addComponent(jTDireccionCuartel)
                                        .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTTelefonoCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addGap(34, 34, 34)
                                                        .addComponent(jTCoordEnY, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jTCorreoCuartel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jTCoordEnX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addComponent(jRBActivo))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBlimpiarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jBElimniar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jBagregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBModificar1)
                        .addGap(17, 17, 17))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(434, Short.MAX_VALUE)
                    .addComponent(jBBuscar1)
                    .addGap(37, 37, 37)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTNombreCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTDireccionCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTCoordEnX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTCoordEnY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTelefonoCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTCorreoCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBlimpiarCampo)
                    .addComponent(jLabel2)
                    .addComponent(jRBActivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBagregar)
                    .addComponent(jBElimniar)
                    .addComponent(jBModificar1))
                .addGap(24, 24, 24))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(jBBuscar1)
                    .addContainerGap(397, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodigoActionPerformed

    }//GEN-LAST:event_jTCodigoActionPerformed

    private void jTDireccionCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDireccionCuartelActionPerformed

    }//GEN-LAST:event_jTDireccionCuartelActionPerformed

    private void jTCoordEnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCoordEnXActionPerformed

    }//GEN-LAST:event_jTCoordEnXActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        Cuartel cuartel = cdata.agregarCuartel(crearCuartel());
        jTCodigo.setText(cuartel.getCodigoCuartel() + "");
    }//GEN-LAST:event_jBagregarActionPerformed

    private void jBlimpiarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarCampoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBlimpiarCampoActionPerformed

    private void jBModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificar1ActionPerformed

        Cuartel cuartel = crearCuartel();
        try {
            cuartel.setCodigoCuartel(Integer.parseInt(jTCodigo.getText()));

            if (cuartel != null) {
                cdata.modificarCuartelporCodigo(cuartel);
            } else {
                JOptionPane.showMessageDialog(null, "no existe cuartel con ese codigo");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Verificar los campos ingresados");
        }

    }//GEN-LAST:event_jBModificar1ActionPerformed

    private void jBBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscar1ActionPerformed
        if (!jTCodigo.equals("")) {
            try {
                Cuartel cuartel = cdata.buscarCuartelPorCodigo(Integer.parseInt(jTCodigo.getText()));
                jTCodigo.setText(cuartel.getCodigoCuartel() + "");
                jTNombreCuartel.setText(cuartel.getNombreDeCuartel());
                jTDireccionCuartel.setText(cuartel.getDireccion());
                jTCoordEnX.setText(cuartel.getCoordenadaEnX() + "");
                jTCoordEnY.setText(cuartel.getCoordenadaEnY() + "");
                jTTelefonoCuartel.setText(cuartel.getTelefono());
                jTCorreoCuartel.setText(cuartel.getCorreo());
                jRBActivo.setSelected(cuartel.isActivo());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Verificar los campos ingresados");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos.");
        }

    }//GEN-LAST:event_jBBuscar1ActionPerformed

    private void jBElimniarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBElimniarActionPerformed

        try {
            cdata.eliminarCuartelPorCodigo(Integer.parseInt(jTCodigo.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El código debe ser un número entero.");
            limpiarCampos();
        }
    }//GEN-LAST:event_jBElimniarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar1;
    private javax.swing.JButton jBElimniar;
    private javax.swing.JButton jBModificar1;
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBlimpiarCampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRBActivo;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTCoordEnX;
    private javax.swing.JTextField jTCoordEnY;
    private javax.swing.JTextField jTCorreoCuartel;
    private javax.swing.JTextField jTDireccionCuartel;
    private javax.swing.JTextField jTNombreCuartel;
    private javax.swing.JTextField jTTelefonoCuartel;
    // End of variables declaration//GEN-END:variables

    public Cuartel crearCuartel() {

        Cuartel cuartel = new Cuartel();

        try{
        cuartel.setNombreDeCuartel(jTNombreCuartel.getText());
        cuartel.setDireccion(jTDireccionCuartel.getText());
        cuartel.setCoordenadaEnX((Integer.parseInt(jTCoordEnX.getText())));
        cuartel.setCoordenadaEnY((Integer.parseInt(jTCoordEnY.getText())));
        cuartel.setTelefono(jTTelefonoCuartel.getText());
        cuartel.setCorreo(jTCorreoCuartel.getText());
        cuartel.setActivo(jRBActivo.isSelected());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Verificar los campos ingresados en Coordenadas");
        }
        return cuartel;
    }

    public void limpiarCampos() {

        jTCodigo.setText("");
        jTCoordEnX.setText("");
        jTCoordEnY.setText("");
        jTCorreoCuartel.setText("");
        jTDireccionCuartel.setText("");
        jTNombreCuartel.setText("");
        jTTelefonoCuartel.setText("");
        jRBActivo.setSelected(false);

    }

    public boolean validarCampos() {

        /*   if (!jRBActivo.isSelected()) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar 'Activo' para el cuartel.");
            return false;
        }
         */
        try {
            int codigo = Integer.parseInt(jTCodigo.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El código debe ser un número entero.");
            return false;
        }

        try {
            int coordX = Integer.parseInt(jTCoordEnX.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La coordenada en X debe ser un número entero.");
            return false;
        }

        try {
            int coordY = Integer.parseInt(jTCoordEnY.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La coordenada en Y debe ser un número entero.");
            return false;
        }

        if (jTCorreoCuartel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de correo no puede estar vacío.");
            return false;
        }

        if (jTDireccionCuartel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de dirección no puede estar vacío.");
            return false;
        }

        if (jTNombreCuartel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de nombre no puede estar vacío.");
            return false;
        }

        String telefono = jTTelefonoCuartel.getText();
        if (!telefono.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "El campo de teléfono debe contener solo números.");
            return false;
        }

        // si todos los campos son válidos
        return true;
    }

}
