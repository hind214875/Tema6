/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajadorHerencia;

/**
 *
 * @author hinda
 */
public class Camarero extends Trabajador {
    
    private String rango;

    public Camarero(String rango, String nombre, String apellidos, String nif) {
        super(nombre, apellidos, nif);
        this.rango = rango;
    }

    public Camarero() {
    }
    
    public Camarero(String rango){
       // super();//si no pongamos no pasa na es por defecto alli
        this.rango=rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return super.toString()+ "Camarero{" + "rango=" + rango + '}';
    }
    
    @Override
    public void cotizar(){
        System.out.println("Cotizar como camarero");
    }
    
    public void servirMesa(String id){
        System.out.println("Camarero sirviendo la mesa "+id);
    }
}
