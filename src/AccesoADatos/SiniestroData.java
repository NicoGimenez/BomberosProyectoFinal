package AccesoADatos;

import Entidades.Especialidad;
import Entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public void modificarSiniestro(Siniestro siniestro) {
        String sql = "UPDATE siniestro SET tipo=?, fecha_siniestro=?, coord_X=?, coord_Y=?, detalle=?, fecha_resol=?, puntuacion=?, codBrigada=? WHERE codigo=?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
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
                JOptionPane.showMessageDialog(null, "Siniestro modificado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el siniestro");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    public void eliminarSiniestro(int codigoSiniestro) {

        String sql = "DELETE FROM siniestro WHERE codigo= ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, codigoSiniestro);

            int exito = ps.executeUpdate();

            if (exito > 0) {

                JOptionPane.showMessageDialog(null, " Siniestro borrado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error! " + ex.getMessage());
        }
    }

    public List<Siniestro> listarSiniestros() {

        ArrayList<Siniestro> siniestros = new ArrayList<>();

        try {
            String sql = "SELECT  * FROM siniestro";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Siniestro siniestro = new Siniestro();
                siniestro.setCodigo(rs.getInt("codigo"));
                String tipoSiniestroStr = rs.getString("tipo");
                Especialidad tipoSiniestro = obtenerEspecialidadDesdeString(tipoSiniestroStr);
                siniestro.setTipo(tipoSiniestro);
                siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro").toLocalDate());
                siniestro.setCoord_x(rs.getInt("coord_X"));
                siniestro.setCoord_Y(rs.getInt("coord_y"));
                siniestro.setDetalles(rs.getString("Detalle"));
                siniestro.setFecha_resol(rs.getDate("fecha_resol").toLocalDate());
                siniestro.setPuntuacion(rs.getInt("puntuacion"));
                siniestro.setCodBrigada(rs.getInt("codBrigada"));

                siniestros.add(siniestro);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos. " + ex.getMessage());
        }
        return siniestros;

    }

    public Especialidad obtenerEspecialidadDesdeString(String especialidadStr) {
        for (Especialidad especialidad : Especialidad.values()) {
            if (especialidad.getDescripcion().equalsIgnoreCase(especialidadStr)) {
                return especialidad;
            }
        }
        throw new IllegalArgumentException("Especialidad no encontrada para: " + especialidadStr);
    }

    public Siniestro BuscarSiniestroPorId(int id) {
        String sql = "SELECT * FROM Siniestro WHERE codigo= ?";

        Siniestro siniestro = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                siniestro = new Siniestro();
                siniestro.setCodigo(id);
                siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro").toLocalDate());
                siniestro.setCoord_x(rs.getInt("coord_X"));
                siniestro.setCoord_Y(rs.getInt("coord_Y"));
                siniestro.setDetalles(rs.getString("detalle"));
                siniestro.setFecha_resol(rs.getDate("fecha_resol").toLocalDate());
                siniestro.setPuntuacion(rs.getInt("puntuacion"));
                siniestro.setCodBrigada(rs.getInt("codBrigada"));

            } else {

                JOptionPane.showMessageDialog(null, "No existe siniestro con ese ID ");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de consulta");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, " No se encontró el siniestro.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, " No se encontró el siniestro.");
        }
        return siniestro;
    }

    public Siniestro BuscarSiniestroEntreFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        String sql = "SELECT * FROM siniestro WHERE fecha_siniestro BETWEEN ? AND ?";

        Siniestro siniestro = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaInicio));
        ps.setDate(2, Date.valueOf(fechaFin));
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                siniestro = new Siniestro();
                siniestro.setCodigo(rs.getInt("codigo"));
                siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro").toLocalDate());
                siniestro.setCoord_x(rs.getInt("coord_X"));
                siniestro.setCoord_Y(rs.getInt("coord_Y"));
                siniestro.setDetalles(rs.getString("detalle"));
                siniestro.setFecha_resol(rs.getDate("fecha_resol").toLocalDate());
                siniestro.setPuntuacion(rs.getInt("puntuacion"));
                siniestro.setCodBrigada(rs.getInt("codBrigada"));

            } else {

                JOptionPane.showMessageDialog(null, "No existe siniestro con ese ID ");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de consulta");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, " No se encontró el siniestro.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, " No se encontró el siniestro.");
        }
        return siniestro;
    }
    
    public List<Siniestro> ListarSiniestrosNoResueltos(){
         ArrayList<Siniestro> siniestros = new ArrayList<>();
         
        String sql = "SELECT * FROM siniestro WHERE fecha_resol IS NULL";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
          
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Siniestro siniestro = new Siniestro();
                siniestro.setCodigo(rs.getInt("codigo"));
                String tipoSiniestroStr = rs.getString("tipo");
                Especialidad tipoSiniestro = obtenerEspecialidadDesdeString(tipoSiniestroStr);
                siniestro.setTipo(tipoSiniestro);
                siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro").toLocalDate());
                siniestro.setCoord_x(rs.getInt("coord_X"));
                siniestro.setCoord_Y(rs.getInt("coord_y"));
                siniestro.setDetalles(rs.getString("Detalle"));
                siniestro.setFecha_resol(rs.getDate("fecha_resol").toLocalDate());
                siniestro.setPuntuacion(rs.getInt("puntuacion"));
                siniestro.setCodBrigada(rs.getInt("codBrigada"));

                siniestros.add(siniestro);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de consulta");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, " No se encontró el siniestro.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, " No se encontró el siniestro.");
        }
        return siniestros;
    }//SELECT * FROM siniestro WHERE fecha_resol IS NOT NULL

    public List<Siniestro> ListarSiniestrosResueltos(){
         ArrayList<Siniestro> siniestros = new ArrayList<>();
         
        String sql = "SELECT * FROM siniestro WHERE fecha_resol IS NOT NULL";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
          
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Siniestro siniestro = new Siniestro();
                siniestro.setCodigo(rs.getInt("codigo"));
                String tipoSiniestroStr = rs.getString("tipo");
                Especialidad tipoSiniestro = obtenerEspecialidadDesdeString(tipoSiniestroStr);
                siniestro.setTipo(tipoSiniestro);
                siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro").toLocalDate());
                siniestro.setCoord_x(rs.getInt("coord_X"));
                siniestro.setCoord_Y(rs.getInt("coord_y"));
                siniestro.setDetalles(rs.getString("Detalle"));
                siniestro.setFecha_resol(rs.getDate("fecha_resol").toLocalDate());
                siniestro.setPuntuacion(rs.getInt("puntuacion"));
                siniestro.setCodBrigada(rs.getInt("codBrigada"));

                siniestros.add(siniestro);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de consulta");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, " No se encontró el siniestro.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, " No se encontró el siniestro.");
        }
        return siniestros;
    }
}
