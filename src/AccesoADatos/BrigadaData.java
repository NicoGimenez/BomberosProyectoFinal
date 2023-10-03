/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;


import Entidades.Brigada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author niqog
 */
public class BrigadaData {

    private Connection con = null;

    public BrigadaData() {

        con = Conexion.getConexion();
    }

     public List<Brigada> listarBrigadasBomberos() {

        ArrayList<Brigada> brigadas  = new ArrayList<>();
        
        try {
            String sql = "SELECT  * FROM brigada WHERE  estado=1";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {                
                
                Brigada brigada = new Brigada();
                brigada.setCodBrigada(0);
                brigada.setEspecialidad(sql);
                
               

            } 

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos. "+ ex.getMessage() );
        }
        return brigadas;
}
}
