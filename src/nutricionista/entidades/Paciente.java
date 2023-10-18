
package nutricionista.entidades;


public class Paciente {
    private int id_paciente;
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private int celular;

    public Paciente() {
    }

    public Paciente(int id_paciente, String nombre, String apellido, int dni, String domicilio, int celular) {
        this.id_paciente = id_paciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.celular = celular;
    }

    public Paciente(String nombre, String apellido, int dni, String domicilio, int celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.celular = celular;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido ;
    }
    
    
    
    
            
   
    
}
