
package Herencia;

/**
 *
 * @author hinda
 */
public class Turismo extends Vehiculo {
    //atributos

    private int puertas;
    private boolean marchaAutomatica;

    //constrectores
    public Turismo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible, int puertas, boolean marchaAutomatica) {
        super(matricula, marca, modelo, color, tarifa, disponible);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }

    public Turismo() {
    }

    public int getPuertas() {
        return puertas;
    }

    //getters
    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    @Override
    public String getAtributos() {
        // Llamada al método getAtributos() de la clase Vehiculo y
        // concateno los atributos de la superclase con los de la subclase

        return super.getAtributos() + " Puertas: " + this.puertas + " Marcha automática: " + this.marchaAutomatica;
    }

}
