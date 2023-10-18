
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


public class ComidaData {
    
    private Connection con = null;   

    public ComidaData() {
        
        con = Conexion.getConexion();
    }
    
    public void guardarComida(Comida comida){
         String sql= "Insert into comida (nombre,detalle, cantCalorias)"
               + "Values (?,?,?)";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3,comida.getCantCalorias());
            
            int exito= ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                comida.setId_comida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "comida Guardada");
            }
            ps.close();
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se puede ingresar a la tabla comida");
        }
    
    
    
    }
    
    
    public Comida buscarComida(String nombre) {
        
        Comida comida=null;
        String sql= "SELECT id_comida, nombre, detalle, cantCalorias FROM comida WHERE nombre = ? ";
        
        PreparedStatement ps= null;
                
       
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs= ps.executeQuery();
            
            if(rs.next()){
                comida= new Comida();
                comida.setId_comida(rs.getInt("id_comida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
            }else{
                JOptionPane.showMessageDialog(null, "No existe la comida");
            }    
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro la comida con ese Nombre");
        }
            
        return comida;
    }
    
    
    
     public void modificarComida(Comida comida){
  
         String sql = "UPDATE comida SET nombre = ?, detalle = ?, cantCalorias = ? WHERE id_comida = ?";

        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setInt(4, comida.getId_comida());
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificacion realizada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo ingresar a la tabla COMIDA");
        }

    }
     
   
     
     public void eliminarComida(String nombre){
        
        String sql="delete from comida where nombre=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, nombre);
           int exito= ps.executeUpdate();
           
           if(exito==1 ){
               JOptionPane.showMessageDialog(null, "comida eliminada con exito");
           }
            
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo ingresar los datos a la tabla COMIDA");
        }
        
    }

     
     public List <Comida> ListarComidas(){
         
       Comida comida= null;
        String sql = "SELECT id_comida,nombre,detalle,catCalorias FROM comida";
        PreparedStatement ps= null;
         
         ArrayList <Comida> comidas = new ArrayList<>();
                 
        try{
            ps = con.prepareStatement(sql);
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
            JOptionPane.showMessageDialog(null, "No se pudo ingresar los datos a la tabla comida");
        }

        
         
        return comidas;
         
    }
    
}
