
package AccesoADatos;

import java.sql.Connection;

/*
 * @author Lucas E. Sayago
 */
public class CuartelData {
    
   private Connection con = null;

    public CuartelData() {
        con = Conexion.getConexion();
    }

}
