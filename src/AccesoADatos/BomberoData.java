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

    private Connection connection = null;

    public BomberoData() {
        connection = Conexion.getConexion();
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

            
             int exito=ps.executeUpdate();
            
            if(exito>0){
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                bombero.setCod_bombero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Bombero guardado con éxito.");
            }
            }else{
                JOptionPane.showMessageDialog(null, "Error al agregar Bombero. ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar un bombero. " + ex.getMessage());
        }
    }

    //FUNCIONA SSEEEEEEEEEEEEEEEEEE
    public Bombero buscarBomberoPorCodigo(int cod_bombero) {

        Bombero bombero = null;
        String sql = "SELECT nombre_ape, idBombero, dni, grupo_sanguineo, fecha_nac, celular, codBrigada, activo FROM bombero WHERE idBombero = ?";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, cod_bombero);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                bombero=new Bombero();
                bombero.setNombre(rs.getString("nombre_ape"));
                bombero.setCod_bombero(rs.getInt("idBombero"));
                bombero.setDni(rs.getString("dni"));
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));

                Date fechaNacimiento = rs.getDate("fecha_nac");
                if (fechaNacimiento != null) {
                    bombero.setFechaNac(fechaNacimiento.toLocalDate());
                }

                bombero.setCelular(rs.getString("celular"));
                bombero.setCodigoDeBrigada(rs.getInt("codBrigada"));
                bombero.setActivo(rs.getBoolean("activo"));

            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "\"Error al intentar buscar bombero por id\"");
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
                    + "fecha_nac = ?, celular = ?, activo = ? WHERE idBombero = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, bombero.getDni());
            st.setString(2, bombero.getNombre());
            st.setString(3, bombero.getGrupo_sanguineo());
            st.setDate(4, Date.valueOf(bombero.getFechaNac()));
            st.setString(5, bombero.getCelular());
            st.setInt(6, bombero.getCod_bombero());
            st.setBoolean(7, bombero.isActivo());
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

                JOptionPane.showMessageDialog(null, "Bombero dado de baja exitosamente.");

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
    
    public ArrayList<Bombero> listarBomberos() {

        ArrayList<Bombero> bomberos = new ArrayList<>();
        
        String sql= "SELECT `idBombero`, `dni`, `nombre_ape`, `grupo_sanguineo`, `fecha_nac`, `celular`, `codBrigada`, `activo` FROM `bombero` WHERE 1";
        try { 
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Bombero bombero = new Bombero();
                bombero.setCod_bombero(rs.getInt("idBombero"));
                bombero.setDni(rs.getString("dni"));
                bombero.setNombre(rs.getString("nombre_ape"));
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));   
                bombero.setFechaNac(rs.getDate("fecha_nac").toLocalDate());               
                bombero.setCelular(rs.getString("celular"));
                bombero.setCodigoDeBrigada(rs.getInt("codBrigada"));             
                bombero.setActivo(rs.getBoolean("activo"));
                bomberos.add(bombero);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar bomberos");
        }

        return bomberos;
    }
    
    
}
