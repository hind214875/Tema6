/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajadorHerencia;

import java.util.ArrayList;

/**
 *
 * @author hinda
 */
public class Prueba {
    
    public static void main(String[] args) {
        Camarero c1=new Camarero("jefe de seccion","Manuel","fdez","123dfd");
        System.out.println(c1);
        
        Camarero c2=new Camarero("Sumiller");
        System.out.println(c2);
        
        Cosinero co1=new Cosinero("Postres","luisa","perez","ddd");
        Trabajador t1=new Trabajador("Paco","El chocolatero","fgf1234");
        
//        System.out.println(c1);
//        System.out.println(co1);
//        System.out.println(t1);
//        
//        c1.cotizar();
//        co1.cotizar();
//        t1.cotizar();
        
        ArrayList<Trabajador> listatrabajadores=new ArrayList<>();
        listatrabajadores.add(t1);
        listatrabajadores.add(c1); //conversion implicita
        listatrabajadores.add(co1); //conversion implicita
        
        for (Trabajador t : listatrabajadores) {
            System.out.println(t);
            t.cotizar();
            
            //si t es una instancia de camarero
            if(t instanceof Camarero){
                Camarero aux=(Camarero) t;//conversion implicita
                aux.servirMesa("4");
            }
            
            if(t instanceof Cosinero){
                ((Cosinero) t).prepararPlato("Pushhero");
            }
        }
        
    }
}
