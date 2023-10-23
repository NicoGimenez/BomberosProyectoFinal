/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.BrigadaData;
import AccesoADatos.CuartelData;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lucas E. Sayago
 */
public class ListarCuartelesView extends javax.swing.JInternalFrame {

    private final DefaultTableModel modelo = new DefaultTableModel();
    private final CuartelData cData = new CuartelData();
    private final BrigadaData bdata = new BrigadaData();
    private ArrayList<Cuartel> cuarteles = new ArrayList<>();
    private ArrayList<Brigada> brigadas = new ArrayList<>();

    public ListarCuartelesView() {
        cuarteles = cData.listarCuarteles();
        initComponents();
        this.setTitle("Listar Cuarteles");
        armarCabecera();
        llenarTabla(cuarteles);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

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

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel1.setText("Lista de Cuarteles");

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void armarCabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Coord X");
        modelo.addColumn("Coord Y");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        modelo.addColumn("Activo");

        jTable1.setModel(modelo);

        jTable1.getColumnModel().getColumn(0).setPreferredWidth(50); // CÓDIGO
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100); // NOMBRE
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(150); // DIRECCION
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(50); // COORD x
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(50); // COORD Y
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(80); // TELÉFONO
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(150); // CORREO
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(50); // ACTIVO

        // Hacer la tabla no editable
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            Class<?> columnClass = jTable1.getColumnClass(i);
            jTable1.setDefaultEditor(columnClass, null);

        }

    }

    public void llenarTabla(ArrayList<Cuartel> cuarteles) {
        modelo.setRowCount(0);

        for (Cuartel XCuartel : cuarteles) {
            Object[] rowData = {
                XCuartel.getCodigoCuartel(),
                XCuartel.getNombreDeCuartel(),
                XCuartel.getDireccion(),
                XCuartel.getCoordenadaEnX(),
                XCuartel.getCoordenadaEnY(),
                XCuartel.getTelefono(),
                XCuartel.getCorreo(),
                XCuartel.isActivo()? "SI" : "NO"
            };
            modelo.addRow(rowData);
        }
    }

}
