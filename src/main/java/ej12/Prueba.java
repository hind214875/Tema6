/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author hinda
 */
public class Prueba {
    public static void main(String[] args) {
        Cliente c1=new Cliente("Hind","apellido","123546IY");
        Cliente c2=new Cliente("Javier","Perez","5683KJ");
        
        CuentaCorriente cuentaC=new CuentaCorriente(1000,c1);
        CuentaAhorro cuentaH=new CuentaAhorro(1,500,c2);
        
        System.out.println("");
        cuentaC.retirar(500);
        System.out.println(cuentaC.getSaldo());
        
    }
}
