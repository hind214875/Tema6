/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

/**
 *
 * @author hinda
 */
public abstract class Legislador extends Persona{
    
    private String provinciaQueRepresenta;
    private String partidoPolitico;
    
    //constrector

    public Legislador(String provinciaQueRepresenta, String partidoPolitico, String nombre, String Apellidos) {
        super(nombre, Apellidos);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
    }

    public Legislador() {     
    }
   
    //getters setters

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
    
    //abstract method
    public abstract String getCamaraEnQueTrabaja();

    @Override
    public String toString() {
        return super.toString()+" Legislador{" + "provinciaQueRepresenta=" + provinciaQueRepresenta + ", partidoPolitico=" + partidoPolitico + '}';
    }
    
    

}
