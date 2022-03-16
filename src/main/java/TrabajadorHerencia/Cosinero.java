/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajadorHerencia;

/**
 *
 * @author hinda
 */
public class Cosinero extends Trabajador {

    private String partida;

    public Cosinero(String partida, String nombre, String apellidos, String nif) {
        super(nombre, apellidos, nif);
        this.partida = partida;
       /* this.nif=nif; porque nif es protected en la classe Trabajador*/
    }

    public Cosinero() {
    }

    public Cosinero(String partida) {
        this.partida = partida;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Cosinero{" + "partida=" + partida + '}';
    }
 
    @Override
    public void cotizar(){
        System.out.println("Cotizando como un cocinero");
    }
    
    public void prepararPlato(String plato){
        System.out.println("Cocinero prepara "+plato);
    }
}
