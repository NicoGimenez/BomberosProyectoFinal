/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Brigada;
import Entidades.Especialidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public List<Brigada> listarBrigadasLibres() {

        ArrayList<Brigada> brigadas = new ArrayList<>();

        try {
            String sql = "SELECT  * FROM brigada WHERE  libre=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Brigada brigada = new Brigada();
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigadas.add(brigada);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos. " + ex.getMessage());
        }
        return brigadas;
    }

    public List<Brigada> listarBrigadasLibresPorEspecialidad(Especialidad espc) {

        ArrayList<Brigada> brigadas = new ArrayList<>();

        try {
            String sql = "SELECT  * FROM brigada WHERE  libre=1 AND especialidad=? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Brigada brigada = new Brigada();
                
                brigada= buscarBrigadaPorCodigo(rs.getInt("codBrigada"));
                brigadas.add(brigada);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos. " + ex.getMessage());
        }
        return brigadas;
    }

    public void agregarBrigada(Brigada brigada) {
        try {
            /*
           // Agregué una restricción para que especialidad y nro_cuartel en la base de datos sean únicos -> UC_especialidad_nro_cuartel
            String sqlEspecialidad = "SELECT COUNT(*) AS count from brigada WHERE especialidad = ? AND nro_cuartel = ?"; 
            PreparedStatement psEspecialidad = con.prepareStatement(sqlEspecialidad);
            
            psEspecialidad.setString(1, brigada.getEspecialidad());
            psEspecialidad.setInt(2, brigada.getCodCuartel());
            
            ResultSet rsEspecialidad = psEspecialidad.executeQuery();
            rsEspecialidad.last();
            
            if(rsEspecialidad.getInt("count") > 0) {
               rsEspecialidad.close();
               psEspecialidad.close();
               throw new Exception("especialidad and nro_cuartel must be unique");
            }
            
           
            // Agregué una restricción para que nombre en la base de datos sea único -> UC_nombre_br
            String sqlNombre = "SELECT COUNT(*) AS count from brigada WHERE nombre_br = ?"; 
            PreparedStatement psNombre = con.prepareStatement(sqlNombre);
           
            psNombre.setString(1, brigada.getNombre_br());
            
            ResultSet rsNombre = psNombre.executeQuery();
            rsNombre.last();
            
            if(rsNombre.getInt("count") > 0) {
               rsNombre.close();
               psNombre.close();
               throw new Exception("nombre must be unique");
            }
             */

            String sql = "INSERT INTO brigada (nombre_br, especialidad, libre, nro_cuartel ) "
                    + "VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, brigada.getNombre_br());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getCodCuartel());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                brigada.setCodBrigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Brigada guardado.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar una brigada." + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public List<Brigada> listBrigadasPorCuartel(int nroCuartel) {
        ArrayList<Brigada> brigadas = new ArrayList<>();

        try {
            String sql = "SELECT * FROM brigada WHERE nro_cuartel=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, nroCuartel);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Brigada brigada = new Brigada();
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigadas.add(brigada);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos. " + ex.getMessage());
        }
        return brigadas;
    }

    public void eliminarBrigada(int codBrigada) {

        try {
            String sql = "UPDATE cuartel SET activo=0 WHERE codCuartel=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, codBrigada);

            int exito = ps.executeUpdate();

            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "Brigada eliminado");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la briagada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar cuartel" + ex);
        }
    }

    public Brigada buscarBrigadaPorCodigo(int codBrigada) {
        Brigada brigada = new Brigada();
        String sql = "SELECT codBrigada, nombre_br, especialidad, libre, nro_cuartel FROM brigada WHERE codBrigada=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));
                brigada.setCodCuartel(rs.getInt("nro_cuartel"));

            }else{
                
                 JOptionPane.showMessageDialog(null, "No existe brigada con ese codigo");
                
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar brigada por codigo: " + ex.getMessage());
        }
        return  brigada;
        
        
    }
}
