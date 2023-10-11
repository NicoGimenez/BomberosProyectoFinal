package AccesoADatos;

import Entidades.Brigada;
import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * @author Lucas E. Sayago
 */
public class CuartelData {

    private Connection con = null;

    public CuartelData() {
        con = Conexion.getConexion();
    }

    public Cuartel agregarCuartel(Cuartel cuartel) {

        String sql = "INSERT INTO cuartel(  nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo, activo) "
                + "VALUES (? ,? ,? ,? ,? ,? ,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, cuartel.getNombreDeCuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoordenadaEnX());
            ps.setInt(4, cuartel.getCoordenadaEnY());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());
            ps.setBoolean(7, cuartel.isActivo());

            int exito=ps.executeUpdate();
            
            if(exito>0){
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                cuartel.setCodigoCuartel(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Cuartel generado con exito.");
            }
            }else{
                JOptionPane.showMessageDialog(null, "Error al agregar Cuartel ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar Cuartel " + ex.getMessage());
        }
return cuartel;
    }

    public void eliminarCuartelPorCodigo(int codigoCuartel) {
        String sql = "UPDATE cuartel SET activo=0 WHERE codCuartel=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigoCuartel);

            int exito = ps.executeUpdate();

            if (exito > 0) {

                JOptionPane.showMessageDialog(null, "Cuartel eliminado con exito");

            } else {

                JOptionPane.showMessageDialog(null, "No se encontro cuartel con ese codigo");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar cuartel");
        }

    }

    public void modificarCuartelporCodigo(Cuartel cuartel) {

        String sql = "UPDATE cuartel SET nombre_cuartel = ? , direccion = ?, coord_X = ?, coord_Y= ?, telefono = ?, correo= ? ,activo=? "
                + "WHERE cuartel.codCuartel= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cuartel.getNombreDeCuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoordenadaEnX());
            ps.setInt(4, cuartel.getCoordenadaEnY());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());
            ps.setBoolean(7, cuartel.isActivo());
            ps.setInt(8, cuartel.getCodigoCuartel());

            int exito = ps.executeUpdate();

            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "Cuartel modificadol");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar modificar cuartel");
        }
    }

    public ArrayList<Brigada> obtenerBrigadasDelCuartel(int nro_cuartel) {

        ArrayList<Brigada> brigadas = new ArrayList<>();

        String sql = "SELECT * FROM brigada WHERE nro_cuartel=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nro_cuartel);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Creamos objetos Brigada
                Brigada brigada = new Brigada();
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setCodCuartel(nro_cuartel);
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setLibre(rs.getBoolean("libre"));

                //Lo agregamos al arreglo 
                brigadas.add(brigada);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla Brigada");
        }

        return brigadas;
    }

    public ArrayList<Cuartel> listarCuarteles() {

        ArrayList<Cuartel> cuarteles = new ArrayList<>();

    //    String sql = "SELECT * FROM cuartel WHERE 1";
        String sql= "SELECT codCuartel, nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo, activo FROM cuartel";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Cuartel cuartel = new Cuartel();

                cuartel.setCodigoCuartel(rs.getInt("codCuartel "));
                cuartel.setNombreDeCuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoordenadaEnX(rs.getInt("coord_X"));
                cuartel.setCoordenadaEnY(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreo(rs.getString("correo"));
                cuartel.setActivo(rs.getBoolean("activo"));

                cuarteles.add(cuartel);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar cuarteles");
        }

        return cuarteles;
    }

    public Cuartel buscarCuartelPorCodigo(int codigo) {

          Cuartel cuartel = new Cuartel();
        String sql = "SELECT nombre_cuartel, direccion ,coord_X, coord_Y, telefono, correo,  activo FROM cuartel WHERE codCuartel = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cuartel.setCodigoCuartel(codigo);
                cuartel.setNombreDeCuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoordenadaEnX(rs.getInt("coord_X"));
                cuartel.setCoordenadaEnY(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreo(rs.getString("correo"));
                cuartel.setActivo(rs.getBoolean("activo"));

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar buscar bombero por id");
        }

        return cuartel;
    }

}
