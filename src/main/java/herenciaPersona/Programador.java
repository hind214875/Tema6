/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaPersona;

/**
 *
 * @author hinda
 */
public class Programador extends Persona{
    //atributos
    private Categoria categoria;
    
    //constrectores

    public Programador(Categoria categoria, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.categoria = categoria;
    }
     

    public Programador() {
    }
    
    //getters y setters

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + " categoria: " +categoria;
    }
    
    
}
