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

        jTable1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
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
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void armarCabecera() {
        //dni, nombre_ape, grupo_sanguineo, fecha_nac, celular, codBrigada, activo 
        modelo.addColumn("#");
        modelo.addColumn("NOMBRE Y APELLIDO");
        modelo.addColumn("DNI");
        modelo.addColumn("GRUPO SANGUÍNEO");               
        modelo.addColumn("FECHA DE NACIMIENTO");
        modelo.addColumn("TELÉFONO");
        modelo.addColumn("BRIGADA");
        modelo.addColumn("ACTIVO");
        
        
        
        jTable1.setModel(modelo);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(20); // CÓDIGO
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(115); // NOMBRE Y APELLIDO
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(70); // DNI
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(110); // GRUPO SANGUÍNEO
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(120); // FECHA DE NACIMIENTO
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(80); // TELÉFONO
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(50); // BRIGADA
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(50); // ACTIVO
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
                XBombero.getCodigoDeBrigada(),
                XBombero.isActivo()
            };
            modelo.addRow(rowData);
        }
  
    }
}
