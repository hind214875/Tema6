/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaPersona;

/**
 *
 * @author hinda
 */
public class Empleado extends Persona {
    
    private double salario;

    public Empleado(double salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+ " salario: " + salario;
    }
    
    // Un método que permita aumentar el salario en una cantidad que sería pasada como parámetro.
    public double aumentarSalario(double cantidad){
        return this.salario+cantidad;
    }
    
}
