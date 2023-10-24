/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.BomberoData;
import AccesoADatos.BrigadaData;
import AccesoADatos.CuartelData;
import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lucas E. Sayago
 */
public class ListadoCompletoView extends javax.swing.JInternalFrame {

    private final DefaultTableModel modeloBrigada = new DefaultTableModel();
    private final DefaultTableModel modeloBombero = new DefaultTableModel();
    private final CuartelData cData = new CuartelData();
    private final BrigadaData brigadaData = new BrigadaData();
    private final BomberoData bomberoData = new BomberoData();
    
    private java.util.ArrayList<Cuartel> cuarteles = new java.util.ArrayList<>();
    private java.util.ArrayList<Brigada> brigadas = new java.util.ArrayList<>();
    private java.util.ArrayList<Bombero> bomberos = new java.util.ArrayList<>();

    public ListadoCompletoView() {

        initComponents();
        this.setTitle("LISTADO COMPLETO");
        armarCabeceraBrigada();
        armarCabeceraBobero();
        llenarCombo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCCuarteles = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBrigadasdeCuartel = new javax.swing.JTable();
        jRBLibre = new javax.swing.JRadioButton();
        jRBAsignadas = new javax.swing.JRadioButton();
        jRBTodasLasBrigadas = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLTelefono = new javax.swing.JLabel();
        jLSelecciontelefono = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jLSeleccionEmail = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaBombero = new javax.swing.JTable();

        setClosable(true);

        jCCuarteles.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jCCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCuartelesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel1.setText("SELECCIONAR CUARTEL:");

        jTBrigadasdeCuartel.setModel(new javax.swing.table.DefaultTableModel(
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
        jTBrigadasdeCuartel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBrigadasdeCuartelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTBrigadasdeCuartel);

        jRBLibre.setText("Libres");
        jRBLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBLibreActionPerformed(evt);
            }
        });

        jRBAsignadas.setText("Asignadas");
        jRBAsignadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBAsignadasActionPerformed(evt);
            }
        });

        jRBTodasLasBrigadas.setText("Todas ");
        jRBTodasLasBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBTodasLasBrigadasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel2.setText("BRIGADAS:");

        jLTelefono.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLTelefono.setText("TELEFONO:");

        jLSelecciontelefono.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N

        jLEmail.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLEmail.setText("EMAIL:");

        jLSeleccionEmail.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                        .addComponent(jLEmail)
                        .addGap(170, 170, 170))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLSelecciontelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLSeleccionEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefono)
                    .addComponent(jLEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLSeleccionEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSelecciontelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel4.setText("BOMBEROS:");

        jTablaBombero.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTablaBombero);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36)
                                .addComponent(jRBTodasLasBrigadas)
                                .addGap(71, 71, 71)
                                .addComponent(jRBLibre)
                                .addGap(64, 64, 64)
                                .addComponent(jRBAsignadas))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jCCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBLibre)
                    .addComponent(jRBAsignadas)
                    .addComponent(jRBTodasLasBrigadas)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBTodasLasBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBTodasLasBrigadasActionPerformed
        jRBAsignadas.setSelected(false);
        jRBLibre.setSelected(false);
        Cuartel cuartel = (Cuartel) jCCuarteles.getSelectedItem();
        brigadas = cData.obtenerBrigadasDelCuartel(cuartel.getCodigoCuartel());
        llenarTablaBrigada();
    }//GEN-LAST:event_jRBTodasLasBrigadasActionPerformed

    private void jRBLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBLibreActionPerformed
        jRBTodasLasBrigadas.setSelected(false);
        jRBAsignadas.setSelected(false);
        Cuartel cuartel = (Cuartel) jCCuarteles.getSelectedItem();
        brigadas = cData.obtenerBrigadasLisbreDelCuartel(cuartel.getCodigoCuartel());
        llenarTablaBrigada();
    }//GEN-LAST:event_jRBLibreActionPerformed

    private void jRBAsignadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBAsignadasActionPerformed
        jRBLibre.setSelected(false);
        jRBTodasLasBrigadas.setSelected(false);
        Cuartel cuartel = (Cuartel) jCCuarteles.getSelectedItem();
        brigadas = cData.obtenerBrigadasAsignadasDelCuartel(cuartel.getCodigoCuartel());
        llenarTablaBrigada();
    }//GEN-LAST:event_jRBAsignadasActionPerformed

    private void jCCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCuartelesActionPerformed
        Cuartel cuartel = (Cuartel) jCCuarteles.getSelectedItem();
        setearEtiquetas(cuartel);
        modeloBrigada.setRowCount(0);
        modeloBombero.setRowCount(0);
        jRBLibre.setSelected(false);
        jRBAsignadas.setSelected(false);
        jRBTodasLasBrigadas.setSelected(false);
    }//GEN-LAST:event_jCCuartelesActionPerformed

    private void jTBrigadasdeCuartelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBrigadasdeCuartelMouseClicked
            
        //obtenemos primero la fila seleccionada
        int seleccionDeFila = jTBrigadasdeCuartel.getSelectedRow();

        //se comprueva que tenga alguna seleccion dado que el indice es 0 1 2 3 4 
        if (seleccionDeFila > -1) {
           
            // extraemos el codigo del indice 4
            int codBrigada = Integer.parseInt(modeloBrigada.getValueAt(seleccionDeFila, 4).toString());
            
            bomberos= (ArrayList<Bombero>) bomberoData.listBomberosPorBrigada(codBrigada);
            
            llenarTablaBombero();
            
        }
    }//GEN-LAST:event_jTBrigadasdeCuartelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Cuartel> jCCuarteles;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLSeleccionEmail;
    private javax.swing.JLabel jLSelecciontelefono;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBAsignadas;
    private javax.swing.JRadioButton jRBLibre;
    private javax.swing.JRadioButton jRBTodasLasBrigadas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTBrigadasdeCuartel;
    private javax.swing.JTable jTablaBombero;
    // End of variables declaration//GEN-END:variables

    public void llenarCombo() {
        cuarteles = cData.listarCuarteles();

        for (Cuartel cuartel : cuarteles) {
            jCCuarteles.addItem(cuartel);
        }
    }

    public void armarCabeceraBrigada() {

        modeloBrigada.addColumn("NOMBRE");
        modeloBrigada.addColumn("ESPECILIDAD");
        modeloBrigada.addColumn("ESTADO");
        modeloBrigada.addColumn("LIBRE");
        modeloBrigada.addColumn("CODIGO");

        jTBrigadasdeCuartel.setModel(modeloBrigada);

        jTBrigadasdeCuartel.getColumnModel().getColumn(0).setPreferredWidth(10); // BRIGADA
        jTBrigadasdeCuartel.getColumnModel().getColumn(1).setPreferredWidth(50); // ESPECIALIDAD
        jTBrigadasdeCuartel.getColumnModel().getColumn(2).setPreferredWidth(50); // ACTIVA
        jTBrigadasdeCuartel.getColumnModel().getColumn(3).setPreferredWidth(50); //LIBRE
        jTBrigadasdeCuartel.getColumnModel().getColumn(4).setPreferredWidth(50); //CODIGO

        // Hacer la tabla no editable
        for (int i = 0; i < jTBrigadasdeCuartel.getColumnCount(); i++) {
            Class<?> columnClass = jTBrigadasdeCuartel.getColumnClass(i);
            jTBrigadasdeCuartel.setDefaultEditor(columnClass, null);
        }
    }

    public void armarCabeceraBobero() {

        modeloBombero.addColumn("NOMBRE Y APELLIDO");
        modeloBombero.addColumn("DNI");
        modeloBombero.addColumn("FECHA DE NACIMIENTO");
        modeloBombero.addColumn("TELÉFONO");
        modeloBombero.addColumn("ACTIVO");

        jTablaBombero.setModel(modeloBombero);

        jTablaBombero.getColumnModel().getColumn(0).setPreferredWidth(115); // NOMBRE Y APELLIDO
        jTablaBombero.getColumnModel().getColumn(1).setPreferredWidth(70); // DNI
        jTablaBombero.getColumnModel().getColumn(2).setPreferredWidth(120); // FECHA DE NACIMIENTO
        jTablaBombero.getColumnModel().getColumn(3).setPreferredWidth(80); // TELÉFONO
        jTablaBombero.getColumnModel().getColumn(4).setPreferredWidth(50); // ACTIVO

        // Hacer la tabla no editable
        for (int i = 0; i < jTablaBombero.getColumnCount(); i++) {
            Class<?> columnClass = jTablaBombero.getColumnClass(i);
            jTablaBombero.setDefaultEditor(columnClass, null);
        }
    }

    public void llenarTablaBrigada() {

        modeloBrigada.setRowCount(0);

        for (Brigada brigada : brigadas) {
            Object[] rowData = {
                brigada.getNombre_br(),
                brigada.getTipo(),
                brigada.isActivo() ? "Activo" : "Inactivo", // Si es true, agrega "Activo". Si es false, agrega "Inactivo".
                brigada.isLibre() ? "Si" : "No", // Si es true, agrega "Si". Si es false, agrega "No".
                brigada.getCodBrigada()
            };
            modeloBrigada.addRow(rowData);
        }
    }

    public void llenarTablaBombero() {
        modeloBombero.setRowCount(0);

        for (Bombero XBombero : bomberos) {
            Object[] rowData = {
                XBombero.getNombre(),
                XBombero.getDni(),
                XBombero.getFechaNac(),
                XBombero.getCelular(),
                XBombero.isActivo()? "Si" : "No",
            };
            modeloBombero.addRow(rowData);
        }
    }

    public void setearEtiquetas(Cuartel cuartel) {
        jLSelecciontelefono.setText(cuartel.getTelefono());
        jLSeleccionEmail.setText(cuartel.getCorreo());
    }
}
