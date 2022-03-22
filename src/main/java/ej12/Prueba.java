/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;
import java.util.ArrayList;

/**
 *
 * @author hinda
 */
public class Prueba {
    public static void main(String[] args) {
        Cliente c1=new Cliente("Hind","apellido","123546IY");
        Cliente c2=new Cliente("Javier","Perez","5683KJ");
        Cliente c3=new Cliente("Alex","Perez","56987LK");
        Cliente c4=new Cliente("Luis","Perez","98654HJ");
        
        Cuenta cuentaC=new CuentaCorriente(1000,c1);//aqui polimorfismo
        Cuenta cuentaC1=new CuentaCorriente(1000,c2);//aqui polimorfismo
        Cuenta cuentaC2=new CuentaCorriente(1000,c3);//aqui polimorfismo
        Cuenta cuentaH=new CuentaAhorro(1,500,c2);//aqui polimorfismo
        Cuenta cuentaH1=new CuentaAhorro(1,500,c4);//aqui polimorfismo
        
        System.out.println("");
        cuentaC.retirar(500);
        System.out.println(cuentaC.getSaldo());
        cuentaC1.actualizarSaldo();
        System.out.println(cuentaC1.getSaldo());
        
//        //lista de cuentas 
//          ArrayList<Cuenta> listatCuentas=new ArrayList<>();
//          listatCuentas.add(cuentaC);
//          listatCuentas.add(cuentaH);
//          listatCuentas.add(cuentaC1);
//          listatCuentas.add(cuentaC2);
//          listatCuentas.add(cuentaH1);
//          
//           for (Cuenta c : listatCuentas) {
//            System.out.println(c);
//            c.actualizarSaldo();
//            
//            //si c es una instancia de cuentaAhorro
//            if(c instanceof CuentaAhorro){
//                CuentaAhorro aux=(CuentaAhorro) c;//conversion implicita
//                aux.retirar(200);
//            }
//            
//            if(c instanceof CuentaCorriente){
//                ((CuentaCorriente) c).retirar(100);
//            }
//        }
          
    }
}
