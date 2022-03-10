/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaPersona;

/**
 *
 * @author hinda
 */
public class Prueba {
    public static void main(String[] args) {
        Persona persona=new Persona("persona1","N1235489",32);
        Empleado empleado=new Empleado(2000,"empleado","G569841",28);
        Programador programador=new Programador(Categoria.JUNIOR,"programador","Y986546",35);
        
        System.out.println(persona.toString());
        System.out.println(empleado.toString());
        System.out.println(programador.toString());
        
    }
}
