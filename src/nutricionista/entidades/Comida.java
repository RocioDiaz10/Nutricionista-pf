
package nutricionista.entidades;

public class Comida {
    private int id_comida;
    private String nombre;
    private String detalle;
    private int cantCalorias;

    public Comida() {
    }

    public Comida(String nombre, String detalle, int cantCalorias) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCalorias = cantCalorias;
    }

    public Comida(int id_comida, String nombre, String detalle, int cantCalorias) {
        this.id_comida = id_comida;
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCalorias = cantCalorias;
    }

    public int getId_comida() {
        return id_comida;
    }

    public void setId_comida(int id_comida) {
        this.id_comida = id_comida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }
    
    
    
}
