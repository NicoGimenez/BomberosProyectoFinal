/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.BrigadaData;
import Entidades.Brigada;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lucas E. Sayago
 */
public class BrigadaView extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private ArrayList<Brigada> brigadas = new ArrayList<>();
    private final BrigadaData bData = new BrigadaData();

    public BrigadaView() {
        initComponents();
        armarCombox();
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
        jBadministracionBrigadas = new javax.swing.JButton();
        jCBrigadas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Listar Brigadas");

        jBadministracionBrigadas.setText("Administacion Brigadas");

        jCBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBrigadasActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCBrigadas, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jBadministracionBrigadas, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBrigadas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jBadministracionBrigadas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBrigadasActionPerformed
        limpiarTabla();
        Brigada brigadas = (Brigada) jCBrigadas.getSelectedItem();
        this.brigadas = (ArrayList<Brigada>) bData.listarBrigadasLibres();

        llenarTabla(this.brigadas);
    }//GEN-LAST:event_jCBrigadasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBadministracionBrigadas;
    private javax.swing.JComboBox<String> jCBrigadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla(ArrayList<Brigada> brig) {
        limpiarTabla();

        for (Brigada xbrig : brig) {
            Object[] rowData = {xbrig.getCodBrigada(), xbrig.getTipo(), xbrig.getNombre_br()};
            modelo.addRow(rowData);

        }

    }

    private void limpiarTabla() {

        modelo.setRowCount(0);
    }

    private void armarCombox() {

        ArrayList<Brigada> brigadas = (ArrayList<Brigada>) bData.listarBrigadasLibres();

        for (Brigada brig : brigadas) {
            jCBrigadas.addItemListener((ItemListener) brig);

        }
    }

}
