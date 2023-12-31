
package nutricionista.entidades;

import java.time.LocalDate;


public class Dieta {
    
    private int id_dieta;
    private String nombre;
    private Paciente paciente;
    private int id_paciente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double pesoInicio;
    private double pesoFinal;

    public Dieta() {
    }

    public Dieta(int id_dieta, String nombre,int id_paciente, Paciente paciente, LocalDate fechaInicio, LocalDate fechaFin, double pesoInicio, double pesoFinal) {
        this.id_dieta = id_dieta;
        this.nombre = nombre;
        this.paciente = paciente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.pesoInicio = pesoInicio;
        this.pesoFinal = pesoFinal;
    }

    public Dieta(String nombre,int id_paciente, Paciente paciente, LocalDate fechaInicio, LocalDate fechaFin, double pesoInicio, double pesoFinal) {
        this.nombre = nombre;
        this.paciente = paciente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.pesoInicio = pesoInicio;
        this.pesoFinal = pesoFinal;
    }

    public Dieta(String nombre, int id_paciente, LocalDate fechaInicio, LocalDate fechaFin, double pesoInicio, double pesoFinal) {
        this.nombre = nombre;
        this.id_paciente = id_paciente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.pesoInicio = pesoInicio;
        this.pesoFinal = pesoFinal;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public int getId_dieta() {
        return id_dieta;
    }

    public void setId_dieta(int id_dieta) {
        this.id_dieta = id_dieta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }


    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPesoInicio() {
        return pesoInicio;
    }

    public void setPesoInicio(double pesoInicio) {
        this.pesoInicio = pesoInicio;
    }

    public double getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(double pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
