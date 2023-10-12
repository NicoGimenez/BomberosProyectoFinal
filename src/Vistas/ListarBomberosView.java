package Vistas;

import AccesoADatos.BomberoData;
import Entidades.Bombero;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Enzo
 */
public class ListarBomberosView extends javax.swing.JInternalFrame {

    private final DefaultTableModel modelo = new DefaultTableModel();
    private final BomberoData bdata = new BomberoData();
    private ArrayList<Bombero> bomberos = new ArrayList<>();

    public ListarBomberosView() {
 /*      bomberos = bdata.listBomberosPorBrigada();
        initComponents();
        this.setTitle("Listar Cuarteles");
        armarCabecera();
        llenarTabla(bomberos);
    }

    public ListarBomberosView() {
        initComponents();
    */}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    }

    /*public void llenarTabla(ArrayList<Bombero> cuarteles) {
        modelo.setRowCount(0);

        for (Bombero XBombero : bomberos) {
            Object[] rowData = {
                XBombero.getCod_bombero(),
                XBombero.getNombre(),
                XBombero.getDni(),
                XBombero.getGrupo_sanguineo(),
                XBombero.getFecha_nac(),
                XBombero.getCelular(),
                XBombero.isActivo()
            };
            modelo.addRow(rowData);
        }

    }*/
}
