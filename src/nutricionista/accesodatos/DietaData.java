
package nutricionista.accesodatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nutricionista.entidades.Dieta;
import nutricionista.entidades.Paciente;

/**
 *
 * @author user
 */
public class DietaData {
    private Connection con = null;   

    public DietaData() {
        
         con = Conexion.getConexion();
         
    }
    
    public void guardarDieta(Dieta dieta){
         String sql="insert into dieta (nombre, id_paciente,fechaInicio,fechaFinal,pesoInicio,pesoFinal)"
                +" Values (?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1,dieta.getNombre());
            ps.setInt(2, dieta.getId_paciente());
            ps.setDate(3, Date.valueOf(dieta.getFechaInicio()));
            ps.setDate(4, Date.valueOf(dieta.getFechaFin()));
            ps.setDouble(5, dieta.getPesoInicio());
            ps.setDouble(6, dieta.getPesoFinal());
     
            
             int exito= ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                dieta.setId_dieta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Dieta Guardada");
            }
             ps.close();
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se puede ingresar a la tabla DIETA");
        }
        
        
        
    }
    
    public void modificarDieta(Dieta dieta) {

        String sql = "UPDATE dieta SET nombre=? , id_paciente=? ,fechaInicio=?,fechaFinal=?,pesoInicio=?,pesoFinal=? "
                + "WHERE id_dieta = ?";

        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getId_paciente());
            ps.setDate(3, Date.valueOf(dieta.getFechaInicio()));
            ps.setDate(4, Date.valueOf(dieta.getFechaFin()));
            ps.setDouble(5, dieta.getPesoInicio());
            ps.setDouble(6, dieta.getPesoFinal());
            ps.setInt(7,dieta.getId_dieta());
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificacion realizada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar a la tabla DIETA");
        }

    }
    
    public void eliminarDieta(int id_dieta){
        
        String sql="delete from dieta where id_dieta=?";
        
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id_dieta);
           int exito= ps.executeUpdate();
           
           if(exito==1 ){
               JOptionPane.showMessageDialog(null, "Dieta eliminada con Exito");
           }
            
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo ingresar los datos a la tabla DIETA");
        }
        
    }
    
    
    
     public List <Dieta> ListDieta(){
         
         Dieta dieta= null;
         String sql = "SELECT id_dieta,nombre, id_paciente, fechaInicio, fechaFinal, pesoInicio, pesoFinal FROM dieta ";
         PreparedStatement ps= null;
         
         List <Dieta> dietas = new ArrayList<>();
                 
        try{
            ps = con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
           
         while(rs.next()){
             
                dieta= new Dieta();
                dieta.setId_dieta(rs.getInt("id_dieta"));
                dieta.setNombre(rs.getString("nombre"));
                dieta.setId_paciente(rs.getInt("id_paciente"));
                dieta.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                dieta.setFechaFin(rs.getDate("fechaFinal").toLocalDate());
                dieta.setPesoInicio(rs.getDouble("pesoInicio"));
                dieta.setPesoFinal(rs.getDouble("pesoFinal"));
                
                
                dietas.add(dieta);
            }   
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar los datos a la tabla Dieta");
        }

        
         
        return dietas;
         
    }
}
