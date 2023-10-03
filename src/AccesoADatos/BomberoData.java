
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

    public BomberoData(Connection connection) {
        this.connection = connection;
    }

    
    public void agregarBombero(Bombero bombero) {
         try {
            String sql = "INSERT INTO bombero  (dni, nombre, grupo_sanguineo, fecha_nacimiento, celular) " +
                         "VALUES (?, ?, ?, ?, ?)";
            
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombre());
            ps.setString(3, bombero.getGrupo_sanguineo());
            ps.setDate(4, Date.valueOf(bombero.getFechaNac()));
            ps.setInt(5, bombero.getNro());
            ps.executeUpdate();
            ps.close();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                bombero.setCod_bombero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Bombero guardado.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar un bombero.");
        }
    }

    public Bombero obtenerBomberoPorCodigo(int codigo) {
     Bombero bombero = null;
        try {
            String sql = "SELECT * FROM bombero WHERE codigo = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, codigo);
            
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                bombero = new Bombero();
                bombero.setCod_bombero(rs.getInt("codigo"));
                bombero.setDni(rs.getInt("dni"));
                bombero.setNombre(rs.getString("nombre"));
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));
                bombero.setFechaNac(rs.getDate("fechaDeNacimiento").toLocalDate());
                bombero.setNro(rs.getInt("nro"));
            }else {
                JOptionPane.showMessageDialog(null, "No existe bombero con ese código. ");
            }

            rs.close();
            st.close();
            
          } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
        }
        return bombero;
    }

    public List<Bombero> obtenerTodosLosBomberos() {
     List<Bombero> bomberos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM bombero";
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Bombero bombero = new Bombero();
                bombero.setCod_bombero(rs.getInt("codigo"));
                bombero.setDni(rs.getInt("dni"));
                bombero.setNombre(rs.getString("nombre"));
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));
                bombero.setFechaNac(rs.getDate("fechaDeNacimiento").toLocalDate());
                bombero.setNro(rs.getInt("nro"));
                bomberos.add(bombero);
            }

            rs.close();
            st.close();
            
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos. "+ ex.getMessage() );
        }
        return bomberos;
    }

    public void actualizarBombero(Bombero bombero) {
        try {
            String sql = "UPDATE bombero SET dni = ?, nombre = ?, grupo_sanguineo = ?, " +
                         "fecha_nacimiento = ?, celular = ? WHERE codigo = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, bombero.getDni());
            st.setString(2, bombero.getNombre());
            st.setString(3, bombero.getGrupo_sanguineo());
            st.setDate(4, Date.valueOf(bombero.getFechaNac()));
            st.setInt(5, bombero.getNro());
            st.setInt(6, bombero.getCod_bombero());
            st.executeUpdate();
            st.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
        }
    }

    public void darDeBajaBombero(int codigo) {
        try {
            String sql = "UPTADE bombero se";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, codigo);
            st.executeUpdate();
            st.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
        }
    }
}