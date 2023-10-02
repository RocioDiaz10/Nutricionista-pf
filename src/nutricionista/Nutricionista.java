/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista;

import java.sql.Connection;
import nutricionista.accesodatos.Conexion;
import nutricionista.accesodatos.PacienteData;
import nutricionista.entidades.Paciente;

/**
 *
 * @author user
 */
public class Nutricionista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection con=null;
        
        con = Conexion.getConexion();
        
        Paciente uno= new Paciente("juan","gonzalez",33224455,"rojas 2323",234563242);
        
        PacienteData crear= new PacienteData();
        
        //crear.guardarPaciente(uno);
        crear.modificarPaciente(uno);
        
    }
    
}
