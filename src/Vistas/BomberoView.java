package Vistas;

import AccesoADatos.BomberoData;
import Entidades.Bombero;
import java.awt.Container;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * @author Enzo
 */
public class BomberoView extends javax.swing.JInternalFrame {

    private final BomberoData bdata = new BomberoData();

    public BomberoView() {
        initComponents();
        this.setTitle("Bombero");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTid = new javax.swing.JTextField();
        jTnom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTtelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTdni = new javax.swing.JTextField();
        jTsanguineo = new javax.swing.JTextField();
        jTcodBrigada = new javax.swing.JTextField();
        jBNuevo = new javax.swing.JButton();
        jBLista = new javax.swing.JButton();
        jBModif = new javax.swing.JButton();
        jBElim = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jRBActivo = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setClosable(true);

        jBBuscar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jBBuscar.setText("BUSCAR");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 34)); // NOI18N
        jLabel1.setText("BOMBERO");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel2.setText("ID:");
        jLabel2.setPreferredSize(new java.awt.Dimension(40, 28));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel5.setText("DNI:");
        jLabel5.setPreferredSize(new java.awt.Dimension(40, 28));

        jTid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidActionPerformed(evt);
            }
        });

        jTnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnomActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel6.setText("GRUPO");
        jLabel6.setPreferredSize(new java.awt.Dimension(40, 28));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel7.setText("SANGUÍNEO:");
        jLabel7.setPreferredSize(new java.awt.Dimension(40, 28));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel8.setText("NOMBRE:");
        jLabel8.setPreferredSize(new java.awt.Dimension(40, 28));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel9.setText("NACIMIENTO:");
        jLabel9.setPreferredSize(new java.awt.Dimension(40, 28));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel10.setText("FECHA DE");
        jLabel10.setPreferredSize(new java.awt.Dimension(40, 28));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel11.setText("CÓDIGO DE");
        jLabel11.setPreferredSize(new java.awt.Dimension(40, 28));

        jTtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtelefonoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel12.setText("BRIGADA:");
        jLabel12.setPreferredSize(new java.awt.Dimension(40, 28));

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel13.setText("TELÉFONO:");
        jLabel13.setPreferredSize(new java.awt.Dimension(40, 28));

        jTdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdniActionPerformed(evt);
            }
        });

        jTsanguineo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTsanguineoActionPerformed(evt);
            }
        });

        jTcodBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcodBrigadaActionPerformed(evt);
            }
        });

        jBNuevo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 28)); // NOI18N
        jBNuevo.setText("NUEVO");
        jBNuevo.setPreferredSize(new java.awt.Dimension(150, 70));
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBLista.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 28)); // NOI18N
        jBLista.setText("LISTA");
        jBLista.setPreferredSize(new java.awt.Dimension(150, 70));
        jBLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListaActionPerformed(evt);
            }
        });

        jBModif.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 28)); // NOI18N
        jBModif.setText("MODIFICAR");
        jBModif.setPreferredSize(new java.awt.Dimension(150, 70));
        jBModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModifActionPerformed(evt);
            }
        });

        jBElim.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 28)); // NOI18N
        jBElim.setText("DAR DE BAJA");
        jBElim.setPreferredSize(new java.awt.Dimension(150, 70));
        jBElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBElimActionPerformed(evt);
            }
        });

        jBLimpiar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 28)); // NOI18N
        jBLimpiar.setText("LIMPIAR");
        jBLimpiar.setPreferredSize(new java.awt.Dimension(150, 70));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel14.setText("ESTADO:");
        jLabel14.setPreferredSize(new java.awt.Dimension(40, 28));

        jRBActivo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jRBActivo.setText("ACTIVO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBLista, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTcodBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jTnom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTsanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(124, 124, 124)
                                                .addComponent(jLabel1))))
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(157, 157, 157))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBModif, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jBElim, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBActivo)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTnom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTsanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRBActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTcodBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBModif, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBElim, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLista, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidActionPerformed

    private void jTnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnomActionPerformed

    private void jTtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtelefonoActionPerformed

    private void jTdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdniActionPerformed

    private void jTsanguineoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTsanguineoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTsanguineoActionPerformed

    private void jTcodBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcodBrigadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcodBrigadaActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        bdata.agregarBombero(crearBombero());
    }//GEN-LAST:event_jBNuevoActionPerformed

    // NO ANDA
    
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        String idText = jTid.getText();

        if (!idText.isEmpty()) {
            int bomberoId = Integer.parseInt(idText);
            Bombero bo = bdata.buscarBomberoPorCodigo(bomberoId);

            if (bo != null) {
                jTnom.setText(bo.getNombre());
                jTdni.setText(bo.getDni());
                jTsanguineo.setText(bo.getGrupo_sanguineo());

                LocalDate fechaNacimiento = bo.getFechaNac();
                if (fechaNacimiento != null) {
                    java.util.Date fechaNacimientoAsDate = java.util.Date.from(fechaNacimiento.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    jDateChooser1.setDate(fechaNacimientoAsDate);
                } else {
                    jDateChooser1.setDate(null); // Establecer la fecha a null en el JDateChooser
                }

                jTcodBrigada.setText(bo.getCodigoDeBrigada() + "");
                jTtelefono.setText(bo.getCelular());
                jRBActivo.setSelected(bo.isActivo());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un bombero con ese ID.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El campo ID está vacío. Por favor, ingrese un ID válido.");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    
    
    
    
    // FUNCIONA PERFECTAMENTE
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModifActionPerformed
        // BUENO ES MOMENTO DE MODIFICAR BOMBEROS
        Bombero bombero = crearBombero();
        bombero.setCod_bombero(Integer.parseInt(jTid.getText()));

        if (bombero != null) {
            bdata.actualizarBombero(bombero);
            JOptionPane.showMessageDialog(this,"Se modificó el bombero exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No fue posible modificar el bombero.");
        }


    }//GEN-LAST:event_jBModifActionPerformed

    private void jBElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBElimActionPerformed
        // borrar bomberos
        
        
        try {
            jBBuscarActionPerformed(evt);
            int dni = Integer.parseInt(jTid.getText());

            Bombero alumno = bdata.buscarBomberoPorCodigo(dni);
            if (alumno != null && alumno.isActivo()) {

                bdata.darDeBajaBombero(alumno.getCod_bombero());
                //JOptionPane.showMessageDialog(this, "Bombero eliminado con exito");
            } else {
                JOptionPane.showMessageDialog(this, "No existe bombero con esos datos.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Verificar los campos ingresados en ID.");
        }
    }//GEN-LAST:event_jBElimActionPerformed

    private void jBListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListaActionPerformed
        // listita de bomberos che
    
        Container parent = this.getParent();
        if (parent instanceof JDesktopPane) {
            JDesktopPane desktopPane = (JDesktopPane) parent;

            // Luego, puedes agregar tu segundo JInternalFrame al JDesktopPane
            ListarBomberosView listita = new ListarBomberosView();
            desktopPane.add(listita);
            listita.setVisible(true);
        }
    }//GEN-LAST:event_jBListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBElim;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBLista;
    private javax.swing.JButton jBModif;
    private javax.swing.JButton jBNuevo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRBActivo;
    private javax.swing.JTextField jTcodBrigada;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTnom;
    private javax.swing.JTextField jTsanguineo;
    private javax.swing.JTextField jTtelefono;
    // End of variables declaration//GEN-END:variables

    public Bombero crearBombero() {

        Bombero bombero = new Bombero();

        bombero.setNombre(jTnom.getText());
        bombero.setDni(jTdni.getText());
        bombero.setGrupo_sanguineo(jTsanguineo.getText());

        java.util.Date fechaNacimientoAsDate = jDateChooser1.getDate();
        LocalDate fechaNacimiento = fechaNacimientoAsDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        bombero.setFechaNac(fechaNacimiento);

        bombero.setCelular(jTtelefono.getText());
        bombero.setCodigoDeBrigada(Integer.parseInt(jTcodBrigada.getText()));
        bombero.setActivo(jRBActivo.isSelected());

        return bombero;
    }

    public void limpiarCampos() {

        jTid.setText("");
        jTnom.setText("");
        jTdni.setText("");
        jTsanguineo.setText("");
        jDateChooser1.setDate(null);
        jTtelefono.setText("");
        jTcodBrigada.setText("");
        jRBActivo.setSelected(false);

    }


}
