
package nutricionista.accesodatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nutricionista.entidades.DietaComida;

/**
 *
 * @author user
 */
public class DietaComidaData {
    private Connection con = null;   

    public DietaComidaData() {
        
           con = Conexion.getConexion();
    }
    
    public void GuardarDietaComida(DietaComida dietacomida){
        
        String sql= "insert into dietacomida (id_comida, id_dieta)"
                +"Values (?,?)";
        
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1,dietacomida.getComida().getId_comida());
            ps.setInt(2,dietacomida.getDieta().getId_dieta());
            
            int exito= ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                dietacomida.setId_dietacomida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "dietacomida Guardada");
            }
             ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo ingresar a la tabla dietacomida123");
        }
        
        
    }
    
    
    
}
