
package nutricionista.accesodatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nutricionista.entidades.Comida;
import nutricionista.entidades.DietaComida;
import nutricionista.entidades.Dieta;

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
            ps.setInt(1, dietacomida.getComida().getId_comida());
            ps.setInt(2, dietacomida.getDieta().getId_dieta());
            
            
            int exito= ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                dietacomida.setId_dietacomida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Comida viculada con Dieta Exitosamente ");
            }
             ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo ingresar a la tabla dieta-comida");
        }
        
        
    }
    
    public void borrarDietaComida(int id_comida, int id_dieta){
        
        String sql="DELETE FROM dietacomida WHERE id_comida= ?  and id_dieta=? ";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id_comida);
            ps.setInt(2, id_dieta);
           int exito= ps.executeUpdate();
           
           if(exito==1 ){
               JOptionPane.showMessageDialog(null, "Vinculacion entre Comida y Dieta Eliminada");
           }
            
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo ingresar los datos a la tabla Dieta-Comida");;
        }
        
        
    }
    
    public List <Comida> ListarComidasIncluidas(int id){
        
       Comida comida= null;
        String sql = "SELECT c.id_comida, nombre,detalle,cantCalorias FROM comida c JOIN dietacomida dc ON (c.id_comida = dc.id_comida) WHERE dc.id_dieta=?";
        PreparedStatement ps= null;
         
         ArrayList <Comida> comidas = new ArrayList<>();
                 
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
         
         while(rs.next()){
             comida= new Comida();
             comida.setId_comida(rs.getInt("id_comida"));
             comida.setNombre(rs.getNString("nombre"));
             comida.setDetalle(rs.getString("detalle"));
             comida.setCantCalorias(rs.getInt("cantCalorias"));
              
               
                comidas.add(comida);
            }   
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar los datos a la tabla Dieta-Comida");
        }

        
         
        return comidas;
         
    }
    
    
}
