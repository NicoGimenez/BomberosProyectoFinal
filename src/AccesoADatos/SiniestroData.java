package AccesoADatos;

import Entidades.Brigada;
import Entidades.Cuartel;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class SiniestroData {

    private Connection con = null;
    private CuartelData cd = new CuartelData();
    private BrigadaData bd = new BrigadaData();

    public SiniestroData() {

        con = Conexion.getConexion();

    }

    public void altaSiniestro(Siniestro siniestro) {

        String sql = "INSERT INTO siniestro(tipo, fecha_siniestro, coord_X, coord_Y, detalle)"
                + "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, siniestro.getTipo().getDescripcion());
            ps.setDate(2, Date.valueOf(siniestro.getFecha_siniestro()));
            ps.setInt(3, siniestro.getCoord_x());
            ps.setInt(4, siniestro.getCoord_Y());
            ps.setString(5, siniestro.getDetalles());

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
            JOptionPane.showMessageDialog(null, "Error al intentar guardar siniestro: " + ex.getMessage());
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Error! las coordenadas deben ser números: " + ex.getMessage());
        }

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
            JOptionPane.showMessageDialog(null, "Error al intentar guardar siniestro: " + ex.getMessage());
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
            ps.setInt(9, siniestro.getCodigo());

            int exito = ps.executeUpdate();

            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "Siniestro modificado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el siniestro");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar modificar : " + ex.getMessage());
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
            JOptionPane.showMessageDialog(null, " Error al intentar eliminar sinietro  " + ex.getMessage());
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
                siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro") != null ? rs.getDate("fecha_siniestro").toLocalDate() : null);
                siniestro.setCoord_x(rs.getInt("coord_X"));
                siniestro.setCoord_Y(rs.getInt("coord_Y"));
                siniestro.setDetalles(rs.getString("Detalle"));
                siniestro.setFecha_resol(rs.getDate("fecha_resol") != null ? rs.getDate("fecha_resol").toLocalDate() : null);
//                siniestro.setPuntuacion(rs.getObject("puntuacion") != null ? rs.getInt("puntuacion") : null);
                //   siniestro.setCodBrigada(rs.getObject("codBrigada") != null ? rs.getInt("codBrigada") : null);

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
                String tipoSiniestroStr = rs.getString("tipo");
                Especialidad tipoSiniestro = obtenerEspecialidadDesdeString(tipoSiniestroStr);
                siniestro.setTipo(tipoSiniestro);
                siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro").toLocalDate());
                siniestro.setCoord_x(rs.getInt("coord_X"));
                siniestro.setCoord_Y(rs.getInt("coord_Y"));
                siniestro.setDetalles(rs.getString("detalle"));
                siniestro.setCodBrigada(rs.getInt("codBrigada"));
                try {
                    siniestro.setFecha_resol(rs.getDate("fecha_resol").toLocalDate());
                } catch (Exception ex) {
                }
                try {
                    siniestro.setPuntuacion(rs.getInt("puntuacion"));
                } catch (Exception ex) {
                }
            } else {

                JOptionPane.showMessageDialog(null, "No existe siniestro con ese ID ");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de consulta");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, " Ingrese un número de id válido." + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, " No se encontró el siniestro.");
        }
        return siniestro;
    }

    public ArrayList<Siniestro> buscarSiniestroEntreFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        ArrayList<Siniestro> siniestros = new ArrayList<>();
        String sql = "SELECT * FROM siniestro WHERE fecha_siniestro BETWEEN ? AND ?;";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDate(1, Date.valueOf(fechaInicio));
            ps.setDate(2, Date.valueOf(fechaFin));
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Siniestro siniestro = new Siniestro();
                    siniestro.setCodigo(rs.getInt("codigo"));
                    String tipoSiniestroStr = rs.getString("tipo");
                    Especialidad tipoSiniestro = obtenerEspecialidadDesdeString(tipoSiniestroStr);
                    siniestro.setTipo(tipoSiniestro);
                    siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro").toLocalDate());
                    siniestro.setCoord_x(rs.getInt("coord_X"));
                    siniestro.setCoord_Y(rs.getInt("coord_Y"));
                    siniestro.setDetalles(rs.getString("detalle"));
                    siniestro.setFecha_resol(rs.getDate("fecha_resol") != null ? rs.getDate("fecha_resol").toLocalDate() : null);
                    siniestro.setPuntuacion(rs.getInt("puntuacion"));
                    siniestro.setCodBrigada(rs.getInt("codBrigada"));
                    siniestros.add(siniestro);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos. " + ex.getMessage());
            ex.printStackTrace();
        }
      
        return siniestros;
    }

    public List<Siniestro> ListarSiniestrosNoResueltos() {
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
                siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro") != null ? rs.getDate("fecha_siniestro").toLocalDate() : null);
                siniestro.setCoord_x(rs.getInt("coord_X"));
                siniestro.setCoord_Y(rs.getInt("coord_Y"));
                siniestro.setDetalles(rs.getString("Detalle"));
                siniestro.setFecha_resol(rs.getDate("fecha_resol") != null ? rs.getDate("fecha_resol").toLocalDate() : null);
//                siniestro.setPuntuacion(rs.getObject("puntuacion") != null ? rs.getInt("puntuacion") : null);
                //   siniestro.setCodBrigada(rs.getObject("codBrigada") != null ? rs.getInt("codBrigada") : null);

                siniestros.add(siniestro);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos. " + ex.getMessage());
        }

        return siniestros;

    }

    public List<Siniestro> ListarSiniestrosResueltos() {
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

    public ArrayList<Cuartel> ordenarCuartlesPorCercania(Siniestro siniestro, ArrayList<Cuartel> cuarteles) {
        if (siniestro == null || cuarteles == null || cuarteles.isEmpty()) {
            return cuarteles;
        }

        Collections.sort(cuarteles, new Comparator<Cuartel>() {
            @Override
            public int compare(Cuartel cuartel1, Cuartel cuartel2) {
                double distancia1 = cuartel1.distanciaAlSiniestro(siniestro);
                double distancia2 = cuartel2.distanciaAlSiniestro(siniestro);
                return Double.compare(distancia1, distancia2);
            }
        });

        return cuarteles;
    }

    public Brigada buscarBrigadaParaAsignarSiniestro(Siniestro siniestro, Especialidad esp) {
        Brigada brigada = null;
        ArrayList<Brigada> brigadas = new ArrayList<>();
        ArrayList<Cuartel> cuarteles = ordenarCuartlesPorCercania(siniestro, cd.listarCuarteles());
        //System.out.println(cuarteles);

        for (Cuartel cuartel : cuarteles) {
            brigadas = cd.obtenerBrigadasDelCuartel(cuartel.getCodigoCuartel());
            for (Brigada brig : brigadas) {
              System.out.println(brig.getEspecialidad());
                if (!brig.getEspecialidad().equals(esp.getDescripcion()) ) {
                    brigada = brig;
                    break;
                }else{System.out.println(brig.getEspecialidad()+"\n "+esp.getDescripcion());}
            }
            if (brigada != null) {
                
                break;
            }
        }
        return brigada;
    }

    public void asignarBrigada(Siniestro sin, Especialidad esp) {
        int codBrig = buscarBrigadaParaAsignarSiniestro(sin, esp).getCodBrigada();
        sin.setCodBrigada(codBrig);
        modificarSiniestro(sin);
    }
}
