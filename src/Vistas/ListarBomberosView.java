package Vistas;

import AccesoADatos.BomberoData;
import Entidades.Bombero;
import Entidades.Cuartel;
import javax.swing.table.DefaultTableModel;

/**
 * @author Enzo
 */
public class ListarBomberosView extends javax.swing.JInternalFrame {

    private final DefaultTableModel modelo = new DefaultTableModel();
    private final BomberoData bdata = new BomberoData();
    private java.util.ArrayList<Bombero> bomberos = new java.util.ArrayList<>();

    public ListarBomberosView() {
        bomberos = bdata.listarBomberos();
        initComponents();
        this.setTitle("Listar Cuarteles");
        armarCabecera();
        llenarTabla(bomberos);
    }

   
       
  

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
        //dni, nombre_ape, grupo_sanguineo, fecha_nac, celular, codBrigada, activo 
        modelo.addColumn("dni");
        modelo.addColumn("nombre_ape");
        modelo.addColumn("grupo_sanguineo");
        modelo.addColumn("fecha_nac");
        modelo.addColumn("celular");
        modelo.addColumn("codBrigada");
        modelo.addColumn("Activo");

        jTable1.setModel(modelo);
    }

    public void llenarTabla(java.util.ArrayList<Bombero> cuarteles) {
        modelo.setRowCount(0);

        for (Bombero XBombero : bomberos) {
            Object[] rowData = {
                XBombero.getCod_bombero(),
                XBombero.getNombre(),
                XBombero.getDni(),
                XBombero.getGrupo_sanguineo(),
                XBombero.getFechaNac(),
                XBombero.getCelular(),
                XBombero.isActivo()
            };
            modelo.addRow(rowData);
        }
  
    }
}
