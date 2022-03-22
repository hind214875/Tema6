/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

/**
 *
 * @author hinda
 */
public class Persona{
    //atributos
  private String nombre;
  private String Apellidos;
  
   //constrector

    public Persona(String nombre, String Apellidos) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
    }
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Apellidos=" + Apellidos + '}';
    }
  
    
  
    
}
