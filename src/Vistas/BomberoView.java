package Vistas;

import AccesoADatos.BomberoData;
import AccesoADatos.Conexion;
import Entidades.Bombero;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
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
        jBBuscar2 = new javax.swing.JButton();

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

        jDateChooser1.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setOpaque(false);

        jBBuscar2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jBBuscar2.setText("BUSCAR");
        jBBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
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
                            .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(124, 124, 124)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTdni, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTnom, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                            .addComponent(jTid)
                                            .addComponent(jTsanguineo, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jBBuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                            .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBModif, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTcodBrigada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(jTtelefono, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRBActivo)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBElim, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jBLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
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
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTnom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
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
                .addContainerGap(63, Short.MAX_VALUE))
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

    // ANDA PERFECTO PAA

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        try {
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
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número en ID. Verificar los campos.");
            jTid.setText("");
        }


    }//GEN-LAST:event_jBBuscarActionPerformed

    // FUNCIONA PERFECTAMENTE
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModifActionPerformed
        // BUENO ES MOMENTO DE MODIFICAR BOMBEROS
        if (verificarCampos()) {
            Bombero bombero = crearBombero();
            bombero.setCod_bombero(Integer.parseInt(jTid.getText()));

            if (bombero != null) {
                bdata.actualizarBombero(bombero);
                JOptionPane.showMessageDialog(this, "Se modificó el bombero exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No fue posible modificar el bombero.");
            }
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

    private void jBBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscar2ActionPerformed
        try {
        String nombre = jTnom.getText(); // Assuming jTnombre is the JTextField for entering the name

        if (!nombre.isEmpty()) {
            List<Bombero> bomberosEncontrados = bdata.buscarBomberoPorNombre(nombre);

            if (!bomberosEncontrados.isEmpty()) {
                // Assuming you want to display the first result in the UI
                Bombero bo = bomberosEncontrados.get(0);

                jTid.setText(Integer.toString(bo.getCod_bombero()));
                jTdni.setText(bo.getDni());
                jTsanguineo.setText(bo.getGrupo_sanguineo());

                LocalDate fechaNacimiento = bo.getFechaNac();
                if (fechaNacimiento != null) {
                    java.util.Date fechaNacimientoAsDate = java.util.Date.from(fechaNacimiento.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    jDateChooser1.setDate(fechaNacimientoAsDate);
                } else {
                    jDateChooser1.setDate(null);
                }

                jTcodBrigada.setText(Integer.toString(bo.getCodigoDeBrigada()));
                jTtelefono.setText(bo.getCelular());
                jRBActivo.setSelected(bo.isActivo());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron bomberos con ese nombre.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El campo Nombre está vacío. Por favor, ingrese un nombre válido.");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar bomberos por nombre: " + ex.getMessage());
        jTnom.setText("");
    }
    }//GEN-LAST:event_jBBuscar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBBuscar2;
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

    private boolean dniRepetidoEnBD(String dni) {
        Connection con = Conexion.getConexion(); // Reemplaza 'Conexion' con el nombre de tu clase de conexión
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        boolean dniRepetido = false;

        try {
            String consulta = "SELECT COUNT(*) FROM bombero WHERE dni = ?";
            preparedStatement = con.prepareStatement(consulta);
            preparedStatement.setString(1, dni);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next() && resultSet.getInt(1) > 0) {
                dniRepetido = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Algo anda mal.");
        }

        return dniRepetido;
    }

    public boolean verificarCampos() {

        //VARIABLES PARA CADA CAMPO
        String nombre = jTnom.getText();
        String dni = jTdni.getText();
        String sanguineo = jTsanguineo.getText();
        String telefono = jTtelefono.getText();
        String codBrigada = jTcodBrigada.getText();

        //VERIFICAR NOMBRE
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de nombre no puede estar vacío.");
            return false;
        }

        if (nombre.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(this, "El campo de nombre debe contener solo letras.");
            jTnom.setText("");
            return false;
        }

        //VERIFICAR DNI
        if (dni.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de DNI no puede estar vacío.");
            return false;
        }

        if (!dni.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "El campo de DNI debe contener solo números.");
            jTdni.setText("");
            return false;
        }

        if (dni.length() > 8) {
            JOptionPane.showMessageDialog(this, "El campo de DNI debe tener máximo 8 dígitos.");
            jTdni.setText("");
            return false;
        }
        /*
        if (dniRepetidoEnBD(dni)) {
            JOptionPane.showMessageDialog(this, "El DNI ya existe en la base de datos.");
            jTdni.setText("");
            return false;
        }
        */
        
        //VERIFICAR GRUPO SANGUÍNEO
        if (sanguineo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de grupo sanguíneo no puede estar vacío.");
            return false;
        }

        if (sanguineo.length() > 3) {
            JOptionPane.showMessageDialog(this, "El campo de grupo sanguíneo no puede tener más de 3 caracteres.");
            jTsanguineo.setText("");
            return false;
        }

        if (sanguineo.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(this, "El campo de grupo sanguíneo no puede contener números.");
            jTsanguineo.setText("");
            return false;
        }

        //VERIFICAR NÚMERO DE TELÉFONO
        if (telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de teléfono no puede estar vacío.");
            return false;
        }

        if (!telefono.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "El campo de teléfono debe contener solo números.");
            jTtelefono.setText("");
            return false;
        }

        //VERIFICAR NÚMERO DE BRIGADA
        if (codBrigada.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de código de brigada no puede estar vacío.");
            return false;
        }

        if (!codBrigada.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "El campo de código de brigada debe contener solo números.");
            jTcodBrigada.setText("");
            return false;
        }

        return true;
    }

}
