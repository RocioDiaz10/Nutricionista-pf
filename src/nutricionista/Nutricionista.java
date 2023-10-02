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
        
        Paciente uno= new Paciente(2,"JAVIER","gonzalez",34332910,"SAN MARTIN 12",234563242);
        
        PacienteData pac= new PacienteData();
        
        //pac.guardarPaciente(uno);
        //pac.modificarPaciente(uno);
        pac.eliminarPaciente(34332910);
    }
    
}
