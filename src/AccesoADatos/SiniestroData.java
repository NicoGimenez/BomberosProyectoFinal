package AccesoADatos;

import Entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SiniestroData {
     private Connection con = null;
     
      public SiniestroData() {

        con = Conexion.getConexion();

    }
     public void guardarSiniestro(Siniestro siniestro) {
    String sql = "INSERT INTO siniestro(tipo, fecha_siniestro, coord_X, coord_Y, detalle, fecha_resol, puntuacion, codBrigada)"
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
        ps.setString(1, siniestro.getTipo().getDescripcion());
        ps.setDate(2, Date.valueOf(siniestro.getFecha_siniestro()));
        ps.setInt(3, siniestro.getCoord_x());
        ps.setInt(4, siniestro.getCoord_Y());
        ps.setString(5, siniestro.getDetalles());
        ps.setDate(6, Date.valueOf(siniestro.getFecha_resol()));
        ps.setInt(7, siniestro.getPuntuacion());
        ps.setInt(8, siniestro.getCodBrigada());

        int exito = ps.executeUpdate();

        if (exito > 0) {
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                siniestro.setCodigo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Siniestro ingresado");
            }
            rs.close();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar el siniestro");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
}
}
