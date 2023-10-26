package Vistas;

import AccesoADatos.SiniestroData;
import Entidades.Siniestro;
import java.awt.Container;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class ConsultarSiniestro extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private SiniestroData sd = new SiniestroData();

    public ConsultarSiniestro() {
        initComponents();
        armarCabecera();
        mostrarSiniestros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSiniestros = new javax.swing.JTable();
        jDFechaSiniestro = new com.toedter.calendar.JDateChooser();
        jDFechaResol = new com.toedter.calendar.JDateChooser();
        jBBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBModificarSiniestro = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(712, 713));

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(712, 800));

        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 13)); // NOI18N
        jButton1.setText("Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 13)); // NOI18N
        jButton2.setText("Resueltos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 13)); // NOI18N
        jButton3.setText("Sin resolver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 13)); // NOI18N
        jLabel1.setText("Filtrar");

        jTSiniestros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTSiniestros);

        jBBuscar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 13)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 13)); // NOI18N
        jLabel3.setText("Hasta");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 13)); // NOI18N
        jLabel2.setText("Desde");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jDFechaSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(jDFechaResol, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBuscar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(jLabel2))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDFechaSiniestro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDFechaResol, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscar))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 34)); // NOI18N
        jLabel4.setText("Consultar Siniestros");

        jBModificarSiniestro.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 13)); // NOI18N
        jBModificarSiniestro.setText("Modificar Siniestro");
        jBModificarSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarSiniestroActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBModificarSiniestro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBModificarSiniestro))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(22, 22, 22)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jBModificarSiniestro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mostrarSiniestrosNoResueltos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrarSiniestrosResueltos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrarSiniestros();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        LocalDate fecha1 = null;
        LocalDate fecha2 = null;
        if (jDFechaResol.getDate() != null) {
            fecha1 = jDFechaResol.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese una fecha válida en jDFechaResol");
            return;
        }
        if (jDFechaSiniestro.getDate() != null) {
            fecha2 = jDFechaSiniestro.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese una fecha válida en jDFechaSiniestro");
            return;
        }
        mostrarSiniestrosEntreFechas(fecha2, fecha1);
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBModificarSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarSiniestroActionPerformed
        //    int siniestroID;
        try {
            int selectedRow = jTSiniestros.getSelectedRow();

            if (selectedRow != -1) {
                int id = (int) jTSiniestros.getValueAt(selectedRow, 0);

                ModificarSiniestroView ms = new ModificarSiniestroView();
                JDesktopPane desktopPane = getDesktopPane();
                desktopPane.add(ms);
                ms.buscarSiniestroPorId(id);
                ms.habilitarBotones();
                ms.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Selecciona una fila antes de modificar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID de siniestro válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBModificarSiniestroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBModificarSiniestro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDFechaResol;
    private com.toedter.calendar.JDateChooser jDFechaSiniestro;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTSiniestros;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("ID");
        modelo.addColumn("Tipo");
        modelo.addColumn("Fecha");
        modelo.addColumn("X");
        modelo.addColumn("Y");
        modelo.addColumn("Detalles");
        modelo.addColumn("Resolución");
        modelo.addColumn("Puntaje");
        modelo.addColumn("codBrigada");
        jTSiniestros.setModel(modelo);
        TableColumnModel columnModel = jTSiniestros.getColumnModel();
        int ancho0 = 30, ancho1 = 100, ancho2= 50, ancho3= 80;
        TableColumn columna = columnModel.getColumn(0); 
        columna.setPreferredWidth(ancho0);
        columna = columnModel.getColumn(1); 
        columna.setPreferredWidth(ancho1);
        columna = columnModel.getColumn(2); 
        columna.setPreferredWidth(ancho1);
        columna = columnModel.getColumn(3); 
        columna.setPreferredWidth(ancho2);
        columna = columnModel.getColumn(4); 
        columna.setPreferredWidth(ancho2);
        columna = columnModel.getColumn(5); 
        columna.setPreferredWidth(ancho1);
        columna = columnModel.getColumn(6); 
        columna.setPreferredWidth(ancho1);
        columna = columnModel.getColumn(7); 
        columna.setPreferredWidth(ancho0);
        columna = columnModel.getColumn(0); 
        columna.setPreferredWidth(ancho0);

        for (int i = 0; i < jTSiniestros.getColumnCount(); i++) {
            Class<?> columnClass = jTSiniestros.getColumnClass(i);
            jTSiniestros.setDefaultEditor(columnClass, null);
        }
    }

    private void mostrarSiniestros() {
        modelo.setRowCount(0);
        Siniestro siniestro = new Siniestro();
        ArrayList<Siniestro> listaDeSiniestros = (ArrayList) sd.listarSiniestros();

        for (Siniestro sin : listaDeSiniestros) {
            Object[] rowData = {sin.getCodigo(), sin.getTipo(), sin.getFecha_siniestro(), sin.getCoord_x(), sin.getCoord_Y(), sin.getDetalles(), sin.getFecha_resol(), sin.getPuntuacion(), sin.getCodBrigada()};
            modelo.addRow(rowData);
        }
    }

    private void mostrarSiniestrosNoResueltos() {
        modelo.setRowCount(0);
        Siniestro siniestro = new Siniestro();
        ArrayList<Siniestro> listaDeSiniestros = (ArrayList) sd.ListarSiniestrosNoResueltos();

        for (Siniestro sin : listaDeSiniestros) {
            Object[] rowData = {sin.getCodigo(), sin.getTipo(), sin.getFecha_siniestro(), sin.getCoord_x(), sin.getCoord_Y(), sin.getDetalles(), sin.getFecha_resol(), sin.getPuntuacion(), sin.getCodBrigada()};
            modelo.addRow(rowData);
        }
    }

    private void mostrarSiniestrosResueltos() {
        modelo.setRowCount(0);
        Siniestro siniestro = new Siniestro();
        ArrayList<Siniestro> listaDeSiniestros = (ArrayList) sd.ListarSiniestrosResueltos();

        for (Siniestro sin : listaDeSiniestros) {
            Object[] rowData = {sin.getCodigo(), sin.getTipo(), sin.getFecha_siniestro(), sin.getCoord_x(), sin.getCoord_Y(), sin.getDetalles(), sin.getFecha_resol(), sin.getPuntuacion(), sin.getCodBrigada()};
            modelo.addRow(rowData);
        }
    }

    private void mostrarSiniestrosEntreFechas(LocalDate fechaInicio, LocalDate fechaFin) {

        modelo.setRowCount(0);
        Siniestro siniestro = new Siniestro();
        ArrayList<Siniestro> listaDeSiniestros = (ArrayList) sd.buscarSiniestroEntreFechas(fechaInicio, fechaFin);

        for (Siniestro sin : listaDeSiniestros) {
            Object[] rowData = {sin.getCodigo(), sin.getTipo(), sin.getFecha_siniestro(), sin.getCoord_x(), sin.getCoord_Y(), sin.getDetalles(), sin.getFecha_resol(), sin.getPuntuacion(), sin.getCodBrigada()};
            modelo.addRow(rowData);
        }
    }
}
