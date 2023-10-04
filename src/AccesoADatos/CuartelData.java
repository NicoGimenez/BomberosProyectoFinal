package AccesoADatos;

import Entidades.Brigada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * @author Lucas E. Sayago
 */
public class CuartelData {

    private Connection con = null;

    public CuartelData() {
        con = Conexion.getConexion();
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

}
