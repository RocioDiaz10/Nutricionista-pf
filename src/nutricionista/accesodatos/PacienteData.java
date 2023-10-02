
package nutricionista.accesodatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nutricionista.entidades.Paciente;


public class PacienteData {
    
 private Connection con = null;    

    public PacienteData() {
        con = Conexion.getConexion();
    }
    
    public void guardarPaciente(Paciente paciente){
        String sql="insert into paciente (nombre, apellido, dni, domicilio, celular)"
                +"Values (?,?,?,?,?)";

     try {        
         PreparedStatement ps=con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
          ps.setString(1, paciente.getNombre());
          ps.setString(2, paciente.getApellido());
         ps.setInt(3, paciente.getDni());
          ps.setString(4, paciente.getDomicilio());
         ps.setInt(5, paciente.getCelular());
         
       int exito= ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                paciente.setId_paciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "paciente Guardado");
                }
            ps.close();
         
         
         
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,"no se pudo ingresar a la tabla paciente");
     }
        
        
        
        
    }
    
    
    public void modificarPaciente(Paciente paciente) {

        String sql = "UPDATE paciente SET nombre = ?, apellido = ?, dni = ?, domicilio = ?, celular = ? "
                + "WHERE id_paciente = ?";

        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setInt(3, paciente.getDni());
            ps.setString(4, paciente.getDomicilio());
            ps.setInt(5, paciente.getCelular());
            ps.setInt(6, paciente.getId_paciente());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificacion realizada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo ingresar a la tabla paciente");
        }

    }
    
    public void eliminarPaciente(int dni){
        
        String sql="delete from paciente where dni=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
           int exito= ps.executeUpdate();
           
           if(exito==1 ){
               JOptionPane.showMessageDialog(null, "paciente eliminado con exito");
           }
            
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo ingresar los datos a la tabla paciente");
        }
        
    }
    
    
}
