/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

/**
 *
 * @author hinda
 */
public class Diputado extends Legislador {
    //atributos
    private int numeroAsiento;
    
    //constrector

    public Diputado(int numeroAsiento, String provinciaQueRepresenta, String partidoPolitico, String nombre, String Apellidos) {
        super(provinciaQueRepresenta, partidoPolitico, nombre, Apellidos);
        this.numeroAsiento = numeroAsiento;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String toString() {
        return super.toString()+" Diputado{" + "numeroAsiento=" + numeroAsiento + '}';
    }
    
    
    
    @Override
    public String getCamaraEnQueTrabaja() {
        return "Diputado";
    }
    
}
