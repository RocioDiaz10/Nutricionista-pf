
package nutricionista.entidades;


public class DietaComida {
    private int id_dietacomida;
    private Comida comida;
    private Dieta dieta;

    public DietaComida() {
    }

    public DietaComida(int id_dietacomida, Comida comida, Dieta dieta) {
        this.id_dietacomida = id_dietacomida;
        this.comida = comida;
        this.dieta = dieta;
    }

    public DietaComida(Comida comida, Dieta dieta) {
        this.comida = comida;
        this.dieta = dieta;
    }

    public int getId_dietacomida() {
        return id_dietacomida;
    }

    public void setId_dietacomida(int id_dietacomida) {
        this.id_dietacomida = id_dietacomida;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }
    
    
    
}
