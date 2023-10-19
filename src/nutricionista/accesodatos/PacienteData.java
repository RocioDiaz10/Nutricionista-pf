
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
                JOptionPane.showMessageDialog(null, "Paciente Guardado");
                }
            ps.close();
         
         
         
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,"no se pudo ingresar a la tabla PACIENTE");
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
            JOptionPane.showMessageDialog(null, "No se pudo ingresar a la tabla PACIENTE");
        }

    }
    
    public void eliminarPaciente(int dni){
        
        String sql="DELETE from paciente WHERE dni=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
           int exito= ps.executeUpdate();
           
           if(exito==1 ){
               JOptionPane.showMessageDialog(null, "Paciente eliminado con exito");
           }
            
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo ingresar los datos a la tabla PACIENTE");
        }
        
    }
    public Paciente buscarPacienteDNI(int dni){
        
        Paciente paciente= null;
        String sql = "SELECT id_paciente, dni, apellido, nombre, domicilio, celular from paciente where dni= ?  ";
        PreparedStatement ps= null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs= ps.executeQuery();
            
            if(rs.next()){
                paciente= new Paciente();
                
                
                paciente.setDni(rs.getInt("dni"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setCelular(rs.getInt("celular"));
                
                
            }else{
                JOptionPane.showMessageDialog(null, "No existe el paciente");
            }    
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro un paciente con ese DNI");
        }
        
        return paciente;
}
    
    public List <Paciente> ListaPacientes(){
         
         Paciente paciente= null;
         String sql = "SELECT id_paciente, nombre, apellido, dni, domicilio, celular FROM paciente ";
         PreparedStatement ps= null;
         
         List <Paciente> pacientes = new ArrayList<>();
                 
        try{
            ps = con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
           
         while(rs.next()){
             
                paciente= new Paciente();
                paciente.setId_paciente(rs.getInt("id_paciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setCelular(rs.getInt("celular"));
                
                pacientes.add(paciente);
            }   
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar los datos a la tabla Paciente");
        }

        
         
        return pacientes;
         
    }
    
}
