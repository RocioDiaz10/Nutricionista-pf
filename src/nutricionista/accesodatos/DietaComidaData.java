
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
import nutricionista.entidades.Comida;
import nutricionista.entidades.DietaComida;
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
    
     public List <Comida> comidaIncluidas (int id){
         
        ArrayList<Comida> incluidas= new ArrayList<>();
        DietaComida dietacomida= null;
        
     String sql = "SELECT d.id_comida,nombre, detalle,cantCalorias FROM dietacomida d JOIN comida c ON (d.id_comida = c.id_comida)"
             + "WHERE d.id_dieta=?";
             
  
             
         PreparedStatement ps= null;
         
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){
                Comida comida= new Comida();
               comida.setId_comida(rs.getInt("id_comida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                incluidas.add(comida);
            }
            ps.close(); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener los datos de la tabla comida(dietacomidadata)");
        }
        return incluidas;
     } 
     
     
     public List <Comida> comidaNoIncluida(int id){
         
            ArrayList<Comida> noIncluida= new ArrayList<>();
            DietaComida DietaComida= null;
     
                String sql= "SELECT * FROM comida WHERE id_comida not in"
                + "(SELECT id_comida FROM dietacomida WHERE id_dieta= ? )";
        
         PreparedStatement ps= null;
         
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){
                Comida comida= new Comida();
                comida.setId_comida(rs.getInt("id_comida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                
                
                noIncluida.add(comida);
            }
            ps.close(); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener los datos de la tabla Comida(dietacomidadata)");
        }
        return noIncluida;
     }
    
     
     public void borrarIncluidasEnDieta(int id_comida, int id_dieta){
        
        String sql="DELETE FROM dietacomida WHERE id_comida=?  and id_dieta=? ";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id_comida);
            ps.setInt(2, id_dieta);
            System.out.println("hasta aca 1");
           int exito= ps.executeUpdate();
            System.out.println(" hasya aca 2");
           
           if(exito==1 ){
               JOptionPane.showMessageDialog(null, "Comida Excluida");
               System.out.println(" hasta aca 3");
           }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo ingresar los datos a la tabla Dietacomida");
        }
        
        
    }
     
     
     
}
