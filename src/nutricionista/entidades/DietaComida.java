
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
    
    
    
}
