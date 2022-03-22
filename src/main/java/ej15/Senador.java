/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

/**
 *
 * @author hinda
 */
public class Senador extends Legislador{
   //atributos
    private double complemento;
    
    //constrector
    public Senador(double complemento, String provinciaQueRepresenta, String partidoPolitico, String nombre, String Apellidos) {
        super(provinciaQueRepresenta, partidoPolitico, nombre, Apellidos);
        this.complemento = complemento;
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return super.toString()+" Senador{" + "complemento=" + complemento + '}';
    }
    
    
    @Override
    public String getCamaraEnQueTrabaja() {
        return "Senador";
    }
    
}
