package AccesoADatos;

import Entidades.Brigada;
import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    
    public ArrayList<Cuartel> listarCuarteles (){
        
        ArrayList<Cuartel> cuarteles= new ArrayList<>();
       
        String sql = "SELECT * FROM cuartel WHERE 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
              //  Cuartel 
                
            }
            
            
            
        } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al listar cuarteles");
        }
        
        
        return null;
    }
    
    

}
