package AccesoADatos;

/**
 *
 * @author Enzo
 */
import Entidades.Bombero;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BomberoData {

    private Connection connection;

    public BomberoData() {
        this.connection = Conexion.getConexion();
    }

    // ok
    public void agregarBombero(Bombero bombero) {

        String sql = "INSERT INTO bombero (dni, nombre_ape, grupo_sanguineo, fecha_nac, celular, codBrigada, activo ) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, bombero.getDni());
            ps.setString(2, bombero.getNombre());
            ps.setString(3, bombero.getGrupo_sanguineo());
            ps.setDate(4, Date.valueOf(bombero.getFechaNac()));
            ps.setString(5, bombero.getCelular());
            ps.setInt(6, bombero.getCodigoDeBrigada());
            ps.setBoolean(7, bombero.isActivo());
            ps.executeUpdate();
         
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                bombero.setCod_bombero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Bombero guardado.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar un bombero. "+ex.getMessage());
    }
 }
    
    //ok
    public Bombero obtenerBomberoPorCodigo(int codigo) {
        Bombero bombero = null;
        try {
            String sql = "SELECT * FROM bombero WHERE idBombero = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, codigo);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                bombero = new Bombero();
                bombero.setCod_bombero(rs.getInt("idBombero"));
                bombero.setDni(rs.getString("dni"));
                bombero.setNombre(rs.getString("nombre_ape"));
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));
                bombero.setFechaNac(rs.getDate("fecha_nac").toLocalDate());
                bombero.setCelular(rs.getString("celular"));
                bombero.setCodigoDeBrigada(rs.getInt("codBrigada"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe bombero con ese código. ");
            }

            rs.close();
            st.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
        }
        return bombero;
    }

    //OK
    public List<Bombero> obtenerTodosLosBomberos() {
        List<Bombero> bomberos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM bombero";
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Bombero bombero = new Bombero();
                bombero.setCod_bombero(rs.getInt("idBombero"));
                bombero.setDni(rs.getString("dni"));
                bombero.setNombre(rs.getString("nombre_ape"));
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));
                bombero.setFechaNac(rs.getDate("fecha_nac").toLocalDate());
                bombero.setCelular(rs.getString("celular"));
                bombero.setCodigoDeBrigada(rs.getInt("codBrigada"));
                bomberos.add(bombero);
            }

            rs.close();
            st.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos. " + ex.getMessage());
        }
        return bomberos;
    }

    
    public void actualizarBombero(Bombero bombero) {
        try {
            String sql = "UPDATE bombero SET dni = ?, nombre_ape = ?, grupo_sanguineo = ?, "
                    + "fecha_nac = ?, celular = ? WHERE idBombero = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, bombero.getDni());
            st.setString(2, bombero.getNombre());
            st.setString(3, bombero.getGrupo_sanguineo());
            st.setDate(4, Date.valueOf(bombero.getFechaNac()));
            st.setString(5, bombero.getCelular());
            st.setInt(6, bombero.getCod_bombero());
            st.executeUpdate();
            st.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
        }
    }

    public void darDeBajaBombero(int cod_bombero) {
        try {
            String sql = "UPDATE bombero set activo = 0 WHERE idBombero= ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, cod_bombero);
            int exito = st.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Bomero eliminado.");

            }

            st.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos. ");
        }
    }

    public List<Bombero> listBomberosPorBrigada(int codBrigada) {
        List<Bombero> bomberos = new ArrayList<>();
        try {

            String sql = "SELECT * FROM bombero WHERE codBrigada=?";
            PreparedStatement st = connection.prepareStatement(sql);

            st.setInt(1, codBrigada);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Bombero bombero = new Bombero();
                bombero.setCod_bombero(rs.getInt("idBombero"));
                bombero.setDni(rs.getString("dni"));
                bombero.setNombre(rs.getString("nombre_ape"));
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));
                bombero.setFechaNac(rs.getDate("fecha_nac").toLocalDate());
                bombero.setCelular(rs.getString("celular"));
                bomberos.add(bombero);
            }

            st.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos. " + ex.getMessage());
        }
        return bomberos;
    }
}
